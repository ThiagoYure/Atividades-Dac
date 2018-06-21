<%-- 
    Document   : calculadora
    Created on : 21/06/2018, 10:09:04
    Author     : ifpb
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora</title>
    </head>
    <body>
        <form action="CalculadoraServlet">
            <span>valor a</span><br>
            <input type="number" name="a">
            <span>valor b</span><br>
            <input type="number" name="b">
            <br>
            <input type="submit" value="Somar">
        </form>
    </body>
</html>
