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
        Integer count = (Integer) session.getAttribute("count");
        
        if (msg != null) {
    %>
        <h3><%= msg %></h3>
    <% 
        } 
        if (imginfo != null) { 
    %>
        <img src="<%= imginfo %>" width="200">
    <% 
        } 
    %>

    <%-- 당첨되지 않았고(실패), 응모 횟수가 3회 미만인 경우에만 링크 출력 --%>
    <% if (msg != null && msg.contains("실패") && count != null && count < 3) { %>
        <br>
        <a href="/edu/clientexam/lottoForm3.html">다시 시도하기</a>
    <% } %>
</body>
</html>