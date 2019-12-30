<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>Hello World</title>
</head>
<body>
    <h1>Hello World From Struts2</h1>
    <%-- 这个action里面 someother == someother.action --%>
    <%--<form action="sendRedirect">--%>
    <%--<form action="hello">--%>
    <form action="someother">
        <label for="name">Please enter your name</label><br/>
        <s:select list="{'1','2','3'}" name="name"/>
        <input type="submit" value="Say Hello"/>
    </form>
</body>
</html>
