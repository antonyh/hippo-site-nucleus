package org.apache.jsp.WEB_002dINF.jsp.standard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/jspf/htmlTags.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/taglibs.jspf");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.release();
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

      out.write("<div id=\"main\">\n");
      out.write("    <div id=\"leftmenu\">\n");
      out.write("      ");
      if (_jspx_meth_hst_005finclude_005f0(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("    <div id=\"content\">\n");
      out.write("      ");
      if (_jspx_meth_hst_005finclude_005f1(_jspx_page_context))
        return;
      out.write("<!-- the lists is a general 'slot' where items can be dropped in -->\n");
      out.write("      ");
      if (_jspx_meth_hst_005finclude_005f2(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("    <div id=\"right\">\n");
      out.write("      ");
      if (_jspx_meth_hst_005finclude_005f3(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("</div>\n");
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

  private boolean _jspx_meth_hst_005finclude_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  hst:include
    org.hippoecm.hst.tag.HstIncludeTag _jspx_th_hst_005finclude_005f0 = (org.hippoecm.hst.tag.HstIncludeTag) _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.get(org.hippoecm.hst.tag.HstIncludeTag.class);
    _jspx_th_hst_005finclude_005f0.setPageContext(_jspx_page_context);
    _jspx_th_hst_005finclude_005f0.setParent(null);
    // /WEB-INF/jsp/standard/main.jsp(5,6) name = ref type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005finclude_005f0.setRef("leftmenu");
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
    // /WEB-INF/jsp/standard/main.jsp(8,6) name = ref type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005finclude_005f1.setRef("content");
    int _jspx_eval_hst_005finclude_005f1 = _jspx_th_hst_005finclude_005f1.doStartTag();
    if (_jspx_th_hst_005finclude_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.reuse(_jspx_th_hst_005finclude_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.reuse(_jspx_th_hst_005finclude_005f1);
    return false;
  }

  private boolean _jspx_meth_hst_005finclude_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  hst:include
    org.hippoecm.hst.tag.HstIncludeTag _jspx_th_hst_005finclude_005f2 = (org.hippoecm.hst.tag.HstIncludeTag) _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.get(org.hippoecm.hst.tag.HstIncludeTag.class);
    _jspx_th_hst_005finclude_005f2.setPageContext(_jspx_page_context);
    _jspx_th_hst_005finclude_005f2.setParent(null);
    // /WEB-INF/jsp/standard/main.jsp(10,6) name = ref type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005finclude_005f2.setRef("lists");
    int _jspx_eval_hst_005finclude_005f2 = _jspx_th_hst_005finclude_005f2.doStartTag();
    if (_jspx_th_hst_005finclude_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.reuse(_jspx_th_hst_005finclude_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.reuse(_jspx_th_hst_005finclude_005f2);
    return false;
  }

  private boolean _jspx_meth_hst_005finclude_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  hst:include
    org.hippoecm.hst.tag.HstIncludeTag _jspx_th_hst_005finclude_005f3 = (org.hippoecm.hst.tag.HstIncludeTag) _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.get(org.hippoecm.hst.tag.HstIncludeTag.class);
    _jspx_th_hst_005finclude_005f3.setPageContext(_jspx_page_context);
    _jspx_th_hst_005finclude_005f3.setParent(null);
    // /WEB-INF/jsp/standard/main.jsp(13,6) name = ref type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005finclude_005f3.setRef("right");
    int _jspx_eval_hst_005finclude_005f3 = _jspx_th_hst_005finclude_005f3.doStartTag();
    if (_jspx_th_hst_005finclude_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.reuse(_jspx_th_hst_005finclude_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.reuse(_jspx_th_hst_005finclude_005f3);
    return false;
  }
}
