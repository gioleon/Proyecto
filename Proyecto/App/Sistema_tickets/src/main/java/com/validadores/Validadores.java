package com.validadores;

import java.util.*;
import java.util.Arrays;
import java.util.regex.*;
import com.model.Admin;

public class Validadores {

    public static void main(String[] args) {
        Admin admin = new Admin();
        
        admin.agregarEstudiante("1002192504", "giovanni", "leon posada", "Giovannileon2001#", "ingenieria", "ingenieria de sistemas");
//        String correo = "giovanni".split("")[0]+ "leon posada".split(" ")[0] + "leon posada".split(" ")[1].split("")[0]+"@tecnocomfenalco.edu.co";
//        System.out.println(correo);
//        System.out.println(nombreApellidos("Hello wordl"));
//        System.out.println(validadorIdentificacion("102141423"));
//        System.out.println(validadorCorreo(correo));
//        System.out.println(validadorContraseña("Giovannile20#"));
        //System.out.println(validadorPrograma("ingenieria de sistemas"));
        
    }
    
    public  boolean nombreApellidos(String cadena) {
        Pattern stringPattern = Pattern.compile("[0-9#!\"#$%&()=]+");
        Matcher stringMatcher = stringPattern.matcher(cadena);

        return !stringMatcher.find();
    }
    
    public   boolean validadorIdentificacion(String identificacion){
        Pattern stringPattern = Pattern.compile("[a-zA-Z!#$%&/()=Á-Ýá-ý@*¿?]+{10}");
        Matcher stringMatcher = stringPattern.matcher(identificacion);
        
        return !stringMatcher.find();
    }
    
    public static boolean validadorCorreo(String correo){
        Pattern stringPattern = Pattern.compile("[a-z]*@tecnocomfenalco\\.edu\\.co");
        Matcher stringMatcher = stringPattern.matcher(correo);
        
        return stringMatcher.matches();       
    }
    
    public  boolean validadorContraseña(String contraseña){
        Pattern stringPattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%#*?&])[A-Za-z\\d$@$!#%*?&]{8,30}");
        Matcher stringMatcher = stringPattern.matcher(contraseña);
        
        return stringMatcher.matches();
    }
    
    public  boolean validadorSemestre(int semestre){
        return semestre > 0 && semestre <= 10;
    }
    
    public  boolean validadorFacultad(String facultad){
        ArrayList<String> facultades = new ArrayList<String>();
        facultades.add("ciencias economicas, administrativas y contables");
        facultades.add("ciencias sociales y humanas");
        facultades.add("ingenieria");
        
        return facultades.contains(facultad);  
    }
    
    public  boolean validadorPrograma(String programa){
        List<String> programas = Arrays.asList("tecnologia en gestion de marketing",
       "administracion en seguridad y salud en el trabajo",
       "ingenieria civil', 'tecnologia en produccion industrial",
       "tecnologia en seguridad e higiene ocupacional",
       "tecnologia en control de calidad",
       "tecnologia en gestion ambiental industrial",
       "tecnologia en operacion de plantas y procesos industriales",
       "tecnologia en instrumentacion industrial",
       "tecnologia en control electronico de procesos",
       "tecnologia en desarrollo de software",
       "tecnologia en redes de comunicaciones y servicios convergentes",
       "ingenieria industrial", "derecho", "psicologia", "trabajo social",
       "tecnologia en gestion turistica y hotelera",
       "tecnologia en gestion logistica",
       "tecnologia en gestion de negocios internacionales",
       "tecnologia en gestion financiera",
       "tecnologia en contabilidad sistematizada", "contaduria publica",
       "ingenieria de procesos", "ingenieria de sistemas",
       "administracion de empresas", "ingenieria electronica",
       "ingenieria ambiental", "especializacion en finanzas",
       "especializacion en gestion tributaria",
       "especializacion en gerencia de proyectos",
       "especializacion en gerencia estrategica de marketing",
       "especializacion en gestion estrategica del talento humano",
       "especializacion en logistica y distribucion fisica internacional",
       "especializacion psicologia social aplicada",
       "especializacion en gestion integral en hseq",
       "maestria en sistemas de gestion",
       "maestria en tecnologias de la informacion y la comunicacion");
        
        return programas.contains(programa);
    }
}
