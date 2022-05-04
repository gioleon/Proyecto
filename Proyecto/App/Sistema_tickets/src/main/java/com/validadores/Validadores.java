package com.validadores;

import java.util.regex.*;

public class Validadores {

    public static void main(String[] args) {
        System.out.println(nombreApellidos("Hell0 wordl"));
        //System.out.println(validadorIdentificacion("102141423"));
        //System.out.println(validadorCorreo("gleonp@tecnocomfenalco.edu.co"));
        //System.out.println(validadorContraseña("giovannile20#"));
    }
    
    public static boolean nombreApellidos(String cadena) {
        Pattern stringPattern = Pattern.compile("[0-9#!\"#$%&()=]+");
        Matcher stringMatcher = stringPattern.matcher(cadena);

        return !stringMatcher.find();
    }
    
    public static boolean validadorIdentificacion(String identificacion){
        Pattern stringPattern = Pattern.compile("[a-zA-Z!#$%&/()=Á-Ýá-ý@*¿?]+{10}");
        Matcher stringMatcher = stringPattern.matcher(identificacion);
        
        return !stringMatcher.find();
    }
    
    public static boolean validadorCorreo(String correo){
        Pattern stringPattern = Pattern.compile("[a-z]*@tecnocomfenalco\\.edu\\.co");
        Matcher stringMatcher = stringPattern.matcher(correo);
        
        return stringMatcher.matches();       
    }
    
    public static boolean validadorContraseña(String contraseña){
        Pattern stringPattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%#*?&])[A-Za-z\\d$@$!#%*?&]{8,15}");
        Matcher stringMatcher = stringPattern.matcher(contraseña);
        
        return stringMatcher.matches();
    }
}
