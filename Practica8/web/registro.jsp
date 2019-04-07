<%-- 
    Document   : registro
    Created on : 6/04/2019, 10:35:39 PM
    Author     : Alan Cisneros
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REGISTRARME</title>
    </head>
    <body>
        <h1>Formulario de Registro</h1>
        <form action="RegistrarUsuarios" method="post">
            <label>Usuario</label>
            <input type="text" name="usuario"><br/>
            <label>Nombre</label>
            <input type="text" name="nombre"><br/>
            <label>Apellido</label>
            <input type="text" name="apellido"><br/>
            <label>Password</label>
            <input type="password" name="password"><br/>
            <input type="submit" value="Registrarse" >

        </form>

    </body>
</html>
