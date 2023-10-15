<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Title</title>
</head>
<body>

<%--@elvariable id="ctsp" type=""--%>
<form:form action="/ctsp/update/${id}" modelAttribute="ctsp" method="post">

    NamBH:
    <form:input class="form-control" path="namBH" value="${ctsp.namBH}"/>
    <br>
    <br>
    SanPham : <form:select class="form-control" path="sanPham">
    <c:forEach items="${listSanPham}" var="sp">
        <form:option value="${sp.id}" selected="${sp.id==ctsp.sanPham.id?'true':''}">
            ${sp.ten}
        </form:option>
    </c:forEach>
</form:select>
    <br>
    <br>
    NhaSanXuat:
    <form:select class="form-control" path="nhaSanXuat">
        <c:forEach items="${listNSX}" var="nsx">
            <form:option value="${nsx.id}" selected="${nsx.id==ctsp.nhaSanXuat.id?'selected':''}">
                ${nsx.ten}
            </form:option>
        </c:forEach>
    </form:select>

    <br>
    <br>
    MauSac :
    <form:select class="form-control" path="mauSac">
        <c:forEach items="${listMauSac}" var="ms">
            <form:option value="${ms.id}" selected="${ms.id==ctsp.mauSac.id?'selected':''}">
                ${ms.ten}
            </form:option>
        </c:forEach>
    </form:select>
    <br>
    <br>
    DongSP:
    <form:select class="form-control" path="dongSanPham">
        <c:forEach items="${listDongSP}" var="dsp">
            <form:option value="${dsp.id}" selected="${dsp.id==ctsp.dongSanPham.id?'selected':''}">
                ${dsp.ten}
            </form:option>
        </c:forEach>
    </form:select>
    <br>
    <br>
    MoTa:
    <form:input class="form-control" path="moTa" value="${ctsp.moTa}"/>
    <br>
    <br>
    SoLuongTon:
    <form:input class="form-control" path="soLuongTon" value="${ctsp.soLuongTon}"/>
    <br>
    <br>
    GiaNhap:
    <form:input class="form-control" path="giaNhap" value="${ctsp.giaNhap}"/>
    <br>
    <br>
    GiaBan:
    <form:input class="form-control" path="giaBan" value="${ctsp.giaBan}"/>
    <br>
    <button class="btn btn-primary" type="submit">Update</button>
</form:form>
</body>
</html>