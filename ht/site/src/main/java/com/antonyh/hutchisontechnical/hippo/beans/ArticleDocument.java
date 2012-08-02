package com.antonyh.hutchisontechnical.hippo.beans;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSetBean;
import org.hippoecm.hst.content.beans.standard.HippoHtml;

@Node(jcrType = "ht:articledocument")
public class ArticleDocument extends BaseDocument {

	public HippoHtml getHtml() {
		return getHippoHtml("ht:body");
	}

	public String getSummary() {
		return getProperty("ht:summary");
	}

	public String getTitle() {
		return getProperty("ht:title");
	}

	/**
	 * Get the imageset of the articlepage
	 * 
	 * @return the imageset of the articlepage
	 */
	public HippoGalleryImageSetBean getImage() {
		return getLinkedBean("ht:image",
				HippoGalleryImageSetBean.class);
	}

}
