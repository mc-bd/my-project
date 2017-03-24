<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

    
 <script>
function predict1(f){
	var c = confirm("계산 하실거에요???");
	if(c == true){
		f.method='POST';
		f.action='predict1.big';
		f.submit();
		
	}
	
}
</script> 



<h1>계산하는곳</h1>

<form action="predict1.big"  method="POST">
소득<input type="text" name="kostat.totalincome"><br>
소비지출<input type="text" name="kostat.consumption"><br>
비소비지출<input type="text" name="kostat.nonconsumption"><br>
흑자액<input type="text" name="kostat.surplus"><br>



<input type="button" value="계산하기"
onclick="predict1(this.form);"><br>


</form>
