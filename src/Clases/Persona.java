package Clases;

public class Persona {
    private String nombres;
    private String apellidos;
    private String domicilio;

    public Persona(String nombres, String apellidos, String domicilio) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }            
}