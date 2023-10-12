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
<h1 class="text-center">Chi tiết sản phẩm</h1>
<p><a href="/ctsp/view-add" class="btn btn-success">Add</a></p>
<table class="table" >
    <thead>
    <tr>

        <th>ID</th>
        <th>Sản phẩm</th>
        <th>Nhà sản xuất</th>
        <th>Màu sắc</th>
        <th>Dòng sản phẩm</th>
        <th>Năm bảo hành</th>
        <th>Mô tả</th>
        <th>Số lượng tồn</th>
        <th>Gía nhập</th>
        <th>Gía bán</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach var="l" items="${listCTSP}" >
        <tr>
            <td>${l.id}</td>
            <td>${l.sanPham.ten}</td>
            <td>${l.nhaSanXuat.ten}</td>
            <td>${l.mauSac.ten}</td>
            <td>${l.dongSP.ten}</td>
            <td>${l.namBH}</td>
            <td>${l.moTa}</td>
            <td>${l.soLuongTon}</td>
            <td>${l.giaNhap}</td>
            <td>${l.giaBan}</td>

            <td>

                <a class="btn btn-primary" href="/ctsp/view-update/${l.id}"
                   role="button">Edit</a>
                <a role="button" class="btn btn-danger" href="/ctsp/delete/${l.id}"
                >Remove</a>

            </td>
        </tr>

    </c:forEach>
    </tbody>
</table>
</body>
</html>