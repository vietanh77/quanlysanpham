<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Title</title>
</head>
<body>
<%--@elvariable id="mauSac" type=""--%>
<form:form action="/mau-sac/update/${id}" modelAttribute="mauSac" method="post">
    Ma : <form:input path="ma" value="${mauSac.ma}"/>
    <br>
    Ten : <form:input path="ten" value="${mauSac.ten}"/>
    <button class="btn btn-primary" type="submit">Update</button>
</form:form>

</body>
</html>