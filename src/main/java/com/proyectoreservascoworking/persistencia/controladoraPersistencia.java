
package com.proyectoreservascoworking.persistencia;

import com.proyectoreservascoworking.entity.Reserva;
import com.proyectoreservascoworking.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class controladoraPersistencia {
    
    //Instancia del objeto
    ReservaJpaController jpa = new ReservaJpaController();
    
    //Metodo para crear la reserva
    public void crearReserva(Reserva reserva){
        jpa.create(reserva);
    }
    
    //Metodo para mostrar las reservas
    public List<Reserva> traerReservas(){
        return jpa.findReservaEntities();
    }
    
    //Metodo para borrar reservas
    public void borrarReserva(int id){
        try {
            jpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
