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
<%--@elvariable id="sanPham" type=""--%>
<form:form action="/san-pham/update/${id}" modelAttribute="sanPham" method="post">
    Ma : <form:input path="ma" value="${sanPham.ma}"/>
    <br>
    Ten : <form:input path="ten" value="${sanPham.ten}"/>
    <button class="btn btn-primary" type="submit">Update</button>
</form:form>

</body>
</html>