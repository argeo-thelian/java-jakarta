<%@ page contentType="text/html" pageEncoding="UTF-8"
         import="com.arthe.apiservlet.webapp.headers.models.Categoria"
         import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page import="com.arthe.apiservlet.webapp.headers.models.Producto" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%
  List<Categoria> categorias = (List<Categoria>) request.getAttribute("categorias");
  Map<String ,String> errores = (Map<String, String>) request.getAttribute("errores");
  Producto producto = (Producto) request.getAttribute("producto");
  String fecha = producto.getFechaRegistro() != null ?
           producto.getFechaRegistro().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) : "";
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
    <form action="<%=request.getContextPath()%>/productos/form" method="post">

      <div>
        <label for="nombre">Nombre</label>
        <div>
          <input type="text" name="nombre" id="nombre" value="<%=producto.getNombre() != null ? producto.getNombre() : ""%>">
        </div>
        <% if (errores != null && errores.containsKey("nombre")){%>
          <di style="color:red;">
            <%=errores.get("nombre")%>
          </di>
        <%}%>
      </div>

      <div>
        <label for="precio">Precio</label>
        <div>
          <input type="number" name="precio" id="precio" value="<%=producto.getPrecio() != 0 ? producto.getPrecio() : ""%>">
        </div>
        <% if (errores != null && errores.containsKey("precio")){%>
        <di style="color:red;">
          <%=errores.get("precio")%>
        </di>
        <%}%>
      </div>

      <div>
        <label for="sku">Sku</label>
        <div>
          <input type="text" name="sku" id="sku" value="<%=producto.getSku() != null ? producto.getSku() : ""%>">
        </div>
        <% if (errores != null && errores.containsKey("sku")){%>
        <di style="color:red;">
          <%=errores.get("sku")%>
        </di>
        <%}%>
      </div>

      <div>
        <label for="fecha_registro">Fecha Registro</label>
        <div>
          <input type="date" name="fecha_registro" id="fecha_registro" value="<%=fecha%>">
        </div>
        <% if (errores != null && errores.containsKey("fecha_registro")){%>
        <di style="color:red;">
          <%=errores.get("fecha_registro")%>
        </di>
        <%}%>
      </div>

      <div>
        <label for="categoria">Categoria</label>
        <div>
          <select name="categoria" id="categoria">
            <option value="">-- Seleccionar --</option>
            <% for (Categoria c : categorias){%>
              <option value="<%=c.getId()%>" <%=c.getId().equals(producto.getCategoria().getId()) ? "selected" : ""%> ><%=c.getNombre()%></option>
            <% } %>
          </select>
        </div>
        <% if (errores != null && errores.containsKey("categoria")){%>
        <di style="color:red;">
          <%=errores.get("categoria")%>
        </di>
        <%}%>
      </div>
      <div><input type="submit" value="<%=(producto.getId()!=null && producto.getId() > 0) ? "Editar" : " Crear" %>"></div>
      <input type="hidden" name="id" value="<%=producto.getId()%>">
    </form>
  </body>
</html>