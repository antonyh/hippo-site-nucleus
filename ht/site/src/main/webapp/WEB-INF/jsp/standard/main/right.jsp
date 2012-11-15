<%@ include file="/WEB-INF/jspf/htmlTags.jspf" %>
<%--@elvariable id="document" type="org.example.beans.TextDocument"--%>
<%--@elvariable id="sidebarresult" type="org.hippoecm.hst.content.beans.query.HstQueryResult"--%>
<div class="grid_4">
	<c:forEach var="item" items="${sidebarresult.hippoBeans}">
        <hst:link var="link" hippobean="${item}"/>
			<c:if test="${item != document}">
          	<c:catch var="exception">
          	<!-- ${item} -->
 				<c:if test="${not empty item.image.original}"> 
   		            <hst:cmseditlink hippobean="${item}"/>
					<hst:link var="img" hippobean="${item.image.original}"/>
					<hst:link var="link" hippobean="${item}"/>
					<a href="${link}">
	      			<div class="imageblock grid_4 alpha omega homebody" style="background-image:url('${img}');">
						<div>${item.summary}</div>
					</div>
					</a> 
 				</c:if> 
			</c:catch>
			</c:if>
      </c:forEach>
</div>