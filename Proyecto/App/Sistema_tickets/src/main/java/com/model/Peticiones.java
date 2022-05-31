package com.model;

public class Peticiones {
    
    private long id_peticion;
    private long id_estudiante;
    private long id_personal;
    private String nombre_facultad;
    private String nombre_programa;
    private String asunto;
    private String informacion;
    private String retroalimentacion;
    private String fecha_creacion;
    private String fecha_inicio;
    private String fecha_final;
    private String estado;

    public long getId_peticion() {
        return id_peticion;
    }

    public long getId_estudiante() {
        return id_estudiante;
    }

    public String getNombre_facultad() {
        return nombre_facultad;
    }

    public String getNombre_programa() {
        return nombre_programa;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getInformacion() {
        return informacion;
    }

    public String getRetroalimentacion() {
        return retroalimentacion;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public String getFecha_final() {
        return fecha_final;
    }

    public String getEstado() {
        return estado;
    }
    
    
}
