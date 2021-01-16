/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author krishchandarana
 */
public class DoctorPortal extends javax.swing.JFrame {

    private MyHashTable theMainHashTable;
    
    public void setTheMainHashTable(MyHashTable theRefValueHT){
        theMainHashTable = theRefValueHT;
    }
    
    public DoctorPortal() {
        initComponents();
        SpecificEmployeePanel.setVisible(false);
        searchPanel.setVisible(false);
        InncorectPassword.setVisible(false);
        noEmployeeFound3.setVisible(false);
        FirstName.setEditable(false);
        LastName.setEditable(false);
        Gender.setEditable(false);
        Allergies.setEditable(false);
        MedicalConditions.setEditable(false);
        DateOfBirth.setEditable(false);
        SecurityKey.setEditable(false);
        jPanel7.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        LogIn4 = new javax.swing.JButton();
        InncorectPassword = new javax.swing.JLabel();
        userInput = new javax.swing.JPasswordField();
        showPassword = new javax.swing.JCheckBox();
        ExitProgramFully = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        searchPanel = new javax.swing.JPanel();
        userInput4 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        DisplayEmployee3 = new javax.swing.JButton();
        ExitProgram3 = new javax.swing.JButton();
        noEmployeeFound3 = new javax.swing.JLabel();
        SpecificEmployeePanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        FirstName = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        LastName = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Gender = new javax.swing.JTextField();
        DateOfBirth = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        PTEPanel = new javax.swing.JPanel();
        SecurityKey = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        MedicalConditions = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Allergies = new javax.swing.JTextArea();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        jPanel7.setBackground(new java.awt.Color(204, 255, 255));

        LogIn4.setBackground(new java.awt.Color(255, 255, 255));
        LogIn4.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        LogIn4.setText("Log In");
        LogIn4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 99, 71), 1, true));
        LogIn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogIn4ActionPerformed(evt);
            }
        });

        InncorectPassword.setBackground(new java.awt.Color(255, 255, 255));
        InncorectPassword.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        InncorectPassword.setText("**Wrong Password!**");

        showPassword.setText("Show Password");
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });

        ExitProgramFully.setBackground(new java.awt.Color(255, 255, 255));
        ExitProgramFully.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        ExitProgramFully.setText("Exit");
        ExitProgramFully.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 99, 71), 1, true));
        ExitProgramFully.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitProgramFullyActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel13.setText("Enter The Doctor Password Below:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InncorectPassword)
                    .addComponent(jLabel13)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(userInput, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showPassword))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(LogIn4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ExitProgramFully, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExitProgramFully, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(LogIn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InncorectPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        searchPanel.setBackground(new java.awt.Color(204, 255, 255));
        searchPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        userInput4.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel27.setText("Enter Patient Number Below:");

        DisplayEmployee3.setBackground(new java.awt.Color(255, 255, 255));
        DisplayEmployee3.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        DisplayEmployee3.setText("Display Employee");
        DisplayEmployee3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 99, 71), 1, true));
        DisplayEmployee3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayEmployee3ActionPerformed(evt);
            }
        });

        ExitProgram3.setBackground(new java.awt.Color(255, 255, 255));
        ExitProgram3.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        ExitProgram3.setText("Back");
        ExitProgram3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 99, 71), 1, true));
        ExitProgram3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitProgram3ActionPerformed(evt);
            }
        });

        noEmployeeFound3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        noEmployeeFound3.setText("*CANNOT FIND EMPLOYEE*");

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(userInput4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noEmployeeFound3)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addComponent(DisplayEmployee3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ExitProgram3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userInput4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DisplayEmployee3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitProgram3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noEmployeeFound3)
                .addGap(155, 155, 155))
        );

        SpecificEmployeePanel.setBackground(new java.awt.Color(204, 255, 255));
        SpecificEmployeePanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel16.setText("First Name:");

        FirstName.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel17.setText("Last Name:");

        LastName.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel18.setText("Gender:");

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel19.setText("Date Of Birth (DDMMYYY Format):");

        Gender.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        DateOfBirth.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel21.setText("Allergies:");

        PTEPanel.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout PTEPanelLayout = new javax.swing.GroupLayout(PTEPanel);
        PTEPanel.setLayout(PTEPanelLayout);
        PTEPanelLayout.setHorizontalGroup(
            PTEPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 752, Short.MAX_VALUE)
        );
        PTEPanelLayout.setVerticalGroup(
            PTEPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );

        SecurityKey.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel26.setText("Security Key:");

        MedicalConditions.setColumns(20);
        MedicalConditions.setRows(5);
        jScrollPane2.setViewportView(MedicalConditions);

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel24.setText("Medical Conditions:");

        Allergies.setColumns(20);
        Allergies.setRows(5);
        jScrollPane3.setViewportView(Allergies);

        javax.swing.GroupLayout SpecificEmployeePanelLayout = new javax.swing.GroupLayout(SpecificEmployeePanel);
        SpecificEmployeePanel.setLayout(SpecificEmployeePanelLayout);
        SpecificEmployeePanelLayout.setHorizontalGroup(
            SpecificEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SpecificEmployeePanelLayout.createSequentialGroup()
                .addComponent(PTEPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(SpecificEmployeePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SpecificEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, SpecificEmployeePanelLayout.createSequentialGroup()
                        .addGroup(SpecificEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(SpecificEmployeePanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel16)))
                        .addGap(12, 12, 12)
                        .addGroup(SpecificEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(SpecificEmployeePanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel17))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, SpecificEmployeePanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel21))
                    .addComponent(SecurityKey, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, SpecificEmployeePanelLayout.createSequentialGroup()
                        .addGroup(SpecificEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SpecificEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel19)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(DateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SpecificEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(SpecificEmployeePanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SpecificEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel24)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SpecificEmployeePanelLayout.setVerticalGroup(
            SpecificEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SpecificEmployeePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SpecificEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SpecificEmployeePanelLayout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SpecificEmployeePanelLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(SpecificEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SpecificEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SpecificEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SpecificEmployeePanelLayout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SpecificEmployeePanelLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SecurityKey, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199)
                .addComponent(PTEPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(searchPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SpecificEmployeePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 492, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SpecificEmployeePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 355, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitProgramFullyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitProgramFullyActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ExitProgramFullyActionPerformed

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        // TODO add your handling code here:
        if (showPassword.isSelected()){
            userInput.setEchoChar((char) 0);
        } else{
            userInput.setEchoChar('*');
        }
    }//GEN-LAST:event_showPasswordActionPerformed

    private void LogIn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogIn4ActionPerformed
        // TODO add your handling code here:
        String Password = userInput.getText();
        if (Password.equalsIgnoreCase("hackthenorth")){
            searchPanel.setVisible(true);
            jPanel7.setVisible(false);
        } else{
            searchPanel.setVisible(false);
            jPanel7.setVisible(true);
            InncorectPassword.setVisible(true);
        }
    }//GEN-LAST:event_LogIn4ActionPerformed

    private void ExitProgram3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitProgram3ActionPerformed
        // TODO add your handling code here:
        dispose();
        theMainHashTable.saveFile("HTarchive.txt");
    }//GEN-LAST:event_ExitProgram3ActionPerformed

    private void DisplayEmployee3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayEmployee3ActionPerformed
        // TODO add your handling code here:
        if (userInput4.getText().equals("")){
            noEmployeeFound3.setVisible(true);
        }
        else{
            noEmployeeFound3.setVisible(false);
            int employeeNumber = Integer.parseInt(userInput4.getText());
            PatientInfo DisplayEmployee = theMainHashTable.searchFromTable(employeeNumber);

            if(DisplayEmployee != null){

                SpecificEmployeePanel.setVisible(true);

                FirstName.setText(DisplayEmployee.getFirstName());
                LastName.setText(DisplayEmployee.getLastName());
                DateOfBirth.setText(Integer.toString(DisplayEmployee.getDataOfBirth()));
                Gender.setText(DisplayEmployee.getGender());
                SecurityKey.setText(DisplayEmployee.getSecurityKey());
                Allergies.setText(DisplayEmployee.getAllergies());
                MedicalConditions.setText((DisplayEmployee.getMedicalConditions()));

            }
            else{
                noEmployeeFound3.setVisible(true);
            }
        }
    }//GEN-LAST:event_DisplayEmployee3ActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorPortal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Allergies;
    private javax.swing.JTextField DateOfBirth;
    private javax.swing.JButton DisplayEmployee3;
    private javax.swing.JButton ExitProgram3;
    private javax.swing.JButton ExitProgramFully;
    private javax.swing.JTextField FirstName;
    private javax.swing.JTextField Gender;
    private javax.swing.JLabel InncorectPassword;
    private javax.swing.JTextField LastName;
    private javax.swing.JButton LogIn4;
    private javax.swing.JTextArea MedicalConditions;
    private javax.swing.JPanel PTEPanel;
    private javax.swing.JTextField SecurityKey;
    private javax.swing.JPanel SpecificEmployeePanel;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel noEmployeeFound3;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JPasswordField userInput;
    private javax.swing.JTextField userInput4;
    // End of variables declaration//GEN-END:variables
}