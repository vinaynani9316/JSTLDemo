<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>fang</title>
</head>
<body>
<c:set var="str" value="vinay is programmer"/>
<c:forEach items="${fn:split(str,' ')}" var= "s">
 <br>
 ${s}
</c:forEach>

 index : ${fn:indexOf(str, "is") }
  is there : ${fn:contains(str,"programmer")}
  ${fn:toUpperCase(str) }

</body>
</html> 