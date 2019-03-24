/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Alan Cisneros
 */
public class ValidarServlet extends HttpServlet {

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
        
       String name, pass;
       
       name = request.getParameter("name");
       
       pass = request.getParameter("pass");
       
       if(name.equalsIgnoreCase("Alan")){
           if(pass.equalsIgnoreCase("123")){
                Usuario usu = new Usuario(name, pass);
               HttpSession session = request.getSession();
               session.setAttribute("usuario",usu);
               Cookie cookie1 = new Cookie("name", name);
              Cookie cookie2 = new Cookie("pass", pass);
    
                 cookie1.setMaxAge(420);
                 cookie2.setMaxAge(420);         
                 response.addCookie(cookie1);
                 response.addCookie(cookie2);
               request.getRequestDispatcher("MenuServlet").forward(request,response);
          }else{
               request.getRequestDispatcher("registrarse.jsp").forward(request,response);
           }
       }else{
           request.getRequestDispatcher("registrarse.jsp").forward(request,response);  
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
