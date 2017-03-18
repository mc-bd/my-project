<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script  src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<style>
/*Global CSS */
*{
	margin:0;
	padding:0;
}
a{
	text-decoration: none;
}
ul,ol{
	list-style: none;
}
/*Header CSS */
header{
	width:920px;
	height:150px;
	margin:0 auto;
	background:red;
}
/*Nav CSS */
nav{
	width:920px;
	height:40px;
	margin:0 auto;
	background:pink;
}
nav >a{
	color:white;
}
/*Section CSS */
section{
	width:920px;
	min-height:350px;
	margin:0 auto;
	background:grey;
}
/*Footer CSS */
footer{
	width:920px;
	height:40px;
	margin:0 auto;
	background:black;
}
</style>
<style></style>
<script></script>
</head>
<body>
<!-- Header -->
<header>
<c:choose>
	<c:when test="${loginuser == null }">
	<div id="top">
		<a href="main.big?view=login">LOGIN</a>
		<a href="main.big?view=register">REGISTER</a>
	</div>
	</c:when>
	<c:otherwise>
	<div id="top">
		<a href="">${loginuser.id }님</a>
		<a href="login.big">LOGOUT</a>
	</div>
	</c:otherwise>
</c:choose>
	<div id="bottom">
		<a href="main.big?view=cust">CUST</a>
		<a href="main.big?view=product">PRODUCT</a>
		<a href="main.big?view=rgraph">RGraph</a>
		<a href="main.big?view=highcharts">HighCharts</a>
		<a href="main.big?view=weather">Weather</a>
	</div>
	
	
</header>
<!-- Nav -->
<nav>
<c:choose>
	<c:when test="${nav == null}">
	 <a href="main.big">HOME</a>
	 </c:when>
	<c:otherwise>
		${nav}
	</c:otherwise>
</c:choose>
</nav>
<!-- Section -->
<section>
<c:choose>
	<c:when test="${center == null}">
		<jsp:include page="center.jsp"/>
	</c:when>
	<c:otherwise>
		<jsp:include page="${center }.jsp"/>
	</c:otherwise>
</c:choose>
</section>
<!-- Footer-->
<footer></footer>
</body>
</html>