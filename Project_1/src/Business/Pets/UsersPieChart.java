/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pets;

/**
 *
 * @author Neha Ghate
 */
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.PetGiverOrganization;
import Business.Organization.PetGroomingOrganization;
import Business.Organization.PetOwnerOrganization;
import Business.Organization.PetTakerOrganization;
import Business.Organization.PetWalkerOrganization;
import java.awt.Font;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;

public class UsersPieChart extends ApplicationFrame {
 
     /**
     * Default constructor.
     *
     * @param title  the frame title.
     * @param orgDir
     */
    public UsersPieChart(String title,OrganizationDirectory orgDir) {
        super(title);
        setContentPane(createDemoPanel(orgDir));
        
    }

    /**
     * Creates a sample dataset.
     * 
     * @return A sample dataset.
     */
    public static PieDataset createDataset(OrganizationDirectory orgDir) {
        DefaultPieDataset dataset = new DefaultPieDataset();
       int org1Size = 0 ;
       int org2Size = 0 ;
       int org3Size = 0 ;
       int org4Size = 0 ;
       int org5Size = 0 ;
         int org6Size = 0 ;
      
        for(Organization org : orgDir.getOrganizationList()){
            if(org instanceof DoctorOrganization){
            org1Size = org.getUserAccountDirectory().getUserAccountList().size();
            }
           
            if(org instanceof PetOwnerOrganization){
            org2Size = org.getUserAccountDirectory().getUserAccountList().size();
            }
            if(org instanceof PetWalkerOrganization){
            org3Size = org.getUserAccountDirectory().getUserAccountList().size();
            }
            if(org instanceof PetTakerOrganization){
            org4Size = org.getUserAccountDirectory().getUserAccountList().size();
            }
            if(org instanceof PetGiverOrganization){
            org5Size = org.getUserAccountDirectory().getUserAccountList().size();
            }

            if(org instanceof PetGroomingOrganization){
            org6Size = org.getUserAccountDirectory().getUserAccountList().size();
            }
        }
        
        dataset.setValue("Pet Owners", org2Size);
        dataset.setValue("Pet Givers", org5Size);
        dataset.setValue("Pet Takers", org4Size);
        dataset.setValue("Pet Walkers", org3Size);
        dataset.setValue("Pet Groomers", org6Size);
        dataset.setValue("Vet", org1Size);
        return dataset;        
    }
    
    /**
     * Creates a chart.
     * 
     * @param dataset  the dataset.
     * 
     * @return A chart.
     */
    private static JFreeChart createChart(PieDataset dataset) {
        
        JFreeChart chart = ChartFactory.createPieChart(
            "Users in the System",  // chart title
            dataset,             // data
            true,               // include legend
            true,
            false
        );

        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setLabelFont(new Font("SansSerif", Font.PLAIN, 12));
        plot.setNoDataMessage("No data available");
        plot.setCircular(false);
        plot.setLabelGap(0.02);
        return chart;
        
    }
    
    /**
     * Creates a panel for the demo (used by SuperDemo.java).
     * 
     * @return A panel.
     */
    public static JPanel createDemoPanel(OrganizationDirectory orgDir) {
        JFreeChart chart = createChart(createDataset(orgDir));
        return new ChartPanel(chart);
    }
    
   
}
