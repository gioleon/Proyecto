package com.modelo;

import java.sql.Connection;
import java.sql.*;

public class Connections {

    public static void main(String[] args) {
        String string_url = "jdbc:mysql://localhost:3306/sistematickets?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";

        try {
           // Class.forName("com.mysql.cj.jdbc.Driver"); puede ser necesario para aplicaciones web
            Connection conexion = DriverManager.getConnection(string_url, "root", "giovannileon2001");
            Statement instruccion = conexion.createStatement();
            var query = "SELECT Correo_institucional FROM estudiante WHERE Correo_institucional like %s".formatted("\"giovannileon2017\"");
            ResultSet resultado = instruccion.executeQuery(query);
            if (resultado.next()){
                     String id = resultado.getString("Correo_institucional");
                System.out.println(id);
            } else {
                System.out.println("No hay");
            }
            while(resultado.next()){
           
                //System.out.println("id: " + resultado.getInt("rol_id")+ "\nNombre: " + resultado.getString("nombre"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

    }
}
