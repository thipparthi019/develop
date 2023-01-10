<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body{
background-color: silver;
}
label{
width: 400px;
}
#in{
border-radius: 5px;
border: none;
}
</style>
</head>
<body>
    <form:form action="sub" modelAttribute="sDto">
    <label>StudentNo</label><form:input path="stuNo" id="in"/><br><br >
    <label>StudentName</label><form:input path="stuName" id="in"/><br><br>
    <label>StudentLocation</label><form:input path="stuLoc" id="in"/><br><br>
    <label>StudentSection</label><form:input path="stuSection" id="in"/><br><br>
    <label>StudentClass</label><form:input path="stuClass" id="in"/><br><br>
    <label>StudentPercentage</label><form:input path="stuPercentahge" id="in"/><br><br>
    <input type="submit" value="Sig in">
    </form:form>
    <hr>
    
</body>
</html>