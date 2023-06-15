package Clases;

import frames.frmCompra;
import frames.frmRenta;
import javax.swing.JOptionPane;

public class Pila {
    public Cliente pilaCl;
    public Compra pilaC;    
    public Libro pilaL;
    public Renta pilaR, pilaRA;
    public Seccion pilaS;
    private int cantNodos;
    
    //hacer una pila tipo cliente-renta
    //hacer otra pila tipo renta que sirva para apilar datos de la pila renta de los datos principales
    
    public Pila()
    {
        //Inicializar el apuntador principal
        pilaCl = null;
        pilaC = null;
        pilaL = null;
        pilaR = null;
        pilaRA = null;
        pilaS = null;
        cantNodos = 0;
    }    

    public int getCantNodos() {
        return cantNodos;
    }

    public void setCantNodos(int cantNodos) {
        this.cantNodos = cantNodos;
    }
        
    //Operaciones para agregar al inicio de la pilaCl un nodo
    public void pushCliente(int id, String numTel, String correo, String nom, String ape, String dom)
    {
        //Crear el nodo con el valor
        Cliente nuevo = new Cliente(id, numTel, correo, nom, ape, dom);
        if (pilaCl == null)
        {
            pilaCl = nuevo;   
        }else 
        {
            Cliente aux = pilaCl;
            pilaCl = nuevo;
            nuevo.setAptSiguiente(aux);
        }
        cantNodos ++;
    }
    //validar la existencia del cliente
    public boolean validarEC(int a)
    {      
        Cliente aux = pilaCl;
        /*esta sentencia en el while debe quedar de esta forma a comparacion de las que suelo trabajar debido al que el recorrido es desde el ultimo al primero*/
        while(aux != null)
        {                
            if (aux.getIdCliente() == a)
            {
                return true;                  
            }                                
        }
        return false;
    }  

    //validar compra o renta
    public void validarCR(int boton, int idCliente)
    {
        Cliente aux = pilaCl;
        if(pilaCl == null)
        {
            System.out.println("La pila esta vacia");
        }else
        {
            /*esta sentencia en el while debe quedar de esta forma a comparacion de las que suelo trabajar debido al que el recorrido es desde el ultimo al primero*/
            while(aux != null)
            {
                if (validarEC(idCliente) == true)
                {
                    switch (boton)
                    {
                        case 0:
                            frmCompra cmp = new frmCompra();
                            cmp.setVisible(true);   
                            break;
                        case 1:
                            frmRenta rnt = new frmRenta();
                            rnt.setVisible(true);  
                            break;
                    }
                }else
                {
                    JOptionPane.showInternalMessageDialog(null, "No existe el cliente");
                }
            }
        }        
    }

    public void pushCompra(int id, int cant, double tot, double des, String fech, String fol)
    {
        //Crear el nodo con el valor
        Compra nuevo = new Compra(id,cant, tot, des, fech, fol);
        if (pilaC == null)
        {
            pilaC = nuevo;   
        }else 
        {
            Compra aux = pilaC;
            pilaC = nuevo;
            nuevo.setAptSiguiente(aux);
        }
    }

    public void pushRenta(int id, int cant, double totRet, double tot, String fechRen, String fechEnt, String fechCap, int totR)
    {
        //Crear el nodo con el valor
        Renta nuevo = new Renta(id, cant, totRet, tot, fechRen, fechEnt, fechCap, totR);
        if (pilaR == null)
        {
            pilaR = nuevo;
        }else
        {
            Renta aux = pilaR;
            pilaR = nuevo;
            nuevo.setAptSiguiente(aux);
        }
    }
    
    public void pushLibro(int cant, String tit, String gen, String ed, double pr)
    {      
        //Crear el nodo con el valor
        Libro nuevo = new Libro(cant, tit, gen, ed, pr);
        if (pilaL == null)
        {
            pilaL = nuevo;   
        }else 
        {
            Libro aux = pilaL;
            pilaL = nuevo;
            nuevo.setAptSiguiente(aux);            
        } 
    }
    
    public void pushSeccion(char le, int esp, String gen)
    {
        Seccion nuevo = new Seccion(le, esp,gen);
        
        if(pilaS == null){
            pilaS = nuevo;
        }
        else{
            Seccion aux = pilaS;
            pilaS = nuevo;
            nuevo.setAptSiguiente(aux);
        }
    }
    
    public void reapilarSeccion()
    {
        Seccion aux = pilaS;
        while(aux != null)
        {          
            pushSeccion(aux.getLetra(), aux.getEspacio(), aux.getGenero());
            aux = aux.getAptSiguiente();
        }        
    }     
    
    public void modificarPilaRenta(int idC, int cantLib, double retar, double total, String fechRent, String fechEntr, String fechCapt, int totRetar)
    {  
        Renta aux = pilaR;
        /*esta sentencia en el while debe quedar de esta forma a comparacion de las que suelo trabajar debido al que el recorrido es desde el ultimo al primero*/
        while(aux.getIdCliente() != idC)
        {
            pushAuxRenta(aux.getIdCliente(), aux.getCantLibRent(), aux.getTotalDePagoPorRetardo(), aux.getTotalDeRenta(), aux.getFechaRenta(),aux.getFechaEntrega(),aux.getFechaCapturada(), aux.getTotalRetardos());
            aux = aux.getAptSiguiente();
        }
        pilaR = aux.getAptSiguiente();
        pushRenta(idC, cantLib, retar, total, fechRent, fechEntr, fechCapt, totRetar);
        reapilarRenta();        
    }
    
    public void pushAuxSeccion (char le, int cantE, String gen)
    {
        Seccion nuevo = new Seccion(le, cantE, gen);
        if (pilaS == null)
        {
            pilaS = nuevo;  
        }else 
        {
            Seccion aux = pilaS;
            pilaS = nuevo;
            nuevo.setAptSiguiente(aux);
        }        
    }
    
    public void reapilarRenta()
    {
        Renta aux = pilaRA;
        while(aux != null)
        {          
            pushRenta(aux.getIdCliente(), aux.getCantLibRent(), aux.getTotalDePagoPorRetardo(), aux.getTotalDeRenta(), aux.getFechaRenta(),aux.getFechaEntrega(),aux.getFechaCapturada(), aux.getTotalRetardos());
            aux = aux.getAptSiguiente();
        }        
    }     
    
    public void modificarPilaSeccion(char le, int cantE, String gen)
    {  
        Seccion aux = pilaS;
        /*esta sentencia en el while debe quedar de esta forma a comparacion de las que suelo trabajar debido al que el recorrido es desde el ultimo al primero*/
        while(aux.getLetra() != le)
        {
            pushAuxSeccion(aux.getLetra(), aux.getEspacio(), aux.getGenero());
            aux = aux.getAptSiguiente();
        }
        pilaS = aux.getAptSiguiente();
        pushAuxSeccion(le, cantE, gen);
        reapilarSeccion();        
    }    
    
    public void pushAuxRenta (int id, int cantLib, double retar, double tot, String fechRent, String fechEnt, String fechCapt, int totRetar)
    {
        Renta nuevo = new Renta(id, cantLib, retar, tot, fechRent, fechEnt, fechCapt, totRetar);
        if (pilaRA == null)
        {
            pilaRA = nuevo;   
        }else 
        {
            Renta aux = pilaRA;
            pilaRA = nuevo;
            nuevo.setAptSiguiente(aux);
        }        
    }         

    public void buscarLibro(String lib, Libro lbr)
    {
        String datos = "Vacio :(";
        Libro aux = lbr;
        /*esta sentencia en el while debe quedar de esta forma a comparacion de las que suelo trabajar debido al que el recorrido es desde el ultimo al primero*/
        while(aux != null)
        {           
            if(aux.getTitulo().equals(lib))
            {
                datos += "Titulo: " + aux.getTitulo() + "\n";
                datos += "Editorial: " + aux.getEditorial() + "\n";
                datos += "Genero: " + aux.getGenero()+ "\n";
                datos += "Existencias: " + aux.getCantidad()+ "\n";
                datos += "Precio: " + aux.getPrecio();
            }else
            {
                datos = "No existe el libro en el almacen";
            }
            aux = aux.getAptSiguiente();
        }
        JOptionPane.showMessageDialog(null, datos);   
    }
    
    public void agruparLibrosGen(String gen, int cantD, Libro lib)
    {
        Libro aux = lib;
        /*esta sentencia en el while debe quedar de esta forma a comparacion de las que suelo trabajar debido al que el recorrido es desde el ultimo al primero*/
        while(aux.getGenero().equals(gen))
        {
            
            aux = aux.getAptSiguiente();
        }
         
    }
}