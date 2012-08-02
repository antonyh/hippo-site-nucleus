<%@ include file="/WEB-INF/jspf/htmlTags.jspf" %>

<div id="main" class="container_12">
<!--     <div id="leftmenu" class="grid_2 push_8"> -->
<%-- <hst:include ref="leftmenu"/> --%>
<!--     </div> -->
    <div id="content" class="grid_8">
      <hst:include ref="content"/>
      <!-- the lists is a general 'slot' where items can be dropped in -->
      <div class="grid_8">
      <hst:include ref="lists"/>
      </div>
    </div>
    <div id="right" class="grid_4">
      <hst:include ref="right"/>
    </div>
</div>
