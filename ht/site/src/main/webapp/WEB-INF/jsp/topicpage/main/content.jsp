<%@ include file="/WEB-INF/jspf/htmlTags.jspf"%>
<%--@elvariable id="document" type="org.example.beans.TopicDefinition"--%>
<%--@elvariable id="crPage" type="java.lang.Integer"--%>
<%--@elvariable id="info" type="com.antonyh.hutchisontechnical.hippo.componentsinfo.GeneralListInfo"--%>
<%--@elvariable id="pages" type="java.util.Collection<java.lang.Integer>"--%>
<%--@elvariable id="query" type="java.lang.String"--%>
<%--@elvariable id="sidebarresult" type="org.hippoecm.hst.content.beans.query.HstQueryResult"--%>
<%--@elvariable id="articles" type="org.hippoecm.hst.content.beans.query.HstQueryResult"--%>

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

			<div class="grid_8 pagetitle">
				<h1>${document.title}</h1>
<%-- 				<c:if test="${not empty articles.totalSize}"> Total results ${articles.totalSize}</c:if> --%>
			</div>
			<div class="grid_8">

				<ul class="overview">
					<c:forEach var="item" items="${articles.hippoBeans}">
						<c:catch var="exception">
							<hst:link var="link" hippobean="${item}" />
							<c:if test="${not empty link}">
								<hst:cmseditlink hippobean="${item}" />
								<li>
									<div>
										<p>
											<a href="${link}">${item.title}</a>
										</p>
									</div>
								</li>
							</c:if>
						</c:catch>
					</c:forEach>
				</ul>
			</div>

		</c:catch>

	</c:otherwise>
</c:choose>