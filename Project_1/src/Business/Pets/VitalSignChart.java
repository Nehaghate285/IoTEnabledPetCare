/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pets;

import java.awt.Color;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author Neha Ghate
 */
public class VitalSignChart extends ApplicationFrame {

    /**
     * A simple demonstration application showing how to create a line chart
     * using data from an {@link XYDataset}.
     *
     */
    public VitalSignChart(final String title, Pet pet) {

        super(title);

      //  final XYDataset dataset = createDataset(pet);
        //final JFreeChart chart = createChart(dataset);
        //final ChartPanel chartPanel = new ChartPanel(chart);
        //chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
      //  setContentPane(chartPanel);

    }

    /**
     * Creates a sample dataset.
     *
     * @return a sample dataset.
     */
    public static XYDataset createDataset(Pet pet) {

        final XYSeries heartRate = new XYSeries("HeartRate");

        final XYSeries respiratoryRate = new XYSeries("ResipatoryRate");

        for (VitalSign vs : pet.getVsh().getVitalSignList()) {
            Date vitalSignDate = vs.getVitalSignDate();
            Calendar cal = Calendar.getInstance();
            cal.setTime(vitalSignDate);
            long seconds = cal.get(Calendar.SECOND);
           // Long lDate = vitalSignDate.getTime();
            float r = vs.getRespiratoryRate();
            float h = vs.getHeartRate();
            heartRate.add(h, seconds);
            respiratoryRate.add(r, seconds);
        }
        
        final XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(heartRate);
        dataset.addSeries(respiratoryRate);

        return dataset;

    }

    /**
     * Creates a chart.
     *
     * @param dataset the data for the chart.
     *
     * @return a chart.
     */
    public static JFreeChart createChart(final XYDataset dataset) {

        // create the chart...
        final JFreeChart chart = ChartFactory.createXYLineChart(
                "VitalSign For Pet", // chart title
                "TimeLine", // x axis label
                "VitalSign", // y axis label
                dataset, // data
                PlotOrientation.VERTICAL,
                true, // include legend
                true, // tooltips
                false // urls
        );

        // NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...
        chart.setBackgroundPaint(Color.white);

//        final StandardLegend legend = (StandardLegend) chart.getLegend();
        //      legend.setDisplaySeriesShapes(true);
        // get a reference to the plot for further customisation...
        final XYPlot plot = chart.getXYPlot();
        plot.setBackgroundPaint(Color.lightGray);
        //    plot.setAxisOffset(new Spacer(Spacer.ABSOLUTE, 5.0, 5.0, 5.0, 5.0));
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);

        final XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesLinesVisible(0, false);
        renderer.setSeriesShapesVisible(1, false);
        plot.setRenderer(renderer);

        // change the auto tick unit selection to integer units only...
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        // OPTIONAL CUSTOMISATION COMPLETED.

        return chart;

    }

}
