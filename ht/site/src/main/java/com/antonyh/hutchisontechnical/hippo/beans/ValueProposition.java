package com.antonyh.hutchisontechnical.hippo.beans;

import java.util.ArrayList;
import java.util.List;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoMirror;

@Node(jcrType = "ht:valueproposition")
public class ValueProposition extends HippoDocument {
	public String getTitle() {
		return getProperty("ht:title");
	}

	public String getText() {
		return getProperty("ht:text");
	}


	/*
	 * get a List of HippoBean containing the topics for this item
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
