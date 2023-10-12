<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Title</title>
</head>
<body>
<h1 class="text-center">Khách hàng</h1>
<p><a href="/khach-hang/view-add" class="btn btn-success">Add</a></p>

<table class="table">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">Ma</th>
        <th scope="col">Ten</th>
        <th scope="col">TenDem</th>
        <th scope="col">Ho</th>
        <th scope="col">NgaySinh</th>
        <th scope="col">SDT</th>
        <th scope="col">DiaChi</th>
        <th scope="col">ThanhPho</th>
        <th scope="col">QuocGia</th>
        <th scope="col">MatKhau</th>
        <th scope="col">Action</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listKH}" var="kh">
        <tr>
            <th scope="row">${kh.id}</th>
            <td>${kh.ma}</td>
            <td>${kh.ten}</td>
            <td>${kh.tenDem}</td>
            <td>${kh.ho}</td>
            <td>${kh.ngaySinh}</td>
            <td>${kh.sdt}</td>
            <td>${kh.diaChi}</td>
            <td>${kh.thanhPho}</td>
            <td>${kh.quocGia}</td>
            <td>${kh.matKhau}</td>
            <td>
                <a class="btn btn-danger" href="/khach-hang/delete/${kh.id}">Delete</a>
                <a class="btn btn-primary" href="/khach-hang/view-update/${kh.id}">Update</a>
            </td>

        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>