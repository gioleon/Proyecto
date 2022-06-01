package com.main;

import com.login.Login;
import com.conexion.Connections;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;



public class App {
    public static void main(String[] args){
                // rol id
        
        int rol_id = -1;
        // conexion a la base de datos
        Connections con = new Connections();
        
        // log
        Login log2 = new Login();
        
        String correo = "giova20";
        String contraseña = "adaeda";
        
        String mensaje_retorno = log2.login("giova20", "leon");
        
        String tabla = mensaje_retorno.split(" ")[-1];
        
        if (mensaje_retorno.equals("Usuario encontrado %s".formatted(tabla))){
            // Saltara una ventana que arrojará el mensaje "Usuario encontrado"
            Statement instruccion = con.conexion();
            String query = "SELECT rol_id from %s WHERE Correo_institucional like %s".formatted(tabla, correo);
            try {
                ResultSet result = instruccion.executeQuery(query);
                while (result.next()){
                    rol_id = result.getInt("rol_id");
                }
                
                switch (rol_id) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    default:
                        break;
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (mensaje_retorno.equals("Las credenciales no coinciden")){
            // Saltara una ventana que arrojará el mensaje "La credenciales no coinciden"
            
        } else {
            // Saltara una ventaja que arrojará el mensaje "Usuario no encontrado"
        }
        
        
    }
    
}
