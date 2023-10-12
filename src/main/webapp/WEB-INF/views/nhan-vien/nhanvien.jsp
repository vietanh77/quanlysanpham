<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">

</head>
<h1 style="text-align: center">Nhân Viên</h1>
<body>
<a class="btn btn-success" href="/nhan-vien/view-add"
   role="button">ADD</a>
<form action="">
    <table class="table">
        <thead>
        <tr>
<%--            <th>Id</th>--%>
            <th>Mã</th>
            <th>Họ tên</th>
            <th>Giới tính </th>
            <th>Ngày sinh</th>
            <th>Địa chỉ</th>
            <th>SĐT</th>
            <th>Mật khẩu</th>
            <th>Cửa hàng</th>
            <th>Chức vụ</th>
            <th>Trạng thái</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="nv" items="${list}">
            <tr>
<%--                <td scope="row">${nv.id}</td>--%>
                <td scope="row">${nv.ma}</td>
                <td scope="row">${nv.ho} ${nv.tenDem} ${nv.ten}</td>
                <td scope="row">${nv.gioiTinh}</td>
                <td scope="row">${nv.ngaySinh}</td>
                <td scope="row">${nv.diaChi}</td>
                <td scope="row">${nv.sdt}</td>
                <td scope="row">${nv.matKhau}</td>
                <td scope="row">${nv.cuaHang.ten}</td>
                <td scope="row">${nv.chucVu.ten}</td>
                <td scope="row">${nv.trangThai==1?"Đang làm" :"Đã nghỉ"}</td>

                <td>
                    <a class="btn btn-primary" href="/nhan-vien/detail/${nv.id}"
                       role="button">Edit</a>
                    <a role="button" class="btn btn-danger" href="/nhan-vien/remove/${nv.id}"
                    >Remove</a>

                </td>
            </tr>

        </c:forEach>
        </tbody>
    </table>
</form>
</body>
</html>
