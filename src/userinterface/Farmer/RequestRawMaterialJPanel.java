/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Farmer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.SupplierEnterprise;
import Business.Network.Network;
import Business.Organization.RawMaterialsOrganization;

import Business.Organization.Organization;
import Business.RawMaterial.RawMaterial;
import Business.UserAccount.UserAccount;

import Business.WorkQueue.SupplierWorkRequest;

//import Business.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class RequestRawMaterialJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;

    /**
     * Creates new form RequestLabTestJPanel
     */
    public RequestRawMaterialJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        valueLabel.setText(enterprise.getName());
        populateComboBox();
    }

    public void populateComboBox() {
        cmbRawMaterial.removeAllItems();
        for (RawMaterial.RawMaterialType rawMaterial : RawMaterial.RawMaterialType.values()) {
            cmbRawMaterial.addItem(rawMaterial);
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

        requestTestJButton = new javax.swing.JButton();
        quantityJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbRawMaterial = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setBackground(new java.awt.Color(0, 102, 102));
        requestTestJButton.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        requestTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        requestTestJButton.setText("REQUEST RAW MATERIAL");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        quantityJTextField.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(quantityJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 190, -1));

        backJButton.setBackground(new java.awt.Color(0, 102, 102));
        backJButton.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<< BACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        valueLabel.setFont(new java.awt.Font("Chalkboard SE", 1, 12)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(0, 102, 102));
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 130, 30));

        enterpriseLabel.setFont(new java.awt.Font("Chalkboard SE", 1, 12)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(0, 102, 102));
        enterpriseLabel.setText("ENTERPRISE:");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 80, 30));

        jLabel1.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel1.setText("1. RAW MATERIAL TYPE :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        cmbRawMaterial.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(cmbRawMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 190, -1));

        jLabel2.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel2.setText("2. QUANTITY:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel3.setText("3. RAW MATERIAL NAME:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        nameTextField.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 190, -1));

        jLabel4.setFont(new java.awt.Font("Chalkboard SE", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("RAW MATERIAL PORTAL");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 350, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel5.setText("<60 lbs");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        int quantity=0;
        boolean isQtyValid=true;
        try {
            quantity = Integer.parseInt(quantityJTextField.getText());
        } catch (NumberFormatException e) {
            isQtyValid= false;
            JOptionPane.showMessageDialog(null, "Enter valid Quantity", "Error", JOptionPane.ERROR_MESSAGE);
            
        }
        if(quantity <= 0 || quantity >25){
            isQtyValid= false;
             JOptionPane.showMessageDialog(null, "Enter Quantity less than 60 lbs", "Error", JOptionPane.ERROR_MESSAGE);
        }
        String rawMaterialName = nameTextField.getText();
        boolean isValidName = validateStrings(rawMaterialName);
        if (isValidName && isQtyValid) {
            SupplierWorkRequest supplierWorkRequest = new SupplierWorkRequest();
            RawMaterial rawMaterial = new RawMaterial();
            rawMaterial.setName(rawMaterialName);
            rawMaterial.setQuantity(quantity);
            rawMaterial.setRawMaterialType((RawMaterial.RawMaterialType) cmbRawMaterial.getSelectedItem());
            supplierWorkRequest.setRawMaterial(rawMaterial);
            supplierWorkRequest.setSender(userAccount);
            supplierWorkRequest.setStatus("Sent");

            Organization org = null;
            for (Network network : business.getNetworkList()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise instanceof SupplierEnterprise) {
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            if (organization instanceof RawMaterialsOrganization) {
                                org = organization;
                                break;
                            }
                        }
                    }

                }
            }

            if (org != null) {
                org.getWorkQueue().getWorkRequestList().add(supplierWorkRequest);
                userAccount.getWorkQueue().getWorkRequestList().add(supplierWorkRequest);
                JOptionPane.showMessageDialog(null, "You have created request successfully");
                requestTestJButton.setEnabled(false);
                cmbRawMaterial.removeAllItems();
                quantityJTextField.setText("");
                nameTextField.setText("");
            }

        }

    }//GEN-LAST:event_requestTestJButtonActionPerformed
    public boolean validateStrings(String name) {
        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter mandatory value", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        Pattern pattern = Pattern.compile("[a-zA-Z ]*");
        Matcher matcher = pattern.matcher(name);
        if (!matcher.matches()) {

            JOptionPane.showMessageDialog(null, "Please Enter valid string value", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FarmerWorkAreaJPanel dwjp = (FarmerWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox cmbRawMaterial;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField quantityJTextField;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
