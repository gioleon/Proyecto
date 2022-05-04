package com.login;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;


public class Login {

    public static void main(String[] args) {
        login("giovannileon2017", "contraseñas");
    }
    
    public static void login(String correo, String contraseña) {
        
        // tablas donde buscará los usuarios
        List<String> tablas = Arrays.asList("estudiante", "asistente");

        
        
        // variable donde se almancenara la contraseña encriptada
        String encriptado = null;
        
        // Conexion
        String url = "jdbc:mysql://localhost:3306/sistematickets?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            
            // conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, "root", "giovannileon2001");
            Statement instruccion = conexion.createStatement();
            
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
                String query = "select Correo_institucional, Contraseña from %s WHERE Correo_institucional = %s".formatted(tabla, "\"" + correo+"\"");
                ResultSet resultado = instruccion.executeQuery(query);
                if (!tabla.isEmpty()) {
                    while (resultado.next()) {
                        correo_match = resultado.getString("Correo_institucional");
                        contraseña_match = resultado.getString("Contraseña");   
                        if (correo_match.equals(correo) && contraseña_match.equals(encriptado)) {
                            System.out.println("Usuario encontrado");
                            break;
                        } else {
                            System.out.println("La credenciales no coinciden");
                        }
                    }
                }
            }
            
            
            if (correo_match == null){
                System.out.println("Usuario no encontrado");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
