<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<%--@elvariable id="cuaHang" type=""--%>
<form:form modelAttribute="cuaHang" action="/cua-hang/add" method="post">
    <div class="form-group">
        <label>Mã</label>
        <form:input class="form-control" path="ma" value="${cuaHang.ma}" />

    </div>
    <div class="form-group">
        <label>Tên</label>
        <form:input class="form-control" path="ten" value="${cuaHang.ten}" />

    </div>
    <div class="form-group">
        <label>Địa chỉ</label>
        <form:input class="form-control" path="diaChi" value="${cuaHang.diaChi}"/>

    </div>
    <div class="form-group">
        <label>Thành phố</label>
        <form:input class="form-control" path="thanhPho" value="${cuaHang.thanhPho}"/>

    </div>
    <div class="form-group">
        <label>Quốc gia</label>
        <form:input class="form-control" path="quocGia" value="${cuaHang.quocGia}"/>

    </div>
    <button type="submit" class="btn btn-primary">Add</button>
</form:form>
</body>
</html>