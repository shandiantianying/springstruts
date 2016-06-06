<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
<script type="text/javascript">
	//表单验证
	function checkform() {
		var name = document.getElementById("name");
		var pwd = document.getElementById("pwd");
		var userAge = document.getElementById("userAge");
		var userAddress = document.getElementById("userAddress");
		if (name.value == "") {
			alert("请输入名称！");
			name.focus();
			return false;
		}
		if (pwd.value == "") {
			alert("请输入密码！");
			pwd.focus();
			return false;
		}
		if (userAge.value == "") {
			alert("请输入密码！");
			userAge.focus();
			return false;
		}
		if (userAddress.value == "") {
			alert("请输入密码！");
			userAddress.focus();
			return false;
		}
	}
</script>
</head>
<body>
	<form action="registerAction.action" method="post"
		onsubmit="return checkform(this)">
		用户名:<input type="text" name="userRegisterFormBean.name" id="name">
		<br> 密码:<input type="password" name="userRegisterFormBean.pwd"
			id="pwd"> <br> 年龄:<input type="text"
			name="userRegisterFormBean.userAge" id="userAge"> <br>
		地址:<input type="text" name="userRegisterFormBean.userAddress"
			id="userAddress"> <br> <input type="submit"
			name="submit" value="注册">
		<s:actionmessage cssStyle="color: red; list-style-type:none;" />
	</form>
</body>
</html>