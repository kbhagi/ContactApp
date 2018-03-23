<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit-Account.jsp</title>
</head>
<body>
<center><h1>Want to Edit ?? , then Free Edit</h1></center>
<div align="center">
<form action="editAccInt.jsp" method="post">
<label>Name: <input type="text" name="uname" value="${userDetails.uname}"></label><br/>
<br>
<label>Email: <input type="text" name="email" value="${userDetails.email }"readonly="true"></label><br/>
<br>
<label>Password: <input type="password" name="password" value="${userDetails.password}" ></label><br/>
<br>
<label>Repeat Password: <input type="password" name="rpassword"  value="${userDetails.rpassword}"></label><br/>
<br>
<input type="submit" value="Finish Edit" />
</form>
</div>
</body>
</html>