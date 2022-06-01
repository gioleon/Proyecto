package com.login;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import com.conexion.Connections;


public class Login {
    
    public String login(String correo, String contraseña) {
        
        String mensaje = null;
        
        Connections conexion = new Connections();
        
        // tablas donde buscará los usuarios
        List<String> tablas = Arrays.asList("estudiante", "personal");

        
        
        // variable donde se almancenara la contraseña encriptada
        String encriptado = null;
        
        try {
            
            // conectar a la base de datos
            Statement instruccion = conexion.conexion();
            
            // variables a extraer de la base de datos
            String correo_match = null;
            String contraseña_match = null;
            
            // empezando encriptacion
            String encriptar = "select SHA1(%s) encriptado".formatted("\"" + contraseña + "\"");
            ResultSet resultado_encrip = instruccion.executeQuery(encriptar);
            while (resultado_encrip.next()){
                encriptado = resultado_encrip.getString("encriptado");
            }
            
            
            // comenzando validacion de datos
            for (String tabla : tablas) {
                String query = "select correo_institucional, contraseña from %s WHERE correo_institucional = %s".formatted(tabla, "\"" + correo+"\"");
                ResultSet resultado = instruccion.executeQuery(query);
                if (!tabla.isEmpty()) {
                    while (resultado.next()) {
                        correo_match = resultado.getString("correo_institucional");
                        contraseña_match = resultado.getString("contraseña");   
                        if (correo_match.equals(correo) && contraseña_match.equals(encriptado)) {
                            mensaje = "usuario encontrado %s".formatted(tabla);
                            break;
                        } else {
                            mensaje = "las credenciales no coinciden";
                        }
                    }
                }
            }
            
            
            if (correo_match == null){
                mensaje = "usuario no encontrado";
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return mensaje;
    }
}
