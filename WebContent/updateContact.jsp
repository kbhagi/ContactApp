<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update-ContactsInt.jsp</title>
</head>
<body>
<h1 align="center">This is a Update-Contacts Page</h1>
<div align="center">
<form action="updateContactInt.jsp" method="post">
<label>Name: &nbsp; &nbsp;<input type="text" name="cname"></label>
<br/><br>
<label>Email:&nbsp; &nbsp;<textarea name="cemail" cols="30" rows="3"></textarea></label>
<br/><br>
<label>Phone:&nbsp; &nbsp;<textarea name="cphone" cols="30" rows="3"></textarea></label>
<br/><br>
<label>Tags:&nbsp; &nbsp;<textarea name="ctags" cols="30" rows="3"></textarea></label>
<br/><br> 
<label>DOB:&nbsp; &nbsp;<input type="date" name="cdate"></label>
 <br/> <br>
<label>Sex:&nbsp; <select>
  <option value="male">MALE</option>
  <option value="female">FEMALE</option>
  </select></label>
  <br/> <br>
  <input type="submit" value="OK, i am done">
</form>




</div>

</body>
</html>