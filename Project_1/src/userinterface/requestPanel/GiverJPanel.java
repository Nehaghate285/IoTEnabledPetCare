/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.requestPanel;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Pets.Pet;
import Business.UserAccount.UserAccount;
import Business.Validator.Validator;
import Business.WorkQueue.PetGiverWorkRequest;
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
public class GiverJPanel extends javax.swing.JPanel {

    /**
     * Creates new form GiverJPanel
     */
      private JPanel userProcessContainer;
    private PetGiverWorkRequest request;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Organization.Type selectedOrgType;
    private Pet pet;
    
    public GiverJPanel(JPanel userProcessContainer,WorkRequest request,Organization.Type selectedOrg,Pet pet,UserAccount account, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = (PetGiverWorkRequest)request;
        this.userAccount = account;
        this.selectedOrgType = selectedOrg;
        this.enterprise = enterprise;
        this.pet = pet;
        showDetails();
    }

    private void showDetails(){
        petDobJText.setText((String.valueOf(pet.getDob())));
        petNameJText.setText(pet.getPetName());
        petBreedJText.setText(pet.getPetBreed());
       // BufferedImage bi = request.getPet().getPetImage();
        //petImageJLabel.setIcon(new ImageIcon(bi));
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
        backJButton = new javax.swing.JButton();
        petNameJText = new javax.swing.JLabel();
        petDobJText = new javax.swing.JLabel();
        petBreedJText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reasonJTextArea = new javax.swing.JTextArea();
        requestTestJButton = new javax.swing.JButton();
        petImageJLabel = new javax.swing.JLabel();

        jLabel1.setText("Put pet for adoption");

        jLabel2.setText("Pet Name :");

        jLabel3.setText("Pet DOB :");

        jLabel4.setText("Pet Breed :");

        jLabel5.setText("Reason for giving away:");

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        petNameJText.setText("jLabel6");

        petDobJText.setText("jLabel6");

        petBreedJText.setText("jLabel6");

        reasonJTextArea.setColumns(20);
        reasonJTextArea.setRows(5);
        jScrollPane1.setViewportView(reasonJTextArea);

        requestTestJButton.setText("Send");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        petImageJLabel.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backJButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(petDobJText))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(petBreedJText))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(petNameJText)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                                .addComponent(petImageJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(requestTestJButton)))
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(petNameJText))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(petDobJText))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(petBreedJText))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(petImageJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(requestTestJButton)
                .addGap(3, 3, 3)
                .addComponent(backJButton)
                .addGap(52, 52, 52))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        // TODO add your handling code here:
         String reason = reasonJTextArea.getText();
        if(Validator.isStringValid(reason)){
        request.setPet(pet);
        request.setMessage(reason);

        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if(selectedOrgType.getValue().equals(organization.getName())){
                org = organization;
                break;
            }

        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }
         WriteToFile.getData(userAccount.getEmployee().getName()+" requested to give away a pet on "+new Date());
        JOptionPane.showMessageDialog(null, "Test is Requested sucessfully to "+selectedOrgType, "Request is created", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Empty Field,Enter a value ", "Empty Field", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_requestTestJButtonActionPerformed


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
    private javax.swing.JTextArea reasonJTextArea;
    private javax.swing.JButton requestTestJButton;
    // End of variables declaration//GEN-END:variables
}