<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 22, 2020, 5:21:47 PM
    Author     : 800977
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form>
            <label>First:</label><input type="text" name="firstNum"/> <br>
            <label>Second:</label><input type="text" name="secondNum"/> <br>
            <input type="submit" name="add" value="+"/>
            <input type="submit" name="sub" value="-"/>
            <input type="submit" name="mul" value="*"/>
            <input type="submit" name="div" value="%"/>
        </form> <br>
        <a href="age">Age Calculator</a>
    </body>
</html>
