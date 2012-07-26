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
    <div class="grid_8 push_0 pagetitle">
	    <h1>${document.title}</h1>
	    <c:if test="${hst:isReadable(document, 'date.time')}">
	      <div class="date"><fmt:formatDate value="${document.date.time}" type="Date"/></div>
	    </c:if>
    </div>
    
    <div class="grid_7 push_0">
    
    <c:if test="${hst:isReadable(document, 'image.original')}">
      <hst:link var="img" hippobean="${document.image.original}"/>
      <p>
        <br/>
        <img src="${img}" title="${document.image.fileName}"  
          alt="${document.image.fileName}"/>
         <h3>${document.summary}</h3>
        ${document.image.description}
      </p>
    </c:if>

    <hst:html hippohtml="${document.html}"/>

    </div>
  </c:otherwise>
</c:choose>