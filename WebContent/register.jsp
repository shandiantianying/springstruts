<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="registerAction.action" method ="post">
用户名:<input type ="text" name = "userRegisterFormBean.name" >
<br>
密码:<input type ="password" name = "userRegisterFormBean.pwd" >
<br>
年龄:<input type ="text" name = "userRegisterFormBean.userAge" >
<br>
地址:<input type ="text" name = "userRegisterFormBean.userAddress" >
<br>
<input type = "submit" name ="submit" value = "注册">
</form>
</body>
</html>