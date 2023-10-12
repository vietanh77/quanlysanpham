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
<p><a href="/nsx/view-add" class="btn btn-success">Add</a></p>
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
<c:forEach items="${listNSX}" var="nsx">
    <tr>
        <th scope="row">${nsx.id}</th>
        <th scope="row">${nsx.ma}</th>
        <th scope="row">${nsx.ten}</th>
        <td>
            <a class="btn btn-danger" href="/nsx/delete/${nsx.id}">delete</a>
            <a class="btn btn-primary" href="/nsx/view-update/${nsx.id}">update</a>
        </td>
    </tr>
</c:forEach>

    </tbody>
</table>
</body>
</html>