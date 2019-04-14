<%-- 
    Document   : RegistroUser
    Created on : 13/04/2019, 09:11:39 PM
    Author     : Alan Cisneros
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Usuario Normal</title>
    </head>
    <body>
        <h1>Formulario de Registro (Usuario Normal)</h1>
        <form action="RegistrarUsuarios" method="post">
            <label>Usuario</label>
            <input type="text" name="usuario"><br/>
            <label>Contraseña</label>
            <input type="password" name="pass"><br/>
            <label>Fecha de Nacimiento</label>
            <input type="text" name="fn"><br/>
            <label>Email</label>
            <input type="text" name="email"><br/>
            <label>ID</label>
            <input type="text" name="id"><br/>
            <label>Nombre</label>
            <input type="text" name="nombre"><br/>            
            <label>Tipo de Suscripción</label>
            <input type="text" name="suscripcion"><br/>
            <label>Dirección</label>
            <input type="text" name="direccion"><br/>      
            <input type="submit" value="Registrarse" >
        </form>
    </body>
</html>
