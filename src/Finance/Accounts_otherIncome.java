/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Finance;

import CLS.DB;
import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import org.jfree.ui.tabbedui.RootPanel;

/**
 *
 * @author Arjuna
 */
public class Accounts_otherIncome extends javax.swing.JPanel {
    private Component RootPanel;

    /**
     * Creates new form Accounts_otherIncome
     */
    
    Border brr = null;
    Border brr2 = null;
    Border brr3 = null;
    
    public Accounts_otherIncome() {
        initComponents();
        autogen();
    }
    
    double amount = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(1010, 500));
        setMinimumSize(new java.awt.Dimension(1010, 500));
        setPreferredSize(new java.awt.Dimension(1010, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(1010, 510));
        jPanel1.setMinimumSize(new java.awt.Dimension(1010, 510));
        jPanel1.setPreferredSize(new java.awt.Dimension(1010, 510));
        jPanel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jPanel1PropertyChange(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 210, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Date :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Descriptions :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Amount :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Slip no :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 70, -1));

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 180, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextArea1FocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 490, 160));

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Print-icon.png"))); // NOI18N
        jButton6.setText("Print");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton6.setBounds(10, 10, 100, 30);
        jLayeredPane2.add(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton8.setBackground(new java.awt.Color(0, 51, 51));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Calculator");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jButton8.setBounds(120, 10, 100, 30);
        jLayeredPane2.add(jButton8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1406203980_editor_document_file_add_2.png"))); // NOI18N
        jButton1.setText("Record");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(340, 10, 110, 30);
        jLayeredPane2.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new small save.png"))); // NOI18N
        jButton9.setText("Save");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jButton9.setBounds(230, 10, 100, 30);
        jLayeredPane2.add(jButton9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel1.add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 460, 50));

        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Other Income informations");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/content bar.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 30));

        jLabel22.setBackground(new java.awt.Color(51, 51, 51));
        jLabel22.setOpaque(true);
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 30));

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 200, 30));

        jTextField6.setEditable(false);
        jTextField6.setText("Rs.");
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 240, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(42, 42, 205));
        jLabel11.setText("Payment Type :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, -1, 20));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(42, 42, 205));
        jRadioButton1.setText("Cash");
        jRadioButton1.setOpaque(false);
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 260, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(42, 42, 205));
        jRadioButton2.setText("Cheque");
        jRadioButton2.setOpaque(false);
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });
        jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton2ItemStateChanged(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 260, -1, -1));

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bank info", 0, 0, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(42, 42, 205));
        jLabel16.setText("Bank :");
        jLabel16.setBounds(10, 80, 38, 15);
        jLayeredPane3.add(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(42, 42, 205));
        jLabel17.setText("Cheque no :");
        jLabel17.setBounds(10, 40, 74, 15);
        jLayeredPane3.add(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(42, 42, 205));
        jLabel18.setText("Branch :");
        jLabel18.setBounds(10, 120, 50, 15);
        jLayeredPane3.add(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField11.setBackground(new java.awt.Color(227, 217, 217));
        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(51, 51, 255));
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jTextField11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField11FocusGained(evt);
            }
        });
        jTextField11.setBounds(90, 30, 210, 30);
        jLayeredPane3.add(jTextField11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField12.setBackground(new java.awt.Color(227, 217, 217));
        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(51, 51, 255));
        jTextField12.setBounds(90, 70, 210, 30);
        jLayeredPane3.add(jTextField12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField13.setBackground(new java.awt.Color(227, 217, 217));
        jTextField13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(51, 51, 255));
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jTextField13.setBounds(90, 110, 210, 30);
        jLayeredPane3.add(jTextField13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel1.add(jLayeredPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 310, 160));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 510));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed

    }//GEN-LAST:event_jTextField5KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        new Reports.Reports_about_other_income().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        int iii = 0;
        Border br = new LineBorder(Color.red);
        if (jRadioButton1.isSelected()){
            if (jDateChooser1.getDate() == null){
                jDateChooser1.setBorder(br);
                iii = 1;
            }
            if (jTextArea1.getText().isEmpty()){
                jTextArea1.setBorder(br);
                iii = 1;
            }
            if (jTextField5.getText().isEmpty()){
                jTextField5.setBorder(br);
                iii = 1;
            }
        }else{
            if (jDateChooser1.getDate() == null){
                jDateChooser1.setBorder(br);
                iii = 1;
            }
            if (jTextArea1.getText().isEmpty()){
                jTextArea1.setBorder(br);
                iii = 1;
            }
            if (jTextField5.getText().isEmpty()){
                jTextField5.setBorder(br);
                iii = 1;
            }
            if (jTextField11.getText().isEmpty()){
                jTextField11.setBorder(br);
                iii = 1;
            }
            if (jTextField12.getText().isEmpty()){
                jTextField12.setBorder(br);
                iii = 1;
            }
            if (jTextField13.getText().isEmpty()){
                jTextField13.setBorder(br);
                iii = 1;
            }
        }
        
        if (iii == 1){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(RootPanel, "Complete These Textboxes", "Error", JOptionPane.ERROR_MESSAGE);
            jTextArea1.requestFocus();
        }else{
            try {
                ResultSet rs = DB.getCon().createStatement().executeQuery("SELECT slip_no FROM other_income WHERE slip_no = '"+jTextField1.getText()+"'");
                if(!rs.next()){
                    String type = "";
                    amount = Double.parseDouble(jTextField5.getText());
                    Date d = jDateChooser1.getDate();
                    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
                    SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
                    String s1 = sdf1.format(d);
                    String s2 = sdf2.format(d);
                    if (jRadioButton1.isSelected()) {
                        type = "Cash";
                        try {
                            DB.getCon().createStatement().executeUpdate("INSERT INTO other_income (slip_no,date,time,description,amount,payment_type,user) VALUES ('"+jTextField1.getText()+"','"+s1+"','"+s2+"','"+jTextArea1.getText()+"','"+amount+"','"+type+"','"+Login.User_login.user+"')");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else if(jRadioButton2.isSelected()) {
                        type = "Cheque";
                        try {
                            DB.getCon().createStatement().executeUpdate("INSERT INTO other_income VALUES('"+jTextField1.getText()+"','"+s1+"','"+s2+"','"+jTextArea1.getText()+"','"+amount+"','"+type+"','"+jTextField11.getText()+"','"+jTextField12.getText()+"','"+jTextField13.getText()+"','"+Login.User_login.user+"')");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    clear();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            autogen();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(RootPanel, "Saved Sucessful");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        jTextArea1.requestFocus();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed

    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased

//        try {
  ///          ResultSet rs = cls.DB.getCon().createStatement().executeQuery("select * from other_income where slip_no = '"+jTextField1.getText()+"'");
     ///       while(rs.next()){
//                jTextField1.setText(rs.getString("slip_no"));
  ///              jDateChooser2.setDate(rs.getDate("date"));
     //           jTextArea1.setText(rs.getString("description"));
//                jTextField2.setText(rs.getString("cheque_no"));
  ///              jTextField3.setText(rs.getString("bank"));
     ///           jTextField4.setText(rs.getString("branch"));
//                jTextField5.setText(rs.getString("amount"));
//
  //              if (rs.getString("type").equals("Cash")) {
    //                jRadioButton1.setSelected(true);
      //          } else {
//                    jRadioButton2.setSelected(true);
  //              }
//
  //          }
    //    } catch (Exception e) {
//            e.printStackTrace();
  //      }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        new Calculator.Cal().setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased

    }//GEN-LAST:event_jTextField5KeyReleased

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed

        int iii = 0;
        Border br = new LineBorder(Color.red);
        if (jRadioButton1.isSelected()){
            if (jDateChooser1.getDate() == null){
                jDateChooser1.setBorder(br);
                iii = 1;
            }
            if (jTextArea1.getText().isEmpty()){
                jTextArea1.setBorder(br);
                iii = 1;
            }
            if (jTextField5.getText().isEmpty()){
                jTextField5.setBorder(br);
                iii = 1;
            }
        }else{
            if (jDateChooser1.getDate() == null){
                jDateChooser1.setBorder(br);
                iii = 1;
            }
            if (jTextArea1.getText().isEmpty()){
                jTextArea1.setBorder(br);
                iii = 1;
            }
            if (jTextField5.getText().isEmpty()){
                jTextField5.setBorder(br);
                iii = 1;
            }
            if (jTextField11.getText().isEmpty()){
                jTextField11.setBorder(br);
                iii = 1;
            }
            if (jTextField12.getText().isEmpty()){
                jTextField12.setBorder(br);
                iii = 1;
            }
            if (jTextField13.getText().isEmpty()){
                jTextField13.setBorder(br);
                iii = 1;
            }
        }
        if (iii == 1){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(RootPanel, "Complete These Textboxes", "Error", JOptionPane.ERROR_MESSAGE);
            jTextArea1.requestFocus();
        }else{
            if (jRadioButton2.isSelected()){
                jTextField11.requestFocus();
            }else{
                jButton9.requestFocus();
            }
        }
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked

    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged

        jLayeredPane3.setVisible(false);
    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked

    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged

        jLayeredPane3.setVisible(true);
    }//GEN-LAST:event_jRadioButton2ItemStateChanged

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed

        jTextField12.requestFocus();
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField11FocusGained

        jDateChooser1.setBorder(brr2);
        jTextField5.setBorder(brr);
        jTextArea1.setBorder(brr3);
    }//GEN-LAST:event_jTextField11FocusGained

    private void jPanel1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jPanel1PropertyChange

        brr = jTextField5.getBorder();
        brr2 = jDateChooser1.getBorder();
        brr3 = jTextArea1.getBorder();
        jTextArea1.requestFocus();
    }//GEN-LAST:event_jPanel1PropertyChange

    private void jTextArea1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea1FocusGained

        jDateChooser1.setBorder(brr2);
        jTextField5.setBorder(brr);
        jTextField11.setBorder(brr);
        jTextField12.setBorder(brr);
        jTextField13.setBorder(brr);
        jTextArea1.setBorder(brr3);
    }//GEN-LAST:event_jTextArea1FocusGained

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed

        jButton9.requestFocus();
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange

        Date dd = new Date();
        jDateChooser1.setMaxSelectableDate(dd);
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped

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
    }//GEN-LAST:event_jTextField5KeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

    private void clear() {
        autogen();
        jRadioButton1.setSelected(true);
        jRadioButton2.setSelected(false);
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        jTextField5.setText("");
        jTextArea1.setText("");
        jTextArea1.requestFocus();
    }

    private void autogen() {
        Date d = new Date();
        jDateChooser1.setDate(d);
        jRadioButton1.setSelected(true);
        jRadioButton2.setSelected(false);
        try {
            ResultSet rs = DB.getCon().createStatement().executeQuery("SELECT * FROM other_income");
                if (!rs.next()){
                    jTextField1.setText("oi_00000001");
                }else{
                    rs = DB.getCon().createStatement().executeQuery("SELECT MAX(slip_no) FROM other_income");
                    while (rs.next()){
                        String s = rs.getString("MAX(slip_no)");
                        int i = Integer.parseInt(s.substring(3, 11));
                        i+=1;
                        NumberFormat formatter = new DecimalFormat("00000000");
                        jTextField1.setText("oi_" + formatter.format(i));
                    }
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
