package Clases;

public class Cliente extends Persona {
    private int idCliente;
    private String numTelefono;
    private String correoElectronico;
    private Cliente aptSiguiente;

    public Cliente(int idCliente, String numTelefono, String correoElectronico, String nombres, String apellidos, String domicilio) {
        super(nombres, apellidos, domicilio);
        this.idCliente = idCliente;
        this.numTelefono = numTelefono;
        this.correoElectronico = correoElectronico;
        this.aptSiguiente = null;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }        

    public Cliente getAptSiguiente() {
        return aptSiguiente;
    }

    public void setAptSiguiente(Cliente aptSiguiente) {
        this.aptSiguiente = aptSiguiente;
    }    
}