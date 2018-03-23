<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MENU.JSP</title>
</head>
<body>
<div align = "center">
<h1>Welcome <%=session.getAttribute("userId") %></h1>
<h2><a href="openAddContactView.do">Add Contact</a></h2><br/>
<h2><a href="openListContactView.do">List Contact</a></h2><br/>
<h2><a href="openSearchView.do">Search Contact</a></h2><br/>
<h2><a href="openEditContact.do">Edit Contact</a></h2><br/>
</div>
<div align = "right">
<h2><a href="logout.do">Click to logout</a></h2>
</div>
<div align ="left">

<h2><a href="openEditAccView.do">Click here to Edit Account</a></h2>
</div>
</body>
</html>