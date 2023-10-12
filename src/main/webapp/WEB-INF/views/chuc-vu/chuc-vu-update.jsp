<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">

    <title>Title</title>
</head>
<body>
<%--@elvariable id="chucVu" type=""--%>
<form:form action="/chuc-vu/update/${id}" modelAttribute="chucVu" method="post">
    Ma : <form:input class="form-control" path="ma" value="${chucVu.ma}"/>
    <br>
    Ten : <form:input class="form-control" path="ten" value="${chucVu.ten}"/>
    <button class="btn btn-primary" type="submit">Update</button>
</form:form>

</body>
</html>