/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.PetGiverOrganization;
import Business.Organization.PetGroomingOrganization;
import Business.Organization.PetOwnerOrganization;
import Business.Organization.PetTakerOrganization;
import Business.Organization.PetWalkerOrganization;
import Business.Pets.Pet;
import Business.Pets.UsersPieChart;
import Business.Role.PetOwnerRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author Neha Ghate
 */
public class DataStatsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DataStatsJPanel
     */
    private JPanel userProcessContainer;
    private OrganizationDirectory organizationDir;

    public DataStatsJPanel(JPanel container, OrganizationDirectory organizationDir) {
        initComponents();
        this.userProcessContainer = container;
        this.organizationDir = organizationDir;
        populateTable();
        displayChart();
    }

    public void displayChart() {
      //  UsersPieChart demo = new UsersPieChart("Customers in the System", organizationDir);
        //demo.pack();
        //RefineryUtilities.centerFrameOnScreen(demo);
//        dataPanel.setVisible(true);
        PieDataset dataSet = UsersPieChart.createDataset(organizationDir);
        
          JFreeChart chart = ChartFactory.createPieChart(
            "Users in the System",  // chart title
            dataSet,             // data
            true,               // include legend
            true,
            false
        );

        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setLabelFont(new Font("SansSerif", Font.PLAIN, 12));
        plot.setNoDataMessage("No data available");
        plot.setCircular(false);
        plot.setLabelGap(0.02);
        
        ChartPanel myChart = new ChartPanel(chart);
        dataPanel.setLayout(new java.awt.BorderLayout());
        dataPanel.add(myChart, BorderLayout.CENTER);
        dataPanel.validate();
    }
    
    public void calcData(){
        int org1Size = 0 ;
       int org2Size = 0 ;
       int org3Size = 0 ;
       int org4Size = 0 ;
       int org5Size = 0 ;
         int org6Size = 0 ;
      
        for(Organization org : organizationDir.getOrganizationList()){
            if(org instanceof DoctorOrganization){
            org1Size = org.getUserAccountDirectory().getUserAccountList().size();
            break;
            }
           
            if(org instanceof PetOwnerOrganization){
            org2Size = org.getUserAccountDirectory().getUserAccountList().size();
            break;
            }
            if(org instanceof PetWalkerOrganization){
            org3Size = org.getUserAccountDirectory().getUserAccountList().size();
            break;
            }
            if(org instanceof PetTakerOrganization){
            org4Size = org.getUserAccountDirectory().getUserAccountList().size();
            break;
            }
            if(org instanceof PetGiverOrganization){
            org5Size = org.getUserAccountDirectory().getUserAccountList().size();
            break;
            }

            if(org instanceof PetGroomingOrganization){
            org6Size = org.getUserAccountDirectory().getUserAccountList().size();
            break;
            }
        }
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) petOwnerTable.getModel();

        model.setRowCount(0);

        Organization org = null;
        int petCount = 0;
        int workRequestCount = 0;
        ArrayList<Pet> petList = null;
        ArrayList<UserAccount> accList = null;
        for (Organization organization : organizationDir.getOrganizationList()) {
            if (organization instanceof PetOwnerOrganization) {
                org = organization;
                break;
            }
        }
        if (org != null) {
            accList = org.getUserAccountDirectory().getUserAccountList();

            for (UserAccount ua : accList) {
                petCount=0;
                workRequestCount=0;
                ArrayList<WorkRequest> wrList = ua.getWorkQueue().getWorkRequestList();
                for (WorkRequest wr : wrList) {
                    workRequestCount++;
                }
                PetOwnerRole petRole = (PetOwnerRole) ua.getRole();
                try {
                    petList = petRole.getPetDirectory().getPetList();
                    for (Pet pet : petList) {
                        petCount++;
                    }

                    Object[] row = new Object[3];
                    row[0] = ua.getEmployee().getName();
                    row[1] = petCount;
                    row[2] = workRequestCount;

                    model.addRow(row);
                } catch (Exception e) {
                    //JOptionPane.showMessageDialog(null, "No pets added ", "Empty Field", JOptionPane.WARNING_MESSAGE);
                    System.out.println(e.getMessage());
                }
            }
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
        petOwnerTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userLocationButton = new javax.swing.JButton();
        dataPanel = new javax.swing.JPanel();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        petOwnerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Pet Owner Name", "Number of Pets", "Number of requests"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(petOwnerTable);

        jLabel1.setText("Data Statistics ");

        jLabel2.setText("Pet owner Details");

        userLocationButton.setText("System Users Locatiions");
        userLocationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userLocationButtonActionPerformed(evt);
            }
        });

        dataPanel.setBackground(new java.awt.Color(255, 102, 153));

        javax.swing.GroupLayout dataPanelLayout = new javax.swing.GroupLayout(dataPanel);
        dataPanel.setLayout(dataPanelLayout);
        dataPanelLayout.setHorizontalGroup(
            dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
        );
        dataPanelLayout.setVerticalGroup(
            dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 105, Short.MAX_VALUE)
        );

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(userLocationButton)
                            .addComponent(dataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backJButton))))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80)
                .addComponent(userLocationButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(dataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backJButton)
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userLocationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userLocationButtonActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
         Browser browser = new Browser();
        BrowserView browserView = new BrowserView(browser);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        frame.add(browserView, BorderLayout.CENTER);
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
         frame.setTitle("Users located at");
      //  browser.loadURL("C://My Work//AED//locations.html");
       // browser.loadURL("./Business/map.html");
        browser.loadHTML("<!DOCTYPE html>\n" +
"<html> \n" +
"<head> \n" +
"  <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\" /> \n" +
"  <title>Google Maps Multiple Markers</title> \n" +
"  <script src=\"http://maps.google.com/maps/api/js?sensor=false\" \n" +
"          type=\"text/javascript\"></script>\n" +
"</head> \n" +
"<body>\n" +
"  <div id=\"map\" style=\"width: 500px; height: 400px;\"></div>\n" +
"\n" +
"  <script type=\"text/javascript\">\n" +
"    var locations = [\n" +
"      ['Boston', 42.3601, -71.0589, 4],\n" +
"      ['Cambridge', 42.3736, -71.1106, 5], \n" +
"      ['Quincy', 42.2500 , -71.0000, 3],\n" +
"      ['Somerville', 42.3875, -71.1000, 2],\n" +
"      ['Brookline', 42.3317, -71.1217, 1]\n" +
"    ];\n" +
"\n" +
"    var map = new google.maps.Map(document.getElementById('map'), {\n" +
"      zoom: 12,\n" +
"      center: new google.maps.LatLng(42.3601, -71.0589),\n" +
"      mapTypeId: google.maps.MapTypeId.ROADMAP\n" +
"    });\n" +
"\n" +
"    var infowindow = new google.maps.InfoWindow();\n" +
"\n" +
"    var marker, i;\n" +
"\n" +
"    for (i = 0; i < locations.length; i++) {  \n" +
"      marker = new google.maps.Marker({\n" +
"        position: new google.maps.LatLng(locations[i][1], locations[i][2]),\n" +
"        map: map\n" +
"      });\n" +
"\n" +
"      google.maps.event.addListener(marker, 'click', (function(marker, i) {\n" +
"        return function() {\n" +
"          infowindow.setContent(locations[i][0]);\n" +
"          infowindow.open(map, marker);\n" +
"        }\n" +
"      })(marker, i));\n" +
"    }\n" +
"  </script>\n" +
"</body>\n" +
"</html>");
    }//GEN-LAST:event_userLocationButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JPanel dataPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable petOwnerTable;
    private javax.swing.JButton userLocationButton;
    // End of variables declaration//GEN-END:variables
}
