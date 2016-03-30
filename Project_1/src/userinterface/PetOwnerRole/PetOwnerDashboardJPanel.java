/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PetOwnerRole;

import Business.Enterprise.Enterprise;
import Business.Organization.PetOwnerOrganization;
import Business.Pets.PetDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PetGiverWorkRequest;
import Business.WorkQueue.PetGroomerWorkRequest;
import Business.WorkQueue.PetTakerWorkRequest;
import Business.WorkQueue.PetWalkerWorkRequest;
import Business.WorkQueue.VetWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.WriteToFile;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import userinterface.Pets.AddPetsJPanel;

/**
 *
 * @author Neha Ghate
 */
public class PetOwnerDashboardJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PetOwnerDashboardJPanel
     */
    private JPanel userProcessContainer;
    private PetOwnerOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private PetDirectory petDirectory;
    private int petGiverCount = 0;
    private int petTakerCount = 0;
    private int petGroomerCount = 0;
    private int petWalkerCount = 0;
    private int petVetCount = 0;
    private static int requestNumber = 1;
    private  DefaultTableModel model;
    
    Logger logger = Logger.getLogger("myLogger");

    public PetOwnerDashboardJPanel(JPanel userProcessContainer, UserAccount account, PetOwnerOrganization petOwnerOrganization, Enterprise enterprise, PetDirectory petDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = petOwnerOrganization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.petDirectory = petDirectory;
         model = (DefaultTableModel) requestjTable.getModel();
        usernameJText.setText(account.getEmployee().getName());
        logger.log(Level.INFO, userAccount.getEmployee().getName() + " is logged in at " + new Date());
        WriteToFile.getData(userAccount.getEmployee().getName() + " is logged in at " + new Date());
        showDetails();
    }

    public void showDetails() {
        ArrayList<WorkRequest> giverList = new ArrayList();
        ArrayList<WorkRequest> giverList1 = new ArrayList();
        ArrayList<WorkRequest> giverList2 = new ArrayList();
        ArrayList<WorkRequest> giverList3 = new ArrayList();
        ArrayList<WorkRequest> giverList4 = new ArrayList();
        for (WorkRequest workRequest : userAccount.getWorkQueue().getWorkRequestList()) {
            if (workRequest instanceof PetGiverWorkRequest) {
                petGiverCount++;
                PetGiverWorkRequest petGiverWorkRequest = (PetGiverWorkRequest) workRequest;
                giverList.add(petGiverWorkRequest);

            }
            if (workRequest instanceof PetTakerWorkRequest) {
                petTakerCount++;
                PetTakerWorkRequest petTakerWorkRequest = (PetTakerWorkRequest) workRequest;
                giverList1.add(petTakerWorkRequest);
//                showTable(giverList1);
            }
            if (workRequest instanceof PetWalkerWorkRequest) {
                petWalkerCount++;
                PetWalkerWorkRequest petWalkerWorkRequest = (PetWalkerWorkRequest) workRequest;
                giverList2.add(petWalkerWorkRequest);
//                showTable(giverList2);
            }
            if (workRequest instanceof PetGroomerWorkRequest) {
                petGroomerCount++;
                PetGroomerWorkRequest petGroomerWorkRequest = (PetGroomerWorkRequest) workRequest;
                giverList3.add(petGroomerWorkRequest);
//                showTable(giverList3);
            }

            if (workRequest instanceof VetWorkRequest) {
                petVetCount++;
                VetWorkRequest vetWorkRequest = (VetWorkRequest) workRequest;
                giverList4.add(vetWorkRequest);
//                showTable(giverList4);
            }
            // model.setRowCount(0);
            requestNumber =1;

        }
        showTable(giverList);
        showTable(giverList1);
        showTable(giverList2);
        showTable(giverList3);
        showTable(giverList4);

    }

    private void showTable(ArrayList<WorkRequest> requestList) {
       
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        model.setRowCount(requestNumber - 1);
        Object[] row = new Object[6];
        row[0] = requestNumber++;

        for (WorkRequest request : requestList) {

            if (request.getStatus().equalsIgnoreCase("Completed")) {
                i++;
            }
            if (request.getStatus().equalsIgnoreCase("Pending")) {
                j++;
            }
            if (request.getStatus().equalsIgnoreCase("Processing")) {
                k++;
            }
            if (request.getStatus().equalsIgnoreCase("Sent")) {
                l++;
            }
            row[1] = i;
            row[2] = j;
            row[3] = k;
            row[4] = l;
            row[5] = requestList.size();
        }
        model.addRow(row);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageRequestsJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        usernameJText = new javax.swing.JLabel();
        GotoTestimonialsjButton = new javax.swing.JButton();
        addPetsButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestjTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(204, 255, 204));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        setPreferredSize(new java.awt.Dimension(860, 518));

        manageRequestsJButton.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        manageRequestsJButton.setForeground(new java.awt.Color(0, 102, 102));
        manageRequestsJButton.setText("Manage Requests");
        manageRequestsJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        manageRequestsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageRequestsJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("Welcome ");

        jSeparator1.setBackground(new java.awt.Color(0, 153, 102));
        jSeparator1.setForeground(new java.awt.Color(0, 153, 102));

        usernameJText.setFont(new java.awt.Font("Segoe UI Semilight", 3, 18)); // NOI18N
        usernameJText.setForeground(new java.awt.Color(0, 102, 51));

        GotoTestimonialsjButton.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        GotoTestimonialsjButton.setForeground(new java.awt.Color(0, 102, 102));
        GotoTestimonialsjButton.setText("Go to Testimonials");
        GotoTestimonialsjButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        GotoTestimonialsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GotoTestimonialsjButtonActionPerformed(evt);
            }
        });

        addPetsButton.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        addPetsButton.setForeground(new java.awt.Color(0, 102, 102));
        addPetsButton.setText("Add Pets");
        addPetsButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        addPetsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPetsButtonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Show Location");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/imageedit_2_4177795406.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("My  Request Stats:");

        requestjTable.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        requestjTable.setForeground(new java.awt.Color(0, 102, 102));
        requestjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request Type", "Completed", "Pending", "Processing", "Not Processed", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        requestjTable.setDoubleBuffered(true);
        requestjTable.setGridColor(new java.awt.Color(0, 102, 102));
        jScrollPane1.setViewportView(requestjTable);
        if (requestjTable.getColumnModel().getColumnCount() > 0) {
            requestjTable.getColumnModel().getColumn(0).setMinWidth(100);
            requestjTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            requestjTable.getColumnModel().getColumn(4).setMinWidth(110);
            requestjTable.getColumnModel().getColumn(4).setPreferredWidth(110);
        }

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Request Type-\n1 : Pet Giver\n2 : Pet Adoption\n3 : Pet Walking\n4 : Pet Grooming\n5 : Veterinarian\n");
        jTextArea1.setAutoscrolls(false);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(462, 462, 462)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usernameJText, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(manageRequestsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(GotoTestimonialsjButton)
                                .addGap(30, 30, 30)
                                .addComponent(addPetsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 68, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(usernameJText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageRequestsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GotoTestimonialsjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPetsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageRequestsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRequestsJButtonActionPerformed
        // TODO add your handling code here:
        //userProcessContainer.removeAll();
        PetOwnerWorkAreaJPanel poj = new PetOwnerWorkAreaJPanel(userProcessContainer, userAccount, (PetOwnerOrganization) organization, enterprise, petDirectory);
        userProcessContainer.add("PetOwnerWorkAreaJPanel", poj);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageRequestsJButtonActionPerformed

    private void GotoTestimonialsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GotoTestimonialsjButtonActionPerformed
        // TODO add your handling code here:
        //userProcessContainer.removeAll();
        userProcessContainer.add("AddTestimonialJPanel", new AddTestimonialJPanel(userProcessContainer, userAccount, (PetOwnerOrganization) organization, enterprise));
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();

        layout.next(userProcessContainer);

    }//GEN-LAST:event_GotoTestimonialsjButtonActionPerformed

    private void addPetsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPetsButtonActionPerformed
        // TODO add your handling code here:

        AddPetsJPanel djp = new AddPetsJPanel(userProcessContainer, petDirectory);
        userProcessContainer.add("petsJpanel", djp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addPetsButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Browser browser = new Browser();
        BrowserView browserView = new BrowserView(browser);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        frame.add(browserView, BorderLayout.CENTER);
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
//        
//        URL url = //getResource("map.html");
//        File f1 = new File(url.getPath());
//        System.out.println(f1);
//        browser.loadURL(url.getPath());
//        ClassLoader classLoader = getClass().getClassLoader();
//        File fl = new File(classLoader.getResource("map.html").getFile());
//                
        // browser.loadURL("C://My Work//AED//map.html");
        // browser.loadURL("..//map.html");
        browser.loadHTML("<!DocType>\n"
                + "<html>\n"
                + "  <head>\n"
                + " <title>Location</title>\n"
                + "      <meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no\" />\n"
                + "    <style type=\"text/css\">\n"
                + "      html { height: 100% }\n"
                + "      body { height: 100%; margin: 0; padding: 0 }\n"
                + "      #map-canvas { height: 100% }\n"
                + "    </style>\n"
                + "    <script type=\"text/javascript\"\n"
                + "      src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyB7J1zsErb9_7jxNu5KU5kIENFObAQEbl0&sensor=false\">\n"
                + "    </script>\n"
                + "    <script type=\"text/javascript\">\n"
                + "      var map;\n"
                + "      function initialize() {\n"
                + "        var mapOptions = {\n"
                + "           <!-- center: new google.maps.LatLng(42.3601,71.0589),  -->\n"
                + "		  center: {lat: 42.3389, lng:  -71.098326}, \n"
                + "          zoom: 12\n"
                + "        };\n"
                + "		\n"
                + "		\n"
                + "        map = new google.maps.Map(document.getElementById(\"map-canvas\"),\n"
                + "            mapOptions);\n"
                + "			\n"
                + "			var marker = new google.maps.Marker({\n"
                + "    position: {lat: 42.3389, lng:  -71.098326},\n"
                + "    map: map,\n"
                + "    title: 'Pet Location!'\n"
                + "  });\n"
                + "  \n"
                + "      }\n"
                + "      google.maps.event.addDomListener(window, 'load', initialize);\n"
                + "    </script>\n"
                + "  </head>\n"
                + "  <body>\n"
                + "    <div id=\"map-canvas\"/>\n"
                + "  </body>\n"
                + "</html>");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GotoTestimonialsjButton;
    private javax.swing.JButton addPetsButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton manageRequestsJButton;
    private javax.swing.JTable requestjTable;
    private javax.swing.JLabel usernameJText;
    // End of variables declaration//GEN-END:variables
}
