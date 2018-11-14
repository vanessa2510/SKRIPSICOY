/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecasimulatorjframe;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
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
//    TampilanDataWirausaha br;

    public TampilanSimulasi(CA ca) {
        initComponents();
        this.ca = ca;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        nilaiPeriode = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        nilaiPeriode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilaiPeriodeActionPerformed(evt);
            }
        });

        jLabel8.setText(" bulan");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nilaiPeriode, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
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
                    .addComponent(jLabel7)
                    .addComponent(nilaiPeriode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(simulateButton)
                .addGap(21, 21, 21))
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
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
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
                if (!nilaiB.getText().equals("")) {
                    InputDataHandler.inputDataSimulasi("nilaiB", nilaiB.getText());
                    b = Double.parseDouble(nilaiB.getText());
                    if (!nilaiC.getText().equals("")) {
                        InputDataHandler.inputDataSimulasi("nilaiC", nilaiC.getText());
                        c = Double.parseDouble(nilaiC.getText());
                        if (!nilaiPeriode.getText().equals("")) {
                            InputDataHandler.inputDataSimulasi("periode", nilaiPeriode.getText());
                            // System.out.println(nilaiPeriode.getText());
                            if (!nilaiThreshold.getText().equals("")) {
                                InputDataHandler.inputDataSimulasi("threshold", nilaiThreshold.getText());
                                // System.out.println(nilaiThreshold.getText());
                            }
                        }
                    }
                }
            }
        }

        if (a + b + c != 1.0) {
            JOptionPane.showMessageDialog(null, "The sum of a,b and c's value must 1!");
            //checker = false;
        }

        if (checker == false) {
            JOptionPane.showMessageDialog(null, "You must fill the text field first!");
        }

        double[] composition = new double[]{a, b, c};

        double[] POAf = new double[]{8.6, 17.7, 28.4, 29.5, 15.8}; // female
        double[] POAm = new double[]{8.3, 14.5, 26.7, 36.2, 14.3}; // male

        // Perceived Opportunities Education
        double[] POEf = new double[]{1.8, 17.4, 23.4, 49.8, 7.4, 0.1}; // 0.1, 7.4, 49.8, 23.4, 17.4, 1.8 
        double[] POEm = new double[]{0.7, 11.8, 19.9, 54.7, 12.6, 0.3};// 0.3, 12.6, 54.7, 19.9, 11.8, 0.7

        // Perceived Opportunities Location
        double[] POLf = new double[]{0.3, 6.4, 4.8, 2.8, 1.4, 3.5, 1.7, 46.3, 9.6, 6.1, 9.5, 2.5, 1.1, 1.0, 0.6, 2.4}; //  2.4, 0.6, 1.0, 1.1, 2.5, 9.5, 6.1, 9.6, 46.3, 1.7, 3.5, 1.4, 2.8, 4.8, 6.4, 0.3
        double[] POLm = new double[]{0.5, 4.4, 4.5, 2.3, 1.9, 3.8, 2.1, 47.6, 11.1, 6.3, 8.4, 2.7, 0.9, 1.1, 0.5, 2.0}; //      2.0, 0.5, 1.1, 0.9, 2.7, 8.4, 6.3, 11.1, 47.6, 2.1, 3.8, 1.9, 2.3, 4.5, 4.4, 0.5

        // Perceived Opportunities Income
        double[] POIf = new double[]{42.7, 41.5, 10.8, 2.8, 1.5, 0.3, 0, 0.5}; //    0.5, 0, 0.3, 1.5, 2.8, 10.8, 41.5, 42.7
        double[] POIm = new double[]{42.1, 41.7, 11.0, 3.4, 0.7, 0.3, 0.5, 0.2};//    0.2, 0.5, 0.3, 0.7, 3.4, 11.0, 41.7, 42.1

        // Perceived Capabilities Age
        double[] PCAf = new double[]{8.9, 16.1, 28.2, 31.6, 15.1}; //    
        double[] PCAm = new double[]{8.5, 17.3, 26.1, 33.4, 14.7}; //   

        // Perceived Capabilities Education
        double[] PCEf = new double[]{1.7, 15.4, 22.8, 51.5, 8.2, 0.4}; //   0.4, 8.2, 51.5, 22.8, 15.4, 1.7
        double[] PCEm = new double[]{0.9, 12.4, 17.4, 56.9, 12.0, 0.5}; //  0.5, 12.0, 56.9, 17.4, 12.4, 0.9

        // Perceived Capabilities Income
        double[] PCIf = new double[]{41.4, 43.0, 10.2, 3.1, 1.4, 0.2, 0.2, 0.4}; //    0.4, 0.2, 0.2, 1.4, 3.1, 10.2, 43.0, 41.4
        double[] PCIm = new double[]{42.9, 42.1, 10.5, 3.1, 0.8, 0.3, 0.2, 0.2};//    0.2, 0.2, 0.3, 0.8, 3.1, 10.5, 42.1, 42.9

        // Perceived Capabilities Location
        double[] PCLf = new double[]{0.4, 7.5, 3.9, 2.4, 2.0, 3.2, 1.6, 41.1, 10.8, 6.9, 9.0, 3.7, 1.2, 1.0, 0.8, 4.4}; //    4.4, 0.8, 1.0, 1.2, 3.7, 9.0, 6.9, 10.8, 41.1, 1.6, 3.2, 2.0, 2.4, 3.9, 7.5, 0.4
        double[] PCLm = new double[]{0.7, 5.4, 3.4, 2.6, 3.0, 3.8, 1.8, 41.1, 11.5, 7.2, 8.7, 3.5, 1.2, 0.9, 0.7, 4.3}; //   4.3, 0.7, 0.9, 1.2, 3.5, 8.7, 7.2, 11.5, 41.1, 1.8, 3.8, 3.0, 2.6, 3.4, 5.4, 0.7

        // Role Model Age
        double[] RMAf = new double[]{7.5, 17.6, 26.8, 31.0, 17.1}; //   
        double[] RMAm = new double[]{9.1, 16.9, 25.3, 34.4, 14.3}; //  

        // Role Model Income
        double[] RMIf = new double[]{43.1, 41.8, 9.7, 3.0, 1.6, 0.4, 0.1, 0.4}; //   0.4, 0.1, 0.4, 1.6, 3.0, 9.7, 41.8, 43.1
        double[] RMIm = new double[]{42.9, 42.1, 10.4, 3.0, 0.7, 0.2, 0.5, 0.2};//   0.2, 0.5, 0.2, 0.7, 3.0, 10.4, 42.1, 42.9

        // Fear of Failuer Age
        double[] FFAf = new double[]{8.2, 16.4, 23.5, 32.4, 19.5};
        double[] FFAm = new double[]{7.2, 14.3, 23.6, 36.4, 18.6};

        // Fear of Failure Education
        double[] FFEf = new double[]{2.3, 13.9, 22.9, 51.7, 8.7, 0.5};
        double[] FFEm = new double[]{0.7, 12.1, 18.4, 57.4, 11.3, 0};

        // Fear of Failure Location
        double[] FFLf = new double[]{0.7, 10.3, 3.4, 3.8, 3.1, 4.2, 2.5, 36.9, 2.6, 7.8, 12.1, 4.6, 1.9, 1.0, 0.4, 4.8};
        double[] FFLm = new double[]{0.7, 8.9, 3.4, 2.4, 4.2, 5.4, 2.9, 35.4, 1.8, 7.1, 13.2, 4.7, 2.2, 1.0, 0.5, 6.1};

        // Media Attention Location
        double[] MALf = new double[]{0.7, 9.9, 3.6, 3.5, 5.4, 4.1, 1.9, 41.1, 6.3, 9.1, 4.7, 2.9, 1.1, 1.0, 0.7, 4.0};
        double[] MALm = new double[]{0.9, 8.1, 3.4, 3.6, 4.7, 4.9, 1.9, 41.8, 6.5, 8.2, 5.8, 2.9, 1.3, 1.1, 0.7, 4.1};

        // Media Attention Income
        double[] MAIf = new double[]{44.4, 41.6, 9.1, 2.7, 1.4, 0.2, 0.2, 0.4};
        double[] MAIm = new double[]{44.0, 40.0, 11.4, 3.1, 0.6, 0.2, 0.4, 0.2};

        // High Status Successful Income
        double[] HSSIf = new double[]{45.6, 41.7, 8.5, 2.2, 1.2, 0.3, 0.1, 0.3};
        double[] HSSIm = new double[]{46.2, 39.5, 10.2, 2.8, 0.6, 0.2, 0.4, 0.2};

        //High Status Successful Location
        double[] HSSLf = new double[]{0.7, 9.0, 2.7, 2.6, 5.4, 4.5, 1.8, 35.0, 9.8, 8.3, 10.8, 2.8, 1.5, 1.0, 0.8, 3.4};
        double[] HSSLm = new double[]{0.8, 7.2, 2.3, 3.2, 4.8, 4.5, 2.2, 37.0, 10.2, 7.6, 10.7, 2.9, 1.6, 1.1, 0.8, 3.1};

        // High Status Successful Age
        double[] HSSAf = new double[]{10, 17, 26, 31, 17};
        double[] HSSAm = new double[]{9, 16, 25, 33, 16};

        // High Status Successful Education
        double[] HSSEf = new double[]{2, 15, 23, 52, 8, 0};
        double[] HSSEm = new double[]{1, 12, 19, 56, 11, 0};

        // Faktor Publik
        double[] pfs = new double[]{3.06, 2.69, 2.22, 2.53, 2.54, 3.3, 2.31, 3.25, 3.92, 2.82, 3.45, 3.29};
        double[] pfw = InputDataHandler.getDataEksternal();

        double[] nw = InputDataHandler.getBobot();
        int[] nr = InputDataHandler.getRelation();

        ca.pub.setFactors(pfs);
        ca.pub.setWeights(pfw);

        ca.N.setWeight(nw);
        ca.N.setRelation(nr);

//        String outFile = "D:\\Vanessa\\Data\\outFile.txt";
        int maxIter = Integer.parseInt(InputDataHandler.getValue("periode")); // masukan periode
//        PrintWriter out;
//        try {
//            out = new PrintWriter(new BufferedWriter(new FileWriter(outFile, true)));
//            out.println("iter,potential,nascent,new_bm,est_bm,retired");

        Entrepreneurs[][] e = new Entrepreneurs[maxIter][];
        String line = "";
        try {
            PrintWriter pw = new PrintWriter(new File("D:\\output.csv"));
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < maxIter; i++) {
                sb.append("Bulan ke-" + i);
                sb.append('\n');
                line = ca.print(i);
                System.out.println(line);
                ca.NeighborhoodDefinition();
                ca.calculatePoint(POAm, POAf, POEm, POEf, POLm, POLf, POIm, POIf, PCAm, PCAf, PCEm, PCEf, PCLm, PCLf, PCIm, PCIf, RMAm, RMAf, RMIm, RMIf, FFAf, FFAm, FFEf, FFEm, FFLf, FFLm, MALf, MALm, MAIf, MAIm, HSSIf, HSSIm, HSSLf, HSSLm, HSSAf, HSSAm, HSSEf, HSSEm);
                Entrepreneurs[] nE;
                e[i] = ca.stateTransition(ca, composition);

                for (int j = 0; j < e[i].length; j++) {
//                    String lines = e[i][j].toString2();
//                    System.out.println(e[i][j].toString2());
                    sb.append(e[i][j].toString2());
                    sb.append('\n');

                }
                ca.E = e[i];

            }
            pw.write(sb.toString());
            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TampilanSimulasi.class.getName()).log(Level.SEVERE, null, ex);
        }

//                System.out.println(nE);
        this.hide();
        TampilanHasil th = new TampilanHasil(e,ca);

        th.setVisible(
                true);
//        } catch (IOException ex) {
//            System.out.println("Gagal menulis File");
//            Logger.getLogger(TampilanSimulasi.class.getName()).log(Level.SEVERE, null, ex);
//        }


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
            java.util.logging.Logger.getLogger(TampilanSimulasi.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilanSimulasi.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilanSimulasi.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilanSimulasi.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nilaiA;
    private javax.swing.JTextField nilaiB;
    private javax.swing.JTextField nilaiC;
    private javax.swing.JTextField nilaiPeriode;
    private javax.swing.JTextField nilaiThreshold;
    public javax.swing.JButton simulateButton;
    // End of variables declaration//GEN-END:variables
}
