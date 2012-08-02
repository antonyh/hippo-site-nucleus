package com.antonyh.hutchisontechnical.hippo.beans;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSetBean;
import org.hippoecm.hst.content.beans.standard.HippoHtml;

@Node(jcrType = "ht:textdocument")
public class TextDocument extends BaseDocument {

	public HippoHtml getHtml() {
		return getHippoHtml("ht:body");
	}

	public String getSummary() {
		return getProperty("ht:summary");
	}

	public String getTitle() {
		return getProperty("ht:title");
	}

	public HippoGalleryImageSetBean getImage() {
		return getLinkedBean("ht:image",
				HippoGalleryImageSetBean.class);
	}

}
