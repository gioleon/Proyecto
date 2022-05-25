package com.model;

public class Persona {
    String identificacion;
    String nombre;
    String apellido;
    String correo;
    String contraseña;
    String facultad;
    String programa;

    public Persona(String identificacion, String nombre, String apellido, String correo, String contraseña, String facultad, String programa) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
        this.facultad = facultad;
        this.programa = programa;
    }
    
    
}
