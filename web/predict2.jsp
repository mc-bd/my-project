<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

    
 <script>
function predict1(f){
	var c = confirm("��� �Ͻǰſ���???");
	if(c == true){
		f.method='POST';
		f.action='predict1.big';
		f.submit();
		
	}
	
}
</script> 



<h1>����ϴ°�</h1>

<form action="predict1.big"  method="POST">
�ҵ�<input type="text" name="kostat.totalincome"><br>
�Һ�����<input type="text" name="kostat.consumption"><br>
��Һ�����<input type="text" name="kostat.nonconsumption"><br>
���ھ�<input type="text" name="kostat.surplus"><br>



<input type="button" value="����ϱ�"
onclick="predict1(this.form);"><br>


</form>
