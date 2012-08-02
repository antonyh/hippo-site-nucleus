package com.antonyh.hutchisontechnical.hippo.beans;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;

@Node(jcrType = "hutchisontechnicalhippoproject:topicdefinition")
public class TopicDefinition extends HippoDocument {
	public String getTitle() {
		return getProperty("hutchisontechnicalhippoproject:title");
	}

}
