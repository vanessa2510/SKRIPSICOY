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
    //double[] kumpulanNilaiPF = {2.53, 3.92, 3.29, 3.45}; // Nilai dari GEM 2013
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
        jLabel12 = new javax.swing.JLabel();
        nilaiKeterbukaanPasar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        nilaiInfrastrukturKomersial = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        nilaiTransferPenelitian = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        nilaiPendidikanSMK = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        nilaiPendidikanSDSMP = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        nilaiKPPajak = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        nilaiKPEkonomi = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        nilaiKeuanganKewirausahaan = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("SIMULATOR ECA");

        jLabel2.setText("Parameter Setting Kondisi Eksternal :");

        jLabel3.setText("Faktor Publik :");

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

        jLabel12.setText("Keterbukaan Pasar : ");

        nilaiKeterbukaanPasar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilaiKeterbukaanPasarActionPerformed(evt);
            }
        });

        jLabel13.setText("%");

        jLabel15.setText("Infrastruktur Komersial dan legal : ");

        nilaiInfrastrukturKomersial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilaiInfrastrukturKomersialActionPerformed(evt);
            }
        });

        jLabel16.setText("%");

        jLabel17.setText("Transfer Penelitian dan Pengembangan : ");

        jLabel18.setText("%");

        jLabel19.setText("Pendidikan Kewirausahaan pada SMK, profesional dan universitas : ");

        jLabel20.setText("%");

        jLabel21.setText("Pendidikan Kewirausahaan pada SD dan SMP :");

        nilaiPendidikanSDSMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilaiPendidikanSDSMPActionPerformed(evt);
            }
        });

        jLabel22.setText("%");

        jLabel23.setText("Kebijakan Pemerintah terkait Pajak :");

        jLabel24.setText("%");

        jLabel25.setText("Kebijakan Pemerintah terkait Ekonomi :");

        jLabel26.setText("%");

        jLabel27.setText("Keuangan terkait Kewirausahaan :");

        jLabel28.setText("%");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextButton)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(backButton))
                                .addGap(18, 18, 18)
                                .addComponent(nilaiIFA, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(nilaiNSB, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nilaiKeterbukaanPasar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13))
                            .addComponent(jLabel14)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(nilaiDP, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nilaiInfrastrukturKomersial, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nilaiTransferPenelitian, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nilaiPP, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nilaiPendidikanSDSMP, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nilaiPendidikanSMK, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel20))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nilaiKPPajak, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nilaiKPEkonomi, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nilaiKeuanganKewirausahaan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel28))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(87, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(nilaiKeuanganKewirausahaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(nilaiKPEkonomi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(nilaiKPPajak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nilaiPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(nilaiPendidikanSDSMP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(nilaiPendidikanSMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(nilaiTransferPenelitian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nilaiInfrastrukturKomersial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nilaiDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(nilaiKeterbukaanPasar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nilaiIFA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nilaiNSB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(35, 35, 35)
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


    }//GEN-LAST:event_nextButtonActionPerformed

    private void nilaiPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaiPPActionPerformed
        // TODO add your handling code here:
        String masukanPP = nilaiPP.getText();
        bobotPF[0] = Double.parseDouble(masukanPP);
        pf.setWeights(bobotPF);
    }//GEN-LAST:event_nilaiPPActionPerformed

    private void nilaiDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaiDPActionPerformed
        // TODO add your handling code here:
        String masukanDP = nilaiDP.getText();
        bobotPF[1] = Double.parseDouble(masukanDP);
        pf.setWeights(bobotPF);
    }//GEN-LAST:event_nilaiDPActionPerformed

    private void nilaiNSBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaiNSBActionPerformed
        // TODO add your handling code here:
        String masukanNSB = nilaiNSB.getText();
        bobotPF[2] = Double.parseDouble(masukanNSB);
        pf.setWeights(bobotPF);
    }//GEN-LAST:event_nilaiNSBActionPerformed

    private void nilaiIFAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaiIFAActionPerformed
        String masukanIFA = nilaiPP.getText();
        bobotPF[3] = Double.parseDouble(masukanIFA);
        pf.setWeights(bobotPF);
    }//GEN-LAST:event_nilaiIFAActionPerformed

    private void nextButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonMouseClicked
        boolean checker = true;
//        String isiNilaiDP;
//        String isiNilaiIFA;
//        String isiNilaiNSB;
//        String isiNilaiPP;
//        double isiNilaiKK = 0.0;
//        double isiNilaiIK = 0.0;
//        double isiNilaiKPE = 0.0;
//        double isiNilaiKPP = 0.0;
//        double isiNilaiKP = 0.0;
//        double isiNilaiPSS = 0.0;
//        double isiNilaiPS = 0.0;
//        double isiNilaiTP = 0.0;
        double[] kumpulanNilaiPF = new double[12];
//        double isiNilaiDP = 0.0;
//        double isiNilaiIFA = 0.0;
//        double isiNilaiNSB = 0.0;
//        double isiNilaiPP = 0.0;
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
        } else if (nilaiInfrastrukturKomersial.getText().equals("")) {
            InputDataHandler.inputDataEksternal("InfrastrukturKomersial", null);
            checker = false;
        } else if (nilaiKPEkonomi.getText().equals("")) {
            InputDataHandler.inputDataEksternal("NilaiKPEkonomi", null);
            checker = false;
        } else if (nilaiKPPajak.getText().equals("")) {
            InputDataHandler.inputDataEksternal("nilaiKPPajak", null);
            checker = false;
        } else if (nilaiKeterbukaanPasar.getText().equals("")) {
            InputDataHandler.inputDataEksternal("nilaiKeterbukaanPasar", null);
            checker = false;
        } else if (nilaiKeuanganKewirausahaan.getText().equals("")) {
            InputDataHandler.inputDataEksternal("nilaiKeuanganKewirausahaan", null);
            checker = false;
        } else if (nilaiPendidikanSDSMP.getText().equals("")) {
            InputDataHandler.inputDataEksternal("nilaiPendidikanSDSMP", null);
            checker = false;
        } else if (nilaiPendidikanSMK.getText().equals("")) {
            InputDataHandler.inputDataEksternal("nilaiPendidikanSMK", null);
            checker = false;
        } else if (nilaiTransferPenelitian.getText().equals("")) {
            InputDataHandler.inputDataEksternal("nilaiTransferPenelitian", null);
            checker = false;
        } else {
            if (!nilaiKeuanganKewirausahaan.equals("")) {
                InputDataHandler.inputDataEksternal("nilaiKeuanganKewirausahaan", nilaiKeuanganKewirausahaan.getText());
//                isiNilaiKK = InputDataHandler.getValue("nilaiKeuanganKewirausahaan");
                kumpulanNilaiPF[0] = Double.parseDouble(InputDataHandler.getValue("nilaiKeuanganKewirausahaan"));
                if (!nilaiKPEkonomi.getText().equals("")) {
                    InputDataHandler.inputDataEksternal("nilaiKPEkonomi", nilaiKPEkonomi.getText());
//                    isiNilaiKPE = InputDataHandler.getValue("nilaiKPEkonomi");
                    kumpulanNilaiPF[1] = Double.parseDouble(InputDataHandler.getValue("nilaiKPEkonomi"));
                    if (!nilaiKPPajak.getText().equals("")) {
                        InputDataHandler.inputDataEksternal("nilaiKPPajak", nilaiKPPajak.getText());
//                        isiNilaiKPP = InputDataHandler.getValue("nilaiKPPajak");
                        kumpulanNilaiPF[2] = Double.parseDouble(InputDataHandler.getValue("nilaiKPPajak"));
                        if (!nilaiPP.getText().equals("")) {
                            InputDataHandler.inputDataEksternal("ProgramPemerintah", nilaiPP.getText());
//                            isiNilaiPP = InputDataHandler.getValue("ProgramPemerintah");
                            kumpulanNilaiPF[3] = Double.parseDouble(InputDataHandler.getValue("ProgramPemerintah"));

                            if (!nilaiPendidikanSDSMP.getText().equals("")) {
                                InputDataHandler.inputDataEksternal("nilaiPendidikanSDSMP", nilaiPendidikanSDSMP.getText());
//                                isiNilaiPSS = InputDataHandler.getValue("nilaiPendidikanSDSMP");
                                kumpulanNilaiPF[4] = Double.parseDouble(InputDataHandler.getValue("nilaiPendidikanSDSMP"));
                                if (!nilaiPendidikanSMK.getText().equals("")) {
                                    InputDataHandler.inputDataEksternal("nilaiPendidikanSMK", nilaiPendidikanSMK.getText());
//                                    isiNilaiPS = InputDataHandler.getValue("nilaiPendidikanSMK");
                                    kumpulanNilaiPF[5] = Double.parseDouble(InputDataHandler.getValue("nilaiPendidikanSMK"));

                                    if (!nilaiTransferPenelitian.getText().equals("")) {
                                        InputDataHandler.inputDataEksternal("nilaiTransferPenelitian", nilaiTransferPenelitian.getText());
//                                        isiNilaiTP = InputDataHandler.getValue("nilaiTransferPenelitian");
                                        kumpulanNilaiPF[6] = Double.parseDouble(InputDataHandler.getValue("nilaiTransferPenelitian"));
                                        if (!nilaiInfrastrukturKomersial.getText().equals("")) {
                                            InputDataHandler.inputDataEksternal("nilaiInfrastrukturKomersial", nilaiInfrastrukturKomersial.getText());
//                                            isiNilaiIK = InputDataHandler.getValue("nilaiInfrastrukturKomersial");
                                            kumpulanNilaiPF[7] = Double.parseDouble(InputDataHandler.getValue("nilaiInfrastrukturKomersial"));
                                            if (!nilaiDP.getText().equals("")) {
                                                InputDataHandler.inputDataEksternal("DinamikaPasar", nilaiDP.getText());
//                                                isiNilaiDP = InputDataHandler.getValue("DinamikaPasar");
                                                kumpulanNilaiPF[8] = Double.parseDouble(InputDataHandler.getValue("DinamikaPasar"));
                                                if (!nilaiKeterbukaanPasar.getText().equals("")) {
                                                    InputDataHandler.inputDataEksternal("nilaiKeterbukaanPasar", nilaiKeterbukaanPasar.getText());
//                                                    isiNilaiKP = InputDataHandler.getValue("nilaiKeterbukaanPasar");
                                                    kumpulanNilaiPF[9] = Double.parseDouble(InputDataHandler.getValue("nilaiKeterbukaanPasar"));
                                                    if (!nilaiIFA.getText().equals("")) {
                                                        InputDataHandler.inputDataEksternal("InfrastrukturListrik", nilaiIFA.getText());
//                                                        isiNilaiIFA = InputDataHandler.getValue("InfrastrukturListrik");
                                                        kumpulanNilaiPF[10] = Double.parseDouble(InputDataHandler.getValue("InfrastrukturListrik"));
                                                        if (!nilaiNSB.getText().equals("")) {
                                                            InputDataHandler.inputDataEksternal("NormaSosialBudaya", nilaiNSB.getText());
//                                                            isiNilaiNSB = InputDataHandler.getValue("NormaSosialBudaya");
                                                            kumpulanNilaiPF[11] = Double.parseDouble(InputDataHandler.getValue("NormaSosialBudaya"));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }

                                }
                            }
                        }
                    }
                }
            }
        }
        if (kumpulanNilaiPF[0] + kumpulanNilaiPF[1] + kumpulanNilaiPF[2] + kumpulanNilaiPF[3] + kumpulanNilaiPF[4] + kumpulanNilaiPF[5] + kumpulanNilaiPF[6] + kumpulanNilaiPF[7] + kumpulanNilaiPF[8] + kumpulanNilaiPF[9] + kumpulanNilaiPF[10] + kumpulanNilaiPF[11]!= 100.0) {
            JOptionPane.showMessageDialog(null, "The sum of text fields must 100.0!");
            checker = false;
        }
        // System.out.println(checker);
        if (checker == true) {
            this.hide();
            TampilanDataWirausaha ks = new TampilanDataWirausaha();
            ks.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "You must fill the text field!");
        }
        InputDataHandler.setDataEksternal(kumpulanNilaiPF);
        //  System.out.println(InputDataHandler.getDataEksternal());
    }//GEN-LAST:event_nextButtonMouseClicked

    private void nilaiKeterbukaanPasarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaiKeterbukaanPasarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilaiKeterbukaanPasarActionPerformed

    private void nilaiInfrastrukturKomersialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaiInfrastrukturKomersialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilaiInfrastrukturKomersialActionPerformed

    private void nilaiPendidikanSDSMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaiPendidikanSDSMPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilaiPendidikanSDSMPActionPerformed

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
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
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
    private javax.swing.JTextField nilaiInfrastrukturKomersial;
    private javax.swing.JTextField nilaiKPEkonomi;
    private javax.swing.JTextField nilaiKPPajak;
    private javax.swing.JTextField nilaiKeterbukaanPasar;
    private javax.swing.JTextField nilaiKeuanganKewirausahaan;
    private javax.swing.JTextField nilaiNSB;
    private javax.swing.JTextField nilaiPP;
    private javax.swing.JTextField nilaiPendidikanSDSMP;
    private javax.swing.JTextField nilaiPendidikanSMK;
    private javax.swing.JTextField nilaiTransferPenelitian;
    // End of variables declaration//GEN-END:variables
}
