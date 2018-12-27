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
<link href="<%=basePath %>/css/login.css" rel="stylesheet">
<script type="text/javascript">

$(document).ready(function(){
	if('${msg}'!=''){
		alert('${msg}')
	}
});

function fnOnClick(){
	$("#form").submit();
}
</script>
<body>
<div class="user_div">
<form id="form" action="logon.html" >
用户名：<input name="username" />
密&nbsp;&nbsp;&nbsp;码：<input name="password" type="password" />
<input type="button" value="提交" onclick="fnOnClick();"/>
</div>
</form>
</body>
</html>