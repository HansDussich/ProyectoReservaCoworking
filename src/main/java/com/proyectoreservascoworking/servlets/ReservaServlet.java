
package com.proyectoreservascoworking.servlets;

import com.proyectoreservascoworking.entity.Reserva;
import com.proyectoreservascoworking.entity.controladora;
import java.io.IOException;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ReservaServlet", urlPatterns = {"/ReservaServlet"})
public class ReservaServlet extends HttpServlet {
    
    controladora control = new controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Validar Campos
        String nombre = request.getParameter("nombre");
        String fechaReserva = request.getParameter("fecha");
        String espacio = request.getParameter("espacio");        
        String duracionReserva = request.getParameter("duracion");
        
        //Verifica Si un campo es vacio o nulo 
        if(nombre == null || nombre.isEmpty() ||
                fechaReserva == null || fechaReserva.isEmpty() ||
                espacio == null || espacio.isEmpty() ||
                duracionReserva == null || duracionReserva.isEmpty()){
            
            request.setAttribute("error", "Completa todos los campos.");
            request.getRequestDispatcher("index.html").forward(request, response);
            return;
        }

        //Transforma la fecha a tipo LocalDate y la duracion a int
        LocalDate fecha = LocalDate.parse(fechaReserva);
        int duracion = Integer.parseInt(duracionReserva);
        
        //Se crea un objeto reserva y guarda la informacion
        Reserva reserva = new Reserva();
        reserva.setNombreUsuario(nombre);
        reserva.setFechaReserva(fecha);
        reserva.setEspacio(espacio);
        reserva.setDuracion(duracion);
        control.crearReserva(reserva);
        
        //Redirije a la pagina principal
        response.sendRedirect("index.html");
        processRequest(request, response);
    }




}
