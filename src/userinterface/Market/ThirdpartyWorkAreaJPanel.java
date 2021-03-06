/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Market;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CustomerOrganization;
import Business.Organization.Organization;
import Business.Organization.ThirdpartyOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SellingWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AMY
 */
public class ThirdpartyWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private ThirdpartyOrganization organization;
    private EcoSystem business;

    /**
     * Creates new form ThirdpartyWorkAreaJPanel
     */
    public ThirdpartyWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, ThirdpartyOrganization organization, EcoSystem business) {

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.organization = organization;
        this.business = business;
        populateWorkQueueTable();
    }

    public void populateWorkQueueTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        for (WorkRequest work : organization.getWorkQueue().getWorkRequestList()) {
            if (work instanceof SellingWorkRequest) {
                SellingWorkRequest sellingWorkRequest = (SellingWorkRequest) work;
                Object[] row = new Object[5];
                row[0] = sellingWorkRequest;
                row[1] = sellingWorkRequest.getProductName();
                row[2] = sellingWorkRequest.getQuantity();
                row[3] = sellingWorkRequest.getCommission();
                row[4] = sellingWorkRequest.getStatus();

                model.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        forwardBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Chalkboard SE", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("WELCOME TO THIRD PARTY WORKAREA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        workRequestJTable.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sender", "Product Name", "Quantity", "Commision", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(workRequestJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 676, 143));

        forwardBtn.setBackground(new java.awt.Color(0, 102, 102));
        forwardBtn.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        forwardBtn.setForeground(new java.awt.Color(255, 255, 255));
        forwardBtn.setText("FORWARD TO CUSTOMER");
        forwardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forwardBtnActionPerformed(evt);
            }
        });
        add(forwardBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void forwardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            SellingWorkRequest request = (SellingWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
            if (request.getStatus().equals("Forward to Wholesaler")) {
                request.setStatus("Forward to Customer");
                //ADD request to Market Enterprise- Customer Org
                Organization org = null;
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof CustomerOrganization) {
                        org = organization;
                        break;
                    }
                }
                if (org != null) {
                    org.getWorkQueue().getWorkRequestList().add(request);
                    userAccount.getWorkQueue().getWorkRequestList().add(request);
                }
                JOptionPane.showMessageDialog(null, "Request Forwarded to Customer Sucessfully");
                populateWorkQueueTable();
                forwardBtn.setEnabled(false);

            } else {
                JOptionPane.showMessageDialog(null, "Same Request can not be forwarded again", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_forwardBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton forwardBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
