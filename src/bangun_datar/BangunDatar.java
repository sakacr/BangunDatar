
package bangun_datar;

public class BangunDatar extends javax.swing.JFrame {

    public BangunDatar() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        RPersegi = new javax.swing.JRadioButton();
        RPersegiPanjang = new javax.swing.JRadioButton();
        RBelahketupat = new javax.swing.JRadioButton();
        RTrapesium = new javax.swing.JRadioButton();
        RJajargenjang = new javax.swing.JRadioButton();
        RLingkaran = new javax.swing.JRadioButton();
        Keluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setText("PILIH SALAH SATU BANGUN DATAR");

        RPersegi.setText("Persegi");
        RPersegi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RPersegiActionPerformed(evt);
            }
        });

        RPersegiPanjang.setText("Persegi Panjang");
        RPersegiPanjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RPersegiPanjangActionPerformed(evt);
            }
        });

        RBelahketupat.setText("Belahketupat");
        RBelahketupat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBelahketupatActionPerformed(evt);
            }
        });

        RTrapesium.setText("Trapesium");
        RTrapesium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RTrapesiumActionPerformed(evt);
            }
        });

        RJajargenjang.setText("Jajargenjang");
        RJajargenjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RJajargenjangActionPerformed(evt);
            }
        });

        RLingkaran.setText("Lingkaran");
        RLingkaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RLingkaranActionPerformed(evt);
            }
        });

        Keluar.setText("EXIT");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RPersegiPanjang)
                                    .addComponent(RBelahketupat)
                                    .addComponent(RPersegi, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RLingkaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RJajargenjang, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(RTrapesium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(Keluar)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RPersegi)
                    .addComponent(RTrapesium))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RPersegiPanjang)
                    .addComponent(RJajargenjang))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBelahketupat)
                    .addComponent(RLingkaran))
                .addGap(18, 18, 18)
                .addComponent(Keluar)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RPersegiPanjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RPersegiPanjangActionPerformed
        Persegi_Panjang formPersegi_Panjang= new Persegi_Panjang();
        formPersegi_Panjang.show();
        this.hide();
    }//GEN-LAST:event_RPersegiPanjangActionPerformed

    private void RBelahketupatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBelahketupatActionPerformed
        Belahketupat formBelahketupat=new Belahketupat();
        formBelahketupat.show();
        this.hide();
    }//GEN-LAST:event_RBelahketupatActionPerformed

    private void RPersegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RPersegiActionPerformed
        Persegi formPersegi=new Persegi();
        formPersegi.show();
        this.hide();
    }//GEN-LAST:event_RPersegiActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_KeluarActionPerformed

    private void RTrapesiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RTrapesiumActionPerformed
        Trapesium formTrapesium=new Trapesium();
        formTrapesium.show();
        this.hide();
    }//GEN-LAST:event_RTrapesiumActionPerformed

    private void RLingkaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RLingkaranActionPerformed
        Lingkaran formLingkaran=new Lingkaran();
        formLingkaran.show();
        this.hide();
    }//GEN-LAST:event_RLingkaranActionPerformed

    private void RJajargenjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RJajargenjangActionPerformed
        Jajargenjang formJajargenjang=new Jajargenjang();
        formJajargenjang.show();
        this.hide();
    }//GEN-LAST:event_RJajargenjangActionPerformed

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
            java.util.logging.Logger.getLogger(BangunDatar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BangunDatar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BangunDatar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BangunDatar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BangunDatar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Keluar;
    private javax.swing.JRadioButton RBelahketupat;
    private javax.swing.JRadioButton RJajargenjang;
    private javax.swing.JRadioButton RLingkaran;
    private javax.swing.JRadioButton RPersegi;
    private javax.swing.JRadioButton RPersegiPanjang;
    private javax.swing.JRadioButton RTrapesium;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
