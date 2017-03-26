<%@page import="com.sun.org.apache.xml.internal.security.utils.Base64"%>
<%@page import="com.hive.Predict"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
   Predict pre = new Predict();
%>    
    
<!DOCTYPE>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<style></style>
<script></script>
</head>
<body>
<h1>Wordcloud test</h1>

adddd
<% 
   double result = 0;
   result = (double) pre.getGraph(13000,15000,1000,1300);
    result=Math.round(result);
%>
결과값=<%=result %>

</body>
</html>