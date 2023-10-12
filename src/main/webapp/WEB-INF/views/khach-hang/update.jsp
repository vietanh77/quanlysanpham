<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Title</title>
</head>
<body>
<%--@elvariable id="khachHang" type=""--%>
<form:form action="/khach-hang/update/${id}" modelAttribute="khachHang" method="post">

    Ma : <form:input class="form-control" path="ma" value="${khachHang.ma}"/>
    <br><br>
    Ten : <form:input class="form-control" path="ten" value="${khachHang.ten}"/>
    <br><br>
    TenDem : <form:input class="form-control" path="tenDem" value="${khachHang.tenDem}"/>
    <br><br>
    Ho : <form:input class="form-control" path="ho" value="${khachHang.ho}"/>
    <br><br>
    NgaySinh : <form:input class="form-control" type="Date" path="ngaySinh" value="${khachHang.ngaySinh}"/>
    <br><br>
    SDT : <form:input class="form-control" path="sdt" value="${khachHang.sdt}"/>
    <br><br>
    DiaChi : <form:input class="form-control" path="diaChi" value="${khachHang.diaChi}"/>
    <br><br>
    ThanhPho: <form:input class="form-control" path="thanhPho" value="${khachHang.thanhPho}"/>
    <br><br>
    QuocGia: <form:input class="form-control" path="quocGia" value="${khachHang.quocGia}"/>
    <br><br>
    matKhau: <form:input class="form-control" path="matKhau" value="${khachHang.matKhau}"/>
    <br><br>
    <button class="btn btn-primary" type="submit">Update</button>
</form:form>
</body>
</html>