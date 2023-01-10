<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <c:forEach items="${stu }" var="s">
      StudentNo ${s.stuNo }<br><br>
      StudentName ${s.stuName }<br><br>
      StudentLocation ${s.stuLoc }<br><br>
      StudentSection ${s.stuSection }<br><br>
      StudentClass ${s.stuClass }<br><br>
      StudentPercentage ${s.stuPercentahge }<br><br>
      <a href="edit?stuNo=${s.stuNo}"><input type="submit" value="Edit"> </a>
      <a href="delete?stuNo=${s.stuNo}"><input type="submit" value="Delete"></a>
      <hr>
      </c:forEach>
</body>
</html>