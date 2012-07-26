package com.antonyh.hutchisontechnical.hippo.beans;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSetBean;
import org.hippoecm.hst.content.beans.standard.HippoHtml;

@Node(jcrType = "hutchisontechnicalhippoproject:articledocument")
public class ArticleDocument extends BaseDocument {

	public HippoHtml getHtml() {
		return getHippoHtml("hutchisontechnicalhippoproject:body");
	}

	public String getSummary() {
		return getProperty("hutchisontechnicalhippoproject:summary");
	}

	public String getTitle() {
		return getProperty("hutchisontechnicalhippoproject:title");
	}

	/**
	 * Get the imageset of the articlepage
	 * 
	 * @return the imageset of the articlepage
	 */
	public HippoGalleryImageSetBean getImage() {
		return getLinkedBean("hutchisontechnicalhippoproject:image",
				HippoGalleryImageSetBean.class);
	}

}
