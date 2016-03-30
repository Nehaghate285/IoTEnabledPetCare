/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PetOwnerRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PetOwnerOrganization;
import Business.Pets.PetDirectory;
import Business.UserAccount.UserAccount;
import Business.Validator.Validator;
import Business.WorkQueue.CafeEmployeeWorkRequest;
import Business.WorkQueue.PetGiverWorkRequest;
import Business.WorkQueue.PetGroomerWorkRequest;
import Business.WorkQueue.PetTakerWorkRequest;
import Business.WorkQueue.PetWalkerWorkRequest;
import Business.WorkQueue.VetWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.WorkRequestLogic;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Neha Ghate
 */
public class PetOwnerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PetOwnerWorkAreaJPanel
     */

      private JPanel userProcessContainer;
    private PetOwnerOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private PetDirectory petDirectory;
    private Long i;
    public PetOwnerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, PetOwnerOrganization petOwnerOrganization, Enterprise enterprise,PetDirectory petDirectory) {
         initComponents();
         this.userProcessContainer = userProcessContainer;
        this.organization = petOwnerOrganization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.petDirectory = petDirectory;
        valueLabel.setText(account.getEmployee().getName());
        populateRequestTable();
        populateOrganizationComboBox();
    }

     public void populateOrganizationComboBox(){
        
        organizationComboBox.removeAllItems();
        for (Organization.Type type : Organization.Type.values()){
            if ((!type.getValue().equals(Organization.Type.Admin.getValue())) && (!type.getValue().equals(Organization.Type.PetOwner.getValue())))
            {
            if(type.getValue().equals(Organization.Type.PetGiver.getValue()))
                organizationComboBox.addItem(type);
           else if(type.getValue().equals(Organization.Type.PetTaker.getValue()))
                organizationComboBox.addItem(type);
           else if(type.getValue().equals(Organization.Type.PetGroomer.getValue()))
                organizationComboBox.addItem(type);
           else if(type.getValue().equals(Organization.Type.Vet.getValue()))
                organizationComboBox.addItem(type);
           else if(type.getValue().equals(Organization.Type.PetWalker.getValue()))
                organizationComboBox.addItem(type);
           
            }
        }
    }
      public void populateRequestTable() {
 DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[2] = request.getStatus();
            Date d1 =  request.getResolveDate();
            Date d2 = request.getRequestDate();
            if(d1!=null){
            row[3] = Validator.getDifferenceDays(d1, d2) + " mins";
            }
            else
             row[3] = i == null ? "Waiting" : i;
            
            row[4] = request.getPet().getPetName() == null ? "Not Applicable" : request.getPet().getPetName();
           // String result = ((PetGiverWorkRequest) request).getTestResult();
          //  String result = null;
            //row[3] = result == null ? "Waiting" : result;
            
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        requestTestJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        viewRequestButton = new javax.swing.JButton();
        organizationComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Resolved in(Time)", "For Pet"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        requestTestJButton.setText("Request Test");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        valueLabel.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(0, 102, 102));
        valueLabel.setText("<value>");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Details of Request");

        viewRequestButton.setText("View Request");
        viewRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequestButtonActionPerformed(evt);
            }
        });

        organizationComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Type of Request");

        backJButton.setText("<<Back");
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
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175)
                        .addComponent(requestTestJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(refreshTestJButton)
                        .addGap(97, 97, 97))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(16, 16, 16)
                                .addComponent(organizationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(viewRequestButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(backJButton)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(refreshTestJButton)
                            .addComponent(requestTestJButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewRequestButton)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(organizationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1)))
                .addGap(17, 17, 17)
                .addComponent(backJButton)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new RequestsWorkAreaJPanel(userProcessContainer, userAccount, enterprise,petDirectory));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();

    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void organizationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationComboBoxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_organizationComboBoxActionPerformed

    private void viewRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequestButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
           
            JOptionPane.showMessageDialog(null, "Please select a row . ", "No row selected", JOptionPane.WARNING_MESSAGE);
             return;
        }
          WorkRequest request1 = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
          
          Organization.Type selectedOrgType = (Organization.Type) organizationComboBox.getSelectedItem();
       try{
          
        if(selectedOrgType.equals(Organization.Type.PetWalker)){
            PetWalkerWorkRequest request =   WorkRequestLogic.getPetWalkerRequest(selectedOrgType,request1);
            String result = request.getTestResult()== null ? "Waiting" : request.getTestResult();
             jTextArea1.setText("Message details:\n" + result);
        }
        
        if(selectedOrgType.equals(Organization.Type.PetGiver)){
            PetGiverWorkRequest request =   WorkRequestLogic.getPetGiverRequest(selectedOrgType,request1);
             String result = request.getTestResult()== null ? "Waiting" : request.getTestResult();
             jTextArea1.setText("Message details:\n" + result); 
        }
         
        if(selectedOrgType.equals(Organization.Type.PetTaker)){
            PetTakerWorkRequest request =   WorkRequestLogic.getPetTakerRequest(selectedOrgType,request1);
             String result = request.getTestResult()== null ? "Waiting" : request.getTestResult();
             jTextArea1.setText("Message details:\n" + result);
        }
        
        if(selectedOrgType.equals(Organization.Type.Vet)){
            VetWorkRequest request =   WorkRequestLogic.getVetRequest(selectedOrgType,request1);
            String result = request.getTestResult()== null ? "Waiting" : request.getTestResult();
             jTextArea1.setText("Message details:\n" + result);
        }
         
        if(selectedOrgType.equals(Organization.Type.PetGroomer)){
            PetGroomerWorkRequest request =   WorkRequestLogic.getPetGroomerRequest(selectedOrgType,request1);
            String result = request.getTestResult()== null ? "Waiting" : request.getTestResult();
             jTextArea1.setText("Message details:\n" + result);
        }
        
        if(selectedOrgType.equals(Organization.Type.CafeEmployee)){
            CafeEmployeeWorkRequest request =   WorkRequestLogic.getCafeEmployeeWorkRequest(selectedOrgType,request1);
             String result = request.getTestResult()== null ? "Waiting" : request.getTestResult();
             jTextArea1.setText("Message details:\n" + result);
        }
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, "Please select correct Request Type . ", "Incorrect Request", JOptionPane.WARNING_MESSAGE);
       }
        
    }//GEN-LAST:event_viewRequestButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PetOwnerDashboardJPanel petOwnerDashboardJPanel = (PetOwnerDashboardJPanel) component;
        petOwnerDashboardJPanel.showDetails();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox organizationComboBox;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JButton viewRequestButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

  
}