<!doctype html>
<%@ include file="/WEB-INF/jspf/htmlTags.jspf" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
    <hst:headContributions categoryExcludes="scripts" />
    <hst:link var="link" path="/css/style.css"/>
    <link rel="stylesheet" href="${link}" type="text/css"/>
  </head>
  <body>
    <hst:include ref="header"/>
    <hst:include ref="main"/>
    <hst:headContributions categoryIncludes="scripts"/>
  </body>
</html>
