<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List-Contacts.jsp</title>
</head>
<body>
<div align="center">
<form action="listContact.do" method="post">
<label>
List by:<select>
<option>name</option>
<option>email</option>
<option>dob</option>
<option>phone</option>
</select>
</label>
<input type="submit" value="submit"></form>
<h3>name,dob, phone</h3>
</div>
</body>
</html>