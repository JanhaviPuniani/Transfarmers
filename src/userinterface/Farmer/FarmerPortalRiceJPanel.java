/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Farmer;
//import org.jfree.data.category;

import org.jfree.data.category.DefaultCategoryDataset;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FarmerOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.StandardBarPainter;

/**
 *
 * @author jhalak
 */
public class FarmerPortalRiceJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private FarmerOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    EcoSystem business;

    /**
     * Creates new form FarmerPortalJPanel
     */
    public FarmerPortalRiceJPanel(JPanel userProcessContainer, UserAccount account,
            FarmerOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        this.userAccount = account;
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
        btnShowChart = new javax.swing.JButton();
        RiceProductionPanel = new javax.swing.JPanel();
        RicePriceTrend = new javax.swing.JPanel();
        RicePriceJPanel = new javax.swing.JPanel();
        btnPriceSupport = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 440, 589, -1));

        btnShowChart.setBackground(new java.awt.Color(0, 102, 102));
        btnShowChart.setFont(new java.awt.Font("Chalkboard SE", 1, 12)); // NOI18N
        btnShowChart.setForeground(new java.awt.Color(255, 255, 255));
        btnShowChart.setText("Production Trend >>");
        btnShowChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowChartActionPerformed(evt);
            }
        });
        add(btnShowChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 449, -1, -1));

        RiceProductionPanel.setBackground(new java.awt.Color(102, 102, 102));
        RiceProductionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Show Report", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        RiceProductionPanel.setLayout(new javax.swing.BoxLayout(RiceProductionPanel, javax.swing.BoxLayout.LINE_AXIS));
        add(RiceProductionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 346, 422));

        RicePriceTrend.setBackground(new java.awt.Color(102, 102, 102));

        RicePriceJPanel.setBackground(new java.awt.Color(102, 102, 102));
        RicePriceJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Show Report", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        RicePriceJPanel.setLayout(new javax.swing.BoxLayout(RicePriceJPanel, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout RicePriceTrendLayout = new javax.swing.GroupLayout(RicePriceTrend);
        RicePriceTrend.setLayout(RicePriceTrendLayout);
        RicePriceTrendLayout.setHorizontalGroup(
            RicePriceTrendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
            .addGroup(RicePriceTrendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RicePriceTrendLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RicePriceJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        RicePriceTrendLayout.setVerticalGroup(
            RicePriceTrendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(RicePriceTrendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RicePriceTrendLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(RicePriceJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        add(RicePriceTrend, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 6, -1, 422));

        btnPriceSupport.setBackground(new java.awt.Color(0, 102, 102));
        btnPriceSupport.setFont(new java.awt.Font("Chalkboard SE", 1, 12)); // NOI18N
        btnPriceSupport.setForeground(new java.awt.Color(255, 255, 255));
        btnPriceSupport.setText("Minimum Support Price Trend >>");
        btnPriceSupport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPriceSupportActionPerformed(evt);
            }
        });
        add(btnPriceSupport, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 446, -1, -1));

        btnBack.setBackground(new java.awt.Color(0, 102, 102));
        btnBack.setFont(new java.awt.Font("Chalkboard SE", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 496, 133, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowChartActionPerformed
        // TODO add your handling code here:
        // DefaultCategoryDataSet dcd=new DefaultCategoryDataSet();
        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        dcd.setValue(105, "Production", "FY12");
        dcd.setValue(105, "Production", "FY13");
        dcd.setValue(105, "Production", "FY14");
        dcd.setValue(106, "Production", "FY15");
        dcd.setValue(105, "Production", "FY16");
        dcd.setValue(109, "Production", "FY17");
        //JFreeChart jchart=ChartFactory.createBarChart3D("Student Name", "Student Marks", TOOL_TIP_TEXT_KEY, dcd);

        JFreeChart jchart = ChartFactory.createBarChart("Rice Production", "Years", "Quintiles", dcd, PlotOrientation.VERTICAL, true, true, true);
        CategoryPlot cplot = jchart.getCategoryPlot();
        cplot.setRangeGridlinePaint(Color.black);
        ((BarRenderer) cplot.getRenderer()).setBarPainter(new StandardBarPainter());
        BarRenderer r = (BarRenderer) jchart.getCategoryPlot().getRenderer();
        r.setSeriesPaint(0, Color.blue);

        // ChartFrame chartFrame=new ChartFrame("Student Record", jchart, true);
        //  chartFrame.setVisible(true);
        // chartFrame.setSize(500, 400);
        ChartPanel chartPanel = new ChartPanel(jchart);

        RiceProductionPanel.removeAll();
        RiceProductionPanel.add(chartPanel);
        RiceProductionPanel.updateUI();

    }//GEN-LAST:event_btnShowChartActionPerformed

    private void btnPriceSupportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPriceSupportActionPerformed
        // TODO add your handling code here:

        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        dcd.setValue(17, "Prices", "2004-2008");
        dcd.setValue(49, "Prices", "2009-2013");
        dcd.setValue(19, "Prices", "2014-2017/2018");

        //JFreeChart jchart=ChartFactory.createBarChart3D("Student Name", "Student Marks", TOOL_TIP_TEXT_KEY, dcd);
        JFreeChart jchart = ChartFactory.createBarChart("Rice Prices", "Years", "Percentage", dcd, PlotOrientation.VERTICAL, true, true, true);
        CategoryPlot cplot = jchart.getCategoryPlot();
        cplot.setRangeGridlinePaint(Color.black);
        ((BarRenderer) cplot.getRenderer()).setBarPainter(new StandardBarPainter());
        BarRenderer r = (BarRenderer) jchart.getCategoryPlot().getRenderer();
        r.setSeriesPaint(0, Color.orange);

        // ChartFrame chartFrame=new ChartFrame("Student Record", jchart, true);
        //  chartFrame.setVisible(true);
        // chartFrame.setSize(500, 400);
        ChartPanel chartPanel = new ChartPanel(jchart);

        RicePriceJPanel.removeAll();
        RicePriceJPanel.add(chartPanel);
        RicePriceJPanel.updateUI();

    }//GEN-LAST:event_btnPriceSupportActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel RicePriceJPanel;
    private javax.swing.JPanel RicePriceTrend;
    private javax.swing.JPanel RiceProductionPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPriceSupport;
    private javax.swing.JButton btnShowChart;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
