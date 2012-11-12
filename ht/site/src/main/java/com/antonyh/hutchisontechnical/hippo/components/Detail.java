package com.antonyh.hutchisontechnical.hippo.components;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hippoecm.hst.content.beans.query.HstQuery;
import org.hippoecm.hst.content.beans.query.exceptions.QueryException;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.content.beans.standard.HippoDocumentBean;
import org.hippoecm.hst.core.component.HstComponentException;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.hippoecm.hst.core.parameters.ParametersInfo;
import org.hippoecm.hst.util.ContentBeanUtils;
import org.hippoecm.hst.util.PathUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.antonyh.hutchisontechnical.hippo.beans.ArticleDocument;
import com.antonyh.hutchisontechnical.hippo.beans.ValueProposition;
import com.antonyh.hutchisontechnical.hippo.componentsinfo.ListViewInfo;
import com.antonyh.hutchisontechnical.hippo.componentsinfo.SidebarListViewInfo;

@ParametersInfo(type = SidebarListViewInfo.class)
public class Detail extends BaseComponent {

	public static final Logger log = LoggerFactory.getLogger(Detail.class);

	@Override
	public void doBeforeRender(final HstRequest request,
			final HstResponse response) throws HstComponentException {

		HippoBean doc = getContentBean(request);

		if (doc == null) {
			log.warn(
					"Did not find a content bean for relative content path '{}' for pathInfo '{}'",
					request.getRequestContext().getResolvedSiteMapItem()
							.getRelativeContentPath(), request
							.getRequestContext().getResolvedSiteMapItem()
							.getPathInfo());
			response.setStatus(404);
			return;
		}
		request.setAttribute("document", doc);

		// SEARCH FOR RIGHT HAND SIDE
		ListViewInfo info = getParametersInfo(request);
		HippoBean scopeBean = null;

		String scope = info.getScope();
		if (scope == null) {
			throw new HstComponentException(
					"Scope is not allowed to be null for a List component. Cannot create a list");
		}

		scopeBean = getSiteContentBaseBean(request);
		if ("".equals(scope) || "/".equals(scope)) {
			// the scope is the root content bean of this site, scopeBean is
			// already ok.
		} else {
			// strip leading and trailing slashes
			scope = PathUtils.normalizePath(scope);
			scopeBean = scopeBean.getBean(scope);
			if (scopeBean == null) {
				throw new HstComponentException(
						"Scope '"
								+ scope
								+ "' does not point to a bean for Mount with content path '"
								+ request.getRequestContext()
										.getResolvedMount().getMount()
										.getContentPath()
								+ "'. Cannot create a list ");
			}
		}

		if (scope == null) {
			response.setStatus(404);
			throw new HstComponentException(
					"For an Home component there must be a content bean available to search below. Cannot create an overview");
		}

		setValuePropositions(request, response, doc);

		createAndExecuteSearch(request, info, scopeBean, null, "sidebar");
	}

	private void setValuePropositions(final HstRequest request,
			final HstResponse response, final HippoBean doc)
			throws HstComponentException {

		if (!(doc instanceof ArticleDocument)) {
			return;
		}

		ArticleDocument article = (ArticleDocument) doc;
		List<HippoBean> topics = article.getTopics();

		try {
			Set<HippoBean> valuePropositions = new HashSet<HippoBean>();
			for (HippoBean topic : topics) {

				HstQuery valuePropositionQuery = ContentBeanUtils
						.createIncomingBeansQuery((HippoDocumentBean) topic,
								getSiteContentBaseBean(request),
								"ht:topic/@hippo:docbase",
								getObjectConverter(), ValueProposition.class,
								false);

				valuePropositions.addAll(ContentBeanUtils.getIncomingBeans(
						valuePropositionQuery, ValueProposition.class));

			}

			request.setAttribute("valueresult", valuePropositions);

		} catch (QueryException e) {

		}

	}
}
