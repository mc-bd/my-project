<%@page import="com.sun.org.apache.xerces.internal.impl.dv.util.Base64"%>
<%@page import="com.hive.Word2"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    <% Word2 w = new Word2();
    %>
    
<!DOCTYPE>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script  src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

<style></style>
<script></script>
</head>
<body>
<h1>Wordcloud test</h1>
<img src="data:image/jpeg;base64,
<%=Base64.encode(w.getGraph())%>">
</body>
</html>
