/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

/**
 *
 * @author krishchandarana
 */
public class MyPersonalDoctor extends javax.swing.JFrame {

    private MyHashTable theHT;
    
    public MyPersonalDoctor() {
        initComponents();
        theHT = new MyHashTable(10); 
        
        // the archived hash table is loaded when the application starts
      
       
    }
    
    public MyHashTable getTheHashTable () {
        return theHT;
       
    }
    
    public void loadFile(String theFileLocation) throws IOException{
        PatientInfo thePatient;
        String theline;
        theHT = new MyHashTable(10);
        
        try {
            //Loads employee and reads info to add to hashtable
            BufferedReader FileArchive = new BufferedReader(new FileReader(theFileLocation));
            while(true){
                
                
                theline = FileArchive.readLine();
                String info[] = theline.split("\\*");
                // tells the program where the end of the file is
                if("^".equals(theline)){
                   break;   
                }
                
                thePatient = new PatientInfo(Integer.parseInt(info[0]), info[1], info[2], info[3], info[4], info[5], Integer.parseInt(info[6]), info[7]);
                theHT.addEmployee(thePatient);

                for (int i = 0; i< 8; i++){
                System.out.print(info[i]);
                }
                
            }
            
                        
      
        } catch (FileNotFoundException nothing) {// if there is no existing data to import
            Logger.getLogger(MyPersonalDoctor.class.getName()).log(Level.SEVERE, null, nothing);
        }
        
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
        jPanel2 = new javax.swing.JPanel();
        ExitProgram = new javax.swing.JButton();
        PatientPortal = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        DoctorPortal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel1.setText("My Personal Doctor");

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        ExitProgram.setBackground(new java.awt.Color(255, 255, 255));
        ExitProgram.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        ExitProgram.setText("Exit");
        ExitProgram.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 99, 71), 1, true));
        ExitProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitProgramActionPerformed(evt);
            }
        });

        PatientPortal.setBackground(new java.awt.Color(255, 255, 255));
        PatientPortal.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        PatientPortal.setText("Patient Portal");
        PatientPortal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 99, 71), 1, true));
        PatientPortal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientPortalActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(255, 99, 71));

        DoctorPortal.setBackground(new java.awt.Color(255, 255, 255));
        DoctorPortal.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        DoctorPortal.setText("Doctor Portal");
        DoctorPortal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 99, 71), 1, true));
        DoctorPortal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorPortalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(PatientPortal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DoctorPortal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(ExitProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PatientPortal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DoctorPortal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ExitProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitProgramActionPerformed
        // TODO add your handling code here:
        theHT.saveFile("TheArchive.txt");
        System.exit(0);
    }//GEN-LAST:event_ExitProgramActionPerformed

    private void PatientPortalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientPortalActionPerformed
        // TODO add your handling code here:
        try{//loads the archived data file
            loadFile("TheArchive.txt");
        }
        catch (IOException nothing2){//if error occurs in loading the file, means cannot load any existing data
            Logger.getLogger(MyPersonalDoctor.class.getName()).log(Level.SEVERE, null, nothing2);
        }
        PatientPortal executePatientPortal = new PatientPortal();
        executePatientPortal.setVisible(true);
        executePatientPortal.setTheMainHashTable(getTheHashTable());
    }//GEN-LAST:event_PatientPortalActionPerformed

    private void DoctorPortalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorPortalActionPerformed
        // TODO add your handling code here:
        try{//loads the archived data file
            loadFile("TheArchive.txt");
        }
        catch (IOException nothing2){//if error occurs in loading the file, means cannot load any existing data
            Logger.getLogger(MyPersonalDoctor.class.getName()).log(Level.SEVERE, null, nothing2);
        }
        DoctorPortal executeDoctorPortal = new DoctorPortal();
        executeDoctorPortal.setVisible(true);
        executeDoctorPortal.setTheMainHashTable(getTheHashTable());
    }//GEN-LAST:event_DoctorPortalActionPerformed

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
            java.util.logging.Logger.getLogger(MyPersonalDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyPersonalDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyPersonalDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyPersonalDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyPersonalDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DoctorPortal;
    private javax.swing.JButton ExitProgram;
    private javax.swing.JButton PatientPortal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
