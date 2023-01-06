<%@ page contentType="text/html" pageEncoding="UTF-8"
         import="java.time.format.*"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Formulario Producto</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>

</head>
<body>
<h1>Formulario Producto</h1>
<form action="${pageContext.request.contextPath}/productos/form" method="post">

    <div>
        <label for="nombre">Nombre</label>
        <div>
            <input type="text" name="nombre" id="nombre" value="${producto.nombre}">
        </div>
        <c:if test="${(errores != null && errores.containsKey('nombre'))}">
            <di style="color:red;">
                <c:out value="${errores.nombre}"/>
            </di>
        </c:if>
    </div>

    <div>
        <label for="precio">Precio</label>
        <div>
            <input type="number" name="precio" id="precio" value="${producto.precio > 0 ? producto.precio : ""}">
        </div>
        <c:if test="${(errores != null && errores.containsKey('precio'))}">
            <div style="color:red;">
                <c:out value="${errores.precio}"/>
            </div>
        </c:if>
    </div>

    <div>
        <label for="sku">Sku</label>
        <div>
            <input type="text" name="sku" id="sku" value="${producto.sku != null ? producto.sku : ""}">
        </div>
        <c:if test="${errores != null && not empty errores.sku}">
            <div style="color:red;">
                <c:out value="${errores.sku}"/>

            </div>
        </c:if>
    </div>

    <div>
        <label for="fecha_registro">Fecha Registro</label>
        <div>
            <input type="date" name="fecha_registro" id="fecha_registro"
                   value="${producto.fechaRegistro != null ? producto.fechaRegistro.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) : ""}">
        </div>
        <c:if test="${(errores != null && errores.containsKey('fecha_registro'))}">
            <div style="color:red;">
                <c:out value="${errores.fecha_registro}"/>
            </div>
        </c:if>
    </div>

    <div>
        <label for="categoria">Categoria</label>
        <div>
            <select name="categoria" id="categoria">
                <option value="">-- Seleccionar --</option>
                <c:forEach items="${categorias}" var="c">
                    <option value="${c.id}" ${c.id.equals(producto.categoria.id) ? "selected" : ""} >${c.nombre}</option>
                </c:forEach>
            </select>
        </div>
        <c:if test="${errores != null && not empty errores.categoria}">
            <div style="color:red;">
                <c:out value="${errores.categoria}"/>
            </div>
        </c:if>
    </div>

    <div>
        <input type="submit" value="${(producto.id !=null && producto.id > 0) ? "Editar" : " Crear"}">
    </div>

    <input type="hidden" name="id" value="${producto.id}">
</form>
</body>
</html>