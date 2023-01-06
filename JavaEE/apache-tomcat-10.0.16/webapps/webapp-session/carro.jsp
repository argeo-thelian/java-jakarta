<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Carro de Compras</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</head>
<body>
<h1>Carro de Compras</h1>

<c:choose>
    <c:when test="${sessionScope.carro == null || sessionScope.carro.items.isEmpty()}">
        <div class="alert alert-warning">Lo sentimos no hay productos en el carro de compras!</div>
    </c:when>
    <c:otherwise>
        <form name="formcarro" action="${pageContext.request.contextPath}/carro/actualizar" method="post">
            <table class="table table-hover table-striped">
                <tr>
                    <th>id</th>
                    <th>nombre</th>
                    <th>precio</th>
                    <th>cantidad</th>
                    <th>total</th>
                    <th>borrar</th>
                </tr>
                <c:forEach items="${sessionScope.carro.items}" var="item">
                    <tr>
                        <td>
                                ${item.producto.id}
                        </td>
                        <td>
                                ${item.producto.nombre}
                        </td>
                        <td>
                                ${item.producto.precio}
                        </td>
                        <td>
                            <input type="text" size="4" name="cant_${item.producto.id}" value="${item.cantidad}"/>
                        </td>
                        <td>${item.importe}
                        </td>
                        <td>
                            <input type="checkbox" value="${item.producto.id}" name="deleteProductos"/>
                        </td>
                    </tr>
                </c:forEach>
                <tr>
                    <td colspan="4" style="text-align: right">Total:</td>
                    <td>
                            ${carro.total}
                    </td>
                </tr>
            </table>
            <input class="btn btn-sm btn-primary" type="submit" value="Actualizar"/>
        </form>
    </c:otherwise>
</c:choose>

<div class="my-2">
    <a class="btn btn-sm btn-success" href="${pageContext.request.contextPath}/productos">seguir comprando</a>
    <a class="btn btn-sm btn-secondary" href="${pageContext.request.contextPath}/index.html">volver</a>
</div>
</body>
</html>