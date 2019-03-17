<%-- 
    Document   : nameView
    Created on : 12/03/2019, 6:52:13 PM
    Author     : Alan Cisneros 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring Modelo Vista Controlador</title>
    </head>
    <body>
        <h1>!BIENVENIDO, FAVOR DE REGISTRARSE!</h1>
        <spring:nestedPath path="name">
            <form action="" method="post">
                Nombre:
                <spring:bind path="value">
                    <input type="text" name="${status.expression}" value="${status.value}">
                    <br/>
                    Password
                    <input id = "pass" name = "pass" type = "password" value = ""/>
                    <br/>
                    Email
                    <input id = "email" name = "email" type = "text" value = ""/>
                    <input type="submit" value="OK">

                </spring:bind>
                <br/>

            </form>
        </spring:nestedPath>



    </body>
</html>
