<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%
        String basePath=request.getScheme()+"://"+request.getServerName()+":"
                +request.getServerPort()+request.getContextPath()+"/";
    %>
    <base href="<%=basePath%>">
</head>
<body>
    <center>
        <a href="test.do?name=张三">test.do</a>
        <p>==================================</p>
        <form action="one.do" method="post">
            age:<input name="age" type="text"><br/>
            <input type="submit" value="commit">
        </form>
        <p>==================================</p>
        <form action="two.do" >
            age:<input name="age" type="text"><br/>
            <input type="submit" value="commit">
        </form>
        <p>==================================</p>
        <form action="object.do" method="post">
            user:<input name="user" type="text"><br/>
            password:<input name="password" type="password"><br/>
            text:<input name="name" type="text"><br/>
            <input type="submit" value="commit">
        </form>
    </center>
</body>
</html>
