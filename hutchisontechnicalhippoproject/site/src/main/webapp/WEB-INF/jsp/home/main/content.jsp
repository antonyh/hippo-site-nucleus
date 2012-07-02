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
		empty document <tag:pagenotfound />
	</c:when>
	<c:otherwise>
		<c:if test="${not empty document.title}">
			<hst:element var="headTitle" name="title">
				<c:out value="${document.title}" />
			</hst:element>
			<hst:headContribution keyHint="headTitle" element="${headTitle}" />
		</c:if>

		<hst:cmseditlink hippobean="${document}" />

		<!-- <div class="grid_12 homepage_section" style="background:url('/site/images/test/turtle.jpg')"><div>homepage 940x220</div></div> -->
		<!-- <div class="grid_12"> -->
		<!-- <div class="grid_6 alpha homepage_section" style="background:url('/site/images/test/gl11.jpg')"><div>homepage 460x220</div></div> -->
		<!-- <div class="grid_6 omega homepage_section" style="background:url('/site/images/test/test.jpg')"><div>homepage 460x220</div></div> -->
		<!-- </div> -->

		<div class="grid_8 alpha omega homebody">
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

      <c:forEach var="item" items="${result.hippoBeans}">
        <hst:link var="link" hippobean="${item}"/>
          <hst:cmseditlink hippobean="${item}"/>

<!--           <div> -->
<%-- 	        <p><a href="${link}">${item.title}</a></p> --%>
<%--             <c:if test="${hst:isReadable(item, 'date.time')}"> --%>
<%--               <p><fmt:formatDate value="${item.date.time}" type="Date" pattern="MMMM d, yyyy h:mm a"/></p> --%>
<%--             </c:if> --%>

<%--             <p>${item.summary}</p> --%>
<!--           </div> -->

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