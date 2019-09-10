package bangun_datar;
public class Persegi_Panjang extends javax.swing.JFrame {
    double panjang, lebar, luas,keliling;
    public Persegi_Panjang() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LJudul = new javax.swing.JLabel();
        LPanjang = new javax.swing.JLabel();
        TfPanjang = new javax.swing.JTextField();
        Hitung1 = new javax.swing.JButton();
        TfKeliling = new javax.swing.JTextField();
        LKeliling = new javax.swing.JLabel();
        LLuas = new javax.swing.JLabel();
        TfLuas = new javax.swing.JTextField();
        LLebar = new javax.swing.JLabel();
        TfLebar = new javax.swing.JTextField();
        hapus = new javax.swing.JButton();
        keluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LJudul.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LJudul.setText("PERSEGI PANJANG");

        LPanjang.setText(" PANJANG    :");
        LPanjang.setToolTipText("");
        LPanjang.setFocusable(false);
        LPanjang.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        TfPanjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfPanjangActionPerformed(evt);
            }
        });

        Hitung1.setText("HITUNG");
        Hitung1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hitung1ActionPerformed(evt);
            }
        });

        TfKeliling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfKelilingActionPerformed(evt);
            }
        });

        LKeliling.setText(" KELILING      :");

        LLuas.setText(" LUAS            :");

        LLebar.setText("LEBAR          :");
        LLebar.setToolTipText("");
        LLebar.setFocusable(false);
        LLebar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        TfLebar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfLebarActionPerformed(evt);
            }
        });

        hapus.setText("HAPUS");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        keluar.setText("KELUAR");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(LJudul)
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(hapus)
                        .addGap(42, 42, 42)
                        .addComponent(keluar)
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LLebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LPanjang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TfLebar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TfPanjang, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LLuas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LKeliling, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Hitung1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(TfKeliling)
                            .addComponent(TfLuas))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LJudul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LPanjang, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TfPanjang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LLebar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TfLebar))
                .addGap(28, 28, 28)
                .addComponent(Hitung1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LKeliling, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TfKeliling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LLuas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TfLuas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapus)
                    .addComponent(keluar))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TfPanjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfPanjangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfPanjangActionPerformed

    private void Hitung1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hitung1ActionPerformed
        // TODO add your handling code here:
        panjang = Double.parseDouble(TfPanjang.getText());
        lebar = Double.parseDouble(TfLebar.getText());
        luas = panjang*lebar;
        TfLuas.setText(String.valueOf(luas));
        keliling = 2*(panjang + lebar);
        TfKeliling.setText(String.valueOf(keliling));
    }//GEN-LAST:event_Hitung1ActionPerformed

    private void TfKelilingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfKelilingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfKelilingActionPerformed

    private void TfLebarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfLebarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfLebarActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        TfPanjang.setText(String.valueOf(" "));
        TfLebar.setText(String.valueOf(" "));
        TfKeliling.setText(String.valueOf(" "));
        TfLuas.setText(String.valueOf(" "));
    }//GEN-LAST:event_hapusActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
       BangunDatar formBangunDatar=new BangunDatar();
        formBangunDatar.show();
        this.hide();
    }//GEN-LAST:event_keluarActionPerformed

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
            java.util.logging.Logger.getLogger(Persegi_Panjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Persegi_Panjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Persegi_Panjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Persegi_Panjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Persegi_Panjang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hitung1;
    private javax.swing.JLabel LJudul;
    private javax.swing.JLabel LKeliling;
    private javax.swing.JLabel LLebar;
    private javax.swing.JLabel LLuas;
    private javax.swing.JLabel LPanjang;
    private javax.swing.JTextField TfKeliling;
    private javax.swing.JTextField TfLebar;
    private javax.swing.JTextField TfLuas;
    private javax.swing.JTextField TfPanjang;
    private javax.swing.JButton hapus;
    private javax.swing.JButton keluar;
    // End of variables declaration//GEN-END:variables
}
