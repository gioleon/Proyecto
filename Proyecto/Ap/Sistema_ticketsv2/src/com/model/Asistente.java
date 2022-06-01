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

public class Asistente extends Persona{
    long id_personal;
    int rol_id;

    public Asistente(long id_personal, int rol_id, String identificacion, String nombre, String apellido, String correo, String facultad, String programa) {
        super(identificacion, nombre, apellido, correo, facultad, programa);
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
    
    public ArrayList<ArrayList> verTickets(int id_personal){
        ArrayList<ArrayList> listObj = new ArrayList<ArrayList>();
        
        ArrayList<Long> id_peticiones = new ArrayList<Long>();
        ArrayList<String> asuntos = new ArrayList<String>();
        ArrayList<String> informaciones = new ArrayList<String>();
        ArrayList<String> estados = new ArrayList<String>();
        
        long id_peticion = -1;
        String asunto = null;
        String informacion = null;
        String estado = null;
        
        
        
        Connections con = new Connections();

        Statement instruccion = con.conexion();

        String query = "SELECT id_peticion, asunto, informacion, estado FROM peticiones where id_personal= %d".formatted(id_personal);

        try {
            ResultSet result = instruccion.executeQuery(query);

            while (result.next()) {
                id_peticion = result.getLong("id_peticion");
                asunto = result.getString("asunto");
                informacion = result.getString("informacion");
                estado = result.getString("estado");
            }
            
            id_peticiones.add(id_peticion);
            asuntos.add(asunto);
            informaciones.add(informacion);
            estados.add(estado);
            
        } catch (SQLException ex) {
            Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
        }
      listObj.add(id_peticiones);
      listObj.add(asuntos);
      listObj.add(informaciones);
      listObj.add(estados);
        
      return listObj;
    }
    
    public ArrayList<Peticiones> verInfoTicket(int id){
        
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

        String query = "SELECT * FROM peticiones where id_peticion = %d".formatted(id);

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
    
    public void solucionarTickets(String id){
        
        Connections con = new Connections();

        String query = """
                       UPDATE peticiones
                       SET estado = "enviado" AND
                       fecha_final = (select current_date())
                       WHERE id_peticion = %d;
                       """.formatted(Integer.parseInt(id));
    }
    
}
