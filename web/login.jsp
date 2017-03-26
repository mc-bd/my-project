<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<script>
function login(f){
	var c = confirm('로그인 하시겠습니까?');
	if(c==true){
		f.method='POST';
		f.action='login.big';
		f.submit();
	}
}
</script>
<div>
<h1>Login Page</h1>
<form>
ID<input type="text" name="id"><br>
PWD<input type="password" name="pwd"><br>
<input type="button" value="LOGIN" 
       onclick="login(this.form);">
</form>
</div>












