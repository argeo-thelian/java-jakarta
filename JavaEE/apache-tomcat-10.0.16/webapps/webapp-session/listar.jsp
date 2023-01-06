<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Listado Producto</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>

</head>
<body>
    <h1>Listado Producto</h1>
    <c:if test="${requestScope.username.isPresent()}">
        <div class="alert alert-info">
            <p>Hola ${requestScope.username.get()}, bienvenido!</p>
        </div>
        <a class="btn btn-primary" href="${pageContext.request.contextPath}/productos/form">Crear [+]</a>
    </c:if>
    <table class="table table-hover table-striped">
        <tr>
            <th>Id</th>
            <th>Nombre</th>
            <th>Categoria</th>
            <c:if test="${username.present}">
                <th>Precio</th>
                <th>Agregar</th>
                <th>Editar</th>
                <th>Eliminar</th>
            </c:if>
        </tr>
        <c:forEach items="${productos}" var="p">
        <tr>
            <td>${p.id}"</td>
            <td>${p.nombre}"</td>
            <td>${p.categoria.nombre}"</td>
            <c:if test="${username.present}">
                <td>${p.precio}"</td>
                <td><a class="btn btn-sm btn-primary" href="${pageContext.request.contextPath}/carro/agregar?id=${p.id}">agregar</a></td>
                <td><a class="btn btn-sm btn-success" href="${pageContext.request.contextPath}/productos/form?id=${p.id}">editar</a></td>
                <td><a class="btn btn-sm btn-danger " onclick="return confirm('Estas seguro que desea eliminar?');"
                       href="${pageContext.request.contextPath}/productos/eliminar?id=${p.id}">eliminar</a></td>
            </c:if>
        </tr>
        </c:forEach>
    </table>
    <p>${applicationScope.mensaje}</p>
    <p>${requestScope.mensaje}</p>
</body>
</html>