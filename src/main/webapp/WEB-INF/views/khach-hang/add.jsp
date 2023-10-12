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
<%--@elvariable id="khachHang" type=""--%>
<form:form action="/khach-hang/add" modelAttribute="khachHang" method="post">


    Ma : <form:input class="form-control" path="ma"/>
    <br><br>
    Ten : <form:input class="form-control" path="ten"/>
    <br><br>
    TenDem : <form:input class="form-control" path="tenDem"/>
    <br><br>
    Ho : <form:input class="form-control" path="ho"/>
    <br><br>
    NgaySinh : <form:input class="form-control" type="Date" path="ngaySinh"/>
    <br><br>
    SDT : <form:input class="form-control" path="sdt"/>
    <br><br>
    DiaChi : <form:input class="form-control" path="diaChi"/>
    <br><br>
    ThanhPho: <form:input class="form-control" path="thanhPho"/>
    <br><br>
    QuocGia: <form:input class="form-control" path="quocGia"/>
    <br><br>
    matKhau: <form:input class="form-control" path="matKhau"/>
    <br><br>
    <button class="btn btn-success" type="submit">ADD</button>
</form:form>
</body>
</html>