<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,net.ridepad.portal.*,org.ridepad.entity.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Members</title>
</head>
<body>
<table border=1>
<TR>
<TH>E-MAIL</TH>
<TH>Password</TH>
<TH>First Name</TH>
<TH>Last Name</TH>
<TH>Mobile</TH>

</TR>
<%
	UserData data = new UserData();
	List list =data.getAllUsers();
	for(int i=0;i<list.size();i++){
		User user = (User) list.get(i);
%>
	<TR>
	<TD><%=user.getEmail()%></TD>
	<TD><%=user.getPassword() %></TD>
	<TD><%=user.getFname() %></TD>
	<TD><%=user.getLname() %></TD>
	<TD><%=user.getMobileno() %></TD>
	</TR>
<%
	}
%>
</table>
</body>
</html>