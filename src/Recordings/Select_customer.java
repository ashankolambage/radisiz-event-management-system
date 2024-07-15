/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Recordings;

import CLS.DB;
import java.awt.Component;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.ui.tabbedui.RootPanel;

/**
 *
 * @author Arjuna
 */
public class Select_customer extends javax.swing.JFrame {
    private Component RootPanel;

    /**
     * Creates new form select_customer
     */
    public Select_customer() {
        initComponents();
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
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Select Customer");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Name Or Id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 22, -1, -1));

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 19, 227, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Customer Name ", "No", "Street", "City", "NIC", "Gender", "Mobile No"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 74, 787, 314));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 400));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-823)/2, (screenSize.height-438)/2, 823, 438);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged

    }//GEN-LAST:event_formWindowStateChanged

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained

    }//GEN-LAST:event_jTextField1FocusGained

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        if (evt.getClickCount() == 2) {
            String ss = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
            Rec_customer_register.jButton2.requestFocus();
            try {
                ResultSet rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_customer WHERE reg_no = '"+ss+"'");
                while (rs.next()){
                    Rec_customer_register.jTextField1.setText(rs.getString("reg_no"));
                    Rec_customer_register.jDateChooser1.setDate(rs.getDate("date"));
                    Rec_customer_register.jComboBox1.setSelectedItem(rs.getString("title"));
                    Rec_customer_register.jTextField3.setText(rs.getString("name"));
                    Rec_customer_register.jTextField4.setText(rs.getString("position"));
                    Rec_customer_register.jTextField5.setText(rs.getString("company"));
                    Rec_customer_register.jTextField6.setText(rs.getString("no"));
                    Rec_customer_register.jTextField7.setText(rs.getString("street"));
                    Rec_customer_register.jTextField8.setText(rs.getString("city"));
                    Rec_customer_register.jTextField9.setText(rs.getString("nic"));
                    if (rs.getString("gender").equals("Male")){
                        Rec_customer_register.jRadioButton1.setSelected(true);
                        Rec_customer_register.jRadioButton2.setSelected(false);
                    }else{
                        Rec_customer_register.jRadioButton2.setSelected(true);
                        Rec_customer_register.jRadioButton1.setSelected(false);
                    }
                    Rec_customer_register.jTextField10.setText(rs.getString("mobile"));
                    Rec_customer_register.jTextField11.setText(rs.getString("land"));
                    Rec_customer_register.jTextField12.setText(rs.getString("email"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.dispose();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        loadtable();
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Select_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Select_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Select_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Select_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Select_customer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void loadtable() {
        ResultSet rs = null;
        
        try {
            rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_customer");
                if (!rs.next()){
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(RootPanel, "<html><center>There Are No Registered Customers<br>Please Register Customers And</br> <br>Try Again</br></center></html>", "Information", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_customer");
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.setRowCount(0);
                    while (rs.next()){
                        Vector v = new Vector();
                        v.add(rs.getString("reg_no"));
                        v.add(rs.getString("name"));
                        v.add(rs.getString("no"));
                        v.add(rs.getString("street"));
                        v.add(rs.getString("city"));
                        v.add(rs.getString("nic"));
                        v.add(rs.getString("gender"));
                        v.add(rs.getString("mobile"));
                        dtm.addRow(v);
                    }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
