/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Recordings;

import CLS.DB;
import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import Event.Deal_customer_register;
import Event.Deal_event_register;
import Main_Menu.Event_calender;
import Event.Event_manager_1;
import Main_Menu.Main_menu;

/**
 *
 * @author Arjuna
 */
public class Rec_song_info1 extends javax.swing.JPanel {

    /**
     * Creates new form rec_info
     */
    
    public static String cu_id = "";
    public static String recc_id = "";
    private Component RootPanel;
    Border brr = null;
    Border brr2 = null;
    Border brr3 = null;
    
    public Rec_song_info1() {
        initComponents();
        autogen();
        loadcombo();
        autofill();
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
        jLabel6 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(990, 530));
        setMinimumSize(new java.awt.Dimension(990, 530));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(1030, 550));
        jPanel1.setMinimumSize(new java.awt.Dimension(1030, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(1030, 550));
        jPanel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jPanel1PropertyChange(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Song informations");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Language :");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 90, -1));

        jTextField2.setEditable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 490, 30));

        jTextField5.setEditable(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 490, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("From :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Description :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 90, -1));

        jTextField9.setEditable(false);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 130, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Time :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 70, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Recording ID :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 110, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("To :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Unit Prise :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 130, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/content bar.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Customer ID :");
        jPanel2.add(jLabel2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Customer id ");
        jPanel2.add(jLabel1);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 220, 30));

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 190, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Generes :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 120, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Song name :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 110, -1));

        jLabel22.setBackground(new java.awt.Color(51, 51, 51));
        jLabel22.setOpaque(true);
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 30));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Arrow-Back-icon.png"))); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 480, 110, 30));

        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBox2PropertyChange(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 180, 30));

        jTextField3.setEditable(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 170, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Add Language :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, 20));

        jTextField4.setEditable(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 490, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Song Duration :");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 130, -1));

        jTextField10.setEditable(false);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField10KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 490, 30));

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 180, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00:00", "00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 90, 30));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00:00", "00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30" }));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 90, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 530));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        jPanel1.removeAll();
        GroupLayout gl2=new GroupLayout(jPanel1);
        jPanel1.setLayout(gl2);
        Rec_info ri = new Rec_info();
        gl2.setHorizontalGroup(gl2.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent( ri, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        gl2.setVerticalGroup(gl2.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent( ri, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased

    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

        jTextField2.requestFocus();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed

        jTextField4.requestFocus();
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

        if (jComboBox1.getSelectedItem().equals("Other Language")){
            jTextField3.requestFocus();
        }else{
            jComboBox3.requestFocus();
        }
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged

        if (jComboBox2.getItemCount() != 0){
            if (jComboBox2.getSelectedItem().equals("Other Language")){
                jLabel3.setVisible(true);
                jTextField3.setVisible(true);
                jTextField3.requestFocus();
            }else{
                jLabel3.setVisible(false);
                jTextField3.setVisible(false);
            }
        }
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBox2PropertyChange

    }//GEN-LAST:event_jComboBox2PropertyChange

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed

        jTextField9.requestFocus();
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed

        int iii = 0;
        Border br = new LineBorder(Color.red);
        if (jTextField3.getText().isEmpty()){
            jTextField3.setBorder(br);
            iii = 1;
        }
        if (iii == 1){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(RootPanel, "Complete These Textbox", "Error", JOptionPane.ERROR_MESSAGE);
            jTextField3.requestFocus();
        }else{
            try {
                String ss = "";
                ResultSet rs = DB.getCon().createStatement().executeQuery("SELECT * FROM song_language");
                if (!rs.next()){
                    ss = ("sl_001");
                }else{
                    rs = DB.getCon().createStatement().executeQuery("SELECT MAX(language_id) FROM song_language");
                    while (rs.next()){
                        String s = rs.getString("MAX(language_id)");
                        int i = Integer.parseInt(s.substring(3, 6));
                        i+=1;
                        NumberFormat formatter = new DecimalFormat("000");
                        ss = ("sl_" + formatter.format(i));
                    }
                }
                
                DB.getCon().createStatement().executeUpdate("INSERT INTO song_language VALUES ('"+ss+"','"+jTextField3.getText()+"')");
                jComboBox2.removeAllItems();
                loadcombo();
                jTextField3.setText("");
                jLabel3.setVisible(false);
                jTextField3.setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jPanel1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jPanel1PropertyChange

        brr = jTextField2.getBorder();
        brr2 = jDateChooser1.getBorder();
        brr3 = jComboBox1.getBorder();
        jTextField2.requestFocus();
    }//GEN-LAST:event_jPanel1PropertyChange

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained

        jTextField3.setBorder(brr);
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained

        jDateChooser1.setBorder(brr2);
        jTextField2.setBorder(brr);
        jComboBox2.setBorder(brr3);
        jComboBox1.setBorder(brr3);
        jComboBox3.setBorder(brr3);
        jTextField5.setBorder(brr);
        jTextField4.setBorder(brr);
        jTextField10.setBorder(brr);
        jTextField9.setBorder(brr);
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed

        jTextField10.requestFocus();
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyTyped

        int i = evt.getKeyChar();
        char c = evt.getKeyChar();
        if (!(c>= '0' & c<= '9')){
            if (i == 46){
            }else if (i == 58){
            }else{
                evt.consume();
            }
            if (i == 8){
            }else if (i == 10){
            }else if (i == 46){
            }else if (i == 58){
            }else{
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }//GEN-LAST:event_jTextField10KeyTyped

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped

        int i = evt.getKeyChar();
        char c = evt.getKeyChar();
        if (!(c>= '0' & c<= '9')){
            if (i != 46){
                evt.consume();
            }
            if (i == 8){
            }else if (i == 10){
            }else if (i == 46){
            }else{
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }//GEN-LAST:event_jTextField9KeyTyped

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange

        Date d = new Date();
        jDateChooser1.setMaxSelectableDate(d);
    }//GEN-LAST:event_jDateChooser1PropertyChange

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    private void loadcombo() {

        Date d = new Date();
        jDateChooser1.setDate(d);
        jComboBox2.removeAllItems();
        try {
            ResultSet rs = DB.getCon().createStatement().executeQuery("SELECT laguage FROM song_language");
            while (rs.next()){
                jComboBox2.addItem(rs.getString("laguage"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        jComboBox2.addItem("Other Language");
        if (jComboBox2.getSelectedItem().equals("Other Language")){
            jLabel3.setVisible(true);
            jTextField3.setVisible(true);
        }else{
            jLabel3.setVisible(false);
            jTextField3.setVisible(false);
        }
    }

    private void autogen() {
        jLabel1.setText(Rec_customer_register.rec_cus_id);
        try {
            ResultSet rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info");
                if (!rs.next()){
                    jTextField1.setText("re_00000001");
                }else{
                    rs = DB.getCon().createStatement().executeQuery("SELECT MAX(recording_id) FROM recording_song_info");
                    while (rs.next()){
                        String s = rs.getString("MAX(recording_id)");
                        int i = Integer.parseInt(s.substring(3, 11));
                        i+=1;
                        NumberFormat formatter = new DecimalFormat("00000000");
                        jTextField1.setText("re_" + formatter.format(i));
                    }
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void autofill() {
        jTextField1.setText(Rec_info.id);
        try {
            String ss = "";
            ResultSet rs = DB.getCon().createStatement().executeQuery("SELECT * FROM recording_song_info WHERE recording_id = '"+jTextField1.getText()+"'");
            while (rs.next()){
                jLabel1.setText(rs.getString("recording_customer_reg_no"));
                jDateChooser1.setDate(rs.getDate("date"));
                jTextField2.setText(rs.getString("song_name"));
                ss = (rs.getString("song_language_id"));
                jComboBox1.setSelectedItem(rs.getString("start_time"));
                jComboBox3.setSelectedItem(rs.getString("end_time"));
                jTextField5.setText(rs.getString("genres"));
                jTextField4.setText(rs.getString("description"));
                jTextField10.setText(rs.getString("song_duration"));
                jTextField9.setText(rs.getString("unit_prise"));
            }
            rs = DB.getCon().createStatement().executeQuery("SELECT laguage FROM song_language WHERE language_id = '"+ss+"'");
            while (rs.next()){
                jComboBox2.setSelectedItem(rs.getString("laguage"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
