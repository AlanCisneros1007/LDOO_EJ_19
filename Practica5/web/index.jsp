<%-- 
    Document   : index
    Created on : 24/03/2019, 12:43:46 AM
    Author     : Alan Cisneros
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INICIAR SESIÓN</title>
    </head>
    <body>
        <h1>Bienvenido, favor de iniciar sesión</h1>
        <h2>User:Alan  Pass: 123
        </h2>
       <form action="ValidarServlet" method="post">
            <input type="text" name="name" placeholder="nombre" required>
            <br/>
            <input type="password" name="pass" placeholder="contraseña" required>
            <br/>
            <input type="submit" value="Iniciar Sesión" required>
        </form>
    </body>
</html>
