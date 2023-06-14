package Clases;

import frames.frmInicio;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Proyecto {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        Date fechaActual = new Date();
        System.out.println(sdf.format(fechaActual));
        frmInicio in = new frmInicio();
        in.setVisible(true);
    }
}