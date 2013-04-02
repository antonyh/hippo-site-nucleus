<!DOCTYPE html>
<%@ include file="/WEB-INF/jspf/htmlTags.jspf" %>
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
    <hst:headContributions categoryExcludes="scripts" />
    <hst:link var="link" path="/css/style.css"/>
    <link href='http://fonts.googleapis.com/css?family=Ledger|Quando' rel='stylesheet' type='text/css'/>
    <link rel="stylesheet" href="${link}" type="text/css"/>
    <meta name="viewport" content="width=device-width">
  </head>
  <body>

    <hst:include ref="header"/>
    <hst:include ref="main"/>

    <hst:headContributions categoryIncludes="scripts"/>
    <hst:include ref="footer"/>

	<c:if test="${not composermode}">
		<ga:accountId/>
		<hst:link var="googleAnalytics" path="/resources/google-analytics.js"/>
		<script src="${googleAnalytics}" type="text/javascript"></script>
	</c:if>
	
  </body>
</html>
