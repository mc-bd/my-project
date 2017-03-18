<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div>
<h1>Cust Search Page</h1>

<c:forEach var="user" items="${custlist}">
<h4><a href="cust.big?db=detail&id=${user.id }">${user.id } ${user.name }</h4>
</c:forEach>
</div>