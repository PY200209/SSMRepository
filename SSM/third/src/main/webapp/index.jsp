<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <center>
        <form action="register.do" >
            <input name="user" type="text">
            <input name="password" type="text">
            <input type="submit" value="commit">
        </form>
        <p>=========================</p>
        <a href="register.do?user=1002&password=123">register.do</a>
        <p>=========================</p>
        <form action="login.do" method="post">
            <input name="user" type="text">
            <input name="password" type="text">
            <input type="submit" value="commit">
        </form>
        <p>=========================</p>
        <a href="update.do?user=1001&password=1234">update.do</a>
        <p>=========================</p>
        <a href="delete.do?user=1002&password=123">delete.do</a>
        <p>=========================</p>
    </center>

</body>
</html>
