<%@page contentType="text/html" pageEncoding="UTF-8" import="com.arthe.apiservlet.webapp.headers.models.*" %>

<%
Carro carro = (Carro) session.getAttribute("carro");
%>
<!doctype html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Carro de Compras</title>
</head>
<body>
    <h1>Carro de compras</h1>

    <% if (carro == null || carro.getItems().isEmpty()){ %>
        <p>Lo sentimos, no hay productos en el carro!</p>
    <% }else{ %>
        <table>
            <tr>
                <th>Id</th>
                <th>Nombre</th>
                <th>Precio</th>
                <th>Cantidad</th>
                <th>total</th>
            </tr>
            <% for (ItemCarro item: carro.getItems()){ %>
            <tr>
                <td><%=item.getProducto().getId()%></td>
                <td><%=item.getProducto().getNombre()%></td>
                <td>$ <%=item.getProducto().getPrecio()%></td>
                <td><%=item.getCantidad()%></td>
                <td>$ <%=item.getImporte()%></td>
             </tr>
            <% } %>
            <tr>
                <td colspan="4" style="text-align: right">Total:</td>
                <td>$ <%=carro.getTotal()%></td>
            </tr>
        </table>
    <% } %>
    <p><a href="<%=request.getContextPath()%>/productos">Seguir comprando</a></p>
    <p><a href="<%=request.getContextPath()%>/index.html">volver</a></p>
</body>
</html>
