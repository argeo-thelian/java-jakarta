<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Listado Producto</title>
</head>
<body>
    <h1>Listado Producto</h1>
    <c:if test="${requestScope.username.isPresent()}">
        <div>
            <p>
                Hola <c:out value="${requestScope.username.get()}"/>, bienvenido!
            </p>
        </div>
        <p><a href="<c:out value="${pageContext.request.contextPath}"/>/productos/form">Crear [+]</a></p>
    </c:if>
    <table>
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
            <td><c:out value="${p.id}"/></td>
            <td><c:out value="${p.nombre}"/></td>
            <td><c:out value="${p.categoria.nombre}"/></td>
            <c:if test="${username.present}">
                <td><c:out value="${p.precio}"/></td>
                <td><a href="${pageContext.request.contextPath}/carro/agregar?id=<c:out value="${p.id}"/>">agregar</a></td>
                <td><a href="${pageContext.request.contextPath}/productos/form?id=<c:out value="${p.id}"/>">editar</a></td>
                <td><a onclick="return confirm('Estas seguro que desea eliminar?');"
                       href="${pageContext.request.contextPath}/productos/eliminar?id=<c:out value="${p.id}"/>">eliminar</a></td>
            </c:if>
        </tr>
        </c:forEach>
    </table>
    <p>${applicationScope.mensaje}</p>
    <p>${requestScope.mensaje}</p>
</body>
</html>