package frames;

import Clases.Libro;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Clases.ListasUsuario;
import Clases.Pila;
import proyecto.jifCliente;
import proyecto.jifCompra;
import proyecto.jifLibro;
import proyecto.jifMosUsu;
import proyecto.jifRenta;
import proyecto.jifSeccion;

public class frmMenu extends javax.swing.JFrame {
    Pila datoC = new Pila();
    Pila datoR = new Pila();
    Pila datoL = new Pila();
    Pila datoCl = new Pila(); 
    Pila datoS = new Pila(); 
    ListasUsuario usuarios;
    
    //Fondo fondo;
        
    public frmMenu(String usuario, ListasUsuario usu) {
        //fondo = new Fondo("src/ImgProyecto/pG.png");
        //this.setContentPane(fondo);        
        initComponents();
        usuarios = usu;
        ImageIcon img = new ImageIcon("src/ImgProyecto/cursor_hand_line.png");
        ImageIcon img2 = new ImageIcon("src/ImgProyecto/cursor_hand_open.png");
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Cursor c = tk.createCustomCursor(img.getImage(), new Point(1,1), null);
        Cursor c2 = tk.createCustomCursor(img2.getImage(), new Point(1,1), null);        
        jlblBienvenido.setText(usuario);
        jmnClientes.setCursor(c);
        jmnEmpleado.setCursor(c);
        jmnLibro.setCursor(c);
        jmiRAClientes.setCursor(c);
        jmiMosRegClientes.setCursor(c);
        jmiMosRegEmpleado.setCursor(c);
        jmiRegLibro.setCursor(c);
        jmiBuscar.setCursor(c);    
    }
    
    public Image getIconImage()
    {
        Image valorRetorno = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("ImgProyecto/engine.png"));
        return valorRetorno;
    }       

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpEscritorio = new javax.swing.JDesktopPane();
        jlblBienvenido = new javax.swing.JLabel();
        jmbBarraMenu = new javax.swing.JMenuBar();
        jmnEmpleado = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmiMosRegEmpleado = new javax.swing.JMenuItem();
        jmnClientes = new javax.swing.JMenu();
        jmiRAClientes = new javax.swing.JMenuItem();
        jmiCompra = new javax.swing.JMenuItem();
        jmiRenta = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiMosRegClientes = new javax.swing.JMenuItem();
        jmnLibro = new javax.swing.JMenu();
        jmnSecciones = new javax.swing.JMenu();
        jmiEstantantes = new javax.swing.JRadioButtonMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jmiBuscar = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jmiRegLibro = new javax.swing.JMenuItem();
        jmnNosotros = new javax.swing.JMenu();
        jrmMostrarL3 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jrmLibro3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jdpEscritorio.setBackground(new java.awt.Color(255, 255, 153));

        jlblBienvenido.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlblBienvenido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgProyecto/pM.png"))); // NOI18N
        jlblBienvenido.setText("Bienvenido: ");

        jdpEscritorio.setLayer(jlblBienvenido, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpEscritorioLayout = new javax.swing.GroupLayout(jdpEscritorio);
        jdpEscritorio.setLayout(jdpEscritorioLayout);
        jdpEscritorioLayout.setHorizontalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpEscritorioLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jlblBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(296, Short.MAX_VALUE))
        );
        jdpEscritorioLayout.setVerticalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpEscritorioLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlblBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );

        jmnEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgProyecto/usuario.png"))); // NOI18N
        jmnEmpleado.setText("Empleado");
        jmnEmpleado.add(jSeparator2);

        jmiMosRegEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgProyecto/mostrar.png"))); // NOI18N
        jmiMosRegEmpleado.setText(" Mostrar Registros");
        jmiMosRegEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMosRegEmpleadoActionPerformed(evt);
            }
        });
        jmnEmpleado.add(jmiMosRegEmpleado);

        jmbBarraMenu.add(jmnEmpleado);

        jmnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgProyecto/cliente.png"))); // NOI18N
        jmnClientes.setText("Clientes");
        jmnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmnClientesMouseClicked(evt);
            }
        });
        jmnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnClientesActionPerformed(evt);
            }
        });

        jmiRAClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgProyecto/lapiz.png"))); // NOI18N
        jmiRAClientes.setText("Registrar/Actualizar");
        jmiRAClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRAClientesActionPerformed(evt);
            }
        });
        jmnClientes.add(jmiRAClientes);

        jmiCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgProyecto/compra.png"))); // NOI18N
        jmiCompra.setText("Compra");
        jmiCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCompraActionPerformed(evt);
            }
        });
        jmnClientes.add(jmiCompra);

        jmiRenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgProyecto/renta.png"))); // NOI18N
        jmiRenta.setText("Renta");
        jmiRenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRentaActionPerformed(evt);
            }
        });
        jmnClientes.add(jmiRenta);
        jmnClientes.add(jSeparator1);

        jmiMosRegClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgProyecto/mostrar.png"))); // NOI18N
        jmiMosRegClientes.setText("Mostrar Registros");
        jmiMosRegClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMosRegClientesActionPerformed(evt);
            }
        });
        jmnClientes.add(jmiMosRegClientes);

        jmbBarraMenu.add(jmnClientes);

        jmnLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgProyecto/libros.png"))); // NOI18N
        jmnLibro.setText("Libros");

        jmnSecciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgProyecto/letras.png"))); // NOI18N
        jmnSecciones.setText("Secciones");

        jmiEstantantes.setSelected(true);
        jmiEstantantes.setText("Agregar Estante");
        jmiEstantantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgProyecto/stand.png"))); // NOI18N
        jmiEstantantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEstantantesActionPerformed(evt);
            }
        });
        jmnSecciones.add(jmiEstantantes);
        jmnSecciones.add(jSeparator4);

        jmnLibro.add(jmnSecciones);

        jmiBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgProyecto/buscar.png"))); // NOI18N
        jmiBuscar.setText("Buscar");
        jmiBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBuscarActionPerformed(evt);
            }
        });
        jmnLibro.add(jmiBuscar);
        jmnLibro.add(jSeparator3);

        jmiRegLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgProyecto/lapiz.png"))); // NOI18N
        jmiRegLibro.setText("Registrar");
        jmiRegLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegLibroActionPerformed(evt);
            }
        });
        jmnLibro.add(jmiRegLibro);

        jmbBarraMenu.add(jmnLibro);

        jmnNosotros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgProyecto/feliz.png"))); // NOI18N
        jmnNosotros.setText("Nosotros");

        jrmMostrarL3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgProyecto/acerca.png"))); // NOI18N
        jrmMostrarL3.setText("Acerca de...");
        jrmMostrarL3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrmMostrarL3ActionPerformed(evt);
            }
        });
        jmnNosotros.add(jrmMostrarL3);
        jmnNosotros.add(jSeparator6);

        jrmLibro3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgProyecto/telefono.png"))); // NOI18N
        jrmLibro3.setText("Contactenos");
        jmnNosotros.add(jrmLibro3);

        jmbBarraMenu.add(jmnNosotros);

        setJMenuBar(jmbBarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrmMostrarL3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrmMostrarL3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrmMostrarL3ActionPerformed

    private void jmiEstantantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEstantantesActionPerformed
        Libro aux = datoL.pilaL;
        jifSeccion estan = new jifSeccion(this,datoS,aux);
        jdpEscritorio.add(estan);
        estan.show(); 
    }//GEN-LAST:event_jmiEstantantesActionPerformed

    private void jmnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnClientesActionPerformed

    }//GEN-LAST:event_jmnClientesActionPerformed

    private void jmnClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmnClientesMouseClicked

    }//GEN-LAST:event_jmnClientesMouseClicked

    private void jmiMosRegClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMosRegClientesActionPerformed
        jifMosUsu tablaCl = new jifMosUsu(usuarios);
        jdpEscritorio.add(tablaCl);
        tablaCl.show(); 
    }//GEN-LAST:event_jmiMosRegClientesActionPerformed

    private void jmiMosRegEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMosRegEmpleadoActionPerformed
        jifMosUsu tabla = new jifMosUsu(usuarios);
        jdpEscritorio.add(tabla);
        tabla.show(); 
    }//GEN-LAST:event_jmiMosRegEmpleadoActionPerformed

    private void jmiRAClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRAClientesActionPerformed
        jifCliente clientes = new jifCliente(this,datoCl);
        jdpEscritorio.add(clientes);
        clientes.show(); 
    }//GEN-LAST:event_jmiRAClientesActionPerformed

    private void jmiRegLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegLibroActionPerformed
        jifLibro libro = new jifLibro(this,datoL);
        jdpEscritorio.add(libro);
        libro.show(); 
    }//GEN-LAST:event_jmiRegLibroActionPerformed

    private void jmiCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCompraActionPerformed
        jifCompra com = new jifCompra(this,datoC);
        jdpEscritorio.add(com);
        com.show();        
    }//GEN-LAST:event_jmiCompraActionPerformed

    private void jmiBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBuscarActionPerformed
        Libro aux = datoL.pilaL;
        String libro;
        libro = JOptionPane.showInputDialog(null, "Ingrese el nombre del libro");
        datoS.buscarLibro(libro,aux);
    }//GEN-LAST:event_jmiBuscarActionPerformed

    private void jmiRentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRentaActionPerformed
        jifRenta ren = new jifRenta(this,datoR);
        jdpEscritorio.add(ren);
        ren.show();   
    }//GEN-LAST:event_jmiRentaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    public static javax.swing.JDesktopPane jdpEscritorio;
    public javax.swing.JLabel jlblBienvenido;
    private javax.swing.JMenuBar jmbBarraMenu;
    private javax.swing.JMenuItem jmiBuscar;
    private javax.swing.JMenuItem jmiCompra;
    private javax.swing.JRadioButtonMenuItem jmiEstantantes;
    private javax.swing.JMenuItem jmiMosRegClientes;
    private javax.swing.JMenuItem jmiMosRegEmpleado;
    private javax.swing.JMenuItem jmiRAClientes;
    private javax.swing.JMenuItem jmiRegLibro;
    private javax.swing.JMenuItem jmiRenta;
    private javax.swing.JMenu jmnClientes;
    private javax.swing.JMenu jmnEmpleado;
    private javax.swing.JMenu jmnLibro;
    private javax.swing.JMenu jmnNosotros;
    private javax.swing.JMenu jmnSecciones;
    private javax.swing.JMenuItem jrmLibro3;
    private javax.swing.JMenuItem jrmMostrarL3;
    // End of variables declaration//GEN-END:variables
}