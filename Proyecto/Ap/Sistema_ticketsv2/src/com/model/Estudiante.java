package com.model;

import com.conexion.Connections;
import com.model.Persona;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Estudiante extends Persona {

    long id_estudiante;
    int semestre;
    int rol_id = 1;

    public Estudiante() {
    }

    ;
    
    public Estudiante(long id_estudiante, String identificacion, String nombre, String apellido, String correo, int semestre, String facultad, String programa) {
        super(identificacion, nombre, apellido, correo, facultad, programa);
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

    public void crearPeticion() {

    }

    public ArrayList<Peticiones> verInfoTicket(int id) {
        long id_peticion = -1;
        long id_estudiante = -1;
        long id_persona = -1;
        String nombre_facultad = null;
        String nombre_programa = null;
        String asunto = null;
        String informacion = null;
        String retroalimentacion = null;
        Date fecha_creacion = null;
        Date fecha_inicio = null;
        Date fecha_final = null;
        String estado = null;

        ArrayList<Peticiones> listObj = new ArrayList<Peticiones>();

        Connections con = new Connections();

        Statement instruccion = con.conexion();

        String query = "SELECT * FROM peticiones where id_peticion= %d".formatted(id);

        try {
            ResultSet result = instruccion.executeQuery(query);

            while (result.next()) {
                id_peticion = result.getInt("id_peticion");
                id_estudiante = result.getInt("id_estudiante");
                id_persona = result.getInt("id_personal");
                nombre_facultad = result.getString("nombre_facultad");
                nombre_programa = result.getString("nombre_programa");
                asunto = result.getString("asunto");
                informacion = result.getString("informacion");
                retroalimentacion = result.getString("retroalimentacion");
                fecha_creacion = result.getDate("fecha_creacion");
                fecha_inicio = result.getDate("fecha_inicio");
                fecha_final = result.getDate("fecha_final");
                estado = result.getString("estado");
            }

            Peticiones peti = new Peticiones(id_peticion, id_estudiante, id_persona, nombre_facultad, nombre_programa, asunto, informacion, retroalimentacion, fecha_creacion,
                    fecha_inicio, fecha_final, estado);

            listObj.add(peti);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return listObj;
    }

    public ArrayList<ArrayList> verTickets(int id_estudiante) {
        ArrayList<ArrayList> listObj = new ArrayList<ArrayList>();

        ArrayList<Integer> id_peticiones = new ArrayList<Integer>();
        ArrayList<String> asuntos = new ArrayList<String>();
        ArrayList<String> informaciones = new ArrayList<String>();
        ArrayList<String> estados = new ArrayList<String>();

        int id_peticion = -1;
        String asunto = null;
        String informacion = null;
        String estado = null;

        Connections con = new Connections();

        Statement instruccion = con.conexion();

        String query = "SELECT id_peticion, asunto, informacion, estado FROM peticion where id_estudiante= %d".formatted(id_estudiante);

        try {
            ResultSet result = instruccion.executeQuery(query);

            while (result.next()) {
                id_peticion = result.getInt("id_peticion");
                asunto = result.getString("asunto");
                informacion = result.getString("informacion");
                estado = result.getString("estado");
                id_peticiones.add(id_peticion);
                asuntos.add(asunto);
                informaciones.add(informacion);
                estados.add(estado);
            }

      

        } catch (SQLException ex) {
            Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
        }
        listObj.add(id_peticiones);
        listObj.add(asuntos);
        listObj.add(informaciones);
        listObj.add(estados);

        return listObj;
    }

    public void cerrarPeticion(int id_peticion) {
        Connections con = new Connections();

        Statement instruccion = con.conexion();

        String query = "UPDATE peticion SET estado = \"solucionada\" WHERE id_peticion = %d;".formatted(id_peticion);
        try {
            instruccion.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void devolverPeticion(int id_peticion, String retroalimentacion) {
        Connections con = new Connections();

        Statement instruccion = con.conexion();

        String query = "UPDATE peticion SET estado = \"en progreso\", fecha_inicio = \"0000/00/00\", retroalimentacion = \"%s\" WHERE id_peticion = %d;".formatted(retroalimentacion, id_peticion);
        try {
            instruccion.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void actualizarEstudiante(int id_estudiante, String nombre, String apellido) {

        Connections con = new Connections();

        Statement instruccion = con.conexion();

        String query = "UPDATE estudiante SET nombre = \"%s\", apellido = \"%s\" WHERE id_estudiante = %d".formatted(nombre, apellido, id_estudiante);

        try {
            instruccion.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Asistente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void eliminarEstudiante(int id_personal){
        
        try {
            Connections con = new Connections();
            
            Statement instruccion = con.conexion();
            
            String query = "UPDATE estudiante set estado = \"inactivo\" WHERE id_estudiante = %d;".formatted(id_personal);        
            instruccion.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Asistente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    

    public static void main(String[] args) {

//        long id_estudiante = 1;
//        String identificacion = "1201312313";
//        String nombre = "GIO";
//        String apellido = "lef";
//        String correo = "gioasd";
//        int semestre = 1;
//        String facultad = "fsdf";
//        String programa = "fasda";
//        
//        Estudiante estu = new Estudiante(id_estudiante, identificacion, nombre, apellido, correo, semestre, facultad, programa);
    }

}
