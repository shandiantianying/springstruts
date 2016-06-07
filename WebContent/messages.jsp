<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	上传成功：
	<br /> usename:
	<s:property value="usename" />
	<br />
	<s:iterator value="file1FileName" id="f">
	文件:<s:property value="#f" />
		</br>
	</s:iterator>
</body>
</html>