<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로또 결과</title>
</head>
<body>
    <h2>로또 결과</h2>
    <hr>
    <%
        String msg = (String) request.getAttribute("msg");
        String imginfo = (String) request.getAttribute("imginfo");
    %>
    
    <h3><%= msg %></h3>
    
    <% if (imginfo != null) { %>
        <img src="<%= imginfo %>" width="200">
    <% } %>

    <% if (msg != null && msg.contains("실패")) { %>
        <br>
        <a href="/edu/clientexam/lottoForm2.html">다시 시도하기</a>
    <% } %>
</body>
</html>