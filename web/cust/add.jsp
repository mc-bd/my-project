<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<script>
function add(f){
	var c =confirm('입력 하시겠습니까?');
	if(c==true){
		f.method='POST';
		f.action='cust.big?db=add';
		f.submit();
	}
};
</script>
<div>
<h1>Cust Add Center Page</h1>
<form>
ID<input type="text" name="id"><br>
PWD<input type="password" name="pwd"><br>
NAME<input type="text" name="name"><br>
<input type="button" value="ADD"
onclick="add(this.form);">
</form>
</div>