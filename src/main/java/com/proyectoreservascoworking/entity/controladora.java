
package com.proyectoreservascoworking.entity;

import com.proyectoreservascoworking.persistencia.controladoraPersistencia;
import java.util.List;

public class controladora {
    
    //Instancia de tipo objeto 
    controladoraPersistencia control = new controladoraPersistencia();
    
    //Metodo para crear la reserva
    public void crearReserva(Reserva reserva){
        control.crearReserva(reserva);
    }
    
    //Metodo para mostrar todas las reservas
    public List<Reserva> traerReservas(){
        return control.traerReservas();
    }
    
    //Metodo para borrar reservas
    public void borrarReserva(int id){
        control.borrarReserva(id);
    }
    
}
