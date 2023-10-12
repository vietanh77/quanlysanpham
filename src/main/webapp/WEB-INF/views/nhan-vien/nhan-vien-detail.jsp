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
<%--@elvariable id="nhanVien" type=""--%>
<form:form modelAttribute="nhanVien" action="/nhan-vien/update/${nhanVien.id} " method="post">
    <label>Mã</label>
   <form:input clas="form-control" path="ma" value="${nhanVien.ma}"/>
    <span id="ma_error" style="color: red"></span>
    <br>
   <label>Tên:</label>
    <form:input clas="form-control" path="ten" value="${nhanVien.ten}"/>
    <span id="ten_error" style="color: red"></span>
    <br>
    <label>Tên đệm:</label>
    <form:input clas="form-control" path="tenDem" value="${nhanVien.tenDem}"/>
    <span id="tenDem_error"style="color: red"></span>
    <br>
    <label>Họ:</label>
    <form:input clas="form-control" path="ho" value="${nhanVien.ho}"/>
    <span id="ho_error" style="color: red"></span>
    <br>
    <label>Giới tính :</label>
    <div>
        <form:radiobutton path="gioiTinh" value="Nam"/>Nam
        <form:radiobutton path="gioiTinh" value="Nữ"/>Nữ
    </div>
    <br>
    <label>Ngày sinh:</label>
    <form:input path="ngaySinh" type="Date" value="${nhanVien.ngaySinh}"/>
    <span id="ngaySinh_error" style="color: red"></span>
    <br>
    <label>Địa chỉ:</label>
    <form:input path="diaChi" value="${nhanVien.diaChi}"/>
    <span id="diaChi_error" style="color: red"></span>
    <br>
    <label>Số điện thoại:</label>
    <form:input  path="sdt" id="sdt" value="${nhanVien.sdt}"/>
    <span id="sdt_error" style="color: red"></span>
    <br>
    <label>Mật khẩu:</label>
    <form:input type="password" path="matKhau" id="matKhau" value="${nhanVien.matKhau}" />
    <span id="matKhau_error" style="color: red"></span>
    <br>
    <label>Trạng thái:</label>
    <div>
        <form:radiobutton path="trangThai" value="1"/>Đang làm
        <form:radiobutton path="trangThai" value="0"/>Đã nghỉ
    </div>
    <br>
    Chức vụ:
    <form:select class="form-control" path="chucVu" >
        <c:forEach items="${listCV}" var="cv">
            <form:option  value="${cv.id}" Selected="${nhanVien.chucVu.id==cv.id?'selected':''}">${cv.ten}</form:option>
        </c:forEach>
    </form:select>
    <br>
    Cửa hàng:

    <form:select class="form-control" path="cuaHang">
        <c:forEach items="${listCH}" var="ch">
            <form:option  value="${ch.id}" Selected="${nhanVien.cuaHang.id==ch.id?'selected':''}">${ch.ten}</form:option>
        </c:forEach>
    </form:select>
    <br>
    <button  type="submit">UPDATE</button>
</form:form>
</body>
</html>
