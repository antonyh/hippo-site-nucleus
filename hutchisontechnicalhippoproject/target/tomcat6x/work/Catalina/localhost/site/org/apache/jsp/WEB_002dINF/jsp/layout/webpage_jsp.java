package org.apache.jsp.WEB_002dINF.jsp.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class webpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/jspf/htmlTags.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/taglibs.jspf");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhst_005fheadContributions_0026_005fcategoryExcludes_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhst_005flink_0026_005fvar_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhst_005fheadContributions_0026_005fcategoryIncludes_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhst_005fheadContributions_0026_005fcategoryExcludes_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhst_005flink_0026_005fvar_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhst_005fheadContributions_0026_005fcategoryIncludes_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhst_005fheadContributions_0026_005fcategoryExcludes_005fnobody.release();
    _005fjspx_005ftagPool_005fhst_005flink_0026_005fvar_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.release();
    _005fjspx_005ftagPool_005fhst_005fheadContributions_0026_005fcategoryIncludes_005fnobody.release();
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html;charset=utf-8\" />\n");
      out.write("    ");
      if (_jspx_meth_hst_005fheadContributions_005f0(_jspx_page_context))
        return;
      //  hst:link
      java.lang.String link = null;
      org.hippoecm.hst.tag.HstLinkTag _jspx_th_hst_005flink_005f0 = (org.hippoecm.hst.tag.HstLinkTag) _005fjspx_005ftagPool_005fhst_005flink_0026_005fvar_005fpath_005fnobody.get(org.hippoecm.hst.tag.HstLinkTag.class);
      _jspx_th_hst_005flink_005f0.setPageContext(_jspx_page_context);
      _jspx_th_hst_005flink_005f0.setParent(null);
      // /WEB-INF/jsp/layout/webpage.jsp(7,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_hst_005flink_005f0.setVar("link");
      // /WEB-INF/jsp/layout/webpage.jsp(7,4) name = path type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_hst_005flink_005f0.setPath("/css/style.css");
      int _jspx_eval_hst_005flink_005f0 = _jspx_th_hst_005flink_005f0.doStartTag();
      link = (java.lang.String) _jspx_page_context.findAttribute("link");
      if (_jspx_th_hst_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhst_005flink_0026_005fvar_005fpath_005fnobody.reuse(_jspx_th_hst_005flink_005f0);
        return;
      }
      link = (java.lang.String) _jspx_page_context.findAttribute("link");
      _005fjspx_005ftagPool_005fhst_005flink_0026_005fvar_005fpath_005fnobody.reuse(_jspx_th_hst_005flink_005f0);
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${link}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" type=\"text/css\"/>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    ");
      if (_jspx_meth_hst_005finclude_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_hst_005finclude_005f1(_jspx_page_context))
        return;
      if (_jspx_meth_hst_005fheadContributions_005f1(_jspx_page_context))
        return;
      out.write("</body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_hst_005fheadContributions_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  hst:headContributions
    org.hippoecm.hst.tag.HeadContributionsTag _jspx_th_hst_005fheadContributions_005f0 = (org.hippoecm.hst.tag.HeadContributionsTag) _005fjspx_005ftagPool_005fhst_005fheadContributions_0026_005fcategoryExcludes_005fnobody.get(org.hippoecm.hst.tag.HeadContributionsTag.class);
    _jspx_th_hst_005fheadContributions_005f0.setPageContext(_jspx_page_context);
    _jspx_th_hst_005fheadContributions_005f0.setParent(null);
    // /WEB-INF/jsp/layout/webpage.jsp(6,4) name = categoryExcludes type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005fheadContributions_005f0.setCategoryExcludes("scripts");
    int _jspx_eval_hst_005fheadContributions_005f0 = _jspx_th_hst_005fheadContributions_005f0.doStartTag();
    if (_jspx_th_hst_005fheadContributions_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhst_005fheadContributions_0026_005fcategoryExcludes_005fnobody.reuse(_jspx_th_hst_005fheadContributions_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhst_005fheadContributions_0026_005fcategoryExcludes_005fnobody.reuse(_jspx_th_hst_005fheadContributions_005f0);
    return false;
  }

  private boolean _jspx_meth_hst_005finclude_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  hst:include
    org.hippoecm.hst.tag.HstIncludeTag _jspx_th_hst_005finclude_005f0 = (org.hippoecm.hst.tag.HstIncludeTag) _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.get(org.hippoecm.hst.tag.HstIncludeTag.class);
    _jspx_th_hst_005finclude_005f0.setPageContext(_jspx_page_context);
    _jspx_th_hst_005finclude_005f0.setParent(null);
    // /WEB-INF/jsp/layout/webpage.jsp(11,4) name = ref type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005finclude_005f0.setRef("header");
    int _jspx_eval_hst_005finclude_005f0 = _jspx_th_hst_005finclude_005f0.doStartTag();
    if (_jspx_th_hst_005finclude_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.reuse(_jspx_th_hst_005finclude_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.reuse(_jspx_th_hst_005finclude_005f0);
    return false;
  }

  private boolean _jspx_meth_hst_005finclude_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  hst:include
    org.hippoecm.hst.tag.HstIncludeTag _jspx_th_hst_005finclude_005f1 = (org.hippoecm.hst.tag.HstIncludeTag) _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.get(org.hippoecm.hst.tag.HstIncludeTag.class);
    _jspx_th_hst_005finclude_005f1.setPageContext(_jspx_page_context);
    _jspx_th_hst_005finclude_005f1.setParent(null);
    // /WEB-INF/jsp/layout/webpage.jsp(12,4) name = ref type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005finclude_005f1.setRef("main");
    int _jspx_eval_hst_005finclude_005f1 = _jspx_th_hst_005finclude_005f1.doStartTag();
    if (_jspx_th_hst_005finclude_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.reuse(_jspx_th_hst_005finclude_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.reuse(_jspx_th_hst_005finclude_005f1);
    return false;
  }

  private boolean _jspx_meth_hst_005fheadContributions_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  hst:headContributions
    org.hippoecm.hst.tag.HeadContributionsTag _jspx_th_hst_005fheadContributions_005f1 = (org.hippoecm.hst.tag.HeadContributionsTag) _005fjspx_005ftagPool_005fhst_005fheadContributions_0026_005fcategoryIncludes_005fnobody.get(org.hippoecm.hst.tag.HeadContributionsTag.class);
    _jspx_th_hst_005fheadContributions_005f1.setPageContext(_jspx_page_context);
    _jspx_th_hst_005fheadContributions_005f1.setParent(null);
    // /WEB-INF/jsp/layout/webpage.jsp(13,4) name = categoryIncludes type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005fheadContributions_005f1.setCategoryIncludes("scripts");
    int _jspx_eval_hst_005fheadContributions_005f1 = _jspx_th_hst_005fheadContributions_005f1.doStartTag();
    if (_jspx_th_hst_005fheadContributions_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhst_005fheadContributions_0026_005fcategoryIncludes_005fnobody.reuse(_jspx_th_hst_005fheadContributions_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhst_005fheadContributions_0026_005fcategoryIncludes_005fnobody.reuse(_jspx_th_hst_005fheadContributions_005f1);
    return false;
  }
}
