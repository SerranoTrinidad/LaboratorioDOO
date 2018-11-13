<%-- 
    Document   : index
    Created on : 11/11/2018, 09:11:06 PM
    Author     : Luis Serrano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>

    <%
        String user = "Usuario1"; 

        Cookie[] allCookies = request.getCookies();


        if (allCookies != null) {
            for (Cookie cookie : allCookies) {
                if (cookie.getName().equals("user")) {
                    user = cookie.getValue();
                }
            }
        }

    %>

    <body bgcolor="<%=user%>">
        <h1>Elige un usuario registrado para ingresar:</h1>
        <form action="user.jsp" method="POST">
            <select name="user">
                <option <%=user.equals("Usuario1") ? "selected" : ""%> value="Usuario1">Usuario 1</option>
                <option <%=user.equals("Usuario2") ? "selected" : ""%> value="Usuario2">Usuario 2</option>
                <option <%=user.equals("Usuario3") ? "selected" : ""%> value="Usuario3">Usuario 3</option>
                <option <%=user.equals("Usuario4") ? "selected" : ""%> value="Usuario4">Usuario 4</option><br>
               <p><strong>Contraseña</strong><br><input type="password" name="password" id="pass"><br></p>
                <input type="submit" value="Ingresar">
            </select>    
        </form>
    </body>
</html>