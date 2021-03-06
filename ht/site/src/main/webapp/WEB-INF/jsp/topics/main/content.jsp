<%@ include file="/WEB-INF/jspf/htmlTags.jspf" %>
<%--@elvariable id="crPage" type="java.lang.Integer"--%>
<%--@elvariable id="info" type="com.antonyh.hutchisontechnical.hippo.componentsinfo.GeneralListInfo"--%>
<%--@elvariable id="pages" type="java.util.Collection<java.lang.Integer>"--%>
<%--@elvariable id="query" type="java.lang.String"--%>
<%--@elvariable id="result" type="org.hippoecm.hst.content.beans.query.HstQueryResult"--%>

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
	<div class="grid_8 pagetitle">
    <h1>
      ${info.title}
<%--       <c:if test="${not empty result.totalSize}"> Total results ${result.totalSize}</c:if> --%>
    </h1>
    </div>
    <div class="grid_8">
    <ul class="overview">
      <c:forEach var="item" items="${result.hippoBeans}">
        <hst:link var="link" hippobean="${item}"/>
        <li>
          <hst:cmseditlink hippobean="${item}"/>
          <div>
	        <p><a href="${link}">${item.title}</a></p>
          </div>
        </li>
      </c:forEach>
    </ul>
 	</div>
    <!--if there are pages on the request, they will be printed by the tag:pages -->
    <tag:pages pages="${pages}" page="${page}"/>

  </c:otherwise>
</c:choose>