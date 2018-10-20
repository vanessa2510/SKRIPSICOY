/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecasimulatorjframe;

import javax.swing.JOptionPane;

/**
 *
 * @author Vanessa
 */
public class TampilanKondisiEksternal extends javax.swing.JFrame {

    /**
     * Creates new form TampilanKondisiEksternal
     */
    double[] kumpulanNilaiPF = {2.53, 3.92, 3.29, 3.45}; // Nilai dari GEM 2013
    double[] bobotPF;
    PublicFactor pf;

    public TampilanKondisiEksternal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nilaiPP = new javax.swing.JTextField();
        nilaiDP = new javax.swing.JTextField();
        nilaiNSB = new javax.swing.JTextField();
        nilaiIFA = new javax.swing.JTextField();
        nextButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("SIMULATOR ECA");

        jLabel2.setText("Parameter Setting Kondisi Eksternal :");

        jLabel3.setText("Faktor Publik");

        jLabel4.setText("Program Pemerintah :");

        jLabel5.setText("Dinamika Pasar :");

        jLabel6.setText("Norma, Sosial dan Budaya :");

        jLabel7.setText("Infrastruktur Fisik dan Akses Layanan :");

        nilaiPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilaiPPActionPerformed(evt);
            }
        });

        nilaiDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilaiDPActionPerformed(evt);
            }
        });

        nilaiNSB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilaiNSBActionPerformed(evt);
            }
        });

        nilaiIFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilaiIFAActionPerformed(evt);
            }
        });

        nextButton.setText("NEXT");
        nextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextButtonMouseClicked(evt);
            }
        });
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("%");

        jLabel9.setText("%");

        jLabel10.setText("%");

        jLabel11.setText("%");

        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(backButton))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nilaiDP, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                    .addComponent(nilaiPP)
                                    .addComponent(nilaiNSB)
                                    .addComponent(nilaiIFA))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))))))
                .addContainerGap(141, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(nextButton)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(155, 155, 155))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nilaiPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nilaiDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nilaiNSB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nilaiIFA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton)
                    .addComponent(backButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.hide();
        TampilanKondisiKetetanggaan ki = new TampilanKondisiKetetanggaan();
        ki.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:

        if (nilaiPP.getText().trim().isEmpty()) {

        } else if (nilaiDP.getText().trim().isEmpty()) {

        } else if (nilaiNSB.getText().trim().isEmpty()) {

        } else if (nilaiIFA.getText().trim().isEmpty()) {

        } else {
            //nextButton.setEnabled(true);
            this.hide();
            TampilanDataWirausaha ks = new TampilanDataWirausaha();
            ks.setVisible(true);
        }


    }//GEN-LAST:event_nextButtonActionPerformed

    private void nilaiPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaiPPActionPerformed
        // TODO add your handling code here:
        pf.setFactors(kumpulanNilaiPF);
        String masukanPP = nilaiPP.getText();
        bobotPF[0] = Double.parseDouble(masukanPP);
        pf.setWeights(bobotPF);
    }//GEN-LAST:event_nilaiPPActionPerformed

    private void nilaiDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaiDPActionPerformed
        // TODO add your handling code here:
        pf.setFactors(kumpulanNilaiPF);
        String masukanDP = nilaiDP.getText();
        bobotPF[1] = Double.parseDouble(masukanDP);
        pf.setWeights(bobotPF);
    }//GEN-LAST:event_nilaiDPActionPerformed

    private void nilaiNSBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaiNSBActionPerformed
        // TODO add your handling code here:
        pf.setFactors(kumpulanNilaiPF);
        String masukanNSB = nilaiNSB.getText();
        bobotPF[2] = Double.parseDouble(masukanNSB);
        pf.setWeights(bobotPF);
    }//GEN-LAST:event_nilaiNSBActionPerformed

    private void nilaiIFAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaiIFAActionPerformed
        // TODO add your handling code here:
        pf.setFactors(kumpulanNilaiPF);
        String masukanIFA = nilaiPP.getText();
        bobotPF[3] = Double.parseDouble(masukanIFA);
        pf.setWeights(bobotPF);
    }//GEN-LAST:event_nilaiIFAActionPerformed

    private void nextButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonMouseClicked
        boolean checker = true;
        if (nilaiDP.getText().equals("")) {
            InputDataHandler.inputDataEksternal("dinamikaPasar", null);
            checker = false;
        } else if (nilaiIFA.getText().equals("")) {
            InputDataHandler.inputDataEksternal("InfrastrukturListrik", null);
            checker = false;
        } else if (nilaiNSB.getText().equals("")) {
            InputDataHandler.inputDataEksternal("NormaSosialBudaya", null);
            checker = false;
        } else if (nilaiPP.getText().equals("")) {
            InputDataHandler.inputDataEksternal("ProgramPemerintah", null);
            checker = false;
        } else {
            if (!nilaiDP.getText().equals("")) {
                InputDataHandler.inputDataEksternal("dinamikaPasar", nilaiDP.getText());
                checker = true;
            } else if (!nilaiIFA.getText().equals("")) {
                InputDataHandler.inputDataEksternal("InfrastrukturListrik", nilaiIFA.getText());
                checker = true;
            } else if (!nilaiNSB.getText().equals("")) {
                InputDataHandler.inputDataEksternal("NormaSosialBudaya", nilaiNSB.getText());
                checker = true;
            } else {
                InputDataHandler.inputDataEksternal("ProgramPemerintah", nilaiPP.getText());
                checker = true;
            }
        }

        if (checker == true) {
            this.hide();
            TampilanDataWirausaha ks = new TampilanDataWirausaha();
            ks.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "You must fill the text field first!");
        }
    }//GEN-LAST:event_nextButtonMouseClicked

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
            java.util.logging.Logger.getLogger(TampilanKondisiEksternal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilanKondisiEksternal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilanKondisiEksternal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilanKondisiEksternal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TampilanKondisiEksternal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton nextButton;
    private javax.swing.JTextField nilaiDP;
    private javax.swing.JTextField nilaiIFA;
    private javax.swing.JTextField nilaiNSB;
    private javax.swing.JTextField nilaiPP;
    // End of variables declaration//GEN-END:variables
}
