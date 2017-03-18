<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<style>
#main_center{
	width:800px;
	height:400px;
	border:1px solid red;
	background:white;
	margin-top:20px;
	margin:0 auto;
}
</style>
<script>
function register(f){
	var c = confirm('가입 하시겠습니까?');
	if(c == true){
		f.method = 'post'; //get,post
		f.action = 'register.bank';
		f.submit();
	};
};
</script>
<div id="main_center">
<h1>Register Center</h1>
<form>
ID<input type="text" name="id"><br>
PWD<input type="text" name="pwd"><br>
NAME<input type="text" name="name"><br>
<input type="button" value="register"
onclick="register(this.form)"><br>
</form>
</div>










