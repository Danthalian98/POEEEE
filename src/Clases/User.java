package Clases;

public class User extends Persona{
    private String nomUser;
    private String password;
    private String sueldo;
    private String puesto;
    private boolean regAsistencia;
    private User aptSiguiente;

    public User(String nomUser, String password, String sueldo, String puesto, boolean regAsistencia, String nombres, String apellidos, String domicilio) {
        super(nombres, apellidos, domicilio);
        this.nomUser = nomUser;
        this.password = password;
        this.sueldo = sueldo;
        this.puesto = puesto;
        this.regAsistencia = regAsistencia;
        this.aptSiguiente = null;
    }

    public String getNomUser() {
        return nomUser;
    }

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public boolean isRegAsistencia() {
        return regAsistencia;
    }

    public void setRegAsistencia(boolean regAsistencia) {
        this.regAsistencia = regAsistencia;
    }

    public User getAptSiguiente() {
        return aptSiguiente;
    }

    public void setAptSiguiente(User aptSiguiente) {
        this.aptSiguiente = aptSiguiente;
    }
}