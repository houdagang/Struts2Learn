<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>Employee Form</title>
</head>
<body>
    <s:form action="empinfo" method="post">
        <s:textfield name="name" label="Name" size="20" />
        <s:textfield name="age" label="Age" size="20" />
        <s:submit name="submit" label="Submit" align="center" />
    </s:form>
</body>
</html>