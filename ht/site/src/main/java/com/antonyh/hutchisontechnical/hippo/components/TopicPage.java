package com.antonyh.hutchisontechnical.hippo.components;

import org.hippoecm.hst.content.beans.query.HstQuery;
import org.hippoecm.hst.content.beans.query.HstQueryResult;
import org.hippoecm.hst.content.beans.query.exceptions.QueryException;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.core.component.HstComponentException;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.hippoecm.hst.core.parameters.ParametersInfo;
import org.hippoecm.hst.util.ContentBeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.antonyh.hutchisontechnical.hippo.beans.BaseDocument;
import com.antonyh.hutchisontechnical.hippo.beans.TopicDefinition;
import com.antonyh.hutchisontechnical.hippo.componentsinfo.TopicPageListInfo;

@ParametersInfo(type = TopicPageListInfo.class)
public class TopicPage extends Detail {

	public static final Logger log = LoggerFactory.getLogger(TopicPage.class);

	@Override
	public void doBeforeRender(final HstRequest request,
			final HstResponse response) throws HstComponentException {

		// super.doBeforeRender(request, response);
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

		TopicDefinition topic = getContentBean(request, TopicDefinition.class);
		if (topic == null) {
			response.setStatus(HstResponse.SC_NOT_FOUND);
			return;
		}

		// now, also try to find the 10 most recent comments
		try {
			// below, a HstQuery gets bootstrapped that searches for documents
			// of type that descends from BaseDocument (basically anything)
			// 1. have a hippo:mirror link stored at a child node
			// 'ht:topic' (hence uuid stored in 'ht:topic/@hippo:docbase')
			// 2. have their hippo:mirror link point to anything this
			// TopicDefinition
			// 3. are located below getSiteContentBaseBean(request), thus, the
			// entire content of the (sub)site
			HstQuery articlesQuery = ContentBeanUtils.createIncomingBeansQuery(
					topic, getSiteContentBaseBean(request),
					"ht:topic/@hippo:docbase", getObjectConverter(),
					BaseDocument.class, true);

			// to the created query, you can do the normal stuff you can do with
			// a HstQuery

			// for example order by date descending
			articlesQuery.addOrderByDescending("hippostdpubwf:publicationDate");
			// set a limit of 100
			articlesQuery.setLimit(100);

			// execute the search and store the comments HstQueryResult
			// containing 'CommentBean's on the request
			HstQueryResult topics = articlesQuery.execute();
			request.setAttribute("articles", topics);
		} catch (QueryException e) {
			log.warn("QueryException ", e);
		}

	}
}
