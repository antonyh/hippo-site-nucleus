<%@ include file="/WEB-INF/jspf/htmlTags.jspf" %>
<%--@elvariable id="document" type="org.example.beans.TextDocument"--%>

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
    <article>
    <div class="grid_8 pagetitle"><h1>${document.title}</h1></div>
    <div class="grid_8 alpha omega">
    	<div class="grid_4 alpha pageimage"><div>${document.summary}</div></div>
    	<hst:html hippohtml="${document.html}"/>
    </div>
    </article>
  </c:otherwise>
</c:choose>