/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import AppPackage.AnimationClass;
import CLS.DB;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Arjuna
 */

public class User_login extends javax.swing.JFrame {

    public static String user;
    int xMouse;
    int yMouse;
    AnimationClass AC = new AnimationClass();

    public User_login() {
        initComponents();
        slideshow();
    }

    public void slideshow() {
        new Thread() {
            int count;

            @Override
            public void run() {
                try {
                    while (true) {
                        switch (count) {
                            case 0:
                                ImageIcon ii = new ImageIcon(getClass().getResource("/img/welcome.png"));
                                BackgroundSlide1.setIcon(ii);

                                Thread.sleep(5000);
                                AC.jLabelXLeft(0, -686, 20, 7, BackgroundSlide1);
                                AC.jLabelXLeft(686, 0, 20, 7, BackgroundSlide2);
                                count = 1;

                                break;

                            case 1:
                                ImageIcon ii2 = new ImageIcon(getClass().getResource("/img/slide2.png"));
                                BackgroundSlide2.setIcon(ii2);

                                Thread.sleep(5000);
                                AC.jLabelXRight(-686, 0, 20, 7, BackgroundSlide1);
                                AC.jLabelXRight(0, 686, 20, 7, BackgroundSlide2);
                                count = 2;
                                break;

                            case 2:
                                ImageIcon ii3 = new ImageIcon(getClass().getResource("/img/slide3.png"));
                                BackgroundSlide1.setIcon(ii3);

                                Thread.sleep(5000);
                                AC.jLabelXLeft(0, -686, 20, 7, BackgroundSlide1);
                                AC.jLabelXLeft(686, 0, 20, 7, BackgroundSlide2);
                                count = 3;

                                break;

                            case 3:
                                ImageIcon ii4 = new ImageIcon(getClass().getResource("/img/slide4.png"));
                                BackgroundSlide2.setIcon(ii4);

                                Thread.sleep(3000);
                                AC.jLabelXRight(-686, 0, 20, 7, BackgroundSlide1);
                                AC.jLabelXRight(0, 686, 20, 7, BackgroundSlide2);
                                count = 4;
                                break;

                            case 4:
                                ImageIcon ii5 = new ImageIcon(getClass().getResource("/img/slide5.png"));
                                BackgroundSlide1.setIcon(ii5);

                                Thread.sleep(3000);
                                AC.jLabelXLeft(0, -686, 20, 7, BackgroundSlide1);
                                AC.jLabelXLeft(686, 0, 20, 7, BackgroundSlide2);
                                count = 5;

                                break;

                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Exit = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FramDrag = new javax.swing.JLabel();
        TopBar = new javax.swing.JLabel();
        user_name = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        BackgroundSlide2 = new javax.swing.JLabel();
        BackgroundSlide1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ExitMouseReleased(evt);
            }
        });
        getContentPane().add(Exit);
        Exit.setBounds(654, 0, 30, 30);

        Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MinimizeMouseReleased(evt);
            }
        });
        getContentPane().add(Minimize);
        Minimize.setBounds(610, 0, 30, 30);

        Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/new button.png"))); // NOI18N
        Login.setContentAreaFilled(false);
        Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginMouseExited(evt);
            }
        });
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login);
        Login.setBounds(550, 360, 120, 40);

        jTextField1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.setBorder(null);
        jTextField1.setOpaque(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(31, 374, 189, 23);

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPasswordField1.setBorder(null);
        jPasswordField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPasswordField1.setOpaque(false);
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(312, 374, 190, 25);

        jLabel1.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("User name");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 340, 130, 30);

        jLabel2.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Password");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 340, 170, 30);

        FramDrag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FramDragMousePressed(evt);
            }
        });
        FramDrag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                FramDragMouseDragged(evt);
            }
        });
        getContentPane().add(FramDrag);
        FramDrag.setBounds(0, 0, 690, 410);

        TopBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new bar2.png"))); // NOI18N
        getContentPane().add(TopBar);
        TopBar.setBounds(0, 0, 690, 104);

        user_name.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/pass.png"))); // NOI18N
        getContentPane().add(user_name);
        user_name.setBounds(310, 370, 220, 30);

        password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/name.png"))); // NOI18N
        getContentPane().add(password);
        password.setBounds(30, 370, 220, 30);

        BackgroundSlide2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/slide2.png"))); // NOI18N
        getContentPane().add(BackgroundSlide2);
        BackgroundSlide2.setBounds(686, 0, 686, 410);

        BackgroundSlide1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/welcome.png"))); // NOI18N
        getContentPane().add(BackgroundSlide1);
        BackgroundSlide1.setBounds(0, 0, 690, 412);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-686)/2, (screenSize.height-412)/2, 686, 412);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
    }//GEN-LAST:event_ExitMouseClicked

    private void ExitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseReleased
        System.exit(0);
    }//GEN-LAST:event_ExitMouseReleased

    private void MinimizeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseReleased
        this.setState(User_login.ICONIFIED);
    }//GEN-LAST:event_MinimizeMouseReleased

    private void FramDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FramDragMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();


        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_FramDragMouseDragged

    private void FramDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FramDragMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_FramDragMousePressed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed

        login();
    }//GEN-LAST:event_LoginActionPerformed

    private void LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseEntered
        ImageIcon ii = new ImageIcon(getClass().getResource("/img/entered.png"));
        Login.setIcon(ii);
    }//GEN-LAST:event_LoginMouseEntered

    private void LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseExited
        ImageIcon ii2 = new ImageIcon(getClass().getResource("/img/exits.png"));
        Login.setIcon(ii2);
    }//GEN-LAST:event_LoginMouseExited

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        jPasswordField1.requestFocus();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed

    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed

        login();
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        jTextField1.requestFocus();
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

        user = jTextField1.getText();
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(User_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundSlide1;
    private javax.swing.JLabel BackgroundSlide2;
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel FramDrag;
    private javax.swing.JButton Login;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel TopBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel password;
    private javax.swing.JLabel user_name;
    // End of variables declaration//GEN-END:variables

    private void login() {
        try {
            ResultSet rs = DB.getCon().createStatement().executeQuery("SELECT * FROM login");
            if (rs.next()){
                String us = jTextField1.getText();
                String pa = new String(jPasswordField1.getPassword());
                if (jTextField1.getText().isEmpty()){
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(rootPane, "Please Enter User Name", "Error", JOptionPane.ERROR_MESSAGE);
                    jTextField1.requestFocus();
                }else if (pa.isEmpty()){
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(rootPane, "Please Enter Password", "Error", JOptionPane.ERROR_MESSAGE);
                    jPasswordField1.requestFocus();
                }else{
                    rs = DB.getCon().createStatement().executeQuery("SELECT * FROM login WHERE username = '"+us+"'");  
                    if (rs.next()){
                        rs = DB.getCon().createStatement().executeQuery("SELECT * FROM login WHERE password = '"+pa+"'");
                        if (rs.first()){
                            this.dispose();
                            new Main_Menu.Main_menu().setVisible(true);
                        }else{
                            Toolkit.getDefaultToolkit().beep();
                            JOptionPane.showMessageDialog(rootPane, "Password Is Incorrect", "Error", JOptionPane.ERROR_MESSAGE);
                            jPasswordField1.setText("");
                            jPasswordField1.requestFocus();
                        }
                    }else{
                        Toolkit.getDefaultToolkit().beep();
                        JOptionPane.showMessageDialog(rootPane, "User Name Is Incorrect", "Error", JOptionPane.ERROR_MESSAGE);
                        jTextField1.setText("");
                        jTextField1.requestFocus();
                    }
                }
            }else{
                new Main_Menu.Main_menu().setVisible(true);
                this.dispose();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
