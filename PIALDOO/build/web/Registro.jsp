<%-- 
    Document   : Registro
    Created on : 12/11/2018, 08:14:43 AM
    Author     : Luis Serrano
--%>

<!DOCTYPE html>

<html>
    <head>
        <title>Creacion de Cuenta</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div><font face="arial">Ingresa los siguientes campos (obligatorios) para la creacion de tu cuenta</div>
        <form action="Formulario" method="post">
            
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
