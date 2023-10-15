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
<%--@elvariable id="ctsp" type=""--%>
<form:form action="/ctsp/add" modelAttribute="ctsp" method="post">

    NamBH:
    <form:input class="form-control" path="namBH"/>
    <br>
    <br>


    SanPham : <form:select class="form-control" path="sanPham">
    <c:forEach items="${listSanPham}" var="sp">
        <form:option value="${sp.id}" selected="${sp.id==ctsp.sanPham.id?'selected':''}">
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
    <form:input class="form-control" path="moTa"/>
    <br>
    <br>
    SoLuongTon:
    <form:input class="form-control" path="soLuongTon"/>
    <br>
    <br>
    GiaNhap:
    <form:input class="form-control" path="giaNhap"/>
    <br>
    <br>
    GiaBan:
    <form:input class="form-control" path="giaBan"/>
    <br>
    <button class="btn btn-success" type="submit">ADD</button>
</form:form>
</body>
</html>