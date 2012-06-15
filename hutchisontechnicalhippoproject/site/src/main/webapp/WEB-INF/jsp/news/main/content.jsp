<%@ include file="/WEB-INF/jspf/htmlTags.jspf" %>
<%--@elvariable id="document" type="org.example.beans.NewsDocument"--%>

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
    <div class="grid_7 push_1 pagetitle"><h2>${document.title}</h2></div>
    <div class="grid_5 push_3">
    <c:if test="${hst:isReadable(document, 'date.time')}">
      <p><fmt:formatDate value="${document.date.time}" type="Date"/></p>
    </c:if>
    <p>${document.summary}</p>
    <hst:html hippohtml="${document.html}"/>
    <c:if test="${hst:isReadable(document, 'image.original')}">
      <hst:link var="img" hippobean="${document.image.original}"/>
      <p>
        <br/>
        <img src="${img}" title="${document.image.fileName}"
          alt="${document.image.fileName}"/>
        <br/>
        ${document.image.description}
      </p>
    </c:if>
    </div>
  </c:otherwise>
</c:choose>
hey