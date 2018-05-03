/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Farmer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorTreatmentWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author deekshithav
 */
public class RequestDoctorTreatmentWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestDoctorTreatmentWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    //  private Network network;
    private EcoSystem business;

    /**
     * Creates new form RequestLabTestJPanel
     */
    public RequestDoctorTreatmentWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        // this.network = network;
        this.business = business;
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        requestTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lasttimeTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sextextfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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
        messageJTextField = new javax.swing.JTextField();
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

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setBackground(new java.awt.Color(0, 102, 102));
        requestTestJButton.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        requestTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        requestTestJButton.setText("REQUEST TREATMENT");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 540, -1, -1));

        jLabel1.setFont(new java.awt.Font("Chalkboard SE", 0, 14)); // NOI18N
        jLabel1.setText("Enter Your Disease Symptoms* : ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 220, -1));

        lasttimeTextField.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(lasttimeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, 250, 20));

        backJButton.setBackground(new java.awt.Color(0, 102, 102));
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, -1, -1));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 130, -1));

        enterpriseLabel1.setFont(new java.awt.Font("Chalkboard", 1, 14)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(0, 102, 102));
        enterpriseLabel1.setText("ENTERPRISE :");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 167, 30));

        jLabel2.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel2.setText("ADDRESS LINE 2:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, -1, -1));

        sextextfield.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(sextextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 250, 20));

        jLabel3.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel3.setText("MIDDLE NAME: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, 20));

        jLabel4.setFont(new java.awt.Font("Chalkboard SE", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("PATIENT INFORMATION FORM");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel5.setText("MARITAL STATUS:* ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, -1, -1));

        jLabel6.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel6.setText("LAST NAME*:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, 20));

        jLabel7.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel7.setText("AGE:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 30, -1));

        jLabel8.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel8.setText("SEX: ");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel9.setText("FIRST NAME*: ");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, 20));

        addressline2textfield.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(addressline2textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 250, 20));

        middlenametextfield.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(middlenametextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 280, 20));

        lastnametextfield.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(lastnametextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 280, 20));

        agetextfield.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(agetextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 250, 20));

        addressline1textfield.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(addressline1textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 280, 20));

        jLabel10.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel10.setText("ADDRESS LINE 1: ");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, 20));

        messageJTextField.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(messageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 170, -1));

        citytexxtfield.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(citytexxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 280, 20));

        jLabel11.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel11.setText("PHONE NUMBER*: ");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, -1, -1));

        statetextfield.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(statetextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 250, 20));

        jLabel12.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel12.setText("STATE:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, -1, -1));

        firstnametextfield.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(firstnametextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 280, 20));

        jLabel13.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel13.setText("CITY: ");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, 20));

        dobtextfield.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(dobtextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 250, 20));

        jLabel14.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel14.setText("DATE OF BIRTH*:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, -1, -1));

        jLabel15.setFont(new java.awt.Font("Chalkboard SE", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 102));
        jLabel15.setText("ENTER PERSONAL INFORMATION: ");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel16.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel16.setText("COUNTRY:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, 20));

        countrytextfield1.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(countrytextfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 280, 20));

        jLabel17.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel17.setText("WHEN WAS THE LAST TIME YOU HAD DISEASE SYMPTOM (If Yes please mention, else mention as No)?");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 590, 60));

        phonenotextfield1.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(phonenotextfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 250, 20));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Seperated");
        add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Married");
        add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, -1, -1));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Single");
        add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, -1, -1));

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Widowed");
        add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, -1, -1));

        jLabel18.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        jLabel18.setText("OCCUPATION: ");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, 20));

        occupationTextField1.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        add(occupationTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 280, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        if ((!messageJTextField.getText().equals("")) && (!firstnametextfield.getText().equals(""))
                && (!lastnametextfield.getText().equals("")) && (!dobtextfield.getText().equals(""))
                && (!lasttimeTextField.getText().equals(""))) {

            boolean isError = false;
            try {
                String message = messageJTextField.getText();
                System.out.println("size" + enterprise.getOrganizationDirectory().getOrganizationList().size());
                DoctorTreatmentWorkRequest docrequest = new DoctorTreatmentWorkRequest();
                docrequest.setMessage(message);
                docrequest.setFirstName(firstnametextfield.getText());
                docrequest.setMiddleName(middlenametextfield.getText());
                docrequest.setLastName(lastnametextfield.getText());
                docrequest.setAge(Integer.parseInt(agetextfield.getText()));
                docrequest.setSex(sextextfield.getText());
                docrequest.setAddressLine1(addressline1textfield.getText());
                docrequest.setAddressLine2(addressline2textfield.getText());
                docrequest.setCity(citytexxtfield.getText());
                docrequest.setState(statetextfield.getText());
                docrequest.setCountry(lasttimeTextField.getText());
                docrequest.setDOB(dobtextfield.getText());
                docrequest.setPhoneNo(Integer.parseInt(phonenotextfield1.getText()));
                docrequest.setOccupation(occupationTextField1.getText());
                docrequest.setLastTimeDisease(lasttimeTextField.getText());
                if (jRadioButton2.isSelected()) {
                    docrequest.setMaritalStatus(jRadioButton2.getText());
                } else if (jRadioButton3.isSelected()) {
                    docrequest.setMaritalStatus(jRadioButton3.getText());
                } else if (jRadioButton4.isSelected()) {
                    docrequest.setMaritalStatus(jRadioButton4.getText());
                } else {
                    docrequest.setMaritalStatus(jRadioButton1.getText());
                }

                docrequest.setSender(userAccount);

                docrequest.setStatus("Sent");

                Organization org = null;

//                for (Network network : business.getNetworkList()) {
//                    for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
//
//                        for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
//                            System.out.println("o" + organization.getName());
//                            if (organization instanceof DoctorOrganization) {
//                                org = organization;
//                                break;
//                            }
//                        }
//                    }
                for (Network network : business.getNetworkList()) {
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        if (enterprise instanceof HospitalEnterprise) {
                            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                if (organization instanceof DoctorOrganization) {
                                    org = organization;
                                    break;
                                }
                            }
                        }

                    }
                }

                if (org != null) {
                    System.out.println("userinterface.Farmer.RequestDoctorTreatmentWorkAreaJPanel.requestTestJButtonActionPerformed()");
                    org.getWorkQueue().getWorkRequestList().add(docrequest);
                    userAccount.getWorkQueue().getWorkRequestList().add(docrequest);

                    JOptionPane.showMessageDialog(null, "You have successfully submitted your treatment request !", "Information", JOptionPane.INFORMATION_MESSAGE);
                }

                // }
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
        FarmertoDoctorWorkAreaJPanel ftdwjp = (FarmertoDoctorWorkAreaJPanel) component;
        ftdwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressline1textfield;
    private javax.swing.JTextField addressline2textfield;
    private javax.swing.JTextField agetextfield;
    private javax.swing.JButton backJButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField citytexxtfield;
    private javax.swing.JTextField countrytextfield1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField lastnametextfield;
    private javax.swing.JTextField lasttimeTextField;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JTextField middlenametextfield;
    private javax.swing.JTextField occupationTextField1;
    private javax.swing.JTextField phonenotextfield1;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTextField sextextfield;
    private javax.swing.JTextField statetextfield;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
