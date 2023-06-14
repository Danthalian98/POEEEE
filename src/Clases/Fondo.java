package Clases;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fondo extends JPanel{
    private Image imagen;
    private ImageIcon imagenICono;
    
    public Fondo(String ruta)
    {
        imagenICono = new ImageIcon(ruta);
    }
    
    public void paint(Graphics g)
    {
        imagen = imagenICono.getImage();
        g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }
    
}
