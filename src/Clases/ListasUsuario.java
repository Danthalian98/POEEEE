package Clases;

import frames.frmInicio;
import frames.frmMenu;
import javax.swing.JOptionPane;

public class ListasUsuario {
    public User lista, listaAux;
    
    public ListasUsuario()
    {
        lista = null;
        listaAux = null;
    }
    
    public void agregarUsu(String user, String pass, String sld, String psto, boolean regAstncia, String noms, String apells, String dom)
    {
        if (!buscarUsuario(user))
        {
            User nuevo = new User(user, pass, sld, psto, regAstncia, noms, apells, dom);
            if(lista == null){
                lista = nuevo;
            }else
            {
                User aux = lista;
                while(aux.getAptSiguiente() != null)
                {
                    aux = aux.getAptSiguiente();
                }
                aux.setAptSiguiente(nuevo);
            }            
        }else
        {
            JOptionPane.showMessageDialog(null, "Usuario ya existe intente con otro");
        }
    }
   
    //verificar que el usuario no se repita
    public boolean buscarUsuario(String nomUs)
    {
        String nombreDeUsuario = "";
        User aux = lista;
        if(lista == null)
        {
            //JOptionPane.showMessageDialog(null,"La lista esta vacia");
        }else
        {
            while(aux != null)
            {                                   
                if(aux.getNomUser().equals(nomUs))
                {
                    nombreDeUsuario = aux.getNomUser();
                    break;
                }
                aux = aux.getAptSiguiente();
            }
            if (nombreDeUsuario.equals(nomUs))
            {
                return true;
            }  
        }
        return false;
    }   
    
    //funcion que valida los datos recibidos en el frmInicio
    public void validarUsu(String nomUs, String pass, frmInicio inicio, ListasUsuario us)
    {
        String nombreDeUsuario = "", contrasena = "";
        User aux = lista;
        if(lista == null)
        {
            JOptionPane.showMessageDialog(null,"No hay usuarios registrados");
        }else
        {
            while(aux != null)
            {                                   
                if(aux.getNomUser().equals(nomUs))
                {
                    nombreDeUsuario = aux.getNomUser();
                    contrasena = aux.getPassword();
                    break;
                }
                aux = aux.getAptSiguiente();
            } 
            if (!nombreDeUsuario.equals(nomUs))
            {
                 JOptionPane.showMessageDialog(null, "Usuario no coincide con los registros");
            }else if(!contrasena.equals(pass))
            {
                 JOptionPane.showMessageDialog(null, "Contraseña no coincide con los registros");
            }else
            {
                 frmMenu in = new frmMenu(nomUs, us);
                 in.setVisible(true);
                 inicio.setVisible(false);   
            }          
        }      
    }

}/////eliminar si se descomenta la part de abajo
   




/*
     //funcion que valida los datos recibidos en el frmInicio o de algun otro frm
    
    public void agregarUsuAux(String user, String pass, String sld, String psto, boolean regAstncia, String noms, String apells, String dom)
    {
        User nuevo = new User(user, pass, sld, psto, regAstncia, noms, apells, dom);
        if(listaAux == null){
            listaAux = nuevo;
        }else
        {
            User aux = listaAux;
            while(aux.getAptSiguiente() != null)
            {
                aux = aux.getAptSiguiente();
            }
            aux.setAptSiguiente(nuevo);
        }
    }
    
    public void modificarUsuario(String nomUser, String password, String sueldo, String puesto, boolean regAsistencia, String nombres, String apellidos, String domicilio)
    {
        if (!buscarUsuario(nomUser))
        {
            User aux = lista;
            while(aux != null)
            {
                if (aux.getNomUser().equals(nomUser))
                {
                    break;
                }
                agregarUsuAux(aux.getNomUser(), aux.getPassword(),aux.getSueldo(),aux.getPuesto(),aux.isRegAsistencia(),aux.getNombres(),aux.getApellidos(),aux.getDomicilio());
                aux.getAptSiguiente();
            }
            lista = aux.getAptSiguiente();
            agregarUsu(nomUser, password, sueldo, puesto, regAsistencia, nombres, apellidos, domicilio);
            reEnlistarUsu();
        }else
        {
            JOptionPane.showMessageDialog(null, "Nombre de usuario esta en uso, intente con otro");
        }
    }
    
    public void reEnlistarUsu()
    {
        User aux = listaAux;
        while(aux != null)
        {          
            agregarUsu(aux.getNomUser(), aux.getPassword(), aux.getSueldo(), aux.getPuesto(), aux.isRegAsistencia(),aux.getNombres(),aux.getApellidos(), aux.getDomicilio());
            aux = aux.getAptSiguiente();
        } 
    }
}*/