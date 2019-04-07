<%-- 
    Document   : index
    Created on : 6/04/2019, 08:28:20 PM
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
       <form action="InicioSesion" method="post">
           <label>Nombre</label>
            <input type="text" name="usuario" placeholder="nombre" >
            <br/>
           <label>Contraseña</label>
            <input type="password" name="pass" placeholder="contraseña" >
            <br/>
            <input type="submit" value="Iniciar Sesión" >
        </form>
        
        <a href="registro.jsp">Si no tienes una cuenta, click aqui para registrarte</a>
    </body>
</html>
