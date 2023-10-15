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
<h1 class="text-center">Nhà sản xuất</h1>
<p><a href="/san-pham/view-add" class="btn btn-success">Add</a></p>
<table class="table" border="2">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">Ma</th>
        <th scope="col">Ten</th>
        <th scope="col">Action</th>
    </tr>
    </thead>
    <tbody>
<c:forEach items="${listSP}" var="sp">
    <tr>
        <th scope="row">${sp.id}</th>
        <th scope="row">${sp.ma}</th>
        <th scope="row">${sp.ten}</th>
        <td>
            <a class="btn btn-danger" href="/san-pham/delete/${sp.id}">delete</a>
            <a class="btn btn-primary" href="/san-pham/view-update/${sp.id}">update</a>
        </td>

    </tr>
</c:forEach>

    </tbody>
</table>
</body>
</html>