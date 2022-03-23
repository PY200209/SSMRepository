<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <a href="easy.do">easy.do</a>
    <p>===================================</p>
    <form action="one.do">
        age:<input name="age" type="text"><br/>
        <input type="submit" value="commit">
    </form>
    <p>===================================</p>
    <form action="two.do" method="post">
        user:<input name="user" type="text"><br/>
        password:<input name="password" type="password"><br/>
        <input type="submit" value="commit">
    </form>
    <p>===================================</p>
    <form action="object.do">
        user:<input name="user" type="text"><br/>
        password:<input name="password" type="password"><br/>
        name:<input name="name" type="text"><br/>
        <input type="submit" value="commit">
    </form>
</center>
</body>
</html>
