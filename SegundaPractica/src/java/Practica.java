/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.InetAddress;
import java.util.Calendar;

/**
 *
 * @author Luis Serrano
 */
@WebServlet(urlPatterns = {"/Practica"})
public class Practica extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Practica</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Practica at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");*/
            // ip = request.getRemoteAddr();    para ip del cliente
       String ip = null; // IP del cliente
       Calendar calendar = Calendar.getInstance();
       ip= InetAddress.getLocalHost().getHostAddress();
       
       int dia = calendar.get(Calendar.DAY_OF_MONTH);
       int mes = calendar.get(Calendar.MONTH);
       int anio = calendar.get(Calendar.YEAR);
       int hora = calendar.get(Calendar.HOUR_OF_DAY);
       int mins = calendar.get(Calendar.MINUTE);
       int sec = calendar.get(Calendar.SECOND);
    
        //PrintWriter out = response.getWriter();
        response.setContentType("text/html");
     
    out.println("<html><head><title>Obtener IP del cliente</title></head><body>");
    out.println("<strong>Obtener la IP del cliente </strong>");
    out.println("La ip del cliente es " + ip + "<br>");
    out.println("</body></html>");
    
    out.println("La hora es  " + hora + ":" + mins + ":" + sec);
    out.println("La fecha es:  " + dia + "-" + mes + "-" + anio);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
