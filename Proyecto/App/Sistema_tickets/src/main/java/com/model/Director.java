package com.model;

import com.conexion.Connections;
import com.model.Persona;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Director extends Persona {

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

    public ArrayList<ArrayList> verTickets(int id_estudiante) {
        
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

        String query = "SELECT id_peticion, asunto, informacion, estado FROM peticiones where id_estudiante = %d".formatted(id_estudiante);

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
    

    public ArrayList<Peticiones> verInfoTicket(String id) {

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

        String query = "SELECT * FROM peticiones where id_peticion = %d".formatted(Integer.parseInt(id));

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
            Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listObj;
    }

    public void solucionarTickets(String id) {
        Connections con = new Connections();

        String query = """
                       UPDATE peticiones
                       SET estado = "enviado" AND
                       fecha_final = (select current_date())
                       WHERE id_peticion = %d;
                       """.formatted(Integer.parseInt(id));
    }

    public ArrayList<ArrayList> listaAsignarTickets() {
        Connections con = new Connections();

        ArrayList<String> peticiones = new ArrayList<String>();
        ArrayList<String> asuntos = new ArrayList<String>();
        ArrayList<String> id_personal = new ArrayList<String>();
        ArrayList<String> nombre_personal = new ArrayList<String>();

        Statement instruccion = con.conexion();

        String query1 = "SELECT id_peticion, asunto from peticiones where nombre_programa = \"%s\" AND estado = \"sin asignar\";".formatted(this.programa);
        String query2 = "SELECT id_personal, nombre, apellido from personal where nombre_programa = \"%s\"".formatted(this.programa);

        try {
            ResultSet result = instruccion.executeQuery(query1);
            ResultSet result2 = instruccion.executeQuery(query2);
            while (result.next()) {
                String id_peticion = Integer.toString(result.getInt("id_peticion"));
                String asunto = result.getString("asunto");

                peticiones.add(id_peticion);
                asuntos.add(asunto);

            }

            while (result2.next()) {

                String nombre = result2.getString("nombre") + " " + result2.getString("apellido").split(" ")[0];
                String id_persona = Integer.toString(result2.getInt("id_personal"));

                nombre_personal.add(nombre);
                id_personal.add(id_persona);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ArrayList<ArrayList> listObject = new ArrayList<ArrayList>();

        listObject.add(peticiones);
        listObject.add(asuntos);
        listObject.add(nombre_personal);
        listObject.add(id_personal);

        return listObject;
    }

    public void asignarTickets(String id_peticion, String id_personal) {

        Connections con = new Connections();

        Statement instruccion = con.conexion();

        int id_persona = Integer.parseInt(id_personal);

        int id_peticiones = Integer.parseInt(id_peticion);

        String query = """
                       UPDATE peticiones
                      SET id_personal = %d AND
                       estado = "en progreso" AND
                       fecha_inicio = (SELECT CURRENT_DATE())
                       WHERE id_peticion = %d;
                       """.formatted(id_persona, id_peticiones);

        try {
            instruccion.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
