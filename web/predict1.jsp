<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

    
 <script>
function predict1(f){
	var c = confirm("���");
	if(c == true){
		f.method='POST';
		f.action='predict1.big';
		f.submit();		
	}

}
</script>   
    

    
<div>
<h1>Predict Page</h1>
<form action="predict1.big"  method="POST">
�ҵ�<input type="text" name="totalincome" value = "${aa1 }"><br>
�ĺ�<input type="text" name="food" value = "${bb1 }"><br>
�����<input type="text" name="transportation"value = "${cc1 }"><br>
������<input type="text" name="education" value = "${dd1 }"><br>


������� �������  = ${pre1 }
<input type="hidden" name="result" value = "${pre1 }"><br>
<input type="button" value="����ϱ�"
onclick="predict1(this.form);"><br>
</form> 
</div>