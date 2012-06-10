package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pagenotfound_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhst_005felement_0026_005fvar_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhst_005fheadContribution_0026_005fkeyHint_005felement_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public void setJspContext(JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public JspContext getJspContext() {
    return this.jspContext;
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _005fjspx_005ftagPool_005fhst_005felement_0026_005fvar_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fhst_005fheadContribution_0026_005fkeyHint_005felement_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) config.getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhst_005felement_0026_005fvar_005fname.release();
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fhst_005fheadContribution_0026_005fkeyHint_005felement_005fnobody.release();
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();
    _jspInit(config);
    jspContext.getELContext().putContext(JspContext.class,jspContext);

    try {
      out.write('\n');
      out.write('\n');
      out.write('\n');
      //  hst:element
      org.w3c.dom.Element headTitle = null;
      org.hippoecm.hst.tag.HstElementTag _jspx_th_hst_005felement_005f0 = (org.hippoecm.hst.tag.HstElementTag) _005fjspx_005ftagPool_005fhst_005felement_0026_005fvar_005fname.get(org.hippoecm.hst.tag.HstElementTag.class);
      _jspx_th_hst_005felement_005f0.setPageContext(_jspx_page_context);
      _jspx_th_hst_005felement_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/pagenotfound.tag(4,0) name = var type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_hst_005felement_005f0.setVar("headTitle");
      // /WEB-INF/tags/pagenotfound.tag(4,0) name = name type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          out.write("\n");
          out.write("   ");
          if (_jspx_meth_fmt_005fmessage_005f0(_jspx_th_hst_005felement_005f0, _jspx_page_context))
            return;
          out.write('\n');
          out.write(' ');
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
        throw new SkipPageException();
      }
      headTitle = (org.w3c.dom.Element) _jspx_page_context.findAttribute("headTitle");
      _005fjspx_005ftagPool_005fhst_005felement_0026_005fvar_005fname.reuse(_jspx_th_hst_005felement_005f0);
      out.write('\n');
      if (_jspx_meth_hst_005fheadContribution_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<h2>");
      if (_jspx_meth_fmt_005fmessage_005f1(_jspx_page_context))
        return;
      out.write("</h2>");
    } catch( Throwable t ) {
      if( t instanceof SkipPageException )
          throw (SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof IllegalStateException )
          throw (IllegalStateException) t;
      if( t instanceof JspException )
          throw (JspException) t;
      throw new JspException(t);
    } finally {
      jspContext.getELContext().putContext(JspContext.class,super.getJspContext());
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_fmt_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_hst_005felement_005f0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_hst_005felement_005f0);
    // /WEB-INF/tags/pagenotfound.tag(5,3) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f0.setKey("page.not.found");
    int _jspx_eval_fmt_005fmessage_005f0 = _jspx_th_fmt_005fmessage_005f0.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_hst_005fheadContribution_005f0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  hst:headContribution
    org.hippoecm.hst.tag.HeadContributionTag _jspx_th_hst_005fheadContribution_005f0 = (org.hippoecm.hst.tag.HeadContributionTag) _005fjspx_005ftagPool_005fhst_005fheadContribution_0026_005fkeyHint_005felement_005fnobody.get(org.hippoecm.hst.tag.HeadContributionTag.class);
    _jspx_th_hst_005fheadContribution_005f0.setPageContext(_jspx_page_context);
    _jspx_th_hst_005fheadContribution_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/pagenotfound.tag(7,0) name = keyHint type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005fheadContribution_005f0.setKeyHint("headTitle");
    // /WEB-INF/tags/pagenotfound.tag(7,0) name = element type = org.w3c.dom.Element reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005fheadContribution_005f0.setElement((org.w3c.dom.Element) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${headTitle}", org.w3c.dom.Element.class, (PageContext)this.getJspContext(), null, false));
    int _jspx_eval_hst_005fheadContribution_005f0 = _jspx_th_hst_005fheadContribution_005f0.doStartTag();
    if (_jspx_th_hst_005fheadContribution_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhst_005fheadContribution_0026_005fkeyHint_005felement_005fnobody.reuse(_jspx_th_hst_005fheadContribution_005f0);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fhst_005fheadContribution_0026_005fkeyHint_005felement_005fnobody.reuse(_jspx_th_hst_005fheadContribution_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/pagenotfound.tag(8,4) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f1.setKey("page.not.found");
    int _jspx_eval_fmt_005fmessage_005f1 = _jspx_th_fmt_005fmessage_005f1.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f1);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f1);
    return false;
  }
}
