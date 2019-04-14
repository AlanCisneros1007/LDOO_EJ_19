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
        <title>Registrarse</title>
    </head>
    
    <body>
        <h1>Bienvenido a nuestro menú de registro, por favor seleccion el tipo de usuario que es:<h1>
       
                <form action="ControladorServlet" method="post">            
            <select name="rango">
                <option value="Administrador">Administrador</option>
                <option value="Invitado">Invitado</option>
                <option value="Normal">Usuario</option>
            </select>   
            <input type="submit" value="Enviar">
        </form>
        
    </body>
    
    
</html>
