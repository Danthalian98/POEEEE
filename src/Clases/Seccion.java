package Clases;
public class Seccion {
    private char letra;
    private int espacio;
    private String genero;
    private int totalLibros;
    private boolean disponibilidad;
    private Seccion aptSiguiente;

    public Seccion(char letra, int espacio, String genero) {
        this.letra = letra;
        this.espacio = espacio;
        this.genero = genero;
        this.aptSiguiente = null;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String descripcion) {
        this.genero = descripcion;
    }

    public int getTotalLibros() {
        return totalLibros;
    }

    public void setTotalLibros(int totalLibros) {
        this.totalLibros = totalLibros;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Seccion getAptSiguiente() {
        return aptSiguiente;
    }

    public void setAptSiguiente(Seccion aptSiguiente) {
        this.aptSiguiente = aptSiguiente;
    }    
        
}