/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Farmer;
//import org.jfree.data.category;

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
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author jhalak
 */
public class FarmerPortalCerealJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private FarmerOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    EcoSystem business;

    /**
     * Creates new form Prediction
     */
    public FarmerPortalCerealJPanel(JPanel userProcessContainer, UserAccount account,
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
        MaizeProductionPanel = new javax.swing.JPanel();
        MaizePriceTrend = new javax.swing.JPanel();
        MaizePriceJPanel = new javax.swing.JPanel();
        btnPriceSupport = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 440, 589, -1));

        btnShowChart.setBackground(new java.awt.Color(0, 102, 102));
        btnShowChart.setFont(new java.awt.Font("Chalkboard SE", 1, 14)); // NOI18N
        btnShowChart.setForeground(new java.awt.Color(255, 255, 255));
        btnShowChart.setText("VIEW PRODUCTION TREND");
        btnShowChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowChartActionPerformed(evt);
            }
        });
        add(btnShowChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, 40));

        MaizeProductionPanel.setBackground(new java.awt.Color(102, 102, 102));
        MaizeProductionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Show Report", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        MaizeProductionPanel.setLayout(new javax.swing.BoxLayout(MaizeProductionPanel, javax.swing.BoxLayout.LINE_AXIS));
        add(MaizeProductionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 346, 422));

        MaizePriceTrend.setBackground(new java.awt.Color(102, 102, 102));

        MaizePriceJPanel.setBackground(new java.awt.Color(102, 102, 102));
        MaizePriceJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Show Report", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        MaizePriceJPanel.setLayout(new javax.swing.BoxLayout(MaizePriceJPanel, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout MaizePriceTrendLayout = new javax.swing.GroupLayout(MaizePriceTrend);
        MaizePriceTrend.setLayout(MaizePriceTrendLayout);
        MaizePriceTrendLayout.setHorizontalGroup(
            MaizePriceTrendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
            .addGroup(MaizePriceTrendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MaizePriceTrendLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MaizePriceJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        MaizePriceTrendLayout.setVerticalGroup(
            MaizePriceTrendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
            .addGroup(MaizePriceTrendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MaizePriceTrendLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(MaizePriceJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        add(MaizePriceTrend, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 6, -1, 422));

        btnPriceSupport.setBackground(new java.awt.Color(0, 102, 102));
        btnPriceSupport.setFont(new java.awt.Font("Chalkboard SE", 1, 14)); // NOI18N
        btnPriceSupport.setForeground(new java.awt.Color(255, 255, 255));
        btnPriceSupport.setText("MINIMUM SUPPORT PRICE TREND");
        btnPriceSupport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPriceSupportActionPerformed(evt);
            }
        });
        add(btnPriceSupport, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 330, 40));

        btnBack.setBackground(new java.awt.Color(0, 102, 102));
        btnBack.setFont(new java.awt.Font("Chalkboard SE", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowChartActionPerformed
        // TODO add your handling code here:
        // DefaultCategoryDataSet dcd=new DefaultCategoryDataSet();
        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        dcd.setValue(22, "Production", "FY11");
        dcd.setValue(21, "Production", "FY12");
        dcd.setValue(23, "Production", "FY13");
        dcd.setValue(24, "Production", "FY14");
        dcd.setValue(23, "Production", "FY15");
        dcd.setValue(21, "Production", "FY16");
        //JFreeChart jchart=ChartFactory.createBarChart3D("Student Name", "Student Marks", TOOL_TIP_TEXT_KEY, dcd);

        JFreeChart jchart = ChartFactory.createBarChart("Maize Production", "Years", "Millions Metric Tones", dcd, PlotOrientation.HORIZONTAL, true, true, true);
        CategoryPlot cplot = jchart.getCategoryPlot();
        cplot.setRangeGridlinePaint(Color.black);
        ((BarRenderer) cplot.getRenderer()).setBarPainter(new StandardBarPainter());
        BarRenderer r = (BarRenderer) jchart.getCategoryPlot().getRenderer();
        r.setSeriesPaint(0, Color.blue);

        // ChartFrame chartFrame=new ChartFrame("Student Record", jchart, true);
        //  chartFrame.setVisible(true);
        // chartFrame.setSize(500, 400);
        ChartPanel chartPanel = new ChartPanel(jchart);

        MaizeProductionPanel.removeAll();
        MaizeProductionPanel.add(chartPanel);
        MaizeProductionPanel.updateUI();

    }//GEN-LAST:event_btnShowChartActionPerformed

    private void btnPriceSupportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPriceSupportActionPerformed
        // TODO add your handling code here:

        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        dcd.setValue(1275, "Rs/Quintiles", "2015-2016");
        dcd.setValue(1330, "Rs/Quintiles", "2016-2017");
        dcd.setValue(1390, "Rs/Quintiles", "2017-2018");

        //JFreeChart jchart=ChartFactory.createBarChart3D("Student Name", "Student Marks", TOOL_TIP_TEXT_KEY, dcd);
        JFreeChart jchart = ChartFactory.createBarChart("Maize Prices", "Years", "Prices", dcd, PlotOrientation.VERTICAL, true, true, true);
        CategoryPlot cplot = jchart.getCategoryPlot();
        cplot.setRangeGridlinePaint(Color.black);
        ((BarRenderer) cplot.getRenderer()).setBarPainter(new StandardBarPainter());
        BarRenderer r = (BarRenderer) jchart.getCategoryPlot().getRenderer();
        r.setSeriesPaint(0, Color.orange);

        // ChartFrame chartFrame=new ChartFrame("Student Record", jchart, true);
        //  chartFrame.setVisible(true);
        // chartFrame.setSize(500, 400);
        ChartPanel chartPanel = new ChartPanel(jchart);

        MaizePriceJPanel.removeAll();
        MaizePriceJPanel.add(chartPanel);
        MaizePriceJPanel.updateUI();

    }//GEN-LAST:event_btnPriceSupportActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MaizePriceJPanel;
    private javax.swing.JPanel MaizePriceTrend;
    private javax.swing.JPanel MaizeProductionPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPriceSupport;
    private javax.swing.JButton btnShowChart;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
