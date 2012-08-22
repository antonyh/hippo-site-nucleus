package com.antonyh.hutchisontechnical.hippo.beans;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;

@Node(jcrType = "ht:valueproposition")
public class ValueProposition extends HippoDocument {
	public String getTitle() {
		return getProperty("ht:title");
	}

}
