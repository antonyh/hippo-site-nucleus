<%@ include file="/WEB-INF/jspf/htmlTags.jspf" %>
<%--@elvariable id="document" type="org.example.beans.TextDocument"--%>
<%--@elvariable id="headTitle" type="java.lang.String"--%>
HOME CONTENT BADGER
<c:choose>
  <c:when test="${empty document}">
    <tag:pagenotfound/>
  </c:when>
  <c:otherwise>
    <c:if test="${not empty document.title}">
      <hst:element var="headTitle" name="title">
        <c:out value="${document.title}"/>
      </hst:element>
      <hst:headContribution keyHint="headTitle" element="${headTitle}"/>
    </c:if>

    <hst:cmseditlink hippobean="${document}"/>


<div class="grid_12 homepage_section" style="background:url('/site/images/test/turtle.jpg')"><div>homepage 940x220</div></div>
<div class="grid_12">
<div class="grid_6 alpha homepage_section" style="background:url('/site/images/test/gl11.jpg')"><div>homepage 460x220</div></div>
<div class="grid_6 omega homepage_section" style="background:url('/site/images/test/test.jpg')"><div>homepage 460x220</div></div>
</div>

<div class="grid_4">
    <div class="imageblock grid_4"><div>I18n key example: <fmt:message key="home.title"/></div></div>
    <div class="imageblock grid_4"><div>${document.summary}</div></div>
    <hst:include ref="bingo"/>
    <div class="imageblock grid_4"><div>homepage 300x225</div></div>
</div>

<div class="grid_8 alpha omega"><hst:html hippohtml="${document.html}"/></div>


  </c:otherwise>
</c:choose>
