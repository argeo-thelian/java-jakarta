<%@ page contentType="text/html"
         import="java.util.Optional"
         import="java.util.List"
         import="com.arthe.apiservlet.webapp.headers.models.*" %>
<%
    List<Producto> productos = (List<Producto>) request.getAttribute("productos");
    Optional<String> username = (Optional<String>) request.getAttribute("username");
    String mensajeRequest = (String) request.getAttribute("mensaje");
    String mensajeGlobal = (String) request.getServletContext().getAttribute("mensaje");

%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Listado Producto</title>
</head>
<body>
    <h1>Listado Producto</h1>
    <%if (username.isPresent()){%>
    <div>Hola <%=username.get()%>, bienvenido!</div>
    <p><a href="<%=request.getContextPath()%>/productos/form">Crear [+]</a></p>
    <%}%>
    <table>
        <tr>
            <th>Id</th>
            <th>Nombre</th>
            <th>Categoria</th>
            <%if (username.isPresent()){%>
            <th>Precio</th>
            <th>agregar</th>
            <th>editar</th>
            <% } %>
        </tr>
        <%for (Producto p: productos){%>
        <tr>
            <td><%=p.getId()%></td>
            <td><%=p.getNombre()%></td>
            <td><%=p.getCategoria().getNombre()%></td>
            <%if (username.isPresent()){%>
            <td><%=p.getPrecio()%></td>
            <td><a href="<%=request.getContextPath()%>/carro/agregar?id=<%=p.getId()%>">agregar</a></td>
            <td><a href="<%=request.getContextPath()%>/productos/form?id=<%=p.getId()%>">editar</a></td>
            <% }  %>
        </tr>
        <%}%>
    </table>
    <p><%=mensajeGlobal%></p>
    <p><%=mensajeRequest%></p>
</body>
</html>