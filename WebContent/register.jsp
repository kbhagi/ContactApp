<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>

<style>
h4 {   color:red       }
body {
background:#f8f8f8;
}
.txt1 {   width:190px;        }
h1 {

color:green;
}

</style>
</head>
<body>
<center><h1>Want to try ?? , then Free Sign-Up</h1></center>
<div align="center">
<form action="regInt.jsp" method="post">
<label>Name: <input type="text"  name="uname" value="${param.uname}"></label><br/>
<br/>
<label>Email: <input type="text"   name="email" value="${param.email}"></label><br/>
<br>
<label>Password: <input type="password" name="password"></label><br/>
<br>
<label>Repeat Password: <input type="password"  name="rpassword"></label><br/>
<br>
<input type="submit" value="Sign-Up" />
</form>
</div>

<div align="center">
<%     String err=(String)request.getAttribute("error");

		if(!(err==null)){
			
			out.write("<p><h4>"+err+"</h4></p>");
		}
		
%>

</div>
</body>
</html>