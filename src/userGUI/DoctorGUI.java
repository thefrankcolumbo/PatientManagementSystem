package userGUI;

import people.Doctor;

public class DoctorGUI extends javax.swing.JFrame {

    private String userID;
    private Doctor thisUser;
    private String[] messages;
    private enum Mode
    {
        SEEMYCALENDER,
        GETLISTPFMEDICINES,
        MESSAGESECRETARY,
        CREATEAPPOINTMENT,
        ASKSECRETARYTOORDERMEDICINE,
        CREATENEMEDICINE,
        PRESCRIBEMEDICINE,
        PROPOSEAPPOINTMENT,
        MAKEPATIENTNOTES,
        BEGINNING
    }
    /**
     * Creates new form DoctorGUI
     */
    public DoctorGUI(String userID) 
    {
        thisUser = new Doctor(userID);
        initComponents();
        changeTxtBoxButtonPanel(thisUser.getMessages());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlForButtons = new javax.swing.JPanel();
        btnMakePatientNotes = new javax.swing.JButton();
        btnProposeAppointment = new javax.swing.JButton();
        btnPrescribeMedication = new javax.swing.JButton();
        btnCreateNewMedicine = new javax.swing.JButton();
        btnAskSecretaryToOrderMedicine = new javax.swing.JButton();
        btnCreateAppointment = new javax.swing.JButton();
        btnMessageSecretary = new javax.swing.JButton();
        btnGetListOfMedicines = new javax.swing.JButton();
        btnSeeMyCalender = new javax.swing.JButton();
        txtBoxButtonPanel = new javax.swing.JTextField();
        pnlUserViewingPane = new javax.swing.JPanel();
        lblDisplay01 = new javax.swing.JLabel();
        lblDisplay02 = new javax.swing.JLabel();
        lblDisplay03 = new javax.swing.JLabel();
        lblDisplay04 = new javax.swing.JLabel();
        lblDisplay05 = new javax.swing.JLabel();
        lblDisplay06 = new javax.swing.JLabel();
        lblDisplay07 = new javax.swing.JLabel();
        lblDisplay08 = new javax.swing.JLabel();
        lblDisplay09 = new javax.swing.JLabel();
        lblDisplay10 = new javax.swing.JLabel();
        btnDisplaySelect01 = new javax.swing.JButton();
        btnDisplaySelect02 = new javax.swing.JButton();
        btnDisplaySelect03 = new javax.swing.JButton();
        btnDisplaySelect04 = new javax.swing.JButton();
        btnDisplaySelect05 = new javax.swing.JButton();
        btnDisplaySelect06 = new javax.swing.JButton();
        btnDisplaySelect07 = new javax.swing.JButton();
        btnDisplaySelect08 = new javax.swing.JButton();
        btnDisplaySelect09 = new javax.swing.JButton();
        btnDisplaySelect10 = new javax.swing.JButton();
        btnDisplaySelect14 = new javax.swing.JButton();
        btnDisplaySelect13 = new javax.swing.JButton();
        btnDisplaySelect12 = new javax.swing.JButton();
        btnDisplaySelect11 = new javax.swing.JButton();
        lblDisplay11 = new javax.swing.JLabel();
        lblDisplay12 = new javax.swing.JLabel();
        lblDisplay13 = new javax.swing.JLabel();
        lblDisplay14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlForButtons.setBackground(new java.awt.Color(204, 204, 204));

        btnMakePatientNotes.setText("Make Patient Notes");

        btnProposeAppointment.setText("Propose Appointment");

        btnPrescribeMedication.setText("Prescribe Medication");

        btnCreateNewMedicine.setText("Create New Medicine");

        btnAskSecretaryToOrderMedicine.setText("Ask Secretary To order Medicine");
        btnAskSecretaryToOrderMedicine.setToolTipText("");

        btnCreateAppointment.setText("Create Appointment");
        btnCreateAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAppointmentActionPerformed(evt);
            }
        });

        btnMessageSecretary.setText("Message Secretary");
        btnMessageSecretary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMessageSecretaryActionPerformed(evt);
            }
        });

        btnGetListOfMedicines.setText("Get List Of Medicines");
        btnGetListOfMedicines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetListOfMedicinesActionPerformed(evt);
            }
        });

        btnSeeMyCalender.setText("See My Calender");
        btnSeeMyCalender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeeMyCalenderActionPerformed(evt);
            }
        });

        txtBoxButtonPanel.setText("this is text");

        javax.swing.GroupLayout pnlForButtonsLayout = new javax.swing.GroupLayout(pnlForButtons);
        pnlForButtons.setLayout(pnlForButtonsLayout);
        pnlForButtonsLayout.setHorizontalGroup(
            pnlForButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlForButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlForButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBoxButtonPanel)
                    .addComponent(btnMakePatientNotes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProposeAppointment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPrescribeMedication, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreateNewMedicine, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAskSecretaryToOrderMedicine, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreateAppointment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMessageSecretary, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGetListOfMedicines, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeeMyCalender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlForButtonsLayout.setVerticalGroup(
            pnlForButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlForButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMakePatientNotes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProposeAppointment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrescribeMedication)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreateNewMedicine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAskSecretaryToOrderMedicine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreateAppointment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMessageSecretary)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGetListOfMedicines)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSeeMyCalender)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBoxButtonPanel)
                .addContainerGap())
        );

        btnMakePatientNotes.getAccessibleContext().setAccessibleName("btnMakePatientNotes");
        btnProposeAppointment.getAccessibleContext().setAccessibleName("btnProposeAppointment");
        btnPrescribeMedication.getAccessibleContext().setAccessibleName("btnPrescribeMedication");
        btnCreateNewMedicine.getAccessibleContext().setAccessibleName("btnCreateNewMedicine");
        btnAskSecretaryToOrderMedicine.getAccessibleContext().setAccessibleName("btnAskSecretaryToOrderMedicine");
        btnCreateAppointment.getAccessibleContext().setAccessibleName("btnCreateAppointment");
        btnMessageSecretary.getAccessibleContext().setAccessibleName("btnMessageSecretary");
        btnGetListOfMedicines.getAccessibleContext().setAccessibleName("btnGetListOfMedicines");
        btnSeeMyCalender.getAccessibleContext().setAccessibleName("btnSeeMyCalender");

        pnlUserViewingPane.setBackground(new java.awt.Color(204, 204, 204));

        lblDisplay01.setForeground(new java.awt.Color(255, 255, 255));
        lblDisplay01.setText("jLabel1");
        lblDisplay01.setPreferredSize(new java.awt.Dimension(130, 35));

        lblDisplay02.setForeground(new java.awt.Color(255, 255, 255));
        lblDisplay02.setText("jLabel1");
        lblDisplay02.setPreferredSize(new java.awt.Dimension(130, 35));

        lblDisplay03.setForeground(new java.awt.Color(255, 255, 255));
        lblDisplay03.setText("jLabel1");
        lblDisplay03.setPreferredSize(new java.awt.Dimension(130, 35));

        lblDisplay04.setForeground(new java.awt.Color(255, 255, 255));
        lblDisplay04.setText("jLabel1");
        lblDisplay04.setPreferredSize(new java.awt.Dimension(130, 35));

        lblDisplay05.setForeground(new java.awt.Color(255, 255, 255));
        lblDisplay05.setText("jLabel1");
        lblDisplay05.setPreferredSize(new java.awt.Dimension(130, 35));

        lblDisplay06.setForeground(new java.awt.Color(255, 255, 255));
        lblDisplay06.setText("jLabel1");
        lblDisplay06.setPreferredSize(new java.awt.Dimension(130, 35));

        lblDisplay07.setForeground(new java.awt.Color(255, 255, 255));
        lblDisplay07.setText("jLabel1");
        lblDisplay07.setPreferredSize(new java.awt.Dimension(130, 35));

        lblDisplay08.setForeground(new java.awt.Color(255, 255, 255));
        lblDisplay08.setText("jLabel1");
        lblDisplay08.setPreferredSize(new java.awt.Dimension(130, 35));

        lblDisplay09.setForeground(new java.awt.Color(255, 255, 255));
        lblDisplay09.setText("jLabel1");
        lblDisplay09.setPreferredSize(new java.awt.Dimension(130, 35));

        lblDisplay10.setForeground(new java.awt.Color(255, 255, 255));
        lblDisplay10.setText("jLabel1");
        lblDisplay10.setPreferredSize(new java.awt.Dimension(130, 35));

        btnDisplaySelect01.setText("Select");

        btnDisplaySelect02.setText("Select");

        btnDisplaySelect03.setText("Select");

        btnDisplaySelect04.setText("Select");

        btnDisplaySelect05.setText("Select");

        btnDisplaySelect06.setText("Select");

        btnDisplaySelect07.setText("Select");

        btnDisplaySelect08.setText("Select");

        btnDisplaySelect09.setText("Select");

        btnDisplaySelect10.setText("Select");

        btnDisplaySelect14.setText("Select");

        btnDisplaySelect13.setText("Select");

        btnDisplaySelect12.setText("Select");

        btnDisplaySelect11.setText("Select");

        lblDisplay11.setForeground(new java.awt.Color(255, 255, 255));
        lblDisplay11.setText("jLabel1");
        lblDisplay11.setPreferredSize(new java.awt.Dimension(130, 35));

        lblDisplay12.setForeground(new java.awt.Color(255, 255, 255));
        lblDisplay12.setText("jLabel1");
        lblDisplay12.setPreferredSize(new java.awt.Dimension(130, 35));

        lblDisplay13.setForeground(new java.awt.Color(255, 255, 255));
        lblDisplay13.setText("jLabel1");
        lblDisplay13.setPreferredSize(new java.awt.Dimension(130, 35));

        lblDisplay14.setForeground(new java.awt.Color(255, 255, 255));
        lblDisplay14.setText("jLabel1");
        lblDisplay14.setPreferredSize(new java.awt.Dimension(130, 35));

        javax.swing.GroupLayout pnlUserViewingPaneLayout = new javax.swing.GroupLayout(pnlUserViewingPane);
        pnlUserViewingPane.setLayout(pnlUserViewingPaneLayout);
        pnlUserViewingPaneLayout.setHorizontalGroup(
            pnlUserViewingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserViewingPaneLayout.createSequentialGroup()
                .addGroup(pnlUserViewingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserViewingPaneLayout.createSequentialGroup()
                        .addGroup(pnlUserViewingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlUserViewingPaneLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(pnlUserViewingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDisplay02, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDisplay03, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDisplay04, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDisplay05, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlUserViewingPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblDisplay06, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlUserViewingPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblDisplay07, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserViewingPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlUserViewingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDisplay08, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDisplay09, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDisplay10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDisplay11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDisplay12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDisplay13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDisplay14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlUserViewingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDisplaySelect02)
                            .addComponent(btnDisplaySelect03)
                            .addComponent(btnDisplaySelect04)
                            .addComponent(btnDisplaySelect05)
                            .addComponent(btnDisplaySelect06)
                            .addComponent(btnDisplaySelect07)
                            .addComponent(btnDisplaySelect08)
                            .addComponent(btnDisplaySelect09)
                            .addComponent(btnDisplaySelect10)
                            .addComponent(btnDisplaySelect14)
                            .addComponent(btnDisplaySelect13)
                            .addComponent(btnDisplaySelect12)
                            .addComponent(btnDisplaySelect11)))
                    .addGroup(pnlUserViewingPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDisplay01, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(btnDisplaySelect01)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlUserViewingPaneLayout.setVerticalGroup(
            pnlUserViewingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserViewingPaneLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlUserViewingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDisplay01, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDisplaySelect01))
                .addGap(16, 16, 16)
                .addGroup(pnlUserViewingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDisplaySelect02)
                    .addComponent(lblDisplay02, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlUserViewingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDisplaySelect03)
                    .addComponent(lblDisplay03, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlUserViewingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDisplaySelect04)
                    .addComponent(lblDisplay04, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlUserViewingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDisplaySelect05)
                    .addComponent(lblDisplay05, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlUserViewingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDisplaySelect06)
                    .addComponent(lblDisplay06, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(pnlUserViewingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDisplaySelect07)
                    .addComponent(lblDisplay07, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(pnlUserViewingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDisplaySelect08)
                    .addComponent(lblDisplay08, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlUserViewingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDisplaySelect09)
                    .addComponent(lblDisplay09, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlUserViewingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDisplaySelect10)
                    .addComponent(lblDisplay10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlUserViewingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDisplay11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDisplaySelect11))
                .addGap(12, 12, 12)
                .addGroup(pnlUserViewingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDisplay12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDisplaySelect12))
                .addGap(12, 12, 12)
                .addGroup(pnlUserViewingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDisplay13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDisplaySelect13))
                .addGap(12, 12, 12)
                .addGroup(pnlUserViewingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDisplay14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDisplaySelect14))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlForButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlUserViewingPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(285, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlUserViewingPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlForButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlForButtons.getAccessibleContext().setAccessibleName("pnlForButtons");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeeMyCalenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeMyCalenderActionPerformed
        manageListBox(true);
        manageTextBox(false);
        changejList1(thisUser.getCalenderForSpeficDoctor
            (thisUser.getUniqueIdentifier()), "Your Calender", false);
        lblSelectableList.setText("Your Calender");
    }//GEN-LAST:event_btnSeeMyCalenderActionPerformed

    private void btnGetListOfMedicinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetListOfMedicinesActionPerformed
        managepnlUserViewingPane(false);
        manageListBox(true);
        manageTextBox(false);
        changejList1(thisUser.getMedicineList(), "List of Medicines", false);
    }//GEN-LAST:event_btnGetListOfMedicinesActionPerformed

    private void btnMessageSecretaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMessageSecretaryActionPerformed
        managepnlUserViewingPane(false);
        manageListBox(false);
        manageTextBox(true);
        btnTextBoxButtonConfirm.setText("press to send message");
        btnTextBoxButtonCancel.setText("cancel");
        lblTestInputBox.setText("Enter your message below");
    }//GEN-LAST:event_btnMessageSecretaryActionPerformed

    private void btnCreateAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAppointmentActionPerformed
        managepnlUserViewingPane(true);
        manageListBox(true);
        manageTextBox(false);
        // display calender make list selectable
        changejList1(thisUser.getCalenderForSpeficDoctor
            (thisUser.getUniqueIdentifier()), "Your Calender", true);
        // add patients make buttons selectable
        userViewingPaneLablesAndButtonControl(thisUser.getPatientPerticulars(), 
                true, "Select");
        // show confirm cancel buttons
        btnTextBoxButtonConfirm.setVisible(true);
        btnTextBoxButtonCancel.setVisible(true);
        // set confirm button to disabled
        btnTextBoxButtonConfirm.setEnabled(false);
        // make mode to click button know what to do???
    }//GEN-LAST:event_btnCreateAppointmentActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String userID) {
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
            java.util.logging.Logger.getLogger(DoctorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //System.out.println("here void run");
                //new DoctorGUI().setVisible(true);
            }
        });
    }
    
    private void manageMode(Mode mode)
    {
        switch(mode)
        {
            case SEEMYCALENDER :
                managePnlForButtonsButtons(1);
                break;
            case GETLISTPFMEDICINES:
                managePnlForButtonsButtons(2);
                break;
            case MESSAGESECRETARY:
                managePnlForButtonsButtons(3);
                break;
            case CREATEAPPOINTMENT:
                managePnlForButtonsButtons(4);
                break;
            case ASKSECRETARYTOORDERMEDICINE:
                managePnlForButtonsButtons(5);
                break;
            case CREATENEMEDICINE:
                managePnlForButtonsButtons(6);
                break;
            case PRESCRIBEMEDICINE:
                managePnlForButtonsButtons(7);
                break;
            case PROPOSEAPPOINTMENT:
                managePnlForButtonsButtons(8);
                break;
            case MAKEPATIENTNOTES:
                managePnlForButtonsButtons(9);
                break;
            case BEGINNING:
                managePnlForButtonsButtons(10);
                break;
        }
        
    }
    private void managePnlForButtonsButtons(int selection)
    {
        switch(selection)
        {
            case -1 :
                btnSeeMyCalender.setEnabled(false);
                btnGetListOfMedicines.setEnabled(false);
                btnMessageSecretary.setEnabled(false);
                btnCreateAppointment.setEnabled(false);
                btnAskSecretaryToOrderMedicine.setEnabled(false);
                btnCreateNewMedicine.setEnabled(false);
                btnPrescribeMedication.setEnabled(false);
                btnProposeAppointment.setEnabled(false);
                btnMakePatientNotes.setEnabled(false);
                break;
            case 1 :
                managePnlForButtonsButtons(-1);
                btnSeeMyCalender.setEnabled(true);
                break;
            case 2 :
                managePnlForButtonsButtons(-1);
                btnGetListOfMedicines.setEnabled(true);
                break;
            case 3 :
                managePnlForButtonsButtons(-1);
                btnMessageSecretary.setEnabled(true);
                break;
            case 4 :
                managePnlForButtonsButtons(-1);
                btnCreateAppointment.setEnabled(true);
                break;
            case 5 :
                managePnlForButtonsButtons(-1);
                btnAskSecretaryToOrderMedicine.setEnabled(true);
                break;
            case 6 :
                managePnlForButtonsButtons(-1);
                btnCreateNewMedicine.setEnabled(true);
                break;
            case 7 :
                managePnlForButtonsButtons(-1);
                btnPrescribeMedication.setEnabled(true);
                break;
            case 8 :
                managePnlForButtonsButtons(-1);
                btnProposeAppointment.setEnabled(true);
                break;
            case 9 :
                managePnlForButtonsButtons(-1);
                btnMakePatientNotes.setEnabled(true);
                break;
            case 10 :
                btnSeeMyCalender.setEnabled(true);
                btnGetListOfMedicines.setEnabled(true);
                btnMessageSecretary.setEnabled(true);
                btnCreateAppointment.setEnabled(true);
                btnAskSecretaryToOrderMedicine.setEnabled(true);
                btnCreateNewMedicine.setEnabled(true);
                btnPrescribeMedication.setEnabled(true);
                btnProposeAppointment.setEnabled(true);
                btnMakePatientNotes.setEnabled(true);
                break;
            
                
        }
    }
    
    private void userViewingPaneLablesAndButtonControl(String[] array, boolean onOrOFF, String btnText)
    {
        switch(array.length)
        {
            case 14:
                btnDisplaySelect14.setEnabled(onOrOFF);
                btnDisplaySelect14.setText(btnText);
                lblDisplay14.setText(array[13]);
            case 13:
                btnDisplaySelect13.setEnabled(onOrOFF);
                btnDisplaySelect13.setText(btnText);
                lblDisplay13.setText(array[12]);
            case 12:
                btnDisplaySelect12.setEnabled(onOrOFF);
                btnDisplaySelect12.setText(btnText);
                lblDisplay12.setText(array[11]);
            case 11:
                btnDisplaySelect11.setEnabled(onOrOFF);
                btnDisplaySelect11.setText(btnText);
                lblDisplay11.setText(array[10]);
            case 10:
                btnDisplaySelect10.setEnabled(onOrOFF);
                btnDisplaySelect10.setText(btnText);
                lblDisplay10.setText(array[9]);
            case 9:
                btnDisplaySelect09.setEnabled(onOrOFF);
                btnDisplaySelect09.setText(btnText);
                lblDisplay09.setText(array[8]);
            case 8:
                btnDisplaySelect08.setEnabled(onOrOFF);
                btnDisplaySelect08.setText(btnText);
                lblDisplay08.setText(array[7]);
            case 7:
                btnDisplaySelect07.setEnabled(onOrOFF);
                btnDisplaySelect07.setText(btnText);
                lblDisplay07.setText(array[6]);
            case 6:
                btnDisplaySelect06.setEnabled(onOrOFF);
                btnDisplaySelect06.setText(btnText);
                lblDisplay06.setText(array[5]);
            case 5:
                btnDisplaySelect05.setEnabled(onOrOFF);
                btnDisplaySelect05.setText(btnText);
                lblDisplay05.setText(array[4]);
            case 4:
                btnDisplaySelect04.setEnabled(onOrOFF);
                btnDisplaySelect04.setText(btnText);
                lblDisplay04.setText(array[3]);
            case 3:
                btnDisplaySelect03.setEnabled(onOrOFF);
                btnDisplaySelect03.setText(btnText);
                lblDisplay03.setText(array[2]);
            case 2:
                btnDisplaySelect02.setEnabled(onOrOFF);
                btnDisplaySelect02.setText(btnText);
                lblDisplay02.setText(array[1]);
            case 1:
                btnDisplaySelect01.setEnabled(onOrOFF);
                btnDisplaySelect01.setText(btnText);
                lblDisplay01.setText(array[0]);
            default:
        }
    }
    private void managepnlUserViewingPane(boolean onOrOff)
    {
        pnlUserViewingPane.setVisible(onOrOff);
    }
    private void manageTextBox(boolean onOrOff)
    {
        JtextFTextBox.setVisible(onOrOff);
        if(!onOrOff) JtextFTextBox.setText("");
        btnTextBoxButtonConfirm.setVisible(onOrOff);
        btnTextBoxButtonCancel.setVisible(onOrOff);
        lblTestInputBox.setVisible(onOrOff);
    }
    private void manageListBox (boolean onOrOff)
    {
        jList1.setVisible(onOrOff);
        txtBoxButtonPanel.setVisible(onOrOff);
    }
    private void changejList1(String[] array, String message, boolean selectableList)
    {
        lblSelectableList.setText(message);
        jList1.setListData(array);
        jList1.setEnabled(selectableList);
    }
    private void changeTxtBoxButtonPanel(String[] array)
    {
        txtBoxButtonPanel.setText(changeArrayInToString(array));
    }
    private String changeArrayInToString(String[] array)
    {
        String tempString = "";
        for (String element: array)
        {
            tempString = tempString + element + "\n";
        }
        return tempString;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAskSecretaryToOrderMedicine;
    private javax.swing.JButton btnCreateAppointment;
    private javax.swing.JButton btnCreateNewMedicine;
    private javax.swing.JButton btnDisplaySelect01;
    private javax.swing.JButton btnDisplaySelect02;
    private javax.swing.JButton btnDisplaySelect03;
    private javax.swing.JButton btnDisplaySelect04;
    private javax.swing.JButton btnDisplaySelect05;
    private javax.swing.JButton btnDisplaySelect06;
    private javax.swing.JButton btnDisplaySelect07;
    private javax.swing.JButton btnDisplaySelect08;
    private javax.swing.JButton btnDisplaySelect09;
    private javax.swing.JButton btnDisplaySelect10;
    private javax.swing.JButton btnDisplaySelect11;
    private javax.swing.JButton btnDisplaySelect12;
    private javax.swing.JButton btnDisplaySelect13;
    private javax.swing.JButton btnDisplaySelect14;
    private javax.swing.JButton btnGetListOfMedicines;
    private javax.swing.JButton btnMakePatientNotes;
    private javax.swing.JButton btnMessageSecretary;
    private javax.swing.JButton btnPrescribeMedication;
    private javax.swing.JButton btnProposeAppointment;
    private javax.swing.JButton btnSeeMyCalender;
    private javax.swing.JLabel lblDisplay01;
    private javax.swing.JLabel lblDisplay02;
    private javax.swing.JLabel lblDisplay03;
    private javax.swing.JLabel lblDisplay04;
    private javax.swing.JLabel lblDisplay05;
    private javax.swing.JLabel lblDisplay06;
    private javax.swing.JLabel lblDisplay07;
    private javax.swing.JLabel lblDisplay08;
    private javax.swing.JLabel lblDisplay09;
    private javax.swing.JLabel lblDisplay10;
    private javax.swing.JLabel lblDisplay11;
    private javax.swing.JLabel lblDisplay12;
    private javax.swing.JLabel lblDisplay13;
    private javax.swing.JLabel lblDisplay14;
    private javax.swing.JPanel pnlForButtons;
    private javax.swing.JPanel pnlUserViewingPane;
    private javax.swing.JTextField txtBoxButtonPanel;
    // End of variables declaration//GEN-END:variables
}
