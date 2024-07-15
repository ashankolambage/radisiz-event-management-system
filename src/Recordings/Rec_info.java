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

/**
 *
 * @author Arjuna
 */
public class Rec_info extends javax.swing.JPanel {

    /**
     * Creates new form rec_info
     */
    int i = 0;
    private Component RootPanel;
    
    public Rec_info() {
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(990, 530));
        setMinimumSize(new java.awt.Dimension(990, 530));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jPanel1PropertyChange(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Recording ID", "Song Name", "Customer ID", "Customer Name ", "Language", "Start Time", "End Time", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.getTableHeader().setReorderingAllowed(false);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 940, 360));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1406203726_editor_list_view_hambuger_menu.png"))); // NOI18N
        jButton6.setText("View Full Details");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 160, 50));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Song details");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 190, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/content bar.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 30));

        jLabel21.setBackground(new java.awt.Color(51, 51, 51));
        jLabel21.setOpaque(true);
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Search By Date :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 180, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("To");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, 20));

        jDateChooser2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser2PropertyChange(evt);
            }
        });
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 180, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1406203630_672408-search.png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 100, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name Or Id :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, -1, -1));

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
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 50, 180, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 530));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        int raw = jTable2.getSelectedRowCount();
        if (raw == 1){
            id = jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString();
            jPanel1.removeAll();
            GroupLayout layout = new GroupLayout(jPanel1);
            jPanel1.setLayout(layout);
            Rec_song_info1 rs = new Rec_song_info1();
            layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(rs, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
            layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(rs, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        ResultSet rs = null;
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
            try {
            id = jTextField1.getText();
            if (jTextField1.getText().equals("") & jDateChooser1.getDate() != null & jDateChooser2.getDate() != null){
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date d = jDateChooser1.getDate();
                String date1 = sdf.format(d);
                d = jDateChooser2.getDate();
                String date2 = sdf.format(d);
                rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info WHERE date BETWEEN '"+date1+"' AND '"+date2+"'");
            }else if ((!jTextField1.getText().equals("")) & jDateChooser1.getDate() != null & jDateChooser2.getDate() != null){
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date d = jDateChooser1.getDate();
                String date1 = sdf.format(d);
                d = jDateChooser2.getDate();
                String date2 = sdf.format(d);
                if (jTextField1.getText().length() >= 3){
                    String s = id.substring(0, 3);
                    if (s.equals("re_")){
                        rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info WHERE date BETWEEN '"+date1+"' AND '"+date2+"' AND recording_id LIKE '"+jTextField1.getText()+"%'");
                    }else{
                        rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info WHERE date BETWEEN '"+date1+"' AND '"+date2+"' AND song_name LIKE '%"+jTextField1.getText()+"%'");
                    }
                }else{
                    rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info WHERE date BETWEEN '"+date1+"' AND '"+date2+"' AND song_name LIKE '%"+jTextField1.getText()+"%'");
                }
            }else if ((!jTextField1.getText().equals("")) & jDateChooser1.getDate() == null & jDateChooser2.getDate() == null){
                if (jTextField1.getText().length() >= 3){
                    String s = id.substring(0, 3);
                    if (s.equals("re_")){
                        rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info WHERE recording_id LIKE '"+jTextField1.getText()+"%'");
                    }else{
                        rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info WHERE song_name LIKE '%"+jTextField1.getText()+"%'");
                    }
                }else{
                    rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info WHERE song_name LIKE '%"+jTextField1.getText()+"%'");
                }
            }
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            dtm.setRowCount(0);
            String ss = "";
            String ss2 = "";
            while (rs.next()){
                ss = rs.getString("recording_customer_reg_no");
                ss2 = rs.getString("song_language_id");
            }
            ResultSet rs2 = DB.getCon().createStatement().executeQuery("SELECT name FROM recording_customer WHERE reg_no = '"+ss+"'");
            while (rs2.next()){
                ss = rs2.getString("name");
            }
            rs2 = DB.getCon().createStatement().executeQuery("SELECT laguage FROM song_language WHERE language_id = '"+ss2+"'");
            while (rs2.next()){
                ss2 = rs2.getString("laguage");
            }
            id = jTextField1.getText();
            if (jTextField1.getText().equals("") & jDateChooser1.getDate() != null & jDateChooser2.getDate() != null){
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date d = jDateChooser1.getDate();
                String date1 = sdf.format(d);
                d = jDateChooser2.getDate();
                String date2 = sdf.format(d);
                rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info WHERE date BETWEEN '"+date1+"' AND '"+date2+"'");
            }else if ((!jTextField1.getText().equals("")) & jDateChooser1.getDate() != null & jDateChooser2.getDate() != null){
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date d = jDateChooser1.getDate();
                String date1 = sdf.format(d);
                d = jDateChooser2.getDate();
                String date2 = sdf.format(d);
                if (jTextField1.getText().length() >= 3){
                    String s = id.substring(0, 3);
                    if (s.equals("re_")){
                        rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info WHERE date BETWEEN '"+date1+"' AND '"+date2+"' AND recording_id LIKE '"+jTextField1.getText()+"%'");
                    }else{
                        rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info WHERE date BETWEEN '"+date1+"' AND '"+date2+"' AND song_name LIKE '%"+jTextField1.getText()+"%'");
                    }
                }else{
                    rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info WHERE date BETWEEN '"+date1+"' AND '"+date2+"' AND song_name LIKE '%"+jTextField1.getText()+"%'");
                }
            }else if ((!jTextField1.getText().equals("")) & jDateChooser1.getDate() == null & jDateChooser2.getDate() == null){
                if (jTextField1.getText().length() >= 3){
                    String s = id.substring(0, 3);
                    if (s.equals("re_")){
                        rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info WHERE recording_id LIKE '"+jTextField1.getText()+"%'");
                    }else{
                        rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info WHERE song_name LIKE '%"+jTextField1.getText()+"%'");
                    }
                }else{
                    rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info WHERE song_name LIKE '%"+jTextField1.getText()+"%'");
                }
            }
            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("recording_id"));
                v.add(rs.getString("song_name"));
                v.add(rs.getString("recording_customer_reg_no"));
                v.add(ss);
                v.add(ss2);
                v.add(rs.getString("start_time"));
                v.add(rs.getString("end_time"));
                v.add(rs.getString("date"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (jTextField1.getText().isEmpty() & jDateChooser1.getDate() == null & jDateChooser2.getDate() == null){
            loadtable();
        }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained

        if (i == 1){
            loadtable();
            i = 2;
        }
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased

        ResultSet rs = null;
        try {
            id = jTextField1.getText();
            if (jTextField1.getText().equals("") & jDateChooser1.getDate() != null & jDateChooser2.getDate() != null){
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date d = jDateChooser1.getDate();
                String date1 = sdf.format(d);
                d = jDateChooser2.getDate();
                String date2 = sdf.format(d);
                rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info WHERE date BETWEEN '"+date1+"' AND '"+date2+"'");
            }else if ((!jTextField1.getText().equals("")) & jDateChooser1.getDate() != null & jDateChooser2.getDate() != null){
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date d = jDateChooser1.getDate();
                String date1 = sdf.format(d);
                d = jDateChooser2.getDate();
                String date2 = sdf.format(d);
                if (jTextField1.getText().length() >= 3){
                    String s = id.substring(0, 3);
                    if (s.equals("re_")){
                        rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info WHERE date BETWEEN '"+date1+"' AND '"+date2+"' AND recording_id LIKE '"+jTextField1.getText()+"%'");
                    }else{
                        rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info WHERE date BETWEEN '"+date1+"' AND '"+date2+"' AND song_name LIKE '%"+jTextField1.getText()+"%'");
                    }
                }else{
                    rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info WHERE date BETWEEN '"+date1+"' AND '"+date2+"' AND song_name LIKE '%"+jTextField1.getText()+"%'");
                }
            }else if ((!jTextField1.getText().equals("")) & jDateChooser1.getDate() == null & jDateChooser2.getDate() == null){
                if (jTextField1.getText().length() >= 3){
                    String s = id.substring(0, 3);
                    if (s.equals("re_")){
                        rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info WHERE recording_id LIKE '"+jTextField1.getText()+"%'");
                    }else{
                        rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info WHERE song_name LIKE '%"+jTextField1.getText()+"%'");
                    }
                }else{
                    rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info WHERE song_name LIKE '%"+jTextField1.getText()+"%'");
                }
            }
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            dtm.setRowCount(0);
            String ss = "";
            String ss2 = "";
            while (rs.next()){
                ss = rs.getString("recording_customer_reg_no");
                ss2 = rs.getString("song_language_id");
            }
            ResultSet rs2 = DB.getCon().createStatement().executeQuery("SELECT name FROM recording_customer WHERE reg_no = '"+ss+"'");
            while (rs2.next()){
                ss = rs2.getString("name");
            }
            rs2 = DB.getCon().createStatement().executeQuery("SELECT laguage FROM song_language WHERE language_id = '"+ss2+"'");
            while (rs2.next()){
                ss2 = rs2.getString("laguage");
            }
            id = jTextField1.getText();
            if (jTextField1.getText().equals("") & jDateChooser1.getDate() != null & jDateChooser2.getDate() != null){
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date d = jDateChooser1.getDate();
                String date1 = sdf.format(d);
                d = jDateChooser2.getDate();
                String date2 = sdf.format(d);
                rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info WHERE date BETWEEN '"+date1+"' AND '"+date2+"'");
            }else if ((!jTextField1.getText().equals("")) & jDateChooser1.getDate() != null & jDateChooser2.getDate() != null){
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date d = jDateChooser1.getDate();
                String date1 = sdf.format(d);
                d = jDateChooser2.getDate();
                String date2 = sdf.format(d);
                if (jTextField1.getText().length() >= 3){
                    String s = id.substring(0, 3);
                    if (s.equals("re_")){
                        rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info WHERE date BETWEEN '"+date1+"' AND '"+date2+"' AND recording_id LIKE '"+jTextField1.getText()+"%'");
                    }else{
                        rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info WHERE date BETWEEN '"+date1+"' AND '"+date2+"' AND song_name LIKE '%"+jTextField1.getText()+"%'");
                    }
                }else{
                    rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info WHERE date BETWEEN '"+date1+"' AND '"+date2+"' AND song_name LIKE '%"+jTextField1.getText()+"%'");
                }
            }else if ((!jTextField1.getText().equals("")) & jDateChooser1.getDate() == null & jDateChooser2.getDate() == null){
                if (jTextField1.getText().length() >= 3){
                    String s = id.substring(0, 3);
                    if (s.equals("re_")){
                        rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info WHERE recording_id LIKE '"+jTextField1.getText()+"%'");
                    }else{
                        rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info WHERE song_name LIKE '%"+jTextField1.getText()+"%'");
                    }
                }else{
                    rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info WHERE song_name LIKE '%"+jTextField1.getText()+"%'");
                }
            }
            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("recording_id"));
                v.add(rs.getString("song_name"));
                v.add(rs.getString("recording_customer_reg_no"));
                v.add(ss);
                v.add(ss2);
                v.add(rs.getString("start_time"));
                v.add(rs.getString("end_time"));
                v.add(rs.getString("date"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (jTextField1.getText().isEmpty() & jDateChooser1.getDate() == null & jDateChooser2.getDate() == null){
            loadtable();
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped

    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

        if (evt.getClickCount() == 2){
            int raw = jTable2.getSelectedRowCount();
            if (raw == 1){
                id = jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString();
                jPanel1.removeAll();
                GroupLayout layout = new GroupLayout(jPanel1);
                jPanel1.setLayout(layout);
                Rec_song_info1 rs = new Rec_song_info1();
                layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(rs, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(rs, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
            }
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jDateChooser2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser2PropertyChange

        jDateChooser2.setMinSelectableDate(jDateChooser1.getDate());
    }//GEN-LAST:event_jDateChooser2PropertyChange

    private void jPanel1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jPanel1PropertyChange

        jTextField1.requestFocus();
        jDateChooser2.setEnabled(false);
    }//GEN-LAST:event_jPanel1PropertyChange

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange

        jDateChooser2.setEnabled(true);
    }//GEN-LAST:event_jDateChooser1PropertyChange

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void loadtable() {
        ResultSet rs = null;
        try {
            String ss = "";
            String ss2 = "";
            rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info");
            if (!rs.next()){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(RootPanel, "<html><center>There Are No Recorded Songs <br>Please Recording Songs And</br> <br>Try Again</br></center></html>", "Information", JOptionPane.INFORMATION_MESSAGE);
            }else{
                rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info");
                while (rs.next()){
                    ss = rs.getString("recording_customer_reg_no");
                    ss2 = rs.getString("song_language_id");
                }
                ResultSet rs2 = DB.getCon().createStatement().executeQuery("SELECT name FROM recording_customer WHERE reg_no = '"+ss+"'");
                while (rs2.next()){
                    ss = rs2.getString("name");
                }
                rs2 = DB.getCon().createStatement().executeQuery("SELECT laguage FROM song_language WHERE language_id = '"+ss2+"'");
                while (rs2.next()){
                    ss2 = rs2.getString("laguage");
                }
            }
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            dtm.setRowCount(0);
            rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info");
            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("recording_id"));
                v.add(rs.getString("song_name"));
                v.add(rs.getString("recording_customer_reg_no"));
                v.add(ss);
                v.add(ss2);
                v.add(rs.getString("start_time"));
                v.add(rs.getString("end_time"));
                v.add(rs.getString("date"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
