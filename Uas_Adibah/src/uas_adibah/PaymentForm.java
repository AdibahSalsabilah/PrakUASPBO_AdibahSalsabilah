/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package uas_adibah;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class PaymentForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form paymentForm
     */
    public PaymentForm() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        orderNameTxt = new javax.swing.JTextField();
        priceLandTxt = new javax.swing.JTextField();
        areaCombobox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t36RadioButton = new javax.swing.JRadioButton();
        t45RadioButton = new javax.swing.JRadioButton();
        t54RadioButton = new javax.swing.JRadioButton();
        buildingPriceTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        largeLandTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        availableLandTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        totalPriceTxt = new javax.swing.JTextField();
        DPTxt = new javax.swing.JTextField();
        instalmentAmountTxt = new javax.swing.JTextField();
        ppnTxt = new javax.swing.JTextField();
        instalmentMonthTxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        agreementCbx = new javax.swing.JCheckBox();
        processButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setTitle("FORM PENJUALAN");

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 204));
        jLabel1.setText("Nama Pemesan");

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 204));
        jLabel2.setText("Harga Tanah");

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 204));
        jLabel3.setText("Area");

        priceLandTxt.setEditable(false);
        priceLandTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        priceLandTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceLandTxtActionPerformed(evt);
            }
        });

        areaCombobox.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        areaCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH", "BUGENVILE", "MELATI ", "FLAMBOYAN" }));
        areaCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaComboboxActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas_adibah/Gambar WhatsApp 2024-01-07 pukul 14.31.08_99031a56.jpg"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 204));
        jLabel5.setText("Harga Bangunan");

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 204));
        jLabel6.setText("Tipe Rumah");

        buttonGroup1.add(t36RadioButton);
        t36RadioButton.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        t36RadioButton.setForeground(new java.awt.Color(255, 51, 204));
        t36RadioButton.setText("Tipe - 36");
        t36RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t36RadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(t45RadioButton);
        t45RadioButton.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        t45RadioButton.setForeground(new java.awt.Color(255, 51, 204));
        t45RadioButton.setText("Tipe - 45");
        t45RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t45RadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(t54RadioButton);
        t54RadioButton.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        t54RadioButton.setForeground(new java.awt.Color(255, 51, 204));
        t54RadioButton.setText("Tipe - 54");
        t54RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t54RadioButtonActionPerformed(evt);
            }
        });

        buildingPriceTxt.setEditable(false);
        buildingPriceTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        buildingPriceTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buildingPriceTxtActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        jLabel7.setText("Luas Tanah Asli");

        largeLandTxt.setEditable(false);
        largeLandTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        largeLandTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                largeLandTxtActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        jLabel8.setText("Luas Tanah Tersedia");

        availableLandTxt.setEditable(false);
        availableLandTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        availableLandTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableLandTxtActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 204));
        jLabel9.setText("Harga");

        jLabel10.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 204));
        jLabel10.setText("DP");

        jLabel11.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 204));
        jLabel11.setText("Lama Cicilan");

        jLabel12.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 204));
        jLabel12.setText("PPn (10%)");

        jLabel13.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 204));
        jLabel13.setText("Cicilan / Bulan");

        totalPriceTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        DPTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        instalmentAmountTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        instalmentAmountTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instalmentAmountTxtActionPerformed(evt);
            }
        });

        ppnTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        instalmentMonthTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel14.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 204));
        jLabel14.setText("Bulan");

        agreementCbx.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        agreementCbx.setText("Setuju");
        agreementCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreementCbxActionPerformed(evt);
            }
        });

        processButton.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        processButton.setText("PROSES");
        processButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processButtonActionPerformed(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        saveButton.setText("SIMPAN");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        deleteButton.setText("HAPUS");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(orderNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(priceLandTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(areaCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(t54RadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(t45RadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(t36RadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(processButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(instalmentMonthTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(agreementCbx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ppnTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(instalmentAmountTxt)
                                    .addComponent(DPTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(buildingPriceTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(largeLandTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(availableLandTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalPriceTxt, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(15, 15, 15)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(orderNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(buildingPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(priceLandTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(areaCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t36RadioButton)
                    .addComponent(largeLandTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t45RadioButton)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t54RadioButton)
                            .addComponent(availableLandTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(totalPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(DPTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(instalmentAmountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(ppnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(instalmentMonthTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agreementCbx))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processButton)
                    .addComponent(saveButton)
                    .addComponent(deleteButton))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void priceLandTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceLandTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceLandTxtActionPerformed

    private void t36RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t36RadioButtonActionPerformed
        if(areaCombobox.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Pilih area terlebih dahulu");
            buttonGroup1.clearSelection();
        }else {
            largeLandTxt.setText("90");
            availableLandTxt.setText("54");
            long landPrice = Long.parseLong(priceLandTxt.getText()),
                    buildingPrice = Long.parseLong(buildingPriceTxt.getText()),
                    availableland = Long.parseLong(availableLandTxt.getText()),
                    totalPrice;
            totalPrice = (availableland * landPrice) + buildingPrice;
            totalPriceTxt.setText("" + totalPrice);
            
            instalmentAmountTxt.setText("");
            DPTxt.setText("");
            ppnTxt.setText("");
            instalmentMonthTxt.setText("");
        }
    }//GEN-LAST:event_t36RadioButtonActionPerformed

    private void t45RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t45RadioButtonActionPerformed
        if(areaCombobox.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Pilih area terlebih dahulu");
            buttonGroup1.clearSelection();
        }else {
            largeLandTxt.setText("120");
            availableLandTxt.setText("75");
            long landPrice = Long.parseLong(priceLandTxt.getText()),
                    buildingPrice = Long.parseLong(buildingPriceTxt.getText()),
                    availableland = Long.parseLong(availableLandTxt.getText()),
                    totalPrice;
            totalPrice = (availableland * landPrice) + buildingPrice;
            totalPriceTxt.setText("" + totalPrice);
            
            instalmentAmountTxt.setText("");
            DPTxt.setText("");
            ppnTxt.setText("");
            instalmentMonthTxt.setText("");
        }
    }//GEN-LAST:event_t45RadioButtonActionPerformed

    private void buildingPriceTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buildingPriceTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buildingPriceTxtActionPerformed

    private void largeLandTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_largeLandTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_largeLandTxtActionPerformed

    private void availableLandTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableLandTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availableLandTxtActionPerformed

    private void instalmentAmountTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instalmentAmountTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_instalmentAmountTxtActionPerformed

    private void areaComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaComboboxActionPerformed
        switch (areaCombobox.getSelectedIndex()){
            case 0:
                priceLandTxt.setText("");
                buildingPriceTxt.setText("");
                buttonGroup1.clearSelection();
                largeLandTxt.setText("");
                availableLandTxt.setText("");
                totalPriceTxt.setText("");
                DPTxt.setText("");
                instalmentAmountTxt.setText("");
                instalmentMonthTxt.setText("");
                ppnTxt.setText("");
                agreementCbx.setSelected(false);
                break;
            
            case 1:
                priceLandTxt.setText("500000");
                buildingPriceTxt.setText("90000000");
                buttonGroup1.clearSelection();
                largeLandTxt.setText("");
                availableLandTxt.setText("");
                totalPriceTxt.setText("");
                DPTxt.setText("");
                instalmentAmountTxt.setText("");
                instalmentMonthTxt.setText("");
                ppnTxt.setText("");
                agreementCbx.setSelected(false);
                break;
                
            case 2:
                priceLandTxt.setText("600000");
                buildingPriceTxt.setText("120000000");
                buttonGroup1.clearSelection();
                largeLandTxt.setText("");
                availableLandTxt.setText("");
                totalPriceTxt.setText("");
                DPTxt.setText("");
                instalmentAmountTxt.setText("");
                instalmentMonthTxt.setText("");
                ppnTxt.setText("");
                agreementCbx.setSelected(false);
                break;
                
            default:
                priceLandTxt.setText("700000");
                buildingPriceTxt.setText("150000000");
                buttonGroup1.clearSelection();
                largeLandTxt.setText("");
                availableLandTxt.setText("");
                totalPriceTxt.setText("");
                DPTxt.setText("");
                instalmentAmountTxt.setText("");
                instalmentMonthTxt.setText("");
                ppnTxt.setText("");
                agreementCbx.setSelected(false);
                break;
                
        }
    }//GEN-LAST:event_areaComboboxActionPerformed

    private void t54RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t54RadioButtonActionPerformed
        if(areaCombobox.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Pilih area terlebih dahulu");
            buttonGroup1.clearSelection();
        }else {
            largeLandTxt.setText("140");
            availableLandTxt.setText("86");
            long landPrice = Long.parseLong(priceLandTxt.getText()),
                    buildingPrice = Long.parseLong(buildingPriceTxt.getText()),
                    availableland = Long.parseLong(availableLandTxt.getText()),
                    totalPrice;
            totalPrice = (availableland * landPrice) + buildingPrice;
            totalPriceTxt.setText("" + totalPrice);
            
            instalmentAmountTxt.setText("");
            DPTxt.setText("");
            ppnTxt.setText("");
            instalmentMonthTxt.setText("");
        }
    }//GEN-LAST:event_t54RadioButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        orderNameTxt.setText("");
        priceLandTxt.setText("");
        buildingPriceTxt.setText("");
        largeLandTxt.setText("");
        availableLandTxt.setText("");
        totalPriceTxt.setText("");
        DPTxt.setText("");
        instalmentAmountTxt.setText("");
        instalmentMonthTxt.setText("");
        ppnTxt.setText("");
        areaCombobox.setSelectedIndex(0);
        buttonGroup1.clearSelection();
        agreementCbx.setSelected(false);
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void processButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processButtonActionPerformed
        if(totalPriceTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Pilihan Belum Lengkap");
        }else if(DPTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "DP harus diisi");
        }else if(instalmentAmountTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Isi jumlah cicilan yang diinginkan");
        }else {
            long landPrice = Long.parseLong(priceLandTxt.getText()),
                    buildingPrice = Long.parseLong(buildingPriceTxt.getText()),
                    availableland = Long.parseLong(availableLandTxt.getText()),
                    dp = Long.parseLong(DPTxt.getText());
            long instalmentAmount = Long.parseLong(instalmentAmountTxt.getText());
            long totalPrice, ppn, instalmentPerMonth;
            totalPrice = (availableland * landPrice) + buildingPrice;
            ppn = totalPrice * 10 / 100;
            instalmentPerMonth = (totalPrice + ppn) / instalmentAmount;
            ppnTxt.setText("" + ppn);
            instalmentMonthTxt.setText("" + instalmentPerMonth);
                
                    
                   

                    
                    
                    
                    
        }
    }//GEN-LAST:event_processButtonActionPerformed

    private void agreementCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreementCbxActionPerformed
        if(orderNameTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Nama pemesan harus diisi");
            agreementCbx.setSelected(false);
        } else if (ppnTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "tekan tombol proses terlebih dahulu");
            agreementCbx.setSelected(false);
        } else if (agreementCbx.isSelected() == true){
            JOptionPane.showMessageDialog(null,"Pemesan menyetujui");
            agreementCbx.setSelected(true);
        } else {
            JOptionPane.showMessageDialog(null,"Pesanan belum disetujui");
            agreementCbx.setSelected(false);
        }
    }//GEN-LAST:event_agreementCbxActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if(agreementCbx.isSelected() ==false){
            JOptionPane.showMessageDialog(null, 
                    "Klik centang chechkbox untuk simpan data", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            String typeHouse;
            if ( t36RadioButton.isSelected()){
                typeHouse = "TIPE 36";
            } else if (t45RadioButton.isSelected()){
                typeHouse = "TIPE 45";
            } else {
                typeHouse = "TIPE 54";
            }
            
            
            try {
                String sql = "INSERT INTO rumahh (Nama, Area, Tipe, Luas, Harga, Jumlah_cicilan, Cicilan_bulan) VALUES ('"
                        + orderNameTxt.getText() + "','"
                        + areaCombobox.getSelectedItem() + "','"
                        + typeHouse +"','"
                        + largeLandTxt.getText() + "','"
                        + totalPriceTxt.getText() +"','"
                        + instalmentAmountTxt.getText() + "','"
                        + instalmentMonthTxt.getText() + "')";                
                Connection conn = (Connection)ConnectionDb.connectionDatabase();
                PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
                 pst.execute();
            } catch (SQLException ex) {
                Logger.getLogger(PaymentForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            OptionMenu optionMenu = new OptionMenu();
            optionMenu.setVisible(true);
            this.getDesktopPane().add(optionMenu);
            this.dispose();
            
        }
    }//GEN-LAST:event_saveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DPTxt;
    private javax.swing.JCheckBox agreementCbx;
    private javax.swing.JComboBox<String> areaCombobox;
    private javax.swing.JTextField availableLandTxt;
    private javax.swing.JTextField buildingPriceTxt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField instalmentAmountTxt;
    private javax.swing.JTextField instalmentMonthTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField largeLandTxt;
    private javax.swing.JTextField orderNameTxt;
    private javax.swing.JTextField ppnTxt;
    private javax.swing.JTextField priceLandTxt;
    private javax.swing.JButton processButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JRadioButton t36RadioButton;
    private javax.swing.JRadioButton t45RadioButton;
    private javax.swing.JRadioButton t54RadioButton;
    private javax.swing.JTextField totalPriceTxt;
    // End of variables declaration//GEN-END:variables
}
