<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
  List<Categoria> categorias = (List<Categoria>) request.getAttribute("categorias");
  Map<String ,String> errores = (Map<String, String>) request.getAttribute("errores");
  Producto producto = (Producto) request.getAttribute("producto");
  String fecha = producto.getFechaRegistro() != null ? producto.getFechaRegistro().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) : "";
%>
<!doctype html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport"
        content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Formulario Producto</title>
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
            <c:out value="${error.nombre}"/>
          </di>
        </c:if>
      </div>

      <div>
        <label for="precio">Precio</label>
        <div>
          <input type="number" name="precio" id="precio" value="${producto.precio > 0 ? producto.precio : ""}">
        </div>
        <c:if test="${(errores != null && errores.containsKey('precio'))}">
        <di style="color:red;">
          <c:out value="${error.precio}"/>
        </di>
        </c:if>
      </div>

      <div>
        <label for="sku">Sku</label>
        <div>
          <input type="text" name="sku" id="sku" value="${producto.sku != null ? producto.sku : ""}">
        </div>
        <c:if test="${(errores != null && errores.containsKey('sku'))}">
        <di style="color:red;">
          <c:out value="${error.sku}"/>

        </di>
        </c:if>
      </div>

      <div>
        <label for="fecha_registro">Fecha Registro</label>
        <div>
          <input type="date" name="fecha_registro" id="fecha_registro" value="${producto.fechaRegistro != null ? producto.fechaRegistro.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) : ""}">
        </div>
        <c:if test="${(errores != null && errores.containsKey('fecha_registro'))}">
        <di style="color:red;">
          <c:out value="${error.fechaRegistro}"/>
        </di>
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
        </div
        <c:if test="${(errores != null && errores.containsKey('categoria'))}">
        <di style="color:red;">
          <c:out value="${error.categoria}"/>
        </di>
        </c:if>
      </div>
      <div><input type="submit" value="${(producto.id !=null && producto.id > 0) ? "Editar" : " Crear"}"></div>
      <input type="hidden" name="id" value="${producto.id}">
    </form>
  </body>
</html>