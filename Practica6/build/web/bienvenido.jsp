<%-- 
    Document   : vista
    Created on : 24/03/2019, 01:31:37 AM
    Author     : Alan Cisneros
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenido</title>
    </head>
    <body>
           <%
            String name = "";
            Cookie[] cookie1 = request.getCookies();
            for (Cookie cookie : cookie1) {
                if (cookie.getName().equals("name")) {
                    name = cookie.getValue();
                }
            }
            String pass = "";
            Cookie[] cookie2 = request.getCookies();
            for (Cookie cookie : cookie2) {
                if (cookie.getName().equals("pass")) {
                    pass = cookie.getValue();
                }
            }
            
        %>
        
        <h1>Bienvenido! <%=name%></h1>
        <h1>La cookie ha sido creada!</h1>  

    </body>
</html>
