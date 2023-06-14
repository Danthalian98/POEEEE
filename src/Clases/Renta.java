package Clases;

public class Renta {
    private int idCliente;
    private int cantLibRent;
    private double totalDePagoPorRetardo;
    private double totalDeRenta;
    private String fechaRenta;
    private String fechaEntrega;
    private String fechaCapturada;
    private int totalRetardos;
    private Renta aptSiguiente;

    public Renta(int idCliente, int cantLibRent, double totalDePagoPorRetardo, double totalDeRenta, String fechaRenta, String fechaEntrega, String fechaCapturada, int totalRetardos) {
        this.idCliente = idCliente;
        this.cantLibRent = cantLibRent;
        this.totalDePagoPorRetardo = totalDePagoPorRetardo;
        this.totalDeRenta = totalDeRenta;
        this.fechaRenta = fechaRenta;
        this.fechaEntrega = fechaEntrega;
        this.fechaCapturada = fechaCapturada;
        this.totalRetardos = totalRetardos;
        this.aptSiguiente = null;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getCantLibRent() {
        return cantLibRent;
    }

    public void setCantLibRent(int cantLibRent) {
        this.cantLibRent = cantLibRent;
    }

    public double getTotalDePagoPorRetardo() {
        return totalDePagoPorRetardo;
    }

    public void setTotalDePagoPorRetardo(double totalDePagoPorRetardo) {
        this.totalDePagoPorRetardo = totalDePagoPorRetardo;
    }

    public double getTotalDeRenta() {
        return totalDeRenta;
    }

    public void setTotalDeRenta(double totalDeRenta) {
        this.totalDeRenta = totalDeRenta;
    }

    public String getFechaRenta() {
        return fechaRenta;
    }

    public void setFechaRenta(String fechaRenta) {
        this.fechaRenta = fechaRenta;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getFechaCapturada() {
        return fechaCapturada;
    }

    public void setFechaCapturada(String fechaCapturada) {
        this.fechaCapturada = fechaCapturada;
    }

    public int getTotalRetardos() {
        return totalRetardos;
    }

    public void setTotalRetardos(int totalRetardos) {
        this.totalRetardos = totalRetardos;
    }

    public Renta getAptSiguiente() {
        return aptSiguiente;
    }

    public void setAptSiguiente(Renta aptSiguiente) {
        this.aptSiguiente = aptSiguiente;
    }
            
    public void capturarFecha(String fecha)
    {
        String[] valores = fecha.split("/");
        int[] numero = new int[3];
        int i = 0;
        // Imprimir los valores numéricos
        for (String valor : valores) {
            numero[i] = Integer.parseInt(valor);
            i ++;
        }
        //numero[0]
        //numero[1]
        //numero[2]
    }
}