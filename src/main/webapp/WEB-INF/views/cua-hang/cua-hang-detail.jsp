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
<%--@elvariable id="sinhVien" type=""--%>
<%--@elvariable id="cuaHang" type=""--%>
<form:form modelAttribute="cuaHang" action="/cua-hang/update/${cuaHang.id}" method="post">
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
    <button type="submit" class="btn btn-primary">Update</button>
</form:form>


</body>
</html>