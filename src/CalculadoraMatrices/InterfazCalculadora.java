/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CalculadoraMatrices;

public class InterfazCalculadora extends javax.swing.JFrame {

    Logica log = new Logica();
    public InterfazCalculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Piso = new javax.swing.JPanel();
        BackGround = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        panelSuma = new javax.swing.JPanel();
        suma = new javax.swing.JLabel();
        panelResta = new javax.swing.JPanel();
        resta = new javax.swing.JLabel();
        panelTraza = new javax.swing.JPanel();
        traza = new javax.swing.JLabel();
        panelDet = new javax.swing.JPanel();
        determinantes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de Matrices n*n Santiago Naranjo Herrera");
        setResizable(false);

        Piso.setBackground(new java.awt.Color(0, 102, 0));

        BackGround.setBackground(new java.awt.Color(204, 255, 204));

        Titulo.setBackground(new java.awt.Color(0, 0, 0));
        Titulo.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Bienvenido a La Calculadora de Matrices n*n");

        panelSuma.setBackground(new java.awt.Color(255, 204, 51));
        panelSuma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelSumaMouseClicked(evt);
            }
        });

        suma.setBackground(new java.awt.Color(0, 0, 0));
        suma.setFont(new java.awt.Font("JetBrains Mono", 0, 11)); // NOI18N
        suma.setForeground(new java.awt.Color(0, 0, 0));
        suma.setText("Suma ");
        suma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sumaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelSumaLayout = new javax.swing.GroupLayout(panelSuma);
        panelSuma.setLayout(panelSumaLayout);
        panelSumaLayout.setHorizontalGroup(
            panelSumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSumaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(suma)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSumaLayout.setVerticalGroup(
            panelSumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSumaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(suma)
                .addContainerGap())
        );

        panelResta.setBackground(new java.awt.Color(255, 204, 51));
        panelResta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRestaMouseClicked(evt);
            }
        });

        resta.setBackground(new java.awt.Color(0, 0, 0));
        resta.setFont(new java.awt.Font("JetBrains Mono", 0, 11)); // NOI18N
        resta.setForeground(new java.awt.Color(0, 0, 0));
        resta.setText("Resta");
        resta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRestaLayout = new javax.swing.GroupLayout(panelResta);
        panelResta.setLayout(panelRestaLayout);
        panelRestaLayout.setHorizontalGroup(
            panelRestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRestaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(resta)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        panelRestaLayout.setVerticalGroup(
            panelRestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRestaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTraza.setBackground(new java.awt.Color(255, 204, 51));
        panelTraza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelTrazaMouseClicked(evt);
            }
        });

        traza.setBackground(new java.awt.Color(0, 0, 0));
        traza.setFont(new java.awt.Font("JetBrains Mono", 0, 11)); // NOI18N
        traza.setForeground(new java.awt.Color(0, 0, 0));
        traza.setText("Traza");
        traza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trazaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelTrazaLayout = new javax.swing.GroupLayout(panelTraza);
        panelTraza.setLayout(panelTrazaLayout);
        panelTrazaLayout.setHorizontalGroup(
            panelTrazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTrazaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(traza)
                .addContainerGap())
        );
        panelTrazaLayout.setVerticalGroup(
            panelTrazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrazaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(traza)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDet.setBackground(new java.awt.Color(255, 204, 51));
        panelDet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelDetMouseClicked(evt);
            }
        });

        determinantes.setBackground(new java.awt.Color(0, 0, 0));
        determinantes.setFont(new java.awt.Font("JetBrains Mono", 0, 11)); // NOI18N
        determinantes.setForeground(new java.awt.Color(0, 0, 0));
        determinantes.setText("Determinante");
        determinantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                determinantesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelDetLayout = new javax.swing.GroupLayout(panelDet);
        panelDet.setLayout(panelDetLayout);
        panelDetLayout.setHorizontalGroup(
            panelDetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(determinantes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDetLayout.setVerticalGroup(
            panelDetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(determinantes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BackGroundLayout = new javax.swing.GroupLayout(BackGround);
        BackGround.setLayout(BackGroundLayout);
        BackGroundLayout.setHorizontalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(panelSuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(panelResta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(panelTraza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(panelDet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackGroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Titulo)
                .addGap(81, 81, 81))
        );
        BackGroundLayout.setVerticalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGap(32, 32, 32)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelResta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTraza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PisoLayout = new javax.swing.GroupLayout(Piso);
        Piso.setLayout(PisoLayout);
        PisoLayout.setHorizontalGroup(
            PisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PisoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PisoLayout.setVerticalGroup(
            PisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PisoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Piso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Piso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sumaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sumaMouseClicked
        log.SumaMatrices();
    }//GEN-LAST:event_sumaMouseClicked

    private void panelSumaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSumaMouseClicked
      log.SumaMatrices();
    }//GEN-LAST:event_panelSumaMouseClicked

    private void restaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restaMouseClicked
   log.restaMatrices();
   
    }//GEN-LAST:event_restaMouseClicked

    private void panelRestaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRestaMouseClicked
     log.restaMatrices();
    }//GEN-LAST:event_panelRestaMouseClicked

    private void trazaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trazaMouseClicked
      log.trazaMatriz();
    }//GEN-LAST:event_trazaMouseClicked

    private void panelTrazaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTrazaMouseClicked
      log.trazaMatriz();
    }//GEN-LAST:event_panelTrazaMouseClicked

    private void determinantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_determinantesMouseClicked
     log.determinante();
    }//GEN-LAST:event_determinantesMouseClicked

    private void panelDetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDetMouseClicked
      log.determinante();
    }//GEN-LAST:event_panelDetMouseClicked

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
            java.util.logging.Logger.getLogger(InterfazCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JPanel Piso;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel determinantes;
    private javax.swing.JPanel panelDet;
    private javax.swing.JPanel panelResta;
    private javax.swing.JPanel panelSuma;
    private javax.swing.JPanel panelTraza;
    private javax.swing.JLabel resta;
    private javax.swing.JLabel suma;
    private javax.swing.JLabel traza;
    // End of variables declaration//GEN-END:variables
}
