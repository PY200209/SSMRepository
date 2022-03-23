<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <center>
        <a href="get.do?name=张三">get.do</a><br/>
        ============================<br/>
        <form action="cal.do" method="post">
           nums: <input type="text" name="nums">
            <input type="submit" value="commit">
        </form>
        ============================<br/>
        <form action="out.do">
            user:<input name="user" type="text">
            password:<input name="password" type="password">
            sex:<br/>
            man:<input name="sex" value="man" type="radio">
            woman:<input name="sex" value="woman" type="radio">
            <input type="submit" value="commit">
        </form>
        ============================<br/>
        <a href="static/test.html">static/test.html</a>
    </center>
</body>
</html>
