package capadelcliente;

import capabasededatos.Conexion;
import extras.ClaseValidacion;
import capadenegocio.*;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author DYLAN
 */
public class Logueo extends javax.swing.JFrame {

    int xMouse, yMouse;
    public static Padron padron;
    public static capadenegocio.Comite comite;
    public static String votoTemporalGeneral;
    public static String idEstudiantVotando;
    public static Conexion con;

    /**
     * Creates new form Logueo
     */
    public Logueo() {
        initComponents();
        /**
         * Crea el padrón tomando datos obteniendolos desde los métodos desde
         * el objeto Conexion
         */
        con = new Conexion();
        ArrayList<Estudiante> estudiantes = con.descargarEstudiantes();
        ArrayList<Asociacion> asociaciones = con.descargarPartidos();
        ArrayList<Voto> votos = con.descargarVotos();
        int estadoProceso = con.descargarEstadoProceso();
        String idPadron = con.descargarIDPadron();
        padron = new Padron(estudiantes, asociaciones, votos, estadoProceso, idPadron);

        ArrayList<Persona> integrantesComite = con.descargarComite();
        comite = new capadenegocio.Comite(integrantesComite);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        IDBanner = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Login = new javax.swing.JPanel();
        botonLogin = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(230, 120));
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(150, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/udla_logo_blanco_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(706, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 70));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 36)); // NOI18N
        jLabel1.setText("UDLA votaciones");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("ID Banner:");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel4.setText("INICIAR SESIÓN");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        IDBanner.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        IDBanner.setForeground(new java.awt.Color(204, 204, 204));
        IDBanner.setText("Ingrese su ID Banner");
        IDBanner.setToolTipText("");
        IDBanner.setBorder(null);
        IDBanner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IDBannerMousePressed(evt);
            }
        });
        IDBanner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDBannerActionPerformed(evt);
            }
        });
        bg.add(IDBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 360, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 280, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("Contraseña:");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 290, -1));

        Login.setBackground(new java.awt.Color(150, 0, 0));
        Login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inicioSesion(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginMouseExited(evt);
            }
        });

        botonLogin.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        botonLogin.setForeground(new java.awt.Color(255, 255, 255));
        botonLogin.setText("Iniciar sesión");

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonLogin)
                .addGap(35, 35, 35))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addComponent(botonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        bg.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 120, 40));

        Password.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        Password.setForeground(new java.awt.Color(204, 204, 204));
        Password.setText("*********");
        Password.setBorder(null);
        Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PasswordMousePressed(evt);
            }
        });
        bg.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 360, 20));

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setText("  X");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 770, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/4394943.png"))); // NOI18N
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDBannerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDBannerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDBannerActionPerformed

    private void LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseEntered
        Login.setBackground(new Color(200, 0, 0));
    }//GEN-LAST:event_LoginMouseEntered

    private void LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseExited
        Login.setBackground(new Color(150, 0, 0));
    }//GEN-LAST:event_LoginMouseExited

    private void IDBannerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDBannerMousePressed
        if (IDBanner.getText().equals("Ingrese su ID Banner")) {
            IDBanner.setText("");
            IDBanner.setForeground(Color.black);
        }
        if (String.valueOf(Password.getPassword()).isEmpty()) {
            Password.setText("*********");
            Password.setForeground(Color.gray);
        }
    }//GEN-LAST:event_IDBannerMousePressed

    private void PasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordMousePressed
        if (IDBanner.getText().isEmpty()) {
            IDBanner.setText("Ingrese su ID Banner");
            IDBanner.setForeground(Color.gray);
        }
        if (String.valueOf(Password.getPassword()).equals("*********")) {
            Password.setText("");
            Password.setForeground(Color.black);
        }
    }//GEN-LAST:event_PasswordMousePressed

    private void inicioSesion(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioSesion
        /**
         * Maneja el inicio de sesión según si es estudiante o integrante del
         * comité
         */
        String id = IDBanner.getText();
        String contrasenia = Password.getText();
        boolean idv = ClaseValidacion.validarUsuario(id);
        boolean contraseniav = ClaseValidacion.validarContrasenia(contrasenia);

        if (idv && contraseniav) {
            Persona p = padron.buscarEstudiante(id);

            if (p != null) {
                Estudiante e = (Estudiante) p;
                if (padron.getEstadoProceso() == 2) {
                    if (!e.isaVotado()) {
                        if (p.validarCredenciales(contrasenia)) {
                            idEstudiantVotando = id;
                            Votacion y = new Votacion();
                            y.setVisible(true);
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "La clave o usuario proporcionados son inválidos");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Usted ya ha votado");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El proceso de votación no está disponible");
                }
            } else {
                p = comite.buscarIntegrante(id);
                if (p != null) {
                    if (p.validarCredenciales(Password.getText())) {
                        Comite y = new Comite();
                        y.setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "La clave o usuario registrados son inválidos");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El id proporcionado no se encuentra resistrado\n"
                            + "en la base de datos");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Alguno de los campos ingresados es inválido");
        }
    }//GEN-LAST:event_inicioSesion

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        jPanel3.setBackground(new Color(150, 0, 0));
        jLabel7.setForeground(Color.WHITE);
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        jPanel3.setBackground(new Color(250, 250, 250));
        jLabel7.setForeground(new Color(0, 0, 0));

    }//GEN-LAST:event_jPanel3MouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jPanel3.setBackground(new Color(150, 0, 0));
        jLabel7.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jPanel3.setBackground(new Color(250, 250, 250));
        jLabel7.setForeground(new Color(0, 0, 0));

    }//GEN-LAST:event_jLabel7MouseExited

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
            java.util.logging.Logger.getLogger(Logueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logueo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDBanner;
    private javax.swing.JPanel Login;
    private javax.swing.JPasswordField Password;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel botonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
