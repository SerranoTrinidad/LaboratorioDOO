<%-- 
    Document   : newjsp
    Created on : 21-sep-2018, 19:02:33
    Author     : Luis Serrano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <div><font face="arial">Ingresa los siguientes datos para la realizacion de tu cuenta</div>
        <form action="newjsp1.jsp" method="post">
            
            <p><font face="arial"><strong>Nombre</strong></font><br><input type="text" name="user" id="user"/><br>
            </p>
                
            <p><font face="arial"><strong>Apellido Paterno</strong></font><br><input type="text" name="paterno" id="paterno"><br>
            </p>
            
            <p><font face="arial"><strong>Apellido Materno</strong></font><br><input type="text" name="materno" id="materno"><br>
            </p>
              
            <p><font face="arial"><strong>Fecha de Nacimiento</strong></font><br><input type="date" name="nac" id="nac"><br>
            </p>
            
            <p><font face="arial"><strong>Correo Electrinico</strong></font><br><input type="email" name="email" id="email"><br>
            </p>
            
            <p><font face="arial"><strong>Contraseña</strong></font><br><input type="password" name="password" id="pass"><br>
            </p>
            
            <p><input type="submit" name="entrar" value="Formulario Completo">
            </p>
        </form>
    </body>
</html>
