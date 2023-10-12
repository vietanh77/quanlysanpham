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
<form:form action="/san-pham/add" modelAttribute="sanPham" method="post">

    Ma : <form:input  class="form-control" path="ma"/>
    <br>
    Ten : <form:input  class="form-control" path="ten"/>
    <button class="btn btn-success" type="submit">ADD</button>
</form:form>

</body>
</html>