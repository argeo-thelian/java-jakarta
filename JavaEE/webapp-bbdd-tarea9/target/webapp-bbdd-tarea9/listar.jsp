<%@ page contentType="text/html;charset=UTF-8"
    import="java.util.List"
    import="com.arthe.webapp.bbddd.tarea9.models.Curso"
%>
<%
    List<Curso> cursos = (List<Curso>) request.getAttribute("cursos");
%>
<!doctype html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Litar Cursos</title>
</head>
    <h1>Tarea 9: Listado de cursos</h1>

    <form action="/webapp-bbdd-tarea9/buscar" method="post">
        <div>
            <label for="anyword">Buscar Palabra</label>
            <div>
                <input type="text" name="anyword" id="anyword" value="${param.anyword}">
            </div>

            <input type="submit" value="Enviar">
        </div>
    </form>
    <table>
        <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>Instructor</th>
            <th>Duración</th>
        </tr>
        <%for (Curso c: cursos) { %>
        <tr>
            <td><%=c.getId()%></td>
            <td><%=c.getNombre()%></td>
            <td><%=c.getInstructor()%></td>
            <td><%=c.getDuracion()%></td>
        </tr>
        <% } %>
    </table>
<body>

</body>
</html>