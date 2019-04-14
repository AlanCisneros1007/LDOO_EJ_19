package Servlet;

import Controlador.Consultas;
import Usuarios.Administrador;
import Usuarios.Factory;
import Usuarios.Invitado;
import Usuarios.Normal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alan Cisneros
 */
public class RegistrarUsuarios extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        String usuario = request.getParameter("usuario");       
        String email = request.getParameter("email");
        String rango = request.getParameter("rango");
        String fn = request.getParameter("fn");
        String apellido = request.getParameter("apellido");
        String contraseña = request.getParameter("password");
        int id = Integer.parseInt(request.getParameter("id"));
        int nempl = Integer.parseInt(request.getParameter("nempl"));      
        String nombre = request.getParameter("nombre");
        String suscripcion = request.getParameter("suscripcion");
        String direccion = request.getParameter("direccion");
        
        Factory factory = Factory.getFactory();
        factory.addUser(usuario, contraseña, fn, email, rango, id, nempl,nombre,suscripcion,direccion);

        String user = factory.getUser(request.getParameter("user")).getNombreusuario();
        String password = factory.getUser(request.getParameter("user")).getPass();
        String bd = factory.getUser(request.getParameter("user")).getFn();
        String correo = factory.getUser(request.getParameter("user")).getEmail();
        String tipouser = factory.getUser(request.getParameter("user")).getRango();
        int userid = factory.getUser(request.getParameter("user")).getId();
        
        int nempla = 0;
        String name = null;
        String suscription = null;
       String direcc = null;
        String fre = null;

        switch (rango) {
            case "Administrador":
                nempl = ((Administrador) factory.getUser(request.getParameter("user"))).getNempl();
                break;
            case "Normal":
                name = ((Normal) factory.getUser(request.getParameter("user"))).getNombre();
                suscription = ((Normal) factory.getUser(request.getParameter("user"))).getSuscripcion();
                direcc = ((Normal) factory.getUser(request.getParameter("user"))).getDireccion();
                break;
            case "Invitado":
                name = ((Invitado) factory.getUser(request.getParameter("user"))).getNombre();
                fre = ((Invitado) factory.getUser(request.getParameter("user"))).getFechaDeRegistro();
                break;
            default:
                break;
        }

        Consultas co = new Consultas();
        if (co.registrar(user, password, fn, email, rango, id, nempl, name, suscripcion, direccion)) {
            response.sendRedirect("index.jsp");
        } else {
            response.sendRedirect("registro.jsp");
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
