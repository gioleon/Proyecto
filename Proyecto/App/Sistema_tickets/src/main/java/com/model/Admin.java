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
    
    public void agregarAsistente(String identificacion, String nombre, String apellido, String contraseña, String facultad, String programa){
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
            String query = "CALL insertAsistente(\"%s\", \"%s\", \"%s\", \"%s\", \"%s\", \"%s\", \"%s\");".formatted(
                    identificacion, nombre.toLowerCase(), apellido.toLowerCase(), correo.toLowerCase(), contraseña, facultad.toLowerCase(), programa.toLowerCase());
            Statement instruccion = con.conexion();
            try {
                ResultSet resultado = instruccion.executeQuery(query);
                System.out.println("User added");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
                
        } else {
            System.out.println(agregar);
            System.out.println("Something went wrong");
        }
    }
    
    public void agregarDirector(String identificacion, String nombre, String apellido, String contraseña, String facultad, String programa){
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
            String query = "CALL insertDirector(\"%s\", \"%s\", \"%s\", \"%s\", \"%s\", \"%s\", \"%s\");".formatted(
                    identificacion, nombre.toLowerCase(), apellido.toLowerCase(), correo.toLowerCase(), contraseña, facultad.toLowerCase(), programa.toLowerCase());
            Statement instruccion = con.conexion();
            try {
                ResultSet resultado = instruccion.executeQuery(query);
                System.out.println("User added");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
                
        } else {
            System.out.println(agregar);
            System.out.println("Something went wrong");
        }
    }
    
    public void eliminarUsuario(String identificacion, String tabla){
        
        Connections con = new Connections();
        
        
        
        String query = "SELECT identificacion from %s WHERE identificacion = %s;".formatted(tabla, identificacion);
        
        Statement instruccion = con.conexion();
        String id = null;
        
        try {
            ResultSet result = instruccion.executeQuery(query);
            
            while(result.next()){
                id = result.getString("identificacion");
            }
            
            if (id == null){
                System.out.println("User not found");
            } else {
                query = "delete from %s WHERE identificacion = %s;".formatted(tabla, identificacion);
                instruccion.executeUpdate(query);
                System.out.println("User deleted");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
}
