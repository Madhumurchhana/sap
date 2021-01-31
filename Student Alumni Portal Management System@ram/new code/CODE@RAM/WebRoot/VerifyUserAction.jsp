
<%@page import="com.dts.aoc.dao.AcadamicDAO"%>
<%@page import="com.dts.dae.dao.NewDAO"%>
<%@page import="com.dts.dae.dao.ProfileDAO"%><%
ProfileDAO dao=new ProfileDAO();
String login=request.getParameter("loginid");
dao.acceptUserRequest(login);
response.sendRedirect("ViewUsers.jsp");

%>