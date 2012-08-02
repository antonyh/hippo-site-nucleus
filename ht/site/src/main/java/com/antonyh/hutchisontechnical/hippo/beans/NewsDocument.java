package com.antonyh.hutchisontechnical.hippo.beans;

import java.util.Calendar;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSetBean;

@Node(jcrType="ht:newsdocument")
public class NewsDocument extends BaseDocument{

    public Calendar getDate() {
        return getProperty("ht:date");
    }

    public HippoHtml getHtml(){
        return getHippoHtml("ht:body");    
    }

    /**
     * Get the imageset of the newspage
     *
     * @return the imageset of the newspage
     */
    public HippoGalleryImageSetBean getImage() {
        return getLinkedBean("ht:image", HippoGalleryImageSetBean.class);
    }

    public String getSummary() {
        return getProperty("ht:summary");
    }

    public String getTitle() {
        return getProperty("ht:title");
    }

}
