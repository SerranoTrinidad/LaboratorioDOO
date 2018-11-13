/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Luis Serrano
 */
public class CookieManager {

    private final javax.servlet.http.Cookie[] cookies;

    public CookieManager(javax.servlet.http.Cookie[] cookies) {
        this.cookies = cookies;
    }

    public String getCookie(String cookieName) {
        String valor = null;
        for (javax.servlet.http.Cookie cookie : cookies) {
            if (cookie.getName().equals(cookieName)) {
                valor = cookie.getValue();
            }
        }
        return valor;
    }
}

   