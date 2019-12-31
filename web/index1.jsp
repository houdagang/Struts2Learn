<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>File Upload</title>
</head>
<body>
<form action="upload" method="post" enctype="multipart/form-data">
    <label for="myFile">Upload your file</label>
    <input type="file" name="myFile" />
    <input type="submit" value="Upload"/>
</form>
</body>
</html>