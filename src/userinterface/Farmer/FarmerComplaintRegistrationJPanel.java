/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Farmer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FarmerHelpDesk;
import Business.Network.Network;
import Business.Organization.CallCentreOrganization;
import Business.Organization.FarmerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ComplaintWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author deekshithav
 */
public class FarmerComplaintRegistrationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FarmerComplaintRegistrationJPanel
     */
    private JPanel userProcessContainer;
    private FarmerOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private Network network;

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public FarmerComplaintRegistrationJPanel(JPanel userProcessContainer, UserAccount account,
            FarmerOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        this.network = network;
        valueLabel.setText(enterprise.getName());

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
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        requestTestJButton = new javax.swing.JButton();
        lasttimeTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sextextfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        addressline2textfield = new javax.swing.JTextField();
        middlenametextfield = new javax.swing.JTextField();
        lastnametextfield = new javax.swing.JTextField();
        agetextfield = new javax.swing.JTextField();
        addressline1textfield = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        citytexxtfield = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        statetextfield = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        firstnametextfield = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        dobtextfield = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        countrytextfield1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        phonenotextfield1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        occupationTextField1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        departmentComboBox = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        complaintTextArea = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Chalkboard", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("COMPLAINT APPLICATION FORM");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 130, -1));

        enterpriseLabel1.setBackground(new java.awt.Color(0, 102, 102));
        enterpriseLabel1.setFont(new java.awt.Font("Chalkboard", 1, 14)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(0, 102, 102));
        enterpriseLabel1.setText("ENTERPRISE :");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 167, 30));

        requestTestJButton.setBackground(new java.awt.Color(0, 102, 102));
        requestTestJButton.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        requestTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        requestTestJButton.setText("REGISTER COMPLAINT");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 580, -1, -1));

        lasttimeTextField.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(lasttimeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, 450, 20));

        backJButton.setBackground(new java.awt.Color(0, 102, 102));
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, -1, -1));

        jLabel2.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel2.setText("ADDRESS LINE 2:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, -1, -1));

        sextextfield.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(sextextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 250, 20));

        jLabel3.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel3.setText("MIDDLE NAME: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, 20));

        jLabel5.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel5.setText("MARITAL STATUS:* ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, -1, -1));

        jLabel6.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel6.setText("LAST NAME*:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, 20));

        jLabel7.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel7.setText("COMPLAINT MESSAGE: ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 210, -1));

        jLabel8.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel8.setText("SEX: ");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, -1));

        jLabel9.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel9.setText("FIRST NAME*: ");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, 20));

        addressline2textfield.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(addressline2textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 250, 20));

        middlenametextfield.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(middlenametextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 280, 20));

        lastnametextfield.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(lastnametextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 280, 20));

        agetextfield.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(agetextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, 250, 20));

        addressline1textfield.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(addressline1textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 280, 20));

        jLabel10.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel10.setText("ADDRESS LINE 1: ");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, 20));

        citytexxtfield.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(citytexxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 280, 20));

        jLabel11.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel11.setText("PHONE NUMBER*: ");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, -1, -1));

        statetextfield.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(statetextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 250, 20));

        jLabel12.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel12.setText("STATE:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, -1, -1));

        firstnametextfield.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(firstnametextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 280, 20));

        jLabel13.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel13.setText("CITY: ");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, 20));

        dobtextfield.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(dobtextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 250, 20));

        jLabel14.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel14.setText("DATE OF BIRTH*:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, -1, -1));

        jLabel15.setBackground(new java.awt.Color(0, 102, 102));
        jLabel15.setFont(new java.awt.Font("Chalkboard SE", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 102));
        jLabel15.setText("ENTER PERSONAL INFORMATION: ");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel16.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel16.setText("COUNTRY:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, 20));

        countrytextfield1.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(countrytextfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 280, 20));

        jLabel17.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel17.setText("DID YOU FACE THIS ISSUE BEFORE ? (IF YES, PLEASE MENTION)");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 590, 60));

        phonenotextfield1.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(phonenotextfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, 250, 20));

        jRadioButton1.setText("Seperated");
        add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 480, -1, -1));

        jRadioButton2.setText("Married");
        add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, -1, -1));

        jRadioButton3.setText("Single");
        add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 450, -1, -1));

        jRadioButton4.setText("Widowed");
        add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 480, -1, -1));

        jLabel18.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel18.setText("OCCUPATION: ");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, -1, 20));

        occupationTextField1.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(occupationTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 280, 20));

        jLabel19.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel19.setText("AGE:");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 30, -1));

        departmentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crops", "Marketing & Prices", "Fertilizers & Pesticides", "Storage", "Animal Husbandry", "Education", "Loans & Finance", "Insurance", "Healthcare" }));
        departmentComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentComboBoxActionPerformed(evt);
            }
        });
        add(departmentComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 210, -1));

        jLabel20.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel20.setText("SELECT THE DEPARTMENT: ");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 210, -1));

        complaintTextArea.setColumns(20);
        complaintTextArea.setRows(5);
        jScrollPane1.setViewportView(complaintTextArea);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 200, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        if ((!firstnametextfield.getText().equals(""))
                && (!lastnametextfield.getText().equals("")) && (!dobtextfield.getText().equals(""))
                && (!lasttimeTextField.getText().equals(""))) {

            boolean isError = false;
            try {
                String dept = departmentComboBox.getSelectedItem().toString();
                String message = complaintTextArea.getText();
                System.out.println("size" + enterprise.getOrganizationDirectory().getOrganizationList().size());
                ComplaintWorkRequest request = new ComplaintWorkRequest();

                request.setComplaintMessage(message);
                request.setDepartment(dept);

                request.setFirstName(firstnametextfield.getText());
                request.setMiddleName(middlenametextfield.getText());
                request.setLastName(lastnametextfield.getText());
                request.setAge(Integer.parseInt(agetextfield.getText()));
                request.setSex(sextextfield.getText());
                request.setAddressLine1(addressline1textfield.getText());
                request.setAddressLine2(addressline2textfield.getText());
                request.setCity(citytexxtfield.getText());
                request.setState(statetextfield.getText());
                request.setCountry(lasttimeTextField.getText());
                request.setDOB(dobtextfield.getText());
                request.setPhoneNo(Integer.parseInt(phonenotextfield1.getText()));
                request.setOccupation(occupationTextField1.getText());
                request.setLastTimeIssue(lasttimeTextField.getText());
                if (jRadioButton2.isSelected()) {
                    request.setMaritalStatus(jRadioButton2.getText());
                } else if (jRadioButton3.isSelected()) {
                    request.setMaritalStatus(jRadioButton3.getText());
                } else if (jRadioButton4.isSelected()) {
                    request.setMaritalStatus(jRadioButton4.getText());
                } else {
                    request.setMaritalStatus(jRadioButton1.getText());
                }

                request.setSender(userAccount);
                request.setStatus("Sent");
                Organization org = null;
//                for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
//
//                    for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
//                        System.out.println("o" + organization.getName());
//                        if (organization instanceof CallCentreOrganization) {
//                            org = organization;
//                            break;
//                        }
//                    }
//                }

                for (Network network : business.getNetworkList()) {
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        if (enterprise instanceof FarmerHelpDesk) {
                            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                if (organization instanceof CallCentreOrganization) {
                                    org = organization;
                                    break;
                                }
                            }
                        }

                    }
                }
                if (org != null) {
                    System.out.println("userinterface.Farmer.FarmerComplaintRegistrationJPanel.requestTestJButtonActionPerformed()");
                    org.getWorkQueue().getWorkRequestList().add(request);
                    userAccount.getWorkQueue().getWorkRequestList().add(request);

                    JOptionPane.showMessageDialog(null, "You have successfully submitted your complaint !", "Information", JOptionPane.INFORMATION_MESSAGE);

                }
            } catch (Exception e3) {
                isError = true;
                JOptionPane.showMessageDialog(null, "Please input the details in proper format", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fill all the mandatory fields marked with a * ", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FarmerCallCentreComplaintsWorkAreaJPanel fwjp = (FarmerCallCentreComplaintsWorkAreaJPanel) component;
        fwjp.populateComplaintTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void departmentComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentComboBoxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_departmentComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressline1textfield;
    private javax.swing.JTextField addressline2textfield;
    private javax.swing.JTextField agetextfield;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField citytexxtfield;
    private javax.swing.JTextArea complaintTextArea;
    private javax.swing.JTextField countrytextfield1;
    private javax.swing.JComboBox<String> departmentComboBox;
    private javax.swing.JTextField dobtextfield;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JTextField firstnametextfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastnametextfield;
    private javax.swing.JTextField lasttimeTextField;
    private javax.swing.JTextField middlenametextfield;
    private javax.swing.JTextField occupationTextField1;
    private javax.swing.JTextField phonenotextfield1;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTextField sextextfield;
    private javax.swing.JTextField statetextfield;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
