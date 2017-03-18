<%@page import="com.sun.org.apache.xerces.internal.impl.dv.util.Base64"%>
<%@page import="com.hive.Word"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    <% Word w = new Word();
    %>

<div>
<h1>Rgraph </h1>
<img src="data:image/jpeg;base64,
<%=Base64.encode(w.getGraph())%>">
</div>