<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div>
<h1>Product Detail Page</h1>
<img src="img/${detailproduct.img }">
<h2>ID: ${detailproduct.id}</h2>
<h2>NAME: ${detailproduct.name}</h2>
<h2>PRICE: ${detailproduct.price}</h2>

<h4><a href="product.big?db=delete&name=${detail.name }">DELETE</a></h4>
<h4><a href="product.big?db=updateview&name=${detailproduct.name }">UPDATE</a></h4>
</div>