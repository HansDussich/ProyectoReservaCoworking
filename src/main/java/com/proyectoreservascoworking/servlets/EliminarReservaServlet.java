
package com.proyectoreservascoworking.servlets;

import com.proyectoreservascoworking.entity.controladora;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "EliminarReservaServlet", urlPatterns = {"/EliminarReservaServlet"})
public class EliminarReservaServlet extends HttpServlet {
    
    //Instancia del objeto 
    controladora control = new controladora();


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Crear variable donde se guarde el id de la reserva a eliminar
        int id = Integer.parseInt(request.getParameter("id"));
        //Eliminar la reserva 
        control.borrarReserva(id);
        
        //Redirigimos al index
        response.sendRedirect("index.html");
        
    }

}
