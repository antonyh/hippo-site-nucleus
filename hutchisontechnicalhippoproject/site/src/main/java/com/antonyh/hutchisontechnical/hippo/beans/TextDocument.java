package com.antonyh.hutchisontechnical.hippo.beans;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;

@Node(jcrType="hutchisontechnicalhippoproject:textdocument")
public class TextDocument extends BaseDocument{
    
    public HippoHtml getHtml(){
        return getHippoHtml("hutchisontechnicalhippoproject:body");    
    }

    public String getSummary() {
        return getProperty("hutchisontechnicalhippoproject:summary");
    }
 
    public String getTitle() {
        return getProperty("hutchisontechnicalhippoproject:title");
    }

}
