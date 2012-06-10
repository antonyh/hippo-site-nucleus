package org.apache.jsp.WEB_002dINF.jsp.standard.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/jspf/htmlTags.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/taglibs.jspf");
    _jspx_dependants.add("/WEB-INF/tags/pagenotfound.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhst_005felement_0026_005fvar_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhst_005fheadContribution_0026_005fkeyHint_005felement_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhst_005fcmseditlink_0026_005fhippobean_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhst_005fhtml_0026_005fhippohtml_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhst_005felement_0026_005fvar_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhst_005fheadContribution_0026_005fkeyHint_005felement_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhst_005fcmseditlink_0026_005fhippobean_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhst_005fhtml_0026_005fhippohtml_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fhst_005felement_0026_005fvar_005fname.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fhst_005fheadContribution_0026_005fkeyHint_005felement_005fnobody.release();
    _005fjspx_005ftagPool_005fhst_005fcmseditlink_0026_005fhippobean_005fnobody.release();
    _005fjspx_005ftagPool_005fhst_005fhtml_0026_005fhippohtml_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return;
          //  c:otherwise
          org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
          _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
          _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
          int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
          if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
              _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
              // /WEB-INF/jsp/standard/main/content.jsp(9,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty document.title}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
              int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
              if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  //  hst:element
                  org.w3c.dom.Element headTitle = null;
                  org.hippoecm.hst.tag.HstElementTag _jspx_th_hst_005felement_005f0 = (org.hippoecm.hst.tag.HstElementTag) _005fjspx_005ftagPool_005fhst_005felement_0026_005fvar_005fname.get(org.hippoecm.hst.tag.HstElementTag.class);
                  _jspx_th_hst_005felement_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_hst_005felement_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
                  // /WEB-INF/jsp/standard/main/content.jsp(10,6) name = var type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_hst_005felement_005f0.setVar("headTitle");
                  // /WEB-INF/jsp/standard/main/content.jsp(10,6) name = name type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_hst_005felement_005f0.setName("title");
                  int _jspx_eval_hst_005felement_005f0 = _jspx_th_hst_005felement_005f0.doStartTag();
                  if (_jspx_eval_hst_005felement_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_hst_005felement_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_hst_005felement_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_hst_005felement_005f0.doInitBody();
                    }
                    headTitle = (org.w3c.dom.Element) _jspx_page_context.findAttribute("headTitle");
                    do {
                      if (_jspx_meth_c_005fout_005f0(_jspx_th_hst_005felement_005f0, _jspx_page_context))
                        return;
                      int evalDoAfterBody = _jspx_th_hst_005felement_005f0.doAfterBody();
                      headTitle = (org.w3c.dom.Element) _jspx_page_context.findAttribute("headTitle");
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_hst_005felement_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_hst_005felement_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhst_005felement_0026_005fvar_005fname.reuse(_jspx_th_hst_005felement_005f0);
                    return;
                  }
                  headTitle = (org.w3c.dom.Element) _jspx_page_context.findAttribute("headTitle");
                  _005fjspx_005ftagPool_005fhst_005felement_0026_005fvar_005fname.reuse(_jspx_th_hst_005felement_005f0);
                  if (_jspx_meth_hst_005fheadContribution_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
                    return;
                  int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
              if (_jspx_meth_hst_005fcmseditlink_005f0(_jspx_th_c_005fotherwise_005f0, _jspx_page_context))
                return;
              out.write("<h2>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${document.title}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("</h2>\n");
              out.write("    <p>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${document.summary}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("</p>\n");
              out.write("    ");
              if (_jspx_meth_hst_005fhtml_005f0(_jspx_th_c_005fotherwise_005f0, _jspx_page_context))
                return;
              int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/jsp/standard/main/content.jsp(5,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty document}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_tag_005fpagenotfound_005f0(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_tag_005fpagenotfound_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:pagenotfound
    org.apache.jsp.tag.web.pagenotfound_tag _jspx_th_tag_005fpagenotfound_005f0 = new org.apache.jsp.tag.web.pagenotfound_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fpagenotfound_005f0);
    _jspx_th_tag_005fpagenotfound_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fpagenotfound_005f0.setParent(_jspx_th_c_005fwhen_005f0);
    _jspx_th_tag_005fpagenotfound_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fpagenotfound_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_hst_005felement_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_hst_005felement_005f0);
    // /WEB-INF/jsp/standard/main/content.jsp(11,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${document.title}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_hst_005fheadContribution_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  hst:headContribution
    org.hippoecm.hst.tag.HeadContributionTag _jspx_th_hst_005fheadContribution_005f0 = (org.hippoecm.hst.tag.HeadContributionTag) _005fjspx_005ftagPool_005fhst_005fheadContribution_0026_005fkeyHint_005felement_005fnobody.get(org.hippoecm.hst.tag.HeadContributionTag.class);
    _jspx_th_hst_005fheadContribution_005f0.setPageContext(_jspx_page_context);
    _jspx_th_hst_005fheadContribution_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/jsp/standard/main/content.jsp(13,6) name = keyHint type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005fheadContribution_005f0.setKeyHint("headTitle");
    // /WEB-INF/jsp/standard/main/content.jsp(13,6) name = element type = org.w3c.dom.Element reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005fheadContribution_005f0.setElement((org.w3c.dom.Element) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${headTitle}", org.w3c.dom.Element.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_hst_005fheadContribution_005f0 = _jspx_th_hst_005fheadContribution_005f0.doStartTag();
    if (_jspx_th_hst_005fheadContribution_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhst_005fheadContribution_0026_005fkeyHint_005felement_005fnobody.reuse(_jspx_th_hst_005fheadContribution_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhst_005fheadContribution_0026_005fkeyHint_005felement_005fnobody.reuse(_jspx_th_hst_005fheadContribution_005f0);
    return false;
  }

  private boolean _jspx_meth_hst_005fcmseditlink_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  hst:cmseditlink
    org.hippoecm.hst.tag.HstCmsEditLinkTag _jspx_th_hst_005fcmseditlink_005f0 = (org.hippoecm.hst.tag.HstCmsEditLinkTag) _005fjspx_005ftagPool_005fhst_005fcmseditlink_0026_005fhippobean_005fnobody.get(org.hippoecm.hst.tag.HstCmsEditLinkTag.class);
    _jspx_th_hst_005fcmseditlink_005f0.setPageContext(_jspx_page_context);
    _jspx_th_hst_005fcmseditlink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
    // /WEB-INF/jsp/standard/main/content.jsp(16,4) name = hippobean type = org.hippoecm.hst.content.beans.standard.HippoBean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005fcmseditlink_005f0.setHippobean((org.hippoecm.hst.content.beans.standard.HippoBean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${document}", org.hippoecm.hst.content.beans.standard.HippoBean.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_hst_005fcmseditlink_005f0 = _jspx_th_hst_005fcmseditlink_005f0.doStartTag();
    if (_jspx_th_hst_005fcmseditlink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhst_005fcmseditlink_0026_005fhippobean_005fnobody.reuse(_jspx_th_hst_005fcmseditlink_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhst_005fcmseditlink_0026_005fhippobean_005fnobody.reuse(_jspx_th_hst_005fcmseditlink_005f0);
    return false;
  }

  private boolean _jspx_meth_hst_005fhtml_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  hst:html
    org.hippoecm.hst.tag.HstHtmlTag _jspx_th_hst_005fhtml_005f0 = (org.hippoecm.hst.tag.HstHtmlTag) _005fjspx_005ftagPool_005fhst_005fhtml_0026_005fhippohtml_005fnobody.get(org.hippoecm.hst.tag.HstHtmlTag.class);
    _jspx_th_hst_005fhtml_005f0.setPageContext(_jspx_page_context);
    _jspx_th_hst_005fhtml_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
    // /WEB-INF/jsp/standard/main/content.jsp(19,4) name = hippohtml type = org.hippoecm.hst.content.beans.standard.HippoHtml reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005fhtml_005f0.setHippohtml((org.hippoecm.hst.content.beans.standard.HippoHtml) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${document.html}", org.hippoecm.hst.content.beans.standard.HippoHtml.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_hst_005fhtml_005f0 = _jspx_th_hst_005fhtml_005f0.doStartTag();
    if (_jspx_th_hst_005fhtml_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhst_005fhtml_0026_005fhippohtml_005fnobody.reuse(_jspx_th_hst_005fhtml_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhst_005fhtml_0026_005fhippohtml_005fnobody.reuse(_jspx_th_hst_005fhtml_005f0);
    return false;
  }
}
