<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Login Page</title>
<style>
h3 {color:red}
h1 {color:orange}
.myButton {
width:120px;
color:blue
}
body {
background:#f8f8f8;
}
.txt1 {
width:200px;
}
</style>
</head>
<body>
<center><h1>Want to get in ?? , then type your credentials</h1></center>
<div align="center">
<form action="logInt.jsp" method="post">
<label>Email: <input type="text" name="email" class = "txt1" value="${param.email}"></label><br />
<br><br/>
<label>Password: <input type="text" name="password" class = "txt1"></label><br />
<br>
<input type="submit" class="myButton" value="Login" />
</form>
</div>
<div align="center">
<%     String err=(String)request.getAttribute("error");

		if(!(err==null)){
			
			out.write("<p><h3>"+err+"</h3></p>");
		}
		
%>
<%       String errr = (String)request.getAttribute("lout");
			if(!(errr==null)){
				out.write("<p><h3>"+errr+"</h3></p>");
			}


%>
</div>
</body>
</html>