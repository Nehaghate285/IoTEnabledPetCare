/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PetOwnerRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PetOwnerOrganization;
import Business.PetOnly.Testimonial;
import Business.Pets.Pet;
import Business.Role.AdminRole;
import Business.Role.PetOwnerRole;
import Business.UserAccount.UserAccount;
import Business.Validator.Validator;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Neha Ghate
 */
public class AddTestimonialJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddTestimonialJPanel
     */
    private JPanel userProcessContainer;
    private PetOwnerOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Organization org;
    private AdminRole ar;
    ArrayList<UserAccount> userAccountList;

    public AddTestimonialJPanel(JPanel userProcessContainer, UserAccount userAccount, PetOwnerOrganization petOwnerOrganization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = petOwnerOrganization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        populatePetsComboBox();
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) testimonialjTable.getModel();
        userAccountList = enterprise.getUserAccountDirectory().getUserAccountList();
        for (UserAccount ua : userAccountList) {
            ar = (AdminRole) ua.getRole();
        }
        model.setRowCount(0);
        for (Testimonial testimonial : ar.getTestimonial()) {
            Object[] row = new Object[2];
            row[0] = testimonial.getPet().getPetName();
            row[1] = testimonial.getTestimonialMessage();
            model.addRow(row);
        }
    }

    public void populatePetsComboBox() {

        petsComboBox.removeAllItems();
        PetOwnerRole petRole = (PetOwnerRole) userAccount.getRole();
        for (Pet pet : petRole.getPetDirectory().getPetList()) {
            petsComboBox.addItem(pet);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        petsComboBox = new javax.swing.JComboBox();
        addTestimonialJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        testimonialjTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Testimonial:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setText("Write Reviews");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("List of Pets:");

        petsComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        petsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petsComboBoxActionPerformed(evt);
            }
        });

        addTestimonialJButton.setText("Add Testimonial");
        addTestimonialJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTestimonialJButtonActionPerformed(evt);
            }
        });

        testimonialjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Pet Name", "Testimonial"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(testimonialjTable);

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
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(petsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(backJButton)
                        .addGap(39, 39, 39)
                        .addComponent(addTestimonialJButton)))
                .addContainerGap(450, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(petsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(73, 73, 73)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addTestimonialJButton)
                    .addComponent(backJButton))
                .addGap(221, 221, 221))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void petsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petsComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_petsComboBoxActionPerformed

    private void addTestimonialJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTestimonialJButtonActionPerformed
        // TODO add your handling code here:
        Pet selectedPet = (Pet) petsComboBox.getSelectedItem();
        String message = jTextArea1.getText();
        userAccountList = enterprise.getUserAccountDirectory().getUserAccountList();
        for (UserAccount ua : userAccountList) {
            ar = (AdminRole) ua.getRole();
        }
        if (Validator.isStringValid(message)) {
            Testimonial testimonial = new Testimonial();
            testimonial.setPet(selectedPet);
            testimonial.setTestimonialMessage(message);
            ar.addTestimonial(testimonial);
            JOptionPane.showMessageDialog(null, "Testimonial is added", "Result Addition", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Testimonial cannot be empty", "Empty file", JOptionPane.WARNING_MESSAGE);
        }
        
         populateTable();
    }//GEN-LAST:event_addTestimonialJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTestimonialJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox petsComboBox;
    private javax.swing.JTable testimonialjTable;
    // End of variables declaration//GEN-END:variables
}
