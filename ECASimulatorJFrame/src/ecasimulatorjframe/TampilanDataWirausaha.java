/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecasimulatorjframe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vanessa
 */
public class TampilanDataWirausaha extends javax.swing.JFrame {

    /**
     * Creates new form TampilanSimulasi
     */
    CA ca;
    public BufferedReader br;
    private final JFileChooser openFileChooser;

    public TampilanDataWirausaha() {
        initComponents();
        openFileChooser = new JFileChooser();
        openFileChooser.setSelectedFile(new File("D:\\text.txt"));
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        openFileButton = new javax.swing.JButton();
        messageLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        nextButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("SIMULATOR ECA");

        jLabel2.setText("Data Simulasi :");

        openFileButton.setText("OPEN FILE");
        openFileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openFileButtonMouseClicked(evt);
            }
        });
        openFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jenis Kelamin", "Umur", "Usia Bisnis (bulan)", "Kategori", "Sub Kategori", "Pendidikan", "Lokasi", "Pendapatan", "Level", "Point"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable1);

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

        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(openFileButton)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(111, 111, 111)
                                        .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(235, 235, 235))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextButton)
                .addGap(53, 53, 53))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(openFileButton)
                    .addComponent(messageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton)
                    .addComponent(backButton))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_openFileButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        
//        System.out.println(openFileChooser.getSelectedFile().isFile());
        if (!openFileChooser.getSelectedFile().exists()) {
            JOptionPane.showMessageDialog(null, "You must choose the file first!");
            return;
        }
        this.hide();
        TampilanSimulasi ts = new TampilanSimulasi(this.ca);
        ts.setVisible(true);
    }//GEN-LAST:event_nextButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        

        this.hide();
        TampilanKondisiEksternal ke = new TampilanKondisiEksternal();
        ke.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void openFileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openFileButtonMouseClicked
        double[] kumpulanBobot;
        int returnValue = openFileChooser.showOpenDialog(this);
        StringBuilder sb = new StringBuilder();
//        System.out.println(JFileChooser.APPROVE_OPTION);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                br = new BufferedReader(new FileReader(openFileChooser.getSelectedFile()));
                //messageLabel.setText("file successfully loaded!");
                //                FileReader fr = new FileReader();
                //                BufferedReader br = new BufferedReader(fr);
//                String firstLine = br.readLine().trim();
//                //System.out.println(firstLine);
//                String[] columnsName = firstLine.split(",");
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

                Object[] tableLines = br.lines().toArray();
                ca = new CA(tableLines.length, InputDataHandler.getKetetanggaan(),4);
                kumpulanBobot = new double[InputDataHandler.getKetetanggaan()];
                int i;
                for (i = 0; i < tableLines.length; i++) {
                    String lines = tableLines[i].toString().trim();
                    String[] dataRow = lines.split(",");
                    model.addRow(dataRow);

                    //memasukkan data dari fileInput ke kelas Entrepreneurs ca
                    ca.E[i] = new Entrepreneurs();
                    if (dataRow[0].equals("false")) {
                        ca.E[i].sex = false; // pria
                    } else {
                        ca.E[i].sex = true; //wanita
                    }
                    ca.E[i].age = Integer.parseInt(dataRow[1]);
                    ca.E[i].b_age = Integer.parseInt(dataRow[2]);
                    ca.E[i].b_category = Integer.parseInt(dataRow[3]);
                    ca.E[i].b_area = Integer.parseInt(dataRow[4]);
                    ca.E[i].education = Integer.parseInt(dataRow[5]);
                    ca.E[i].location = Integer.parseInt(dataRow[6]);
                    ca.E[i].income = Integer.parseInt(dataRow[7]);
                    ca.E[i].level = Integer.parseInt(dataRow[8]);
                    ca.E[i].point = 0.0;
                }
                // memasukkan data bobot masing2 atribut ke kelas Neighborhood
                

//                InputDataHandler.setDataWirausaha(openFileChooser.getSelectedFile().getName());
//                CA ca = new CA(InputDataHandler.getPopulation(), InputDataHandler.getKetetanggaan(),4);
                //System.out.println(InputDataHandler.jmlChecklist);
//               // dataWirausaha = Object;
//               // System.out.println(dataWirausaha);
//                String line = "";
//                //String simpanData="";
//                //selama isi filenya belom kosong, maka print isi file
//                while ((line = br.readLine()) != null) {
//                    System.out.println(line);
//                    sb.append(line + ";"); // titik koma buat pemisah antar wirausaha
//                    //simpanData = line;
//                }
//                line = sb.toString();
//                System.out.println(line);
//                String[] atribut = line.split(",");
//
//                //int[] atributWirausaha = new int[atribut.length];
//                br.close();
//                // fr.close();
            } catch (IOException e) {
                //messageLabel.setText("failed to load the file!");
                Logger.getLogger(TampilanDataWirausaha.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_openFileButtonMouseClicked

    private void nextButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonMouseClicked
        
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
            java.util.logging.Logger.getLogger(TampilanDataWirausaha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilanDataWirausaha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilanDataWirausaha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilanDataWirausaha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TampilanDataWirausaha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel messageLabel;
    public javax.swing.JButton nextButton;
    private javax.swing.JButton openFileButton;
    // End of variables declaration//GEN-END:variables
}
