<%@ include file="/WEB-INF/jspf/htmlTags.jspf"%>
<%--@elvariable id="document" type="org.example.beans.TextDocument"--%>
 
<c:choose>
	<c:when test="${empty document}">
		<tag:pagenotfound />
	</c:when>
	<c:otherwise>
		<c:catch var="exception">
			<c:if test="${not empty document.title}">
				<hst:element var="headTitle" name="title">
					<c:out value="${document.title}" />
				</hst:element>
				<hst:headContribution keyHint="headTitle" element="${headTitle}" />
			</c:if>

			<hst:cmseditlink hippobean="${document}" />


			<hst:link var="img" hippobean="${document.image.original}" />
			<article>
				<div class="grid_8 pagetitle">
					<h1>${document.title}</h1>
				</div>
				<div class="grid_8 alpha omega">
					<c:if test="${hst:isReadable(document, 'image.original')}">
						<div class="grid_4 alpha imageblock framed"
							style="background-image:url('${img}');">
							<div>${document.summary}</div>
						</div>
					</c:if>
					<hst:html hippohtml="${document.html}" />
				</div>
				
			</article>
		</c:catch>

	</c:otherwise>
</c:choose>