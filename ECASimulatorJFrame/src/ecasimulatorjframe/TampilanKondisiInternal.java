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
public class TampilanKondisiInternal extends javax.swing.JFrame {

    /**
     * Creates new form ECASimulator
     */
    double[] bobot;

    public TampilanKondisiInternal() {
        initComponents();
        nilaiUmurInternal.setEnabled(false);
        nilaiLokasiInternal.setEnabled(false);
        nilaiPendapatanInternal.setEnabled(false);
        nilaiPendidikanInternal.setEnabled(false);
        nilaiUsahaInternal.setEnabled(false);
        nilaiJenisKelaminInternal.setEnabled(false);
        nilaiLevelInternal.setEnabled(false);

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
        umurCBInternal = new javax.swing.JCheckBox();
        levelCBInternal = new javax.swing.JCheckBox();
        pendidikanCBInternal = new javax.swing.JCheckBox();
        pendapatanCBInternal = new javax.swing.JCheckBox();
        jenisKelaminCBInternal = new javax.swing.JCheckBox();
        lokasiCBInternal = new javax.swing.JCheckBox();
        bUsahaCBInternal = new javax.swing.JCheckBox();
        nilaiUmurInternal = new javax.swing.JTextField();
        nilaiLevelInternal = new javax.swing.JTextField();
        nilaiPendidikanInternal = new javax.swing.JTextField();
        nilaiPendapatanInternal = new javax.swing.JTextField();
        nilaiJenisKelaminInternal = new javax.swing.JTextField();
        nilaiLokasiInternal = new javax.swing.JTextField();
        nilaiUsahaInternal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("SIMULATOR ECA");

        jLabel2.setText("Bobot Masing-Masing Parameter Wirausaha :");

        umurCBInternal.setText("UMUR :");
        umurCBInternal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                umurCBInternalMouseClicked(evt);
            }
        });
        umurCBInternal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umurCBInternalActionPerformed(evt);
            }
        });

        levelCBInternal.setText("LEVEL :");
        levelCBInternal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                levelCBInternalMouseClicked(evt);
            }
        });

        pendidikanCBInternal.setText("PENDIDIKAN :");
        pendidikanCBInternal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pendidikanCBInternalMouseClicked(evt);
            }
        });

        pendapatanCBInternal.setText("PENDAPATAN :");
        pendapatanCBInternal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pendapatanCBInternalMouseClicked(evt);
            }
        });
        pendapatanCBInternal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendapatanCBInternalActionPerformed(evt);
            }
        });

        jenisKelaminCBInternal.setText("JENIS KELAMIN :");
        jenisKelaminCBInternal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jenisKelaminCBInternalMouseClicked(evt);
            }
        });

        lokasiCBInternal.setText("LOKASI :");
        lokasiCBInternal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lokasiCBInternalMouseClicked(evt);
            }
        });

        bUsahaCBInternal.setText("BIDANG USAHA :");
        bUsahaCBInternal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bUsahaCBInternalMouseClicked(evt);
            }
        });

        nilaiUmurInternal.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                nilaiUmurInternalComponentAdded(evt);
            }
        });
        nilaiUmurInternal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nilaiUmurInternalMouseClicked(evt);
            }
        });
        nilaiUmurInternal.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                nilaiUmurInternalInputMethodTextChanged(evt);
            }
        });
        nilaiUmurInternal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilaiUmurInternalActionPerformed(evt);
            }
        });

        nilaiLevelInternal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilaiLevelInternalActionPerformed(evt);
            }
        });

        nilaiPendapatanInternal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilaiPendapatanInternalActionPerformed(evt);
            }
        });

        nilaiLokasiInternal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilaiLokasiInternalActionPerformed(evt);
            }
        });

        jLabel3.setText("%");

        jLabel4.setText("%");

        jLabel5.setText("%");

        jLabel6.setText("%");

        jLabel7.setText("%");

        jLabel8.setText("%");

        jLabel9.setText("%");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(nilaiLevelInternal, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(umurCBInternal)
                                                .addComponent(levelCBInternal)
                                                .addComponent(pendidikanCBInternal)
                                                .addComponent(pendapatanCBInternal))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(34, 34, 34)
                                                    .addComponent(nilaiUmurInternal, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(nilaiPendidikanInternal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nilaiPendapatanInternal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addComponent(nilaiJenisKelaminInternal, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nilaiLokasiInternal, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nilaiUsahaInternal, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jenisKelaminCBInternal)
                                            .addGap(68, 68, 68))
                                        .addComponent(lokasiCBInternal)
                                        .addComponent(bUsahaCBInternal)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jLabel1)))
                        .addGap(0, 129, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(nextButton)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(umurCBInternal)
                    .addComponent(nilaiUmurInternal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(levelCBInternal)
                    .addComponent(nilaiLevelInternal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pendidikanCBInternal)
                    .addComponent(nilaiPendidikanInternal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pendapatanCBInternal)
                    .addComponent(nilaiPendapatanInternal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jenisKelaminCBInternal)
                    .addComponent(nilaiJenisKelaminInternal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lokasiCBInternal)
                    .addComponent(nilaiLokasiInternal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bUsahaCBInternal)
                    .addComponent(nilaiUsahaInternal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(nextButton)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
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

    private void nilaiPendapatanInternalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaiPendapatanInternalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilaiPendapatanInternalActionPerformed

    private void nilaiLevelInternalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaiLevelInternalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilaiLevelInternalActionPerformed

    private void pendapatanCBInternalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendapatanCBInternalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pendapatanCBInternalActionPerformed

    private void nilaiLokasiInternalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaiLokasiInternalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilaiLokasiInternalActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed


    }//GEN-LAST:event_nextButtonActionPerformed

    private void umurCBInternalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umurCBInternalActionPerformed

    }//GEN-LAST:event_umurCBInternalActionPerformed

    private void nilaiUmurInternalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaiUmurInternalActionPerformed
        // nilai dari umur ini nanti dimasukin ke atribut weight di kelas Neighborhoods

    }//GEN-LAST:event_nilaiUmurInternalActionPerformed

    private void nextButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonMouseClicked
        //System.out.println("lala");

        int jumlahCheckList = 0;
        //double[] bobot = new double[jumlahCheckList];
        boolean checker = true;
        if (umurCBInternal.isSelected()) {
            jumlahCheckList += 1;
            if (nilaiUmurInternal.getText().equals("")) {
                InputDataHandler.inputDataInternal("umurInternal", null);
                checker = false; // false karena nilainya null
            } else {
                InputDataHandler.inputDataInternal("umurInternal", nilaiUmurInternal.getText());
            }

        }

        if (levelCBInternal.isSelected()) {
            jumlahCheckList += 1;
            if (nilaiLevelInternal.getText().equals("")) {
                InputDataHandler.inputDataInternal("levelInternal", null);
                checker = false; // false karena nilainya null
            } else {
                InputDataHandler.inputDataInternal("levelInternal", nilaiLevelInternal.getText());
            }
        }

        if (pendidikanCBInternal.isSelected()) {
            jumlahCheckList += 1;
            if (nilaiPendidikanInternal.getText().equals("")) {
                InputDataHandler.inputDataInternal("pendidikanInternal", null);
                checker = false; // false karena nilainya null
            } else {
                InputDataHandler.inputDataInternal("pendidikanInternal", nilaiPendidikanInternal.getText());
            }
        }

        if (pendapatanCBInternal.isSelected()) {
            jumlahCheckList += 1;
            if (nilaiPendapatanInternal.getText().equals("")) {
                InputDataHandler.inputDataInternal("pendapatanInternal", null);
                checker = false; // false karena nilainya null
            } else {
                InputDataHandler.inputDataInternal("pendapatanInternal", nilaiPendapatanInternal.getText());
            }
        }

        if (jenisKelaminCBInternal.isSelected()) {
            jumlahCheckList += 1;
            if (nilaiUmurInternal.getText().equals("")) {
                InputDataHandler.inputDataInternal("jenisKelaminInternal", null);
                checker = false; // false karena nilainya null
            } else {
                InputDataHandler.inputDataInternal("jenisKelaminInternal", nilaiJenisKelaminInternal.getText());
            }
        }

        if (lokasiCBInternal.isSelected()) {
            jumlahCheckList += 1;
            if (nilaiLokasiInternal.getText().equals("")) {
                InputDataHandler.inputDataInternal("lokasiInternal", null);
                checker = false; // false karena nilainya null
            } else {
                InputDataHandler.inputDataInternal("lokasiInternal", nilaiLokasiInternal.getText());
            }
        }

        if (bUsahaCBInternal.isSelected()) {
            jumlahCheckList += 1;
            if (nilaiUsahaInternal.getText().equals("")) {
                InputDataHandler.inputDataInternal("usahaInternal", null);
                checker = false; // false karena nilainya null
            } else {
                InputDataHandler.inputDataInternal("usahaInternal", nilaiUsahaInternal.getText());
            }
        }
        double[] kumpulanBobot = new double[jumlahCheckList];
        int m = 0;
        if (umurCBInternal.isSelected()) {
            kumpulanBobot[m] = Double.parseDouble(InputDataHandler.getValue("umurInternal"));
            m++;
        }
        if (pendidikanCBInternal.isSelected()) {
            kumpulanBobot[m] = Double.parseDouble(InputDataHandler.getValue("pendidikanInternal"));
            m++;
        }
        if (levelCBInternal.isSelected()) {
            kumpulanBobot[m] = Double.parseDouble(InputDataHandler.getValue("levelInternal"));
            m++;
        }
        if (pendapatanCBInternal.isSelected()) {
            kumpulanBobot[m] = Double.parseDouble(InputDataHandler.getValue("pendapatanInternal"));
            m++;
        }
        if (jenisKelaminCBInternal.isSelected()) {
            kumpulanBobot[m] = Double.parseDouble(InputDataHandler.getValue("jenisKelaminInternal"));
            m++;
        }
        if (lokasiCBInternal.isSelected()) {
            kumpulanBobot[m] = Double.parseDouble(InputDataHandler.getValue("lokasiInternal"));
            m++;
        }
        if (bUsahaCBInternal.isSelected()) {
            kumpulanBobot[m] = Double.parseDouble(InputDataHandler.getValue("usahaInternal"));
            m++;
        }

        InputDataHandler.setBobot(kumpulanBobot);
        // n.setNumNeighbor(jumlahCheckList);
        if (jumlahCheckList == 0) {
            checker = false;
            // JOptionPane.showMessageDialog(null, "Check box is empty, you must fill it first!");
        }

        if (checker == true) {
            this.hide();
            TampilanKondisiKetetanggaan kk = new TampilanKondisiKetetanggaan();
            kk.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "You cannot move to the other page because you must fill checkbox or text field first!");
        }

    }//GEN-LAST:event_nextButtonMouseClicked

    private void umurCBInternalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_umurCBInternalMouseClicked
        if (umurCBInternal.isSelected()) {
            nilaiUmurInternal.setEnabled(true);
        } else {
            nilaiUmurInternal.setEnabled(false);
        }
    }//GEN-LAST:event_umurCBInternalMouseClicked

    private void levelCBInternalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_levelCBInternalMouseClicked
        if (levelCBInternal.isSelected()) {
            nilaiLevelInternal.setEnabled(true);
        } else {
            nilaiLevelInternal.setEnabled(false);
        }
    }//GEN-LAST:event_levelCBInternalMouseClicked

    private void pendidikanCBInternalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendidikanCBInternalMouseClicked

        if (pendidikanCBInternal.isSelected()) {
            nilaiPendidikanInternal.setEnabled(true);
        } else {
            nilaiPendidikanInternal.setEnabled(false);
        }
    }//GEN-LAST:event_pendidikanCBInternalMouseClicked

    private void pendapatanCBInternalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendapatanCBInternalMouseClicked

        if (pendapatanCBInternal.isSelected()) {
            nilaiPendapatanInternal.setEnabled(true);
        } else {
            nilaiPendapatanInternal.setEnabled(false);
        }
    }//GEN-LAST:event_pendapatanCBInternalMouseClicked

    private void jenisKelaminCBInternalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jenisKelaminCBInternalMouseClicked
        if (jenisKelaminCBInternal.isSelected()) {
            nilaiJenisKelaminInternal.setEnabled(true);
        } else {
            nilaiJenisKelaminInternal.setEnabled(false);
        }
    }//GEN-LAST:event_jenisKelaminCBInternalMouseClicked

    private void lokasiCBInternalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lokasiCBInternalMouseClicked
        if (lokasiCBInternal.isSelected()) {
            nilaiLokasiInternal.setEnabled(true);
        } else {
            nilaiLokasiInternal.setEnabled(false);
        }

    }//GEN-LAST:event_lokasiCBInternalMouseClicked

    private void bUsahaCBInternalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bUsahaCBInternalMouseClicked
        if (bUsahaCBInternal.isSelected()) {
            nilaiUsahaInternal.setEnabled(true);
        } else {
            nilaiUsahaInternal.setEnabled(false);
        }
    }//GEN-LAST:event_bUsahaCBInternalMouseClicked

    private void nilaiUmurInternalInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_nilaiUmurInternalInputMethodTextChanged

    }//GEN-LAST:event_nilaiUmurInternalInputMethodTextChanged

    private void nilaiUmurInternalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nilaiUmurInternalMouseClicked

    }//GEN-LAST:event_nilaiUmurInternalMouseClicked

    private void nilaiUmurInternalComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_nilaiUmurInternalComponentAdded

    }//GEN-LAST:event_nilaiUmurInternalComponentAdded

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
            java.util.logging.Logger.getLogger(TampilanKondisiInternal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilanKondisiInternal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilanKondisiInternal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilanKondisiInternal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TampilanKondisiInternal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox bUsahaCBInternal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox jenisKelaminCBInternal;
    private javax.swing.JCheckBox levelCBInternal;
    private javax.swing.JCheckBox lokasiCBInternal;
    public javax.swing.JButton nextButton;
    private javax.swing.JTextField nilaiJenisKelaminInternal;
    private javax.swing.JTextField nilaiLevelInternal;
    private javax.swing.JTextField nilaiLokasiInternal;
    private javax.swing.JTextField nilaiPendapatanInternal;
    private javax.swing.JTextField nilaiPendidikanInternal;
    private javax.swing.JTextField nilaiUmurInternal;
    private javax.swing.JTextField nilaiUsahaInternal;
    private javax.swing.JCheckBox pendapatanCBInternal;
    private javax.swing.JCheckBox pendidikanCBInternal;
    private javax.swing.JCheckBox umurCBInternal;
    // End of variables declaration//GEN-END:variables
}
