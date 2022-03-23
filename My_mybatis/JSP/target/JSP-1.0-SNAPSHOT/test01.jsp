<%--
  Created by IntelliJ IDEA.
  User: pan
  Date: 2022/3/15
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    int nums = (int) request.getAttribute("nums");
%>
<h1 style="color: red">得到的数字是: <%=nums%> </h1>
