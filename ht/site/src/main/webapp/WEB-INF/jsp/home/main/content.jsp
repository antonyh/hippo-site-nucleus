<%@ include file="/WEB-INF/jspf/htmlTags.jspf"%>
<%--@elvariable id="document" type="org.example.beans.TextDocument"--%>
<%--@elvariable id="headTitle" type="java.lang.String"--%>

<%--@elvariable id="crPage" type="java.lang.Integer"--%>
<%--@elvariable id="info" type="com.antonyh.hutchisontechnical.hippo.componentsinfo.GeneralListInfo"--%>
<%--@elvariable id="pages" type="java.util.Collection<java.lang.Integer>"--%>
<%--@elvariable id="query" type="java.lang.String"--%>
<%--@elvariable id="result" type="org.hippoecm.hst.content.beans.query.HstQueryResult"--%>
 
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

		<div class="grid_12 alpha omega homebody">
			 <hst:html hippohtml="${document.html}" />
		</div>

	</c:otherwise>
</c:choose>
 
<c:choose>
  <c:when test="${empty info}">
    <tag:pagenotfound/>
  </c:when>
  <c:otherwise>
    <c:if test="${not empty info.title}">
      <hst:element var="headTitle" name="title">
        <c:out value="${info.title}"/>
      </hst:element>
      <hst:headContribution keyHint="headTitle" element="${headTitle}"/>
    </c:if>


    <div class="grid_12 alpha omega">

      <c:forEach var="item" items="${result.hippoBeans}" varStatus="status">
 
          <hst:cmseditlink hippobean="${item}"/>

          	<c:catch var="exception">
          	 
				<c:if test="${not empty item.image}">
					<hst:link var="img" hippobean="${item.image.original}"/>
					<hst:link var="link" hippobean="${item}"/>
					<a href="${link}">
	      			<div class="imageblock grid_4 alpha homebody" style="background-image:url('${img}');">
						<div>${item.summary}</div>
					</div>
					</a>
				</c:if>
 
			</c:catch>
			
      </c:forEach>

 	</div>
 	
    <!--if there are pages on the request, they will be printed by the tag:pages -->
    <tag:pages pages="${pages}" page="${page}"/>

  </c:otherwise>
</c:choose>