
package com.proyectoreservascoworking.servlets;

import com.proyectoreservascoworking.entity.Reserva;
import com.proyectoreservascoworking.entity.controladora;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ListaReservasServlet", urlPatterns = {"/ListaReservasServlet"})
public class ListaReservasServlet extends HttpServlet {

    controladora control = new controladora();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Se crea un objeto tipo lista de Reservas
        List<Reserva> reservas = new ArrayList<>();
        reservas = control.traerReservas();
        
        //Crearmos una sesion
        HttpSession misesion = request.getSession();

        misesion.setAttribute("listaReservas", reservas);

         //Redirigimos a mostrarReservas
        response.sendRedirect("mostrarReservas.jsp");
    }


}
