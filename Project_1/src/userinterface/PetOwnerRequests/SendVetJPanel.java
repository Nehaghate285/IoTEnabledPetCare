/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PetOwnerRequests;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Pets.Pet;
import Business.UserAccount.UserAccount;
import Business.Validator.Validator;
import Business.WorkQueue.VetWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.WriteToFile;
import java.awt.CardLayout;
import java.awt.image.BufferedImage;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Neha Ghate
 */
public class SendVetJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SendVetJPanel
     */
    private JPanel userProcessContainer;
    private VetWorkRequest request;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Type selectedOrgType;
    private Pet pet;

    public SendVetJPanel(JPanel userProcessContainer, WorkRequest request, Type selectedOrg, Pet selectedPet, UserAccount account, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = (VetWorkRequest) request;
        this.userAccount = account;
        this.selectedOrgType = selectedOrg;
        this.enterprise = enterprise;
        this.pet = selectedPet;
        showDetails();
    }

    private void showDetails() {
        petDobJText.setText((String.valueOf(pet.getDob())));
        petNameJText.setText(pet.getPetName());
        petBreedJText.setText(pet.getPetBreed());
     //   BufferedImage bi = request.getPet().getPetImage();
     //   petImageJLabel.setIcon(new ImageIcon(bi));
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
        jLabel3 = new javax.swing.JLabel();
        petNameJText = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        petDobJText = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        petBreedJText = new javax.swing.JLabel();
        petImageJLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        symptonsTextArea = new javax.swing.JTextArea();
        requestTestJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));

        jLabel1.setText("Send Request to Vet");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Pet Name:");

        petNameJText.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        petNameJText.setForeground(new java.awt.Color(0, 102, 102));
        petNameJText.setText("Pet Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Pet DOB:");

        petDobJText.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        petDobJText.setForeground(new java.awt.Color(0, 102, 102));
        petDobJText.setText("Pet DOB");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Pet Breed:");

        petBreedJText.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        petBreedJText.setForeground(new java.awt.Color(0, 102, 102));
        petBreedJText.setText("Pet Breed");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Symptons:");

        symptonsTextArea.setColumns(20);
        symptonsTextArea.setRows(5);
        jScrollPane1.setViewportView(symptonsTextArea);

        requestTestJButton.setText("Request to Vet");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(petDobJText)
                            .addComponent(petBreedJText)
                            .addComponent(petNameJText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(98, 98, 98))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(petImageJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(requestTestJButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(backJButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(petNameJText)
                                .addGap(25, 25, 25)
                                .addComponent(petDobJText)
                                .addGap(29, 29, 29)
                                .addComponent(petBreedJText))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel4)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel5)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(petImageJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(backJButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(requestTestJButton)
                                .addGap(94, 94, 94))))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        String message = symptonsTextArea.getText();

        if (Validator.isStringValid(message)) {
            request.setMessage(message);
            request.setPet(pet);

            Organization org = null;
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (selectedOrgType.getValue().equals(organization.getName())) {
                    org = organization;
                    break;
                }

            }
            if (org != null) {
                org.getWorkQueue().getWorkRequestList().add(request);
                userAccount.getWorkQueue().getWorkRequestList().add(request);
            }
             WriteToFile.getData(userAccount.getEmployee().getName()+" requested an appointment for vet on "+new Date());
            JOptionPane.showMessageDialog(null, "Test is Requested sucessfully to " + selectedOrgType, "Request is created", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Empty Field,Enter a value ", "Empty Field", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel petBreedJText;
    private javax.swing.JLabel petDobJText;
    private javax.swing.JLabel petImageJLabel;
    private javax.swing.JLabel petNameJText;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTextArea symptonsTextArea;
    // End of variables declaration//GEN-END:variables
}
