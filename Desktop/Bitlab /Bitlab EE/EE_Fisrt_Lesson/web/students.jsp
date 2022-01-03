<%@ page import="java.util.List" %>
<%@ page import="model.Student" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="db.DBManager" %><%--
  Created by IntelliJ IDEA.
  User: erkin
  Date: 27/12/2021
  Time: 22:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<Student> allStudents = new ArrayList<>();
    allStudents = DBManager.studentList;
    for (Student student : allStudents){
        out.print("<h2>" + student.getName() + " " + student.getSurname() + " " + "ordered" + " "+ student.getCity() +  "</h2>");
    }
%>
</body>
</html>
