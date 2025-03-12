
package com.proyectoreservascoworking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;



@Entity
public class Reserva implements Serializable {

    //Id incremental 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombreUsuario;
    private LocalDate fechaReserva;
    private String espacio;
    private int duracion;

    //Contructor vacio
    public Reserva() {
    }

    //Contructor con argumentos
    public Reserva(String nombreUsuario, LocalDate fechaReserva, String espacio, int duracion) {
        this.nombreUsuario = nombreUsuario;
        this.fechaReserva = fechaReserva;
        this.espacio = espacio;
        this.duracion = duracion;
    }

    //Setters and Getters
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getEspacio() {
        return espacio;
    }

    public void setEspacio(String espacio) {
        this.espacio = espacio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    
    
    
    
}
