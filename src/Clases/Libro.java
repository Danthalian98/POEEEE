package Clases;

public class Libro {
    private int cantidad;
    private String titulo;
    private String genero;
    private String editorial;
    private double precio;
    private Libro aptSiguiente;

    public Libro(int cantidad, String titulo, String genero, String editorial, double precio) {
        this.cantidad = cantidad;
        this.titulo = titulo;
        this.genero = genero;
        this.editorial = editorial;
        this.precio = precio;
        this.aptSiguiente = null;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public Libro getAptSiguiente() {
        return aptSiguiente;
    }

    public void setAptSiguiente(Libro aptsiguiente) {
        this.aptSiguiente = aptsiguiente;
    }
    
    public void buscarPorTitulo()
    {
        
    }
    public void registraLibro()
    {
        
    }
}