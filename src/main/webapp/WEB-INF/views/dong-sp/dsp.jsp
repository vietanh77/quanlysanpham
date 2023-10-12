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
<h1 class="text-center">Dòng sản phẩm</h1>
<p><a href="/dong-sp/view-add" class="btn btn-success">Add</a></p>

<table class="table" border="2">
    <thead>
    <tr>
        <th scope="col">Ma</th>
        <th scope="col">Ten</th>
        <th scope="col">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listDSP}" var="dsp">
        <tr>
            <td>${dsp.ma}</td>
            <td>${dsp.ten}</td>
            <td>
                <a class="btn btn-primary" href="/dong-sp/view-update/${dsp.id}">Update</a>
                <a class="btn btn-danger" href="/dong-sp/delete/${dsp.id}">Delete</a>
            </td>
        </tr>

    </c:forEach>
    </tbody>
</table>

</body>
</html>