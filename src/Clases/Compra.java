package Clases;

public class Compra {
    private int idCliente;
    private int cantLibCom;
    private double total;
    private double descuento;
    private String fecha;
    private String folio;
    private Compra aptSiguiente;

    public Compra(int idCliente, int cantLibCom, double total, double descuento, String fecha, String folio) {
        this.idCliente = idCliente;
        this.cantLibCom = cantLibCom;
        this.total = total;
        this.descuento = descuento;
        this.fecha = fecha;
        this.folio = folio;
        this.aptSiguiente = null;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getCantLibCom() {
        return cantLibCom;
    }

    public void setCantLibCom(int cantLibCom) {
        this.cantLibCom = cantLibCom;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    } 

    public Compra getAptSiguiente() {
        return aptSiguiente;
    }

    public void setAptSiguiente(Compra aptSiguiente) {
        this.aptSiguiente = aptSiguiente;
    }  
}