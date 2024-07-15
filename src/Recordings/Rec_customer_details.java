/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Recordings;

import CLS.DB;
import java.awt.Component;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.ui.tabbedui.RootPanel;

/**
 *
 * @author Arjuna
 */
public class Rec_customer_details extends javax.swing.JPanel {
    private Component RootPanel;

    /**
     * Creates new form Deal_customer_details
     */
    
    int i = 0;
    
    public Rec_customer_details() {
        initComponents();
        i = 1;
    }
    
    public static String id = "";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1030, 550));
        setMinimumSize(new java.awt.Dimension(1030, 550));
        setPreferredSize(new java.awt.Dimension(990, 530));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(1030, 550));
        jPanel1.setMinimumSize(new java.awt.Dimension(1030, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(1030, 550));
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });
        jPanel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jPanel1PropertyChange(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Position", "Company", "No", "Street", "City", "NIC", "Mobile no", "Land line no", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 940, 390));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Customer Details");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 190, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/content bar.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 30));

        jLabel21.setBackground(new java.awt.Color(51, 51, 51));
        jLabel21.setOpaque(true);
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1406204471_user_male.png"))); // NOI18N
        jButton1.setText("View Reomved Customers");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, 200, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1406203781_meanicons_24.png"))); // NOI18N
        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 180, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1406203726_editor_list_view_hambuger_menu.png"))); // NOI18N
        jButton3.setText("More Details");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 130, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Search By Date :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 150, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("To");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, 20));

        jDateChooser2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser2PropertyChange(evt);
            }
        });
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 150, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name Or Id :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 200, -1));

        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 90, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 530));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        ResultSet rs = null;
        
        if(jTable1.isColumnSelected(jTable1.getSelectedColumn())){
            if (jTable1.isRowSelected(jTable1.getSelectedRow())){
                if (jButton2.getText().equals("Remove")){
                String s = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
                try {
                    DB.getCon().createStatement().executeUpdate("UPDATE recording_customer SET state = '"+"Remove"+"' WHERE reg_no = '"+s+"'");
                    rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_customer WHERE state = '"+"Not_Remove"+"'");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else{
                String s = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
                try {
                    DB.getCon().createStatement().executeUpdate("UPDATE recording_customer SET state = '"+"Not_Remove"+"' WHERE reg_no = '"+s+"'");
                    rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_customer WHERE state = '"+"Remove"+"'");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
                try {
                    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                    dtm.setRowCount(0);
                    while (rs.next()){
                        Vector v = new Vector();
                        v.add(rs.getString("reg_no"));
                        v.add(rs.getString("name"));
                        v.add(rs.getString("position"));
                        v.add(rs.getString("company"));
                        v.add(rs.getString("no"));
                        v.add(rs.getString("street"));
                        v.add(rs.getString("city"));
                        v.add(rs.getString("nic"));
                        v.add(rs.getString("mobile"));
                        v.add(rs.getString("land"));
                        v.add(rs.getString("email"));
                        dtm.addRow(v);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        ResultSet rs = null;
        if (jButton1.getText().equals("View Reomved Customers")){
            try {
                rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_customer WHERE state = '"+"Remove"+"'");
                if (!rs.next()){
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(RootPanel, "There Are No Removed Customers", "Information", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_customer WHERE state = '"+"Remove"+"'");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            jButton1.setText("View Current Customers");
            jButton2.setText("Undo Remove");
            jTextField1.requestFocus();
        }else{
            try {
                jButton1.setText("View Reomved Customers");
                jButton2.setText("Remove");
                rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_customer WHERE state = '"+"Not_Remove"+"'");
                if (!rs.next()){
                    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                    dtm.setRowCount(0);
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(RootPanel, "<html><center>There Are No Registered Customers<br>Please Register Customers And</br> <br>Try Again</br></center></html>", "Information", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_customer WHERE state = '"+"Not_Remove"+"'");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            jButton1.setText("View Reomved Customers");
            jButton2.setText("Remove");
            jTextField1.requestFocus();
        }
        
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
                while (rs.next()){
                    Vector v = new Vector();
                        v.add(rs.getString("reg_no"));
                        v.add(rs.getString("name"));
                        v.add(rs.getString("position"));
                        v.add(rs.getString("company"));
                        v.add(rs.getString("no"));
                        v.add(rs.getString("street"));
                        v.add(rs.getString("city"));
                        v.add(rs.getString("nic"));
                        v.add(rs.getString("mobile"));
                        v.add(rs.getString("land"));
                        v.add(rs.getString("email"));
                        dtm.addRow(v);
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jPanel1PropertyChange

        jTextField1.requestFocus();
        jDateChooser2.setEnabled(false);
    }//GEN-LAST:event_jPanel1PropertyChange

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        int raw = jTable1.getSelectedRowCount();
        if (raw == 1){
            id = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
            Customer_details4 cd = new Customer_details4();
            cd.setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained

        if (i == 1){
            load_table();
            i = 2;
        }
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased

        id = jTextField1.getText();
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped

    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        int ii = 0;
        if ((jDateChooser1.getDate() == null) &(jDateChooser2.getDate() != null)){
            ii = 1;
        }else if ((jDateChooser1.getDate() != null) &(jDateChooser2.getDate() == null)){
            ii = 1;
        }
        if (ii == 1){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(RootPanel, "Please Select Next Date");
        }else{
            ResultSet rs = null;
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        if (jTextField1.getText().equals("") & jDateChooser1.getDate() != null & jDateChooser2.getDate() != null){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = jDateChooser1.getDate();
            String date1 = sdf.format(d);
            d = jDateChooser2.getDate();
            String date2 = sdf.format(d);
            try {
                rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_customer WHERE date BETWEEN '"+date1+"' AND '"+date2+"'");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if ((!jTextField1.getText().equals("")) & jDateChooser1.getDate() != null & jDateChooser2.getDate() != null){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = jDateChooser1.getDate();
            String date1 = sdf.format(d);
            d = jDateChooser2.getDate();
            String date2 = sdf.format(d);

            if (jTextField1.getText().length() >= 5){
                String s = id.substring(0, 5);
                try {
                    if (s.equals("evcs_")){
                        rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_customer WHERE date BETWEEN '"+date1+"' AND '"+date2+"' AND event_id LIKE '"+jTextField1.getText()+"%'");
                    }else{
                        rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_customer WHERE date BETWEEN '"+date1+"' AND '"+date2+"' AND name LIKE '%"+jTextField1.getText()+"%'");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else{
                try {
                    rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_customer WHERE date BETWEEN '"+date1+"' AND '"+date2+"' AND name LIKE '%"+jTextField1.getText()+"%'");
                    System.out.println("please");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }else if ((!jTextField1.getText().equals("")) & jDateChooser1.getDate() == null & jDateChooser2.getDate() == null){
            if (jTextField1.getText().length() >= 5){
                String s = id.substring(0, 5);
                try {
                    if (s.equals("evcs_")){
                        rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_customer WHERE reg_no LIKE '"+jTextField1.getText()+"%'");
                    }else{
                        rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_customer WHERE name LIKE '%"+jTextField1.getText()+"%'");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else{
                try {
                    rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_customer WHERE name LIKE '%"+jTextField1.getText()+"%'");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        try {
            while (rs.next()){
                Vector v = new Vector();
                    v.add(rs.getString("reg_no"));
                    v.add(rs.getString("name"));
                    v.add(rs.getString("position"));
                    v.add(rs.getString("company"));
                    v.add(rs.getString("no"));
                    v.add(rs.getString("street"));
                    v.add(rs.getString("city"));
                    v.add(rs.getString("nic"));
                    v.add(rs.getString("mobile"));
                    v.add(rs.getString("land"));
                    v.add(rs.getString("email"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained

        
    }//GEN-LAST:event_jPanel1FocusGained

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        if (evt.getClickCount() == 2){
            int raw = jTable1.getSelectedRowCount();
            if (raw == 1){
                id = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
                Customer_details4 cd = new Customer_details4();
                cd.setVisible(true);
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jDateChooser2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser2PropertyChange

        jDateChooser2.setMinSelectableDate(jDateChooser1.getDate());
    }//GEN-LAST:event_jDateChooser2PropertyChange

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange

        jDateChooser2.setEnabled(true);
    }//GEN-LAST:event_jDateChooser1PropertyChange

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void load_table() {
        ResultSet rs = null;
        try {
            rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_customer WHERE state = '"+"Not_Remove"+"'");
                if (!rs.next()){
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(RootPanel, "<html><center>There Are No Registered Customers<br>Please Register Customers And</br> <br>Try Again</br></center></html>", "Information", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_customer WHERE state = '"+"Not_Remove"+"'");
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
                        v.add(rs.getString("position"));
                        v.add(rs.getString("company"));
                        v.add(rs.getString("no"));
                        v.add(rs.getString("street"));
                        v.add(rs.getString("city"));
                        v.add(rs.getString("nic"));
                        v.add(rs.getString("mobile"));
                        v.add(rs.getString("land"));
                        v.add(rs.getString("email"));
                        dtm.addRow(v);
                    }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
