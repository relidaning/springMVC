<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
		+ request.getServerName() + ":" + request.getServerPort()
		+ path;
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:include page="../common/header.jsp"></jsp:include>
<link href="<%=basePath %>/css/index.css" rel="stylesheet">
<script type="text/javascript">

$(document).ready(function(){
	
});

</script>

<body style="background-color:#FFFFFF; margin-top: 0px; margin-bottom: 0px; margin-left: 0px; margin-right: 0px;">
<!-- Save for Web Slices (未标题-1) -->
<div class="__01">
	<div class="note-01">
		<img src="/images/note_01.gif" width="1366" height="45" alt="">
	</div>
	<div class="note-02">
		<img src="/images/note_02.gif" width="186" height="621" alt="">
	</div>
	<div class="note-03">
		<img src="/images/note_03.gif" width="239" height="61" alt="">
	</div>
	<div class="note-04">
		<img src="/images/note_04.gif" width="941" height="61" alt="">
	</div>
	<div class="note-05">
		<img src="/images/note_05.gif" width="239" height="560" alt="">
	</div>
	<div class="note-06">
		<img src="/images/note_06.gif" width="187" height="37" alt="">
	</div>
	<div class="note-07">
		<img src="/images/note_07.gif" width="754" height="37" alt="">
	</div>
	<div class="note-08">
		<img src="/images/note_08.gif" width="941" height="30" alt="">
	</div>
	<div class="note-09">
		<img src="/images/note_09.gif" width="941" height="493" alt="">
	</div>
	<div class="note-10">
		<img src="/images/note_10.gif" width="1366" height="29" alt="">
	</div>
</div>
<!-- End Save for Web Slices -->
</body>
</html>