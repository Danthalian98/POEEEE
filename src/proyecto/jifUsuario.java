package proyecto;

import Clases.ListasUsuario;
import frames.frmMenu;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class jifUsuario extends javax.swing.JInternalFrame {

    frmMenu menu;
    ListasUsuario lista1;    
    public jifUsuario(frmMenu me, ListasUsuario us) {
        initComponents();
        menu = me;
        lista1 = us;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtfNomUsu = new javax.swing.JTextField();
        jtfPass1 = new javax.swing.JTextField();
        jtfSueldo = new javax.swing.JTextField();
        jtfPuesto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfNombres = new javax.swing.JTextField();
        jtfApellidos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfDomicilio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfPass2 = new javax.swing.JTextField();
        jbtnActualizar = new javax.swing.JButton();
        jbtnRegistrar = new javax.swing.JButton();
        jlblMensaje = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfNomUsu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNomUsuKeyTyped(evt);
            }
        });
        jPanel1.add(jtfNomUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 118, 170, -1));

        jtfPass1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfPass1KeyTyped(evt);
            }
        });
        jPanel1.add(jtfPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 146, 170, -1));

        jtfSueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfSueldoKeyTyped(evt);
            }
        });
        jPanel1.add(jtfSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 205, 100, -1));

        jtfPuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfPuestoKeyTyped(evt);
            }
        });
        jPanel1.add(jtfPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 233, 170, -1));

        jLabel1.setText("Nombre de usuario a establecer:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 121, -1, -1));

        jLabel2.setText("Sueldo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 208, -1, -1));

        jLabel3.setText("Contraseña asignada:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 149, -1, -1));

        jLabel4.setText("Puesto:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 236, -1, -1));

        jLabel6.setText("Nombres:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 37, -1, -1));

        jLabel7.setText("Apellidos:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 65, -1, -1));

        jtfNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombresKeyTyped(evt);
            }
        });
        jPanel1.add(jtfNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 34, 250, -1));

        jtfApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfApellidosKeyTyped(evt);
            }
        });
        jPanel1.add(jtfApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 62, 250, -1));

        jLabel8.setText("Domicilio:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 93, -1, -1));

        jtfDomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfDomicilioKeyTyped(evt);
            }
        });
        jPanel1.add(jtfDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 90, 300, -1));

        jLabel9.setText("Confirmar contraseña:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 177, -1, -1));

        jtfPass2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfPass2KeyTyped(evt);
            }
        });
        jPanel1.add(jtfPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 174, 170, -1));

        jbtnActualizar.setText("Actualizar");
        jbtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        jbtnRegistrar.setText("Registrar");
        jbtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, -1));

        jlblMensaje.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblMensaje.setText("|");
        jPanel1.add(jlblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 520, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNomUsuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNomUsuKeyTyped
        int tam = 10;
        char caracter = evt.getKeyChar();
        if(caracter == KeyEvent.VK_ENTER)
        {
            jbtnRegistrar.requestFocus();
        }
        if(jtfNomUsu.getText().length() >= tam && caracter != KeyEvent.VK_ENTER)
        {
            getToolkit().beep();
            evt.consume();
            jlblMensaje.setText("Maximo " + tam + " digitos");
        }
    }//GEN-LAST:event_jtfNomUsuKeyTyped

    private void jtfPass1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPass1KeyTyped
        int tam = 10;
        char caracter = evt.getKeyChar();
        if(caracter == KeyEvent.VK_ENTER)
        {
            jbtnRegistrar.requestFocus();
        }
        if(jtfPass1.getText().length() >= tam && caracter != KeyEvent.VK_ENTER)
        {
            getToolkit().beep();
            evt.consume();
            jlblMensaje.setText("Maximo " + tam + " digitos");
        }
    }//GEN-LAST:event_jtfPass1KeyTyped

    private void jtfSueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfSueldoKeyTyped
        int tam = 4;
        char caracter = evt.getKeyChar();
        if(caracter == KeyEvent.VK_ENTER)
        {
            jbtnRegistrar.requestFocus();
        }else if(!Character.isDigit(caracter))
        {
            getToolkit().beep();
            evt.consume();
            jlblMensaje.setText("Solo capturar en numeros enteros");
        }
        if(jtfSueldo.getText().length() >= tam && caracter != KeyEvent.VK_ENTER)
        {
            getToolkit().beep();
            evt.consume();
            jlblMensaje.setText("Maximo " + tam + " digitos");
        }
    }//GEN-LAST:event_jtfSueldoKeyTyped

    private void jtfPuestoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPuestoKeyTyped
        int tam = 15;
        char caracter = evt.getKeyChar();
        if(caracter == KeyEvent.VK_ENTER)
        {
            jbtnRegistrar.requestFocus();
        }else if(Character.isDigit(caracter))
        {
            getToolkit().beep();
            evt.consume();
            jlblMensaje.setText("Solo capturar letras");
        }
        if(jtfPass2.getText().length() >= tam && caracter != KeyEvent.VK_ENTER)
        {
            getToolkit().beep();
            evt.consume();
            jlblMensaje.setText("Maximo " + tam + " digitos");
        }
    }//GEN-LAST:event_jtfPuestoKeyTyped

    private void jtfNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombresKeyTyped
        int tam = 25;
        char caracter = evt.getKeyChar();
        if(caracter == KeyEvent.VK_ENTER)
        {
            jbtnRegistrar.requestFocus();
        }else if(Character.isDigit(caracter))
        {
            getToolkit().beep();
            evt.consume();
            jlblMensaje.setText("Solo capturar letras");
        }
        if(jtfNombres.getText().length() >= tam && caracter != KeyEvent.VK_ENTER)
        {
            getToolkit().beep();
            evt.consume();
            jlblMensaje.setText("Maximo " + tam + " digitos");
        }
    }//GEN-LAST:event_jtfNombresKeyTyped

    private void jtfApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfApellidosKeyTyped
        int tam = 25;
        char caracter = evt.getKeyChar();
        if(caracter == KeyEvent.VK_ENTER)
        {
            jbtnRegistrar.requestFocus();
        }else if(Character.isDigit(caracter))
        {
            getToolkit().beep();
            evt.consume();
            jlblMensaje.setText("Solo capturar letras");
        }
        if(jtfApellidos.getText().length() >= tam && caracter != KeyEvent.VK_ENTER)
        {
            getToolkit().beep();
            evt.consume();
            jlblMensaje.setText("Maximo " + tam + " digitos");
        }
    }//GEN-LAST:event_jtfApellidosKeyTyped

    private void jtfDomicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDomicilioKeyTyped
        int tam = 35;
        char caracter = evt.getKeyChar();
        if(caracter == KeyEvent.VK_ENTER)
        {
            jbtnRegistrar.requestFocus();
        }else if(Character.isDigit(caracter))
        {
            getToolkit().beep();
            evt.consume();
            jlblMensaje.setText("Solo capturar letras");
        }
        if(jtfDomicilio.getText().length() >= tam && caracter != KeyEvent.VK_ENTER)
        {
            getToolkit().beep();
            evt.consume();
            jlblMensaje.setText("Maximo " + tam + " digitos");
        }
    }//GEN-LAST:event_jtfDomicilioKeyTyped

    private void jtfPass2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPass2KeyTyped
        int tam = 10;
        char caracter = evt.getKeyChar();
        if(caracter == KeyEvent.VK_ENTER)
        {
            jbtnRegistrar.requestFocus();
        }
        if(jtfPass2.getText().length() >= tam && caracter != KeyEvent.VK_ENTER)
        {
            getToolkit().beep();
            evt.consume();
            jlblMensaje.setText("Maximo " + tam + " digitos");
        }
    }//GEN-LAST:event_jtfPass2KeyTyped

    private void jbtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActualizarActionPerformed
        if (jtfNombres.getText().equals("")) {
            jlblMensaje.setText("No se registraron nombres");
        } else if (jtfApellidos.getText().equals("")) {
            jlblMensaje.setText("No se registraron apellidos");
        } else if (jtfDomicilio.getText().equals("")) {
            jlblMensaje.setText("No se registró un domicilio");
        } else if (jtfNomUsu.getText().equals("")) {
            jlblMensaje.setText("No se registró un nombre de usuario");
        } else if (jtfPass1.getText().equals("")) {
            jlblMensaje.setText("No se registró una contraseña");
        } else if (jtfPass2.getText().equals("")) {
            jlblMensaje.setText("No se confirmó la contraseña");
        } else if (!jtfPass1.getText().equals(jtfPass2.getText())) {
            jlblMensaje.setText("Las contraseñas no coinciden");
        } else if (jtfSueldo.getText().equals("")) {
            jlblMensaje.setText("No se registró un sueldo");
        } else if (jtfPuesto.getText().equals("")) {
            jlblMensaje.setText("No se registró un puesto");
        } else {
            //lista1.modificarUsuario(jtfNomUsu.getText(), jtfPass1.getText(), jtfSueldo.getText(), jtfPuesto.getText(), false, jtfNombres.getText(), jtfApellidos.getText(), jtfDomicilio.getText());           
        }
    }//GEN-LAST:event_jbtnActualizarActionPerformed

    private void jbtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarActionPerformed
        if (jtfNombres.getText().equals("")) {
            jlblMensaje.setText("No se registraron nombres");
        } else if (jtfApellidos.getText().equals("")) {
            jlblMensaje.setText("No se registraron apellidos");
        } else if (jtfDomicilio.getText().equals("")) {
            jlblMensaje.setText("No se registró un domicilio");
        } else if (jtfNomUsu.getText().equals("")) {
            jlblMensaje.setText("No se registró un nombre de usuario");
        } else if (jtfPass1.getText().equals("")) {
            jlblMensaje.setText("No se registró una contraseña");
        } else if (jtfPass2.getText().equals("")) {
            jlblMensaje.setText("No se confirmó la contraseña");
        } else if (!jtfPass1.getText().equals(jtfPass2.getText())) {
            jlblMensaje.setText("Las contraseñas no coinciden");
        } else if (jtfSueldo.getText().equals("")) {
            jlblMensaje.setText("No se registró un sueldo");
        } else if (jtfPuesto.getText().equals("")) {
            jlblMensaje.setText("No se registró un puesto");
        } else {
            lista1.agregarUsu(jtfNomUsu.getText(), jtfPass1.getText(), jtfSueldo.getText(), jtfPuesto.getText(), false, jtfNombres.getText(), jtfApellidos.getText(), jtfDomicilio.getText());
        }
    }//GEN-LAST:event_jbtnRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbtnActualizar;
    private javax.swing.JButton jbtnRegistrar;
    private javax.swing.JLabel jlblMensaje;
    private javax.swing.JTextField jtfApellidos;
    private javax.swing.JTextField jtfDomicilio;
    private javax.swing.JTextField jtfNomUsu;
    private javax.swing.JTextField jtfNombres;
    private javax.swing.JTextField jtfPass1;
    private javax.swing.JTextField jtfPass2;
    private javax.swing.JTextField jtfPuesto;
    private javax.swing.JTextField jtfSueldo;
    // End of variables declaration//GEN-END:variables
}
