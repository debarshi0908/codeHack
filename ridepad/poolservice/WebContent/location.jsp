<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,net.ridepad.portal.*,org.ridepad.entity.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border=1>
<TR>
<TH>E-MAIL</TH>
<TH>Latitude</TH>
<TH>Longtitue</TH>
<TH>Time Stamp</TH>
</TR>
<%
	UserData data = new UserData();
	List list = data.getAllLocations();
	for(int i=0;i<list.size();i++){
		Location user = (Location) list.get(i);
%>
	<TR>
	<TD><%=user.getEmail()%></TD>
	<TD><%=user.getLat() %></TD>
	<TD><%=user.getLong_() %></TD>
	<TD><%=user.getLasttime() %></TD>
	</TR>
<%
	}
%>
</table>
</body>
</html>