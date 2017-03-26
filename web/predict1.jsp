<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

    
 <script>
function predict1(f){
	var c = confirm("계산");
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
소득<input type="text" name="totalincome" value = "${aa1 }"><br>
식비<input type="text" name="food" value = "${bb1 }"><br>
교통비<input type="text" name="transportation"value = "${cc1 }"><br>
교육비<input type="text" name="education" value = "${dd1 }"><br>


총지출액 예측결과  = ${pre1 }
<input type="hidden" name="result" value = "${pre1 }"><br>
<input type="button" value="계산하기"
onclick="predict1(this.form);"><br>
</form> 
</div>