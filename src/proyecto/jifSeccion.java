package proyecto;

import Clases.Pila;
import frames.frmMenu;
import javax.swing.JOptionPane;

public class jifSeccion extends javax.swing.JInternalFrame {

    frmMenu regresar;
    Pila seccion;
    public jifSeccion(frmMenu me, Pila sec) {
        initComponents();
        regresar = me;
        seccion = sec;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jlblNombre = new javax.swing.JLabel();
        jtfLetra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfCantDis = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jbtnAgregarS = new javax.swing.JButton();
        jcbGen = new javax.swing.JComboBox<>();
        jlblMensaje = new javax.swing.JLabel();

        jDesktopPane1.setBackground(new java.awt.Color(204, 255, 153));

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jlblNombre.setText("Letra del stand:");

        jtfLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLetraActionPerformed(evt);
            }
        });

        jLabel2.setText("Cantidad de espacio disponible:");

        jtfCantDis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCantDisActionPerformed(evt);
            }
        });

        jLabel5.setText("Genero:");

        jbtnAgregarS.setText("Agregar stand");
        jbtnAgregarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarSActionPerformed(evt);
            }
        });

        jcbGen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir:", "Terror", "Suspenso", "Fantasia", "Novelas", "Manga" }));

        jlblMensaje.setText("|");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jbtnAgregarS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jlblNombre)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbGen, 0, 1, Short.MAX_VALUE)
                            .addComponent(jtfCantDis, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(jtfLetra))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblNombre)
                    .addComponent(jtfLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtfCantDis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcbGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jlblMensaje)
                .addGap(18, 18, 18)
                .addComponent(jbtnAgregarS)
                .addGap(17, 17, 17))
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLetraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfLetraActionPerformed

    private void jtfCantDisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCantDisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCantDisActionPerformed

    private void jbtnAgregarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarSActionPerformed
        String resp1;
        resp1 = JOptionPane.showInternalInputDialog(null, "Ingrese la letra de la seccion");
        char letra2 = resp1.charAt(0);
        char letra = jtfLetra.getText().charAt(0);
        int espacio = Integer.parseInt(jtfCantDis.getText());
        if (jtfLetra.getText().equals("")) {
            jlblMensaje.setText("No registro letra");
        } else if (jtfCantDis.getText().equals("")) {
            jlblMensaje.setText("No registro cantidad de la capacidad");
        } else if (jcbGen.getSelectedItem().toString().equals("Elegir:")) {
            jlblMensaje.setText("No se selecciono un genero");
        }else {
           // seccion.pushSeccion(letra2, letra, espacio, jcbGen.getSelectedItem().toString());
        }
    }//GEN-LAST:event_jbtnAgregarSActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnAgregarS;
    private javax.swing.JComboBox<String> jcbGen;
    private javax.swing.JLabel jlblMensaje;
    private javax.swing.JLabel jlblNombre;
    private javax.swing.JTextField jtfCantDis;
    private javax.swing.JTextField jtfLetra;
    // End of variables declaration//GEN-END:variables
}
