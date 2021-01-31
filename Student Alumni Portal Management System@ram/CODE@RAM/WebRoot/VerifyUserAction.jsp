
<%@page import="com.dts.dae.dao.ProfileDAO"%>
<%@page import="com.dts.aoc.dao.AcadamicDAO"%>
<%
String login=request.getParameter("loginid");
	AcadamicDAO dao=new AcadamicDAO();
	 dao.acceptUserRequest(login);
	 response.sendRedirect("ViewRequestUser.jsp");
	 
%>