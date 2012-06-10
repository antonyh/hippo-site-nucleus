package com.antonyh.hutchisontechnical.hippo.beans;

import java.util.Calendar;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSetBean;

@Node(jcrType="hutchisontechnicalhippoproject:newsdocument")
public class NewsDocument extends BaseDocument{

    public Calendar getDate() {
        return getProperty("hutchisontechnicalhippoproject:date");
    }

    public HippoHtml getHtml(){
        return getHippoHtml("hutchisontechnicalhippoproject:body");    
    }

    /**
     * Get the imageset of the newspage
     *
     * @return the imageset of the newspage
     */
    public HippoGalleryImageSetBean getImage() {
        return getLinkedBean("hutchisontechnicalhippoproject:image", HippoGalleryImageSetBean.class);
    }

    public String getSummary() {
        return getProperty("hutchisontechnicalhippoproject:summary");
    }

    public String getTitle() {
        return getProperty("hutchisontechnicalhippoproject:title");
    }

}
