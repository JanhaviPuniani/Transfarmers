/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Farmer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.GovermentEnterprise;
import Business.Network.Network;
import Business.Organization.MinistryOfEducationOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EducationEventsWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AMY
 */
public class RequestEventJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX
            = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    /**
     * Creates new form RequestEventJPanel
     */
    public RequestEventJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        populateComboBox();
    }

    private void populateComboBox() {
        networkJComboBox.removeAllItems();
        for (Network network : business.getNetworkList()) {
            networkJComboBox.addItem(network);
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
        networkJComboBox = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        expressInterestBtn = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        backBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Chalkboard SE", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("NETWORK");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 97, 136, 40));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sender", "EventName", "EventType", "EventDate", "Event Time", "Venue", "Description", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(workRequestJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 900, 143));

        jLabel2.setFont(new java.awt.Font("Chalkboard SE", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("EDUCATIONAL EVENT");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        expressInterestBtn.setBackground(new java.awt.Color(0, 102, 102));
        expressInterestBtn.setFont(new java.awt.Font("Chalkboard SE", 1, 14)); // NOI18N
        expressInterestBtn.setForeground(new java.awt.Color(255, 255, 255));
        expressInterestBtn.setText("EXPRESS INTEREST !!!");
        expressInterestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expressInterestBtnActionPerformed(evt);
            }
        });
        add(expressInterestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 190, -1));

        jCheckBox1.setFont(new java.awt.Font("Chalkboard SE", 1, 13)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 102, 102));
        jCheckBox1.setText("Claim Conveyance Allowance");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        backBtn.setBackground(new java.awt.Color(0, 102, 102));
        backBtn.setFont(new java.awt.Font("Chalkboard SE", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 445, -1, -1));

        jLabel3.setFont(new java.awt.Font("Chalkboard SE", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("*ENTER VALID EMAIL ID :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, -1, 20));

        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });
        add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, 210, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        // TODO add your handling code here:
        Network network = (Network) networkJComboBox.getSelectedItem();

        populateWorkQueueTable(network);
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void expressInterestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expressInterestBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row ");
            return;
        } else {
            boolean isValid = true;
            EducationEventsWorkRequest request = (EducationEventsWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);

            if (request.getStatus().equals("Pending")) {
                Date date = request.getEvent().getEventDate();

                int y = date.getYear();
                int m = date.getMonth();
                int d = date.getDay();

                // check if he has registered for an event at same time
                for (WorkRequest workRequest : userAccount.getWorkQueue().getWorkRequestList()) {
                    if (workRequest instanceof EducationEventsWorkRequest) {
                        if (workRequest.getStatus() != null && workRequest.getStatus().equals("Completed")) {
                            Date registeredDate = ((EducationEventsWorkRequest) workRequest).getEvent().getEventDate();
                            int day = registeredDate.getDay();
                            int month = registeredDate.getMonth();
                            int year = registeredDate.getYear();
                            if (d == day && m == month && y == year) {
                                isValid = false;
                                JOptionPane.showMessageDialog(null, "You have already registered for another event at same date", "Warning", JOptionPane.WARNING_MESSAGE);
                                break;
                            }
                        }
                    }
                }
                boolean isValidEmail = validate(emailTextField.getText());
                if (!isValidEmail) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid email address", "Warning", JOptionPane.WARNING_MESSAGE);
                }
                if (isValid && isValidEmail) {
                    request.setReceiver(userAccount);
                    request.setStatus("Completed");
                    userAccount.getWorkQueue().getWorkRequestList().add(request);
                    Network network = (Network) networkJComboBox.getSelectedItem();
                    populateWorkQueueTable(network);
                    JOptionPane.showMessageDialog(null, "You have successfully registered for event!!");
                    SendMailUsingAuthentication sendEmail = new SendMailUsingAuthentication();
                    sendEmail.send("puniani.janhavi@gmail.com", "..jan16..",
                            emailTextField.getText(), "Congratulations !!", "We are excited to see you at the Event");
                    JOptionPane.showMessageDialog(null, "Check your Mail Inbox");
                    emailTextField.setText("");
                }

            } else {
                JOptionPane.showMessageDialog(null, "You have already registered for this event", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }

    }//GEN-LAST:event_expressInterestBtnActionPerformed

    public static boolean validate(String emailStr) {
        if (emailStr == null) {
            return false;
        }
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FarmerWorkAreaJPanel dwjp = (FarmerWorkAreaJPanel) component;
        dwjp.populateEventRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    public void populateWorkQueueTable(Network network) {

        if (network == null) {
            return;
        }
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise instanceof GovermentEnterprise) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof MinistryOfEducationOrganization) {
                        for (WorkRequest work : organization.getWorkQueue().getWorkRequestList()) {
                            if (work instanceof EducationEventsWorkRequest) {
                                EducationEventsWorkRequest educationEventsWorkRequest = (EducationEventsWorkRequest) work;
                                Object[] row = new Object[8];
                                row[0] = educationEventsWorkRequest;
                                if (educationEventsWorkRequest.getEvent() != null) {
                                    row[1] = educationEventsWorkRequest.getEvent().getEventName();
                                    row[2] = educationEventsWorkRequest.getEvent().getEventType();
                                    row[3] = educationEventsWorkRequest.getEvent().getEventDate();
                                    row[4] = educationEventsWorkRequest.getEvent().getTime();
                                    row[5] = educationEventsWorkRequest.getEvent().getVenue();
                                    row[6] = educationEventsWorkRequest.getEvent().getDescription();
                                    if (jCheckBox1.isSelected()) {
                                        educationEventsWorkRequest.setClaimedMoney(educationEventsWorkRequest.getEvent().getConveyanceAllowance());
                                    }
                                }
                                row[7] = educationEventsWorkRequest.getStatus();

                                model.addRow(row);
                            }
                        }
                    }

                }
            }

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JButton expressInterestBtn;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
