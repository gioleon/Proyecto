package com.model;

import com.model.Persona;


public class Estudiante extends Persona{
    long id_estudiante;
    int semestre;
    int rol_id = 1;

    public Estudiante(long id_estudiante, String identificacion, String nombre, String apellido, String correo, String contraseña, int semestre, String facultad, String programa) {
        super(identificacion, nombre, apellido, correo, contraseña, facultad, programa);
        this.id_estudiante = id_estudiante;
        this.semestre = semestre;
    }
    
    public long getId_estudiante() {
        return id_estudiante;
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


    public int getSemestre() {
        return semestre;
    }


    public String getFacultad() {
        return facultad;
    }


    public String getPrograma() {
        return programa;
    }

    public int getRol_id() {
        return rol_id;
    }

    
    public void crearPeticion(){
        
    }
    
    public void verInfoPeticion(){
        
    }
    
    public void verPeticiones(){
        
    }
    
    public void cerrarPeticion(){
        
    }
    
    public void devolverPeticion(){
        
    }
    
}
