<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

    
 <script>
function predict1(f){
	var c = confirm("계?");
	if(c == true){
		f.method='POST';
		f.action='predict2.big';
		f.submit();		
	}

}
</script>   
    

    
<div>
<h1>Predict Page</h1>
<form action="predict1.big"  method="POST">
소득<input type="text" name="kostat.totalincome" value = "${aa1 }"><br>
소비지출<input type="text" name="kostat.consumption" value = "${bb1 }"><br>
비소비지출<input type="text" name="kostat.nonconsumption"value = "${cc1 }"><br>
흑자액<input type="text" name="kostat.surplus" value = "${dd1 }"><br>


결과값 = ${pre1 }
<input type="hidden" name="result" value = "${pre1 }"><br>
<input type="button" value="계산하기"
onclick="predict1(this.form);"><br>
</form> 
</div>