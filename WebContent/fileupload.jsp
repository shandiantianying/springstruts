<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="script/jquery-1.8.1.js"></script>
<script type="text/javascript">
	$(function() {
		$("#button")
				.click(
						function() {
							var html = $("<input type='file' name='file'>");
							var button = $("<input type='button' name='button' value='删除'><br>");

							$("#body div").append(html).append(button);

							button.click(function() {
								html.remove();
								button.remove();
							})
						})
	})
</script>
</head>
<body>
	<h1>-----------------------单个文件上传----------------------------</h1>
	<form action="fileUpload.action" enctype="multipart/form-data"
		method="post">
		username: <input type="text" name="username"><br> file: <input
			type="file" name="file"><br> <input type="submit"
			value="提交">
	</form>

	<h1>-----------------------文件上传列表----------------------------</h1>

	<form action="fileUploads.action" enctype="multipart/form-data"
		method="post">

		username:<input type="text" name="username"><br> file:<input
			type="file" name="file1"> <input type="button" value="添加"
			id="button"><br> 上传文件：<input type="file" name="file1"><br />
		上传文件： <input type="file" name="file1"><br />
		<div></div>
		<input type="submit" value="submit">

	</form>



























</body>
</html>