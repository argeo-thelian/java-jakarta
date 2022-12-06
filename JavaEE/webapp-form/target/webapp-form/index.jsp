<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="java.util.Map" %>
<%
    //scriptlet
    Map<String, String> errores = (Map<String, String>) request.getAttribute("errores");

%>
<!doctype html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Formulario de usuario</title>
    <!-- CSS only -->
    <link href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet"

</head>
<body>
<h3>Formulario de usuarios</h3>
<%
    if (errores != null && errores.size() > 0) {
%>
<ul class="alert alert-danger mx-5 px-5">
    <%for (String error : errores.values()) {%>
    <li>
        <% //out.println(error);%>
        <%=error%>
    </li>
    <%}%>
</ul>
<%
    }
%>
<div class="px-5">
    <form action="/webapp-form/registro" method="post">
        <div class="row mb-3">
            <label for="username" class="col-form-label col-sm-2">Usuario</label>
            <div class="col-sm-4">
                <input type="text" name="username" id="username" class="form-control" value="${param.username}">
            </div>
            <%
                if (errores != null && errores.containsKey("username")) {
                    out.print("<small class='alert alert-danger col-sm-4' style='color:red;'>" + errores.get("username") + "</small>");
                }
            %>
        </div>
        <div class="row mb-3">
            <label for="password" class="col-form-label col-sm-2">Password</label>
            <div class="col-sm-4">
                <input type="password" name="password" id="password" class="form-control">
            </div>
            <%
                if (errores != null && errores.containsKey("password")) {
                    out.print("<small class='alert alert-danger col-sm-4' style='color:red;'>" + errores.get("password") + "</small>");
                }
            %>
        </div>
        <div class="row mb-3">
            <label for="email" class="col-form-label col-sm-2">Email</label>
            <div class="col-sm-4">
                <input type="text" name="email" id="email" class="form-control" value="${param.email}">
            </div>
            <%
                if (errores != null && errores.containsKey("email")) {
                    out.print("<small class='alert alert-danger col-sm-4' style='color:red;'>" + errores.get("email") + "</small>");
                }
            %>
        </div>
        <div class="row mb-3">
            <label for="pais" class="col-form-label col-sm-2">País</label>
            <div class="col-sm-4">
                <select name="pais" id="pais" class="form-select">
                    <option value="">-- seleccionar --</option>
                    <option value="ES" ${param.pais.equals("ES") ? "selected" : ""}>España</option>
                    <option value="MX" ${param.pais.equals("MX") ? "selected" : ""}>México</option>
                    <option value="CL" ${param.pais.equals("CL") ? "selected" : ""}>Chile</option>
                    <option value="AR" ${param.pais.equals("AR") ? "selected" : ""}>Argentina</option>
                    <option value="PE" ${param.pais.equals("PE") ? "selected" : ""}>Perú</option>
                    <option value="CO" ${param.pais.equals("CO") ? "selected" : ""}>Colombia</option>
                    <option value="VE" ${param.pais.equals("VE") ? "selected" : ""}>Venezuela</option>
                </select>
            </div>
            <%
                if (errores != null && errores.containsKey("pais")) {
                    out.print("<small class='alert alert-danger col-sm-4' style='color:red;'>" + errores.get("pais") + "</small>");
                }
            %>
        </div>

        <div class="row mb-3">
            <label for="lenguajes" class="col-form-label col-sm-2">Lenguajes de programación</label>
            <div class="col-sm-4">
                <select name="lenguajes" id="lenguajes" multiple class="form-select">
                    <option value="java" ${paramValues.lenguajes.stream().anyMatch(v->v.equals("java")).get() ? "selected" : ""} >Java SE</option>
                    <option value="jakarta" ${paramValues.lenguajes.stream().anyMatch(v->v.equals("jakarta")).get() ? "selected" : ""} >jakarta EE9</option>
                    <option value="spring" ${paramValues.lenguajes.stream().anyMatch(v->v.equals("spring")).get() ? "selected" : ""}>Spring Boot</option>
                    <option value="js" ${paramValues.lenguajes.stream().anyMatch(v->v.equals("js")).get() ? "selected" : ""}>JavaScript</option>
                    <option value="angular" ${paramValues.lenguajes.stream().anyMatch(v->v.equals("angular")).get() ? "selected" : ""}>Angular</option>
                    <option value="react" ${paramValues.lenguajes.stream().anyMatch(v->v.equals("react")).get() ? "selected" : ""}>React</option>
                </select>
            </div>
            <%
                if (errores != null && errores.containsKey("lenguajes")) {
                    out.print("<small class='alert alert-danger col-sm-4' style='color:red;'>" + errores.get("lenguajes") + "</small>");
                }
            %>
        </div>

        <div class="row mb-3">
            <label class="col-form-label col-sm-2">Roles</label>
            <div class="form-check col-sm-2">
                <input type="checkbox" name="roles" value="ROLE_ADMIN"
                ${paramValues.roles.stream().anyMatch(v->v.equals("ROLE_ADMIN")).get() ? "checked" : ""}
                       id="idAdmin" class="form-check-input">
                <label for="idAdmin" class="form-check-label">Administrador</label>
            </div>
            <div class="form-check col-sm-2">
                <input type="checkbox" name="roles" value="ROLE_USER"
                ${paramValues.roles.stream().anyMatch(v->v.equals("ROLE_USER")).get() ? "checked" : ""}
                       id="idUser"  class="form-check-input">
                <label for="idUser" class="form-check-label">Usuario</label>
            </div>
            <div class="form-check col-sm-2">
                <input type="checkbox" name="roles" value="ROLE_MODERATOR"
                ${paramValues.roles.stream().anyMatch(v->v.equals("ROLE_MODERATOR")).get() ? "checked" : ""}

                       id="idModerador" class="form-check-input">
                <label for="idModerador" class="form-check-label">Moderador</label>
            </div>
            <%
                if (errores != null && errores.containsKey("roles")) {
                    out.print("<small class='alert alert-danger col-sm-4' style='color:red;'>" + errores.get("roles") + "</small>");
                }
            %>
        </div>

        <div class="row mb-3">
            <label class="col-form-label col-sm-2">Idiomas</label>
            <div class="form-check col-sm-2">
                <input type="radio" name="idioma" value="es" id="espanol" class="form-check-input" ${param.idioma.equals("es") ? "checked" : ""}>
                <label for="espanol" class="form-check-label">Español</label>
            </div>
            <div class="form-check col-sm-2">
                <input type="radio" name="idioma" value="en" id="ingles" class="form-check-input" ${param.idioma.equals("en") ? "checked" : ""}>
                <label for="ingles" class="form-check-label">Inglés</label>
            </div>
            <div class="form-check col-sm-2">
                <input type="radio" name="idioma" value="fr" id="frances" class="form-check-input" ${param.idioma.equals("fr") ? "checked" : ""}>
                <label for="frances" class="form-check-label">Frances</label>
            </div>
            <%
                if (errores != null && errores.containsKey("idioma")) {
                    out.print("<small class='alert alert-danger col-sm-4' style='color:red;'>" + errores.get("idioma") + "</small>");
                }
            %>
        </div>
        <div class="row mb-3">
            <label for="habilitar" class="col-form-label col-sm-2">Habilitar</label>
            <div class="form-check col-sm-2">
                <input type="checkbox" name="habilitar" id="habilitar" checked class="form-check-input">
            </div>
        </div>
        <div class="row mb-3">
            <div>
                <input type="submit" value="Enviar" class="btn btn-primary">
            </div>
        </div>
        <input type="hidden" name="secreto" value="12345">
    </form>
</div>
</body>
</html>