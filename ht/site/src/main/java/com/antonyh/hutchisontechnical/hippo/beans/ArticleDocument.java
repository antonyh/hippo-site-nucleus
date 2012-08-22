package com.antonyh.hutchisontechnical.hippo.beans;

import java.util.ArrayList;
import java.util.List;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSetBean;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.hippoecm.hst.content.beans.standard.HippoMirror;

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
		return getLinkedBean("ht:image", HippoGalleryImageSetBean.class);
	}

	/*
	 * get a List of Beans representing the topics for this page
	 */
	public List<HippoBean> getTopics() {
		List<HippoMirror> children = getChildBeansByName("ht:topic");
		List<HippoBean> beans = new ArrayList<HippoBean>();

		for (HippoMirror bean : children) {
			HippoBean referenced = bean.getReferencedBean();
			if (referenced instanceof TopicDefinition) {
				beans.add(referenced);
			}
		}
		return beans;
	}

}
