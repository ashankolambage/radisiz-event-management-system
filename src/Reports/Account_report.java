/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Reports;

import CLS.DB;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JRViewer;



/**
 *
 * @author Administrator
 */
public class Account_report extends javax.swing.JFrame {

    /**
     * Creates new form Reports_about_invoice
     */
    
    String is = null;
    String fdate = null;
    String ldate = null;
    Map mm = new HashMap();
    
    public Account_report() {
        initComponents();
        setlocation();
        load();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Yearly Report");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel2.setMinimumSize(new java.awt.Dimension(750, 600));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("FrankRuehl", 1, 20)); // NOI18N
        jLabel1.setText("Account Report");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));
        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 97, 740, 490));

        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 600, 150, 40));

        jButton6.setText("Print");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 600, 150, 40));

        jButton8.setText("Send as email");
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 150, 40));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Daily", "Date Range", "All" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 160, -1));

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 110, 30));
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 160, -1));

        jDateChooser2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser2PropertyChange(evt);
            }
        });
        jPanel2.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged

        Date d = new Date();
        if (jComboBox2.getSelectedIndex() == 1){
            jDateChooser1.setEnabled(true);
            jDateChooser2.setEnabled(true);
            jDateChooser1.setDate(d);
        }else if (jComboBox2.getSelectedIndex() == 2){
            jDateChooser1.setEnabled(false);
            jDateChooser2.setEnabled(false);
            jDateChooser1.setDate(null);
            jDateChooser2.setDate(null);
        }else{
            jDateChooser1.setEnabled(true);
            jDateChooser2.setEnabled(false);
            jDateChooser1.setDate(d);
            jDateChooser2.setDate(null);
        }
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        load();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jDateChooser2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser2PropertyChange

        jDateChooser2.setMinSelectableDate(jDateChooser1.getDate());
    }//GEN-LAST:event_jDateChooser2PropertyChange

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Account_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Account_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Account_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account_report().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    int total;
    
    private void credit() {
        try {
            ResultSet rs = DB.getCon().createStatement().executeQuery("SELECT total_prise FROM invoice");
            while (rs.next()){
                String s = rs.getString("total_prise");
                int i = Integer.parseInt(s);
                total = total + i;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void income() {
        try {
            ResultSet rs = DB.getCon().createStatement().executeQuery("SELECT amount FROM other_income");
            while (rs.next()){
                String s = rs.getString("amount");
                int i = Integer.parseInt(s);
                total = total + i;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void setlocation() {
        jComboBox2.setSelectedIndex(2);
        int fheight = this.getHeight();
        int fwidth = this.getWidth();
        
        int height = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        int width = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        
        width = ((width - fwidth) / 2);
        height = ((height - fheight) / 4);
        
        setLocation(width, height);
    }

    private void calculate() {
        mindate();
        mm.put("fdate", fdate);
        mm.put("ldate", ldate);
        ResultSet rs = null;
        double credit = 0;
        double debit = 0;
        try {
            double i = 0;
            rs = DB.getCon().createStatement().executeQuery("SELECT charge FROM pay_roll WHERE date >= '"+fdate+"' AND date <= '"+ldate+"'");
            while (rs.next()){
                i = i + rs.getInt("charge");
            }
            debit = debit + i;
            mm.put("payments", i);
            rs = DB.getCon().createStatement().executeQuery("SELECT amount FROM other_expense WHERE date >= '"+fdate+"' AND date <= '"+ldate+"'");
            while (rs.next()){
                i = i + rs.getInt("amount");
            }
            debit = debit + i;
            mm.put("expense", i);
            mm.put("debit", debit);
            rs = DB.getCon().createStatement().executeQuery("SELECT this_receipt_amount FROM event_invoice WHERE date >= '"+fdate+"' AND date <= '"+ldate+"'");
            while (rs.next()){
                i = i + rs.getInt("this_receipt_amount");
            }
            credit = credit + i;
            mm.put("event", i);
            rs = DB.getCon().createStatement().executeQuery("SELECT this_receipt_amount FROM recording_invoice WHERE date >= '"+fdate+"' AND date <= '"+ldate+"'");
            while (rs.next()){
                i = i + rs.getInt("this_receipt_amount");
            }
            credit = credit + i;
            mm.put("recording", i);
            rs = DB.getCon().createStatement().executeQuery("SELECT amount FROM other_income WHERE date >= '"+fdate+"' AND date <= '"+ldate+"'");
            while (rs.next()){
                i = i + rs.getInt("amount");
            }
            credit = credit + i;
            mm.put("income", i);
            mm.put("credit", credit);
            mm.put("profit", (credit - debit));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void load() {
        try {
            is = "D://Final Final Viva//Rreports//Account//Account 1.jrxml";
            calculate();
            InputStream iss = new FileInputStream(is);
            JasperReport jr = JasperCompileManager.compileReport(iss);
            JasperPrint jp = JasperFillManager.fillReport(jr, mm, DB.getCon());
            JRViewer jrv = new JRViewer(jp);
            if (jTabbedPane1.getTabCount() == 1){
                jTabbedPane1.removeAll();
            }
            jTabbedPane1.add("Accounts", jrv);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void mindate() {
        Date d = null;
        Date dd = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if (jComboBox2.getSelectedIndex() == 0){
            d = new Date();
            dd = new Date();
        }else if (jComboBox2.getSelectedIndex() == 1){
            d = jDateChooser1.getDate();
            dd = jDateChooser2.getDate();
        }else if (jComboBox2.getSelectedIndex() == 2){
            d = new Date("1990/01/01");
            dd = new Date();
        }
        fdate = sdf.format(d);
        ldate = sdf.format(dd);
    }
}