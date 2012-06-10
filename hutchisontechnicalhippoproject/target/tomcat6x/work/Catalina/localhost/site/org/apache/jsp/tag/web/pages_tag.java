package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pages_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:length", org.apache.taglibs.standard.functions.Functions.class, "length", new Class[] {java.lang.Object.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhst_005frenderURL_0026_005fvar;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhst_005fparam_0026_005fvalue_005fname_005fnobody;

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
  private java.util.List pages;
  private java.lang.Integer page;
  private java.lang.String query;

  public java.util.List getPages() {
    return this.pages;
  }

  public void setPages(java.util.List pages) {
    this.pages = pages;
    jspContext.setAttribute("pages", pages);
  }

  public java.lang.Integer getPage() {
    return this.page;
  }

  public void setPage(java.lang.Integer page) {
    this.page = page;
    jspContext.setAttribute("page", page);
  }

  public java.lang.String getQuery() {
    return this.query;
  }

  public void setQuery(java.lang.String query) {
    this.query = query;
    jspContext.setAttribute("query", query);
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fhst_005frenderURL_0026_005fvar = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fhst_005fparam_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) config.getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fhst_005frenderURL_0026_005fvar.release();
    _005fjspx_005ftagPool_005fhst_005fparam_0026_005fvalue_005fname_005fnobody.release();
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
    if( getPages() != null ) 
      _jspx_page_context.setAttribute("pages", getPages());
    if( getPage() != null ) 
      _jspx_page_context.setAttribute("page", getPage());
    if( getQuery() != null ) 
      _jspx_page_context.setAttribute("query", getQuery());

    try {
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/pages.tag(8,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:length(pages) gt 0}", java.lang.Boolean.class, (PageContext)this.getJspContext(), _jspx_fnmap_0, false)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("  <ul id=\"paging-nav\">\n");
          out.write("    ");
          //  c:forEach
          org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
          _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
          _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
          // /WEB-INF/tags/pages.tag(10,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_c_005fforEach_005f0.setVar("page");
          // /WEB-INF/tags/pages.tag(10,4) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pages}", java.lang.Object.class, (PageContext)this.getJspContext(), null, false));
          int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
          try {
            int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
            if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write("\n");
                out.write("      ");
                if (_jspx_meth_c_005fset_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
                  return;
                out.write("\n");
                out.write("      ");
                //  c:choose
                org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
                _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
                _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
                int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
                if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\n");
                    out.write("        ");
                    if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
                      return;
                    out.write("\n");
                    out.write("        ");
                    //  c:otherwise
                    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
                    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
                    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
                    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\n");
                        out.write("          ");
                        //  hst:renderURL
                        java.lang.String pagelink = null;
                        org.hippoecm.hst.tag.HstRenderURLTag _jspx_th_hst_005frenderURL_005f0 = (org.hippoecm.hst.tag.HstRenderURLTag) _005fjspx_005ftagPool_005fhst_005frenderURL_0026_005fvar.get(org.hippoecm.hst.tag.HstRenderURLTag.class);
                        _jspx_th_hst_005frenderURL_005f0.setPageContext(_jspx_page_context);
                        _jspx_th_hst_005frenderURL_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
                        // /WEB-INF/tags/pages.tag(17,10) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_hst_005frenderURL_005f0.setVar("pagelink");
                        int _jspx_eval_hst_005frenderURL_005f0 = _jspx_th_hst_005frenderURL_005f0.doStartTag();
                        pagelink = (java.lang.String) _jspx_page_context.findAttribute("pagelink");
                        if (_jspx_eval_hst_005frenderURL_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                          do {
                            out.write("\n");
                            out.write("            ");
                            if (_jspx_meth_hst_005fparam_005f0(_jspx_th_hst_005frenderURL_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
                              return;
                            out.write("\n");
                            out.write("            ");
                            if (_jspx_meth_hst_005fparam_005f1(_jspx_th_hst_005frenderURL_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
                              return;
                            out.write("\n");
                            out.write("          ");
                            int evalDoAfterBody = _jspx_th_hst_005frenderURL_005f0.doAfterBody();
                            pagelink = (java.lang.String) _jspx_page_context.findAttribute("pagelink");
                            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                          } while (true);
                        }
                        if (_jspx_th_hst_005frenderURL_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                          _005fjspx_005ftagPool_005fhst_005frenderURL_0026_005fvar.reuse(_jspx_th_hst_005frenderURL_005f0);
                          throw new SkipPageException();
                        }
                        pagelink = (java.lang.String) _jspx_page_context.findAttribute("pagelink");
                        _005fjspx_005ftagPool_005fhst_005frenderURL_0026_005fvar.reuse(_jspx_th_hst_005frenderURL_005f0);
                        out.write("\n");
                        out.write("          <li><a href=\"");
                        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pagelink}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
                        out.write("\" title=\"");
                        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
                        out.write('"');
                        out.write('>');
                        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
                        out.write("</a></li>\n");
                        out.write("        ");
                        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
                      throw new SkipPageException();
                    }
                    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
                    out.write("\n");
                    out.write("      ");
                    int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                }
                if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
                  throw new SkipPageException();
                }
                _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
                out.write("\n");
                out.write("    ");
                int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
                if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                  break;
              } while (true);
            }
            if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              throw new SkipPageException();
            }
          } catch (Throwable _jspx_exception) {
            while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
              out = _jspx_page_context.popBody();
            _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
          } finally {
            _jspx_th_c_005fforEach_005f0.doFinally();
            _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
          }
          out.write("\n");
          out.write("  </ul>\n");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      out.write('\n');
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/tags/pages.tag(11,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("active");
    // /WEB-INF/tags/pages.tag(11,6) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new String(""));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/tags/pages.tag(13,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${crPage == page}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("          <li>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
        out.write("</li>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_hst_005fparam_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_hst_005frenderURL_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  hst:param
    org.hippoecm.hst.tag.ParamTag _jspx_th_hst_005fparam_005f0 = (org.hippoecm.hst.tag.ParamTag) _005fjspx_005ftagPool_005fhst_005fparam_0026_005fvalue_005fname_005fnobody.get(org.hippoecm.hst.tag.ParamTag.class);
    _jspx_th_hst_005fparam_005f0.setPageContext(_jspx_page_context);
    _jspx_th_hst_005fparam_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_hst_005frenderURL_005f0);
    // /WEB-INF/tags/pages.tag(18,12) name = name type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005fparam_005f0.setName("page");
    // /WEB-INF/tags/pages.tag(18,12) name = value type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005fparam_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
    int _jspx_eval_hst_005fparam_005f0 = _jspx_th_hst_005fparam_005f0.doStartTag();
    if (_jspx_th_hst_005fparam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhst_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_hst_005fparam_005f0);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fhst_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_hst_005fparam_005f0);
    return false;
  }

  private boolean _jspx_meth_hst_005fparam_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_hst_005frenderURL_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  hst:param
    org.hippoecm.hst.tag.ParamTag _jspx_th_hst_005fparam_005f1 = (org.hippoecm.hst.tag.ParamTag) _005fjspx_005ftagPool_005fhst_005fparam_0026_005fvalue_005fname_005fnobody.get(org.hippoecm.hst.tag.ParamTag.class);
    _jspx_th_hst_005fparam_005f1.setPageContext(_jspx_page_context);
    _jspx_th_hst_005fparam_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_hst_005frenderURL_005f0);
    // /WEB-INF/tags/pages.tag(19,12) name = name type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005fparam_005f1.setName("query");
    // /WEB-INF/tags/pages.tag(19,12) name = value type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005fparam_005f1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${query}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
    int _jspx_eval_hst_005fparam_005f1 = _jspx_th_hst_005fparam_005f1.doStartTag();
    if (_jspx_th_hst_005fparam_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhst_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_hst_005fparam_005f1);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fhst_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_hst_005fparam_005f1);
    return false;
  }
}
