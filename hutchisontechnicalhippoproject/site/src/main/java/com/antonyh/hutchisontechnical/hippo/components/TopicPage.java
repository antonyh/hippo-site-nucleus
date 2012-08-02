package com.antonyh.hutchisontechnical.hippo.components;

import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.core.component.HstComponentException;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.hippoecm.hst.core.parameters.ParametersInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.antonyh.hutchisontechnical.hippo.componentsinfo.TopicListInfo;

@ParametersInfo(type = TopicListInfo.class)
public class TopicPage extends Detail {

	public static final Logger log = LoggerFactory.getLogger(TopicPage.class);

	@Override
	public void doBeforeRender(final HstRequest request,
			final HstResponse response) throws HstComponentException {

		super.doBeforeRender(request, response);

		TopicListInfo info = getParametersInfo(request);
		HippoBean scope = getContentBean(request);

		if (scope == null) {
			response.setStatus(404);
			throw new HstComponentException(
					"For an Overview component there must be a content bean available to search below. Cannot create an overview");
		}

		createAndExecuteSearch(this, request, info, scope, null);

	}

}
