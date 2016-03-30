/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ProcessingJPanel;

import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.SendSMS;
import Business.Validator.Validator;
import Business.WorkQueue.DoctorWorkRequest;
import Business.WorkQueue.VetWorkRequest;
import Business.WriteToFile;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.VetRole.VetWorkAreaJPanel;

/**
 *
 * @author Neha Ghate
 */
public class VetProcessJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PetGiverProcessJPanel
     */
    private JPanel userProcessContainer;
    private VetWorkRequest request;
    private Enterprise enterprise;

    public VetProcessJPanel(JPanel userProcessContainer, VetWorkRequest request, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.enterprise = enterprise;
        showDetails();
    }

    private void showDetails() {
        petDobJText.setText((String.valueOf(request.getPet().getDob())));
        petNameJText.setText(request.getPet().getPetName());
        petBreedJText.setText(request.getPet().getPetBreed());
        messageJLabel.setText(request.getMessage());
         Date dob = request.getPet().getDob();
        LocalDate start = dob.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate end = LocalDate.now(); // use for age-calculation: LocalDate.now()
        long years = ChronoUnit.YEARS.between(start, end);
        ageJText.setText(Long.toString(years));
//        BufferedImage bi = request.getPet().getPetImage();
//        petImageJLabel.setIcon(new ImageIcon(bi));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultJTextField = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        petNameJText = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        petDobJText = new javax.swing.JLabel();
        petBreedJText = new javax.swing.JLabel();
        petImageJLabel = new javax.swing.JLabel();
        jDateChooser1 = new com.lavantech.gui.comp.DateTimePicker();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ageJText = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        messageJLabel = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(204, 255, 204));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        submitJButton.setText("Submit Result");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Location and comments:");

        jLabel2.setText("Receptionist Work Area");

        resultJTextField.setColumns(20);
        resultJTextField.setRows(5);
        jScrollPane1.setViewportView(resultJTextField);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Date of Visit:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Pet Name:");

        petNameJText.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        petNameJText.setForeground(new java.awt.Color(0, 102, 102));
        petNameJText.setText("Pet Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Pet DOB:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Pet Breed:");

        petDobJText.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        petDobJText.setForeground(new java.awt.Color(0, 102, 102));
        petDobJText.setText("Pet DOB");

        petBreedJText.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        petBreedJText.setForeground(new java.awt.Color(0, 102, 102));
        petBreedJText.setText("Pet Breed");

        jDateChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDateChooser1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Message:");

        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Age:");

        ageJText.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        ageJText.setForeground(new java.awt.Color(0, 102, 102));
        ageJText.setText("jLabel7");

        messageJLabel.setEditable(false);
        messageJLabel.setColumns(20);
        messageJLabel.setRows(5);
        jScrollPane3.setViewportView(messageJLabel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(backJButton)
                        .addGap(143, 143, 143)
                        .addComponent(submitJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(petDobJText)
                                    .addComponent(petBreedJText)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(petNameJText)
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel11)
                                        .addGap(43, 43, 43)
                                        .addComponent(ageJText))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(petImageJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(petImageJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(petNameJText)
                                    .addComponent(ageJText)
                                    .addComponent(jLabel11))
                                .addGap(25, 25, 25)
                                .addComponent(petDobJText)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(petBreedJText)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel5)
                                .addGap(49, 49, 49)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel10)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(111, 111, 111))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(88, 88, 88))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitJButton)
                    .addComponent(backJButton))
                .addGap(58, 58, 58))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        VetWorkAreaJPanel dwjp = (VetWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        String result = resultJTextField.getText();
        DoctorWorkRequest doctorWorkRequest = new DoctorWorkRequest();
        if (Validator.isStringValid(result)) {
            request.setTestResult(result);
            request.setStatus("Completed");
            request.setResolveDate(new Date());
            request.setDocStatus("sent to doctor");
            if (jDateChooser1 != null) {
                doctorWorkRequest.setRequestDate(jDateChooser1.getDate());
            } else {
                JOptionPane.showMessageDialog(null, "Select a date", "Empty text field", JOptionPane.WARNING_MESSAGE);
            }
            request.setMessage(result);
            WriteToFile.getData(request.getReceiver() + " accepted the request on " + new Date());
            JOptionPane.showMessageDialog(null, "Result  is added", "Result Addition", JOptionPane.INFORMATION_MESSAGE);
            SendSMS.sendNotificationMessage(request.getSender(), request);
        } else {
            JOptionPane.showMessageDialog(null, "Test result cannot be empty", "Empty text field", JOptionPane.WARNING_MESSAGE);
        }

        //String reason = reasonJTextArea.getText();
        doctorWorkRequest.setPet(request.getPet());
        doctorWorkRequest.setSender(request.getReceiver());
        doctorWorkRequest.setStatus("Sent");

        doctorWorkRequest.setMessage(result);
        // request.setMessage(reason);
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof DoctorOrganization) {
                org = organization;
                break;

            }
        }
        org.getWorkQueue().getWorkRequestList().add(doctorWorkRequest);

    }//GEN-LAST:event_submitJButtonActionPerformed

    private void jDateChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDateChooser1ActionPerformed
        // TODO add your handling code here:
        if(jDateChooser1.getDate().before(new Date())){
            JOptionPane.showMessageDialog(null, "Enter date from today ", "Select forward date", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jDateChooser1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageJText;
    private javax.swing.JButton backJButton;
    private com.lavantech.gui.comp.DateTimePicker jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea messageJLabel;
    private javax.swing.JLabel petBreedJText;
    private javax.swing.JLabel petDobJText;
    private javax.swing.JLabel petImageJLabel;
    private javax.swing.JLabel petNameJText;
    private javax.swing.JTextArea resultJTextField;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
