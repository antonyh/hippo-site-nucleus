<%@ include file="/WEB-INF/jspf/htmlTags.jspf" %>
<%--@elvariable id="document" type="org.example.beans.TextDocument"--%>
<%--@elvariable id="headerName" type="java.lang.String"--%>
<%--@elvariable id="topmenu" type="org.hippoecm.hst.core.sitemenu.HstSiteMenu"--%>


<div id="nav" class="container_12">
<nav class="grid_12 push_0 alpha omega">

<c:forEach var="item" items="${topmenu.siteMenuItems}">
<tag:menuitem siteMenuItem="${item}"/>
</c:forEach>
<!-- <a href="#">Info</a> -->
<!-- <a href="#">Events</a> -->
<!-- <a href="#">Tech</a> -->
<!-- <a href="#">CMS & ECM</a> -->
<!-- <a href="#">Services</a> -->
<!-- <a href="#">Links</a> -->
<!-- <a href="#">Contact</a> -->
</nav>
</div>
<div class="container_12">
<div class="grid_10 sitetitle"><c:out value="${headerName}"/></div>
<div class="grid_10 sitesubtitle"><c:out value="${subHeaderName}"/></div>

<fmt:message var="submitText" key="search.submit.text"/>
<hst:link var="link" path="/search"/>
<%-- <form action="${link}" method="POST"> --%>
<!--  <input type="text" name="query"/> -->
<%--  <input type="submit" value="${submitText}"/> --%>
<!-- </form> -->
</div>
