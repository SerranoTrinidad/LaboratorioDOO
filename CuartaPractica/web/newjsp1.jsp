<%-- 
    Document   : newjsp1
    Created on : 21-sep-2018, 19:22:26
    Author     : Luis Serrano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <background color="blue">
            
            
    </head>
    
      
        

        <%String user = request.getParameter("user");%>

        <% String paterno = request.getParameter("paterno"); %>

        <% String materno = request.getParameter("materno"); %>
        <% String nac = request.getParameter("nac");%>
        <% String email = request.getParameter("email");%>
        <% String pass = request.getParameter("password");%>
        
        <table width="280" cellspacing="1" cellpadding="3" border="0" bgcolor="#1E679A">
<tr>
   <td><font color="#FFFFFF" face="arial, verdana, helvetica">
  <h1><center>Datos Completos</center></h1>
   </font></td>
</tr>
<tr>
   <td bgcolor="#ffffcc">
   <font face="arial, verdana, helvetica">
               
          <p><center><strong>Nombre:</center></strong><br>         
          <center><% out.println(user);%></center>
          <p><center><strong>Apellido Paterno:</strong></center><br>       
           <center><% out.println(paterno);%></center>
          <p> <center><strong>Apellido Materno:</strong></center><br>       
           <center><% out.println(materno);%></center>
          <p> <center><strong>Fecha de nacieminto:</strong></center><br>
           <center><% out.println(nac);%></center>
          <p> <center><strong>Correo electronico:</strong></center><br>
          <center> <% out.println(email);%></center>
          <p> <center><strong>Contraseña: Confimada</strong></center><br> 

   </font>
   </td>
</tr>
</table> 

            
            
    
</html>
    