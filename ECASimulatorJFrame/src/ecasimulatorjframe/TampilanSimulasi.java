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
public class TampilanSimulasi extends javax.swing.JFrame {

    /**
     * Creates new form TampilanSimulasi
     */
    CA ca;
    public TampilanSimulasi(CA ca) {
        initComponents();
        this.ca=ca;
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
        nilaiPeriode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nilaiA = new javax.swing.JTextField();
        nilaiB = new javax.swing.JTextField();
        nilaiC = new javax.swing.JTextField();
        nilaiThreshold = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        simulateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nilaiPeriode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilaiPeriodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nilaiPeriode, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(nilaiPeriode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("SIMULATOR ECA");

        jLabel2.setText("Simulasi :");

        jLabel3.setText("a :");

        jLabel4.setText("b :");

        jLabel5.setText("c :");

        jLabel6.setText("Threshold :");

        nilaiA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilaiAActionPerformed(evt);
            }
        });

        nilaiB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilaiBActionPerformed(evt);
            }
        });

        nilaiC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilaiCActionPerformed(evt);
            }
        });

        nilaiThreshold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilaiThresholdActionPerformed(evt);
            }
        });

        jLabel7.setText("Periode :");

        simulateButton.setText("SIMULATE");
        simulateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                simulateButtonMouseClicked(evt);
            }
        });
        simulateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simulateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nilaiA)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nilaiB, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(simulateButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nilaiC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))
                        .addGap(13, 13, 13)
                        .addComponent(nilaiThreshold, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(nilaiA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nilaiB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nilaiC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nilaiThreshold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(simulateButton)
                        .addGap(21, 21, 21))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nilaiAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaiAActionPerformed
//        // TODO add your handling code here:
//        String masukanA = nilaiA.getText();
//        double a = Double.parseDouble(masukanA);
    }//GEN-LAST:event_nilaiAActionPerformed

    private void simulateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simulateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_simulateButtonActionPerformed

    private void nilaiBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaiBActionPerformed
        // TODO add your handling code here:
//        String masukanB = nilaiB.getText();
//        double b = Double.parseDouble(masukanB);
    }//GEN-LAST:event_nilaiBActionPerformed

    private void nilaiCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaiCActionPerformed
        // TODO add your handling code here:
//        String masukanC = nilaiC.getText();
//        double c = Double.parseDouble(masukanC);
    }//GEN-LAST:event_nilaiCActionPerformed

    private void nilaiThresholdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaiThresholdActionPerformed
        // TODO add your handling code here:
//        String masukanThreshold = nilaiThreshold.getText();
//        double t = Double.parseDouble(masukanThreshold);
    }//GEN-LAST:event_nilaiThresholdActionPerformed

    private void nilaiPeriodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaiPeriodeActionPerformed
        // TODO add your handling code here:
//        String masukanPeriode = nilaiPeriode.getText();
//        int p = Integer.parseInt(masukanPeriode);
    }//GEN-LAST:event_nilaiPeriodeActionPerformed

    private void simulateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_simulateButtonMouseClicked
        boolean checker = true;
        double a=0.0;
        double b=0.0;
        double c=0.0;
        if (nilaiA.getText().equals("")) {
            InputDataHandler.inputDataSimulasi("nilaiA", null);
            checker = false;
        } else if (nilaiB.getText().equals("")) {
            InputDataHandler.inputDataSimulasi("nilaiB", null);
            checker = false;
        } else if (nilaiC.getText().equals("")) {
            InputDataHandler.inputDataSimulasi("nilaiC", null);
            checker = false;
        } else if (nilaiPeriode.getText().equals("")) {
            InputDataHandler.inputDataSimulasi("periode", null);
            checker = false;
        } else if (nilaiThreshold.getText().equals("")) {
            InputDataHandler.inputDataSimulasi("threshold", null);
            checker = false;
        } else {
            if (!nilaiA.getText().equals("")) {
                InputDataHandler.inputDataSimulasi("nilaiA", nilaiA.getText());
                a = Double.parseDouble(nilaiA.getText());
                checker = true;
            } else if (!nilaiB.getText().equals("")) {
                InputDataHandler.inputDataSimulasi("nilaiB", nilaiB.getText());
                b = Double.parseDouble(nilaiB.getText());
                checker = true;
            } else if (!nilaiC.getText().equals("")) {
                InputDataHandler.inputDataSimulasi("nilaiC", nilaiC.getText());
                c = Double.parseDouble(nilaiC.getText());
                checker = true;
            } else if (!nilaiPeriode.getText().equals("")) {
                InputDataHandler.inputDataSimulasi("periode", nilaiPeriode.getText());
                checker = true;
            } else {
                InputDataHandler.inputDataSimulasi("threshold", nilaiThreshold.getText());
                checker = true;
            }
        }
        
        if (a+b+c!=1.0) {
            JOptionPane.showMessageDialog(null, "The sum of a,b and c's value must 1!");
            checker = false;
        }
        
        if (checker == true) {
            this.hide();
            TampilanDataWirausaha ks = new TampilanDataWirausaha();
            ks.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "You must fill the text field first!");
        }
        
        double[] composition = new double[] {a,b,c};
        
        double[] POAf = new double [] {8.6,17.7,28.4,29.5,15.8}; // female
        double[] POAm = new double [] {8.3,14.5,26.7,36.2,14.3}; // male
        
        // Perceived Opportunities Education
        double[] POEf = new double [] {0.1,7.4,49.8,23.4,17.4,1.8};
        double[] POEm = new double [] {0.3,12.6,54.7,19.9,11.8,0.7};
        
        // Perceived Opportunities Location
        double[] POLf = new double [] {2.4,0.6,1.0,1.1,2.5,9.5,6.1,9.6,46.3,1.7,3.5,1.4,2.8,4.8,6.4,0.3};
        double[] POLm = new double [] {2.0,0.5,1.1,0.9,2.7,8.4,6.3,11.1,47.6,2.1,3.8,1.9,2.3,4.5,4.4,0.5};
        
        // Perceived Opportunities Income
        double[] POIf = new double[] {0.5,0,0.3,1.5,2.8,10.8,41.5,42.7};
        double[] POIm = new double[] {0.2,0.5,0.3,0.7,3.4,11.0,41.7,42.1};
        
        // Perceived Capabilities Age
        double[] PCAf = new double[] {8.9,16.1,28.2,31.6,15.1};
        double[] PCAm = new double[] {8.5,17.3,26.1,33.4,14.7};
        
        // Perceived Capabilities Education
        double[] PCEf = new double[] {0.4,8.2,51.5,22.8,15.4,1.7};
        double[] PCEm = new double[] {0.5,12.0,56.9,17.4,12.4,0.9};
        
        // Perceived Capabilities Income
        double[] PCIf = new double[] {0.4,0.2,0.2,1.4,3.1,10.2,43.0,41.4};
        double[] PCIm = new double[] {0.2,0.2,0.3,0.8,3.1,10.5,42.1,42.9};
        
        // Perceived Capabilities Location
        double[] PCLf = new double[] {4.4,0.8,1.0,1.2,3.7,9.0,6.9,10.8,41.1,1.6,3.2,2.0,2.4,3.9,7.5,0.4};
        double[] PCLm = new double[] {4.3,0.7,0.9,1.2,3.5,8.7,7.2,11.5,41.1,1.8,3.8,3.0,2.6,3.4,5.4,0.7};
        
        // Role Model Age
        double[] RMAf = new double[] {7.5,17.6,26.8,31.0,17.1};
        double[] RMAm = new double[] {9.1,16.9,25.3,34.4,14.3};
        
        // Role Model Income
        double[] RMIf = new double[] {0.4,0.1,0.4,1.6,3.0,9.7,41.8,43.1};
        double[] RMIm = new double[] {0.2,0.5,0.2,0.7,3.0,10.4,42.1,42.9};
        
        // Faktor Publik
        double[] pfs = new double[] {2.53, 3.92, 3.29, 3.45};
        double[] pfw = InputDataHandler.getDataEksternal();
        
        double[] nw = InputDataHandler.getBobot();
        int[] nr = InputDataHandler.getRelation();
        
        
        ca.pub.setFactors(pfs);
        ca.pub.setWeights(pfw);
        
        ca.N.setWeight(nw);
        ca.N.setRelation(nr);
        
        int maxIter = 100;
        for (int i = 0; i < maxIter; i++) {
            ca.NeighborhoodDefinition();
           // int periode = Integer.parseInt(InputDataHandler.getValue("periode"));
            if (i % 12 == 0) {
                //ca.print(i, null);
                ca.calculatePoint(POAm, POAf, POEm, POEf, POLm, POLf, POIm, POIf, PCAm, PCAf, PCEm, PCEf, PCLm, PCLf, PCIm, PCIf, RMAm, RMAf, RMIm, RMIf);
               // System.out.println(ca.calculatePoint(POAm, POAf, POEm, POEf, POLm, POLf, POIm, POIf, PCAm, PCAf, PCEm, PCEf, PCLm, PCLf, PCIm, PCIf, RMAm, RMAf, RMIm, RMIf));
                Entrepreneurs[] nE;
                nE = ca.stateTransition(ca,composition);
                for (int j = 0; j < nE.length; j++) {
                    System.out.println(nE[j].toString2());
                }
                ca.E = nE;
//                System.out.println(nE);
            }
        }
    }//GEN-LAST:event_simulateButtonMouseClicked

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
            java.util.logging.Logger.getLogger(TampilanSimulasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilanSimulasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilanSimulasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilanSimulasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new TampilanSimulasi(this.ca).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nilaiA;
    private javax.swing.JTextField nilaiB;
    private javax.swing.JTextField nilaiC;
    private javax.swing.JTextField nilaiPeriode;
    private javax.swing.JTextField nilaiThreshold;
    public javax.swing.JButton simulateButton;
    // End of variables declaration//GEN-END:variables
}
