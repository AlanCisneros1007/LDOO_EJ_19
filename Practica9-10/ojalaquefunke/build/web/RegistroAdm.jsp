<%-- 
    Document   : RegistroAdm
    Created on : 13/04/2019, 09:11:31 PM
    Author     : Alan Cisneros
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Administrador</title>
    </head>
    <body>
         <h1>Formulario de Registro (Administrador)</h1>
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
            <label>No. de Empleado</label>
            <input type="text" name="nempl"><br/>            
            <input type="submit" value="Registrarse" >
        </form>
    </body>
</html>
