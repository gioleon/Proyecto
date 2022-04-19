package usuarios.estudiante;

import usuarios.persona.Persona;

public class Estudiante extends Persona{
   private final long ID_ESTUDIANTE = 0;
   private int semestre;
   private String facultad;
   private String programa;
   private String correo_institucional;
   private String contraseña;

   public Estudiante(){
       
   }
    public Estudiante(int semestre, String facultad, String programa, String correo_institucional, String contraseña, String identificacion, String nombre, String apellidos, int edad) {
        super(identificacion, nombre, apellidos, edad);
        this.semestre = semestre;
        this.facultad = facultad;
        this.programa = programa;
        this.correo_institucional = correo_institucional;
        this.contraseña = contraseña;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getCorreo_institucional() {
        return correo_institucional;
    }

    public void setCorreo_institucional(String correo_institucional) {
        this.correo_institucional = correo_institucional;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
   
   
}
