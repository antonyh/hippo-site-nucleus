package com.antonyh.hutchisontechnical.hippo.components;

import org.hippoecm.hst.component.support.bean.BaseHstComponent;
import org.hippoecm.hst.configuration.hosting.Mount;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.core.component.HstComponentException;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.antonyh.hutchisontechnical.hippo.channels.WebsiteInfo;

public class Footer extends BaseHstComponent {

	public static final Logger log = LoggerFactory.getLogger(Footer.class);

	@Override
	public void doBeforeRender(final HstRequest request,
			final HstResponse response) throws HstComponentException {
		final Mount mount = request.getRequestContext().getResolvedMount()
				.getMount();
		final WebsiteInfo info = mount.getChannelInfo();

		if (info != null) {
			request.setAttribute("headerName", info.getHeaderName());
		} else {
			log.warn("No channel info available for website '{}'",
					mount.getMountPath());
		}

		HippoBean doc = getContentBean(request);

		// if (doc != null) {
		// request.setAttribute("pageTitle", doc.getProperty("title")
		// .toString());
		// } else {
		// request.setAttribute("pageTitle", "Pagex");
		//
		// }

		request.setAttribute("twitterShareMessage",
				response.encodeURL("Page - " + request.getRequestURL()));

	}

}
