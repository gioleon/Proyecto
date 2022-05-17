package com.model;

import com.model.Persona;

public class Director extends Persona{
    
    long id_personal;
    int rol_id;
    
    public Director(long id_personal, int rol_id, String identificacion, String nombre, String apellido, String correo, String contraseña, String facultad, String programa) {
        super(identificacion, nombre, apellido, correo, contraseña, facultad, programa);
        this.id_personal = id_personal;
        this.rol_id = rol_id;
    }

    public long getId_personal() {
        return id_personal;
    }

    public int getRol_id() {
        return rol_id;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getFacultad() {
        return facultad;
    }

    public String getPrograma() {
        return programa;
    }
    
    public void verTickets(){
        
    }
    
    public void verInfoTicket(){
        
    }
    
    public void solucionarTickets(){
        
    }
    
    public void asignarTickets(){
        
    }
}
