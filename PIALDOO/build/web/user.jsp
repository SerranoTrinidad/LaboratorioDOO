<%-- 
    Document   : color
    Created on : 11/11/2018, 09:11:59 PM
    Author     : Luis Serrano
--%>

<%@page import="Controlador.CookieManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Color Cookie</title>
    </head>
<%
        String user = "Usuario1";
        Cookie[] allCookies = request.getCookies();

        if (allCookies != null) {
            for (Cookie cookie : allCookies) {
                if (cookie.getName().equals("user")) {
                    user = cookie.getValue();
                    System.out.println("--hay cookie: " + user);
                }
            }
        }

        CookieManager cm = new CookieManager(allCookies);
        String c = cm.getCookie("user");
        String userForm = request.getParameter("user");
        String passForm = request.getParameter("pass");
        if(userForm == "Usuario1" && passForm == "Usuario1"){
            user = "Usuario1";
        } else {
            
            user = userForm;
            Cookie cookie = new Cookie("user", user);
            cookie.setMaxAge(3600); 
            response.addCookie(cookie);

        }
    %>
    
        <h1>Usuario Elegido: <%=user%></h1>
        <a href="index.jsp" >"Regresar a Index" </a>
    


