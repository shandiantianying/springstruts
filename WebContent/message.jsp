<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>上传成功</title>
</head>
<body>
上传成功: <br/>  
    usename: <s:property value="username" /><br/>  
    file: <s:property value="fileFileName"/><br/>  
    contentType: <s:property value="fileContentType"/>  
  
</body>
</html>