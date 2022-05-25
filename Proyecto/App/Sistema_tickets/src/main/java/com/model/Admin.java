package com.model;
import com.conexion.Connections;
import com.validadores.Validadores;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Admin {
    public void agregarEstudiante(String identificacion, String nombre, String apellido, String contraseña, String facultad, String programa){
        
        Connections con = new Connections();
        
        String correo = nombre.split("")[0]+ apellido.split(" ")[0] + apellido.split(" ")[1].split("")[0]+"@tecnocomfenalco.edu.co";
        
        boolean agregar = true;
        
        Validadores val = new Validadores();
        
        if(val.validadorIdentificacion(identificacion) == false){
            agregar = false;
        } 
        
        if(val.nombreApellidos(nombre) == false){
            agregar = false;
        } 
        
        if(val.nombreApellidos(apellido) == false){
            agregar= false;
        } 
        
        if(val.validadorContraseña(contraseña) == false){
            agregar = false;
        } 
        
        if (val.validadorFacultad(facultad) == false){
            agregar = false;
        }
//        
        if (val.validadorPrograma(programa) == false){
            agregar = false;
        }
//        
        if (val.validadorCorreo(correo.toLowerCase()) == false){
            agregar = false;
        }
        
        
        if (agregar == true){
            String query = "CALL insertEstudiante(\"%s\", \"%s\", \"%s\", \"%s\", \"%s\", \"%s\", \"%s\");".formatted(
                    identificacion, nombre.toLowerCase(), apellido.toLowerCase(), correo.toLowerCase(), contraseña, facultad.toLowerCase(), programa.toLowerCase());
            Statement instruccion = con.conexion();
            try {
                ResultSet resultado = instruccion.executeQuery(query);
                System.out.println("User added");
            } catch (SQLException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
                
        } else {
            System.out.println(agregar);
            System.out.println("Something went wrong");
        }
        
        
    }
    
    public void agregarPersonal(){
        
    }
    
    public void eliminarUsuario(){
        
    }
}
