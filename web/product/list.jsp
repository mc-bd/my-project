<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
#plist >h5 >img{
	width:80px;
	border: 2px solid blue;
}
</style>
<div id="plist">
<h1>Product Search Page</h1>

<c:forEach var="p" items="${plist}">
<h5>
<img src="img/${p.img}">
${p.id} ${p.name } ${p.price }</h5>
</c:forEach>
</div>