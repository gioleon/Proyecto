package com.conexion;

import java.sql.Connection;
import java.sql.*;

public class Connections {

    public Statement conexion() {
        String string_url = "jdbc:mysql://localhost:3306/sistematickets?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        Statement instruccion = null;

        try {
           // Class.forName("com.mysql.cj.jdbc.Driver"); puede ser necesario para aplicaciones web
            Connection conexion = DriverManager.getConnection(string_url, "root", "giovannileon2001");
            instruccion = conexion.createStatement();
            
            
            
           
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return instruccion;
    }
}
