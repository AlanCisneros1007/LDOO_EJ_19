<%-- 
    Document   : JSPBasico
    Created on : 6/03/2019, 08:00:53 PM
    Author     : Alan Cisneros
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="main.css" rel="stylesheet" type="text/css"/>
        <title>JSP - LDOO</title>
    </head>
    
    <body>
        
       <%
        
          String nombre = request.getParameter("nombre");
          String email = request.getParameter("email");
          String pass = request.getParameter("pass");
          String fn = request.getParameter("fechadenacimiento");
          
        %>
        
         <h2 class='hola'>DATOS ENVIADOS COMO: </h2>
         <p class='hola'> Nombre: <%=nombre%> </p> </br>
         <p class='hola'> E-Mail: <%=email%> </p> </br>
         <p class='hola'> Password: <%=pass%> </p> </br>
         <p class='hola'> Fecha de Nacimiento: <%=fn%> </p> </br>   
          
          
    </body>
</html>
