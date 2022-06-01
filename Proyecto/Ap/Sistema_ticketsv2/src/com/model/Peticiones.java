package com.model;

import java.sql.Date;

public class Peticiones {
    
    private long id_peticion;
    private long id_estudiante;
    private long id_personal;
    private String nombre_facultad;
    private String nombre_programa;
    private String asunto;
    private String informacion;
    private String retroalimentacion;
    private Date fecha_creacion;
    private Date fecha_inicio;
    private Date fecha_final;
    private String estado;

    public Peticiones(long id_peticion, long id_estudiante, long id_personal, String nombre_facultad, String nombre_programa, String asunto, String informacion, String retroalimentacion, Date fecha_creacion, Date fecha_inicio, Date fecha_final, String estado) {
        this.id_peticion = id_peticion;
        this.id_estudiante = id_estudiante;
        this.id_personal = id_personal;
        this.nombre_facultad = nombre_facultad;
        this.nombre_programa = nombre_programa;
        this.asunto = asunto;
        this.informacion = informacion;
        this.retroalimentacion = retroalimentacion;
        this.fecha_creacion = fecha_creacion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
        this.estado = estado;
    }

   

    
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

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public Date getFecha_final() {
        return fecha_final;
    }

    public String getEstado() {
        return estado;
    }
    
    
}
