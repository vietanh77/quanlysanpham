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
<h1 class="text-center">Chức vụ</h1>
<p><a href="/chuc-vu/view-add" class="btn btn-success">Add</a></p>

<table class="table">
    <thead>
    <tr>
        <th scope="col">Ma</th>
        <th scope="col">Ten</th>
        <th scope="col">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listChucVu}" var="cv">
        <tr>
            <td>${cv.ma}</td>
            <td>${cv.ten}</td>
            <td>
                <a class="btn btn-primary" href="/chuc-vu/view-update/${cv.id}">Update</a>
                <a class="btn btn-danger" href="/chuc-vu/delete/${cv.id}">Delete</a>
            </td>
        </tr>

    </c:forEach>
    </tbody>
</table>

</body>
</html>