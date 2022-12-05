<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="java.util.List"%>
<%
//scriptlet
    List<String> errores = (List<String>) request.getAttribute("errores");

%>
<!doctype html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Formulario de usuario</title>
</head>
<body>
    <h3>Formulario de usuarios</h3>
    <%
        if(errores != null && errores.size()>0){
    %>
        <ul>
            <%for (String error: errores){%>
            <li>
                <% //out.println(error);%>
                <%=error%>
            </li>
            <%}%>
        </ul>
    <%
        }
    %>
    <form action="/webapp-form/registro" method="post">
        <div>
            <label for="username">Usuario</label>
            <div ><input type="text" name="username" id="username"></div>
        </div>
        <div>
            <label for="password">Password</label>
            <div ><input type="password" name="password" id="password"></div>
        </div>
        <div>
            <label for="email">Email</label>
            <div ><input type="text" name="email" id="email"></div>
        </div>
        <div>
            <label for="pais">País</label>
            <div>
                <select name="pais" id="pais">
                    <option value="">-- seleccionar --</option>
                    <option value="ES">España</option>
                    <option value="MX" selected>México</option>
                    <option value="CL">Chile</option>
                    <option value="AR">Argentina</option>
                    <option value="PE">Perú</option>
                    <option value="CO">Colombia</option>
                    <option value="VE">Venezuela</option>
                </select>
            </div>
        </div>
        
        <div>
            <label for="lenguajes">Lenguajes de programación</label>
            <div>
                <select name="lenguajes" id="lenguajes" multiple>
                    <option value="java" selected>Java SE</option>
                    <option value="jakarta" selected>jakarta EE9</option>
                    <option value="spring">Spring Boot</option>
                    <option value="js">JavaScript</option>
                     <option value="angular">Angular</option>
                    <option value="react">React</option>
                </select>
            </div>
        </div>

        <div>
            <label>Roles</label>
            <div>
                <input type="checkbox" name="roles" value="ROLE_ADMIN" id="idAdmin">
                <label for="idAdmin">Administrador</label>
            </div>
            <div>
                <input type="checkbox" name="roles" value="ROLE_USER" id="idUser" checked>
                <label for="idUser">Usuario</label>
            </div>
            <div>
                <input type="checkbox" name="roles" value="ROLE_MODERATOR" id="idModerador">
                <label for="idModerador">Moderador</label>
            </div>
        </div>

        <div>
            <label>Idiomas</label>
            <div>
                <input type="radio" name="idioma" value="es" id="espanol" checked>
                <label for="espanol">Español</label>
            </div>
            <div>
                <input type="radio" name="idioma" value="en" id="ingles">
                <label for="ingles">Inglés</label>
            </div>
            <div>
                <input type="radio" name="idioma" value="er" id="frances">
                <label for="frances">Frances</label>
            </div>
        </div>
        <div>
            <label for="habilitar">Habilitar</label>
            <input type="checkbox" name="habilitar" id="habilitar" checked >
        </div>
        <div>
            <div>
                <input type="submit" value="Enviar">
            </div>
        </div>
        <input type="hidden" name="secreto" value="12345">
    </form>
</body>
</html>