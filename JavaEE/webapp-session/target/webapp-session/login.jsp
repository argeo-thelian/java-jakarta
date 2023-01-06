<%@page contentType="text/html;" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>

</head>
<body>
    <h1>Iniciar sesión</h1>
    <form action="/webapp-session/login" method="POST">
        <div>
            <label for="username">User name</label>
            <div>
                <input type="text" name="username" id="username">
            </div>
        </div>
        <div>
            <label for="password">Password</label>
            <div>
                <input type="password" name="password" id="password">
            </div>
        </div>
        <div>
            <input type="submit" value="Login">
        </div>
    </form>
</body>
</html>