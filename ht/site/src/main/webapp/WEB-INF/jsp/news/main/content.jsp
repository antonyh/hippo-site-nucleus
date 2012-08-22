<%@ include file="/WEB-INF/jspf/htmlTags.jspf"%>
<%--@elvariable id="document" type="org.example.beans.NewsDocument"--%>
 
<c:choose>
	<c:when test="${empty document}">
		<tag:pagenotfound />
	</c:when>
	<c:otherwise>
		<c:if test="${not empty document.title}">
			<hst:element var="headTitle" name="title">
				<c:out value="${document.title}" />
			</hst:element>
			<hst:headContribution keyHint="headTitle" element="${headTitle}" />
		</c:if>

		<hst:cmseditlink hippobean="${document}" />
		<div class="grid_8 push_0 pagetitle">
			<h1>${document.title}</h1>
			<c:if test="${hst:isReadable(document, 'date.time')}">
				<div class="date">
					<fmt:formatDate value="${document.date.time}" type="Date" />
				</div>
			</c:if>
		</div>

		<div class="grid_7 push_0 ">
			<article>
				<c:choose>
					<c:when test="${hst:isReadable(document, 'image.original')}">
						<hst:link var="img" hippobean="${document.image.original}" />
						<h2>${document.summary}</h2>
       					${document.image.description}
       <%
				 //I've elected to not show the image. Uncomment this to use the document image. 
				 //you might want to change things around to fit your html.
				 %>
<%--         <img src="${img}" title="${document.image.fileName}" --%>
<%-- 							alt="${document.image.fileName}" /> --%>
					</c:when>
					<c:otherwise>
					<h3>${document.summary}</h3>
					</c:otherwise>
				</c:choose>
				
				<div class="grid_8 alpha omega"><hst:html hippohtml="${document.html}" /></div>
				 
				 <%
				 //display value propositions
				 %>
				<c:forEach var="item" items="${valueresult}">
				<div class="grid_8 alpha omega">
					<h3>${item.title}</h3>
					<p>Cras eu tortor sem. Praesent vitae dolor augue. Curabitur in elit sit amet leo vehicula sodales quis in lorem. Ut mattis sollicitudin nunc, vel ultrices velit tincidunt nec. Morbi congue tincidunt metus ut condimentum. Donec facilisis, risus a hendrerit ullamcorper, tellus odio luctus nisl, non blandit neque elit sit amet erat. Maecenas varius ante et sem ullamcorper et commodo mi vehicula.</p>
				</div>
				</c:forEach>
			</article>
		</div>
	</c:otherwise>
</c:choose>