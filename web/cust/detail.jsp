<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div>
<h1>Cust Detail Page</h1>
<h2>ID: ${detailuser.id}</h2>
<h2>PWD: ${detailuser.pwd}</h2>
<h2>NAME: ${detailuser.name}</h2>
<h4><a href="cust.big?db=delete&id=${detail.id }">DELETE</a></h4>
<h4><a href="cust.big?db=updateview&id=${detailuser.id }">UPDATE</a></h4>
</div>