<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>Title</title>
</head>
<c:if test="${not empty thongBao}">
    <script !src="">
        alert("${thongBao}");
    </script>
</c:if>
<body>
<h1 class="text-center">Cửa Hàng</h1>
<p><a href="/cua-hang/view-add" class="btn btn-success">Add</a></p>
<table class="table">
    <thead>
    <tr>
        <th scope="col">Mã</th>
        <th scope="col">Tên</th>
        <th scope="col">Địa chỉ</th>
        <th scope="col">Thành phố</th>
        <th scope="col">Quốc gia</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="cuaHang">
        <tr>
            <td>${cuaHang.ma}</td>
            <td>${cuaHang.ten}</td>
            <td>${cuaHang.diaChi}</td>
            <td>${cuaHang.thanhPho}</td>
            <td>${cuaHang.quocGia}</td>
            <td><a href="/cua-hang/delete/${cuaHang.id}" class="btn btn-danger">Xóa</a>
            <a href="/cua-hang/detail/${cuaHang.id}" class="btn btn-primary">Detail</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>