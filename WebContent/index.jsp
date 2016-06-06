<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	//表单验证
	function checkform() {
		var username = document.getElementById("name");
		var userpass = document.getElementById("userAge");
		if (username.value == "") {
			alert("请输入您的登陆用户名！");
			username.focus();
			return false;
		}
		if (userpass.value == "") {
			alert("请输入您的登陆密码！");
			userpass.focus();
			return false;
		}
	}
</script>
<body>
	<form action="LoginAction.action" method="post"
		onSubmit="return checkform(this)">
		用户名:<input type="text" name="userRegisterFormBean.name" id="name">
		<br> 密码:<input type="password"
			name="userRegisterFormBean.userAge" id="userAge"> <br> <input
			type="submit" name="submit" value="登录">
	</form>
	<br>
	<s:actionmessage cssStyle="color: red; list-style-type:none;" />
	<br>
	<a href="register.jsp">注册用户</a>
</body>
</html>