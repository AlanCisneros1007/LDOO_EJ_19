<%-- 
    Document   : RegistroInv
    Created on : 13/04/2019, 09:11:56 PM
    Author     : Alan Cisneros
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Invitado</title>
    </head>
    <body>
         <h1>Formulario de Registro (Invitado)</h1>
        <form action="RegistrarUsuarios" method="post">
            <label>Usuario</label>
            <input type="text" name="usuario"><br/>
            <label>Contraseña</label>
            <input type="text" name="pass"><br/>
            <label>Fecha de Nacimiento</label>
            <input type="text" name="fn"><br/>
            <label>Email</label>
            <input type="password" name="email"><br/>
            <label>ID</label>
            <input type="text" name="id"><br/>
            <label>Nombre</label>
            <input type="text" name="nombre"><br/>            
            <input type="submit" value="Registrarse" >
        </form>
    </body>
</html>