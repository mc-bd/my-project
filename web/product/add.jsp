<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<script>
function add(f){
	var c =confirm('�Է� �Ͻðڽ��ϱ�?');
	if(c==true){
		f.method='POST';
		f.action='product.big?db=add';
		f.submit();
	}
};
</script>
<div>
<h1>Product Add Center Page</h1>
<form enctype="multipart/form-data">
NAME<input type="text" name="name"><br>
PRICE<input type="number" name="price"><br>
IMAGE<input type="file" name="img"><br>
<input type="button" value="ADD"
onclick="add(this.form);">
</form>
</div>