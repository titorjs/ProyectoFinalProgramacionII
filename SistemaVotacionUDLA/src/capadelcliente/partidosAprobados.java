package capadelcliente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import capadenegocio.Asociacion;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class partidosAprobados extends javax.swing.JFrame {

    int xMouse, yMouse;

    public partidosAprobados() {
        initComponents();
        this.setLocationRelativeTo(null);
        actualizar();
    }

    private void actualizar() {
        String textoAsociaciones = "";
        int i = 1;
        List<Asociacion> asociaciones = (ArrayList<Asociacion>) Logueo.padron.getAsociaciones();
        Collections.sort(asociaciones, (p1, p2) -> Integer.compare(p2.getNumFirmas(), p1.getNumFirmas()));
        asociacionesRegistradas.removeAllItems();
        for (capadenegocio.Asociacion a : asociaciones) {
            if (!a.getNombre().equals("blanco")) {
                asociacionesRegistradas.addItem(a.getNombre());
                textoAsociaciones += "Posición por voto #" + i + "\n"
                        + "Nombre: " + a.getNombre() + "\n"
                        + "Presidente: " + a.getPresidenteAsociacion() + "\n"
                        + "Firmas: " + a.getNumFirmas() + "\n\n";
                i++;
            }
        }
        jTextArea_ListasSeleccionadas.setText(textoAsociaciones);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_ListasSeleccionadas = new javax.swing.JTextArea();
        jPanel_MostrarLP = new javax.swing.JPanel();
        jLabel_MostrarLP = new javax.swing.JLabel();
        jPanel_MostrarLA = new javax.swing.JPanel();
        jLabel_MostrarLA = new javax.swing.JLabel();
        asociacionesRegistradas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel_MostrarLA1 = new javax.swing.JPanel();
        jLabel_MostrarLA1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel_Salir = new javax.swing.JPanel();
        jLabel_Salir = new javax.swing.JLabel();
        jPanel_Atras = new javax.swing.JPanel();
        jLabel_Atras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(150, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 70));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/udla_logo_blanco_1.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 88, 48));

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextArea_ListasSeleccionadas.setEditable(false);
        jTextArea_ListasSeleccionadas.setBackground(new java.awt.Color(236, 234, 234));
        jTextArea_ListasSeleccionadas.setColumns(20);
        jTextArea_ListasSeleccionadas.setRows(5);
        jScrollPane3.setViewportView(jTextArea_ListasSeleccionadas);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 540, 310));

        jPanel_MostrarLP.setBackground(new java.awt.Color(150, 0, 0));
        jPanel_MostrarLP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel_MostrarLP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_MostrarLP.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jLabel_MostrarLP.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_MostrarLP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_MostrarLP.setText("ACTUALIZAR");
        jLabel_MostrarLP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizar(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_MostrarLPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MostrarLPMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel_MostrarLPLayout = new javax.swing.GroupLayout(jPanel_MostrarLP);
        jPanel_MostrarLP.setLayout(jPanel_MostrarLPLayout);
        jPanel_MostrarLPLayout.setHorizontalGroup(
            jPanel_MostrarLPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_MostrarLP, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );
        jPanel_MostrarLPLayout.setVerticalGroup(
            jPanel_MostrarLPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_MostrarLP, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel_MostrarLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 210, 40));

        jPanel_MostrarLA.setBackground(new java.awt.Color(150, 0, 0));
        jPanel_MostrarLA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel_MostrarLA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_MostrarLA.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jLabel_MostrarLA.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_MostrarLA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_MostrarLA.setText("ELIMINAR");
        jLabel_MostrarLA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarAsociacion(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_MostrarLAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MostrarLAMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel_MostrarLALayout = new javax.swing.GroupLayout(jPanel_MostrarLA);
        jPanel_MostrarLA.setLayout(jPanel_MostrarLALayout);
        jPanel_MostrarLALayout.setHorizontalGroup(
            jPanel_MostrarLALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_MostrarLA, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );
        jPanel_MostrarLALayout.setVerticalGroup(
            jPanel_MostrarLALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_MostrarLA, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel_MostrarLA, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 210, 40));

        asociacionesRegistradas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        asociacionesRegistradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asociacionesRegistradasActionPerformed(evt);
            }
        });
        jPanel2.add(asociacionesRegistradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 210, 20));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel4.setText("Listas Postulantes");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, -10, 150, 30));

        jPanel_MostrarLA1.setBackground(new java.awt.Color(150, 0, 0));
        jPanel_MostrarLA1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel_MostrarLA1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_MostrarLA1.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jLabel_MostrarLA1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_MostrarLA1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_MostrarLA1.setText("FINALIZAR PROCESO");
        jLabel_MostrarLA1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finalizarProceso(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_MostrarLA1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MostrarLA1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel_MostrarLA1Layout = new javax.swing.GroupLayout(jPanel_MostrarLA1);
        jPanel_MostrarLA1.setLayout(jPanel_MostrarLA1Layout);
        jPanel_MostrarLA1Layout.setHorizontalGroup(
            jPanel_MostrarLA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MostrarLA1Layout.createSequentialGroup()
                .addComponent(jLabel_MostrarLA1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        jPanel_MostrarLA1Layout.setVerticalGroup(
            jPanel_MostrarLA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_MostrarLA1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel_MostrarLA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 210, 40));

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 800, 390));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_Salir.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_Salir.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jLabel_Salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Salir.setText("X");
        jLabel_Salir.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel_Salir.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_SalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_SalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_SalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel_SalirLayout = new javax.swing.GroupLayout(jPanel_Salir);
        jPanel_Salir.setLayout(jPanel_SalirLayout);
        jPanel_SalirLayout.setHorizontalGroup(
            jPanel_SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SalirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_SalirLayout.setVerticalGroup(
            jPanel_SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SalirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        bg.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        jPanel_Atras.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_Atras.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jLabel_Atras.setText("<");
        jLabel_Atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_AtrasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_AtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_AtrasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel_AtrasLayout = new javax.swing.GroupLayout(jPanel_Atras);
        jPanel_Atras.setLayout(jPanel_AtrasLayout);
        jPanel_AtrasLayout.setHorizontalGroup(
            jPanel_AtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AtrasLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel_Atras)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel_AtrasLayout.setVerticalGroup(
            jPanel_AtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_AtrasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Atras)
                .addContainerGap())
        );

        bg.add(jPanel_Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel4MouseDragged

    private void jLabel_SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel_SalirMouseClicked

    private void jLabel_SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SalirMouseEntered
        jPanel_Salir.setBackground(new Color(150, 0, 0));
        jLabel_Salir.setForeground(Color.WHITE);

    }//GEN-LAST:event_jLabel_SalirMouseEntered

    private void jLabel_SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SalirMouseExited
        jPanel_Salir.setBackground(Color.WHITE);
        jLabel_Salir.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel_SalirMouseExited

    private void jLabel_AtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AtrasMouseEntered
        jPanel_Atras.setBackground(new Color(150, 0, 0));
        jLabel_Atras.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel_AtrasMouseEntered

    private void jLabel_AtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AtrasMouseExited
        jPanel_Atras.setBackground(Color.WHITE);
        jLabel_Atras.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel_AtrasMouseExited

    private void jLabel_AtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AtrasMouseClicked
        Manejoasociacionesycandidatos mac = new Manejoasociacionesycandidatos();
        mac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel_AtrasMouseClicked

    private void actualizar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar
        actualizar();
    }//GEN-LAST:event_actualizar

    private void jLabel_MostrarLPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MostrarLPMouseEntered
        jPanel_MostrarLP.setBackground(new Color(200, 0, 0));
    }//GEN-LAST:event_jLabel_MostrarLPMouseEntered

    private void jLabel_MostrarLPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MostrarLPMouseExited
        jPanel_MostrarLP.setBackground(new Color(150, 0, 0));
    }//GEN-LAST:event_jLabel_MostrarLPMouseExited

    private void jLabel_MostrarLAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MostrarLAMouseEntered
        jPanel_MostrarLA.setBackground(new Color(200, 0, 0));
    }//GEN-LAST:event_jLabel_MostrarLAMouseEntered

    private void jLabel_MostrarLAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MostrarLAMouseExited
        jPanel_MostrarLA.setBackground(new Color(150, 0, 0));
    }//GEN-LAST:event_jLabel_MostrarLAMouseExited

    private void asociacionesRegistradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asociacionesRegistradasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asociacionesRegistradasActionPerformed

    private void eliminarAsociacion(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarAsociacion
        if (Logueo.padron.getEstadoProceso() == 0) {
            
            if (asociacionesRegistradas.getSelectedIndex() != -1) {
                String asociacion = asociacionesRegistradas.getSelectedItem().toString();
                if (Logueo.con.eliminarPartido(asociacion)) {
                    Logueo.padron.eliminarAsociacion(asociacion);
                    JOptionPane.showMessageDialog(null, "Asociación eliminada con éxito, actualize para\n"
                            + "ver los cambios.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar la asociación,\n"
                            + "inténtelo de nuevo más tarde");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Primero ingrese un partido para poder eliminarlo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El proceso de asociaciones ya finalizó");
        }
    }//GEN-LAST:event_eliminarAsociacion

    private void finalizarProceso(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalizarProceso
        if (Logueo.padron.getEstadoProceso() == 0) {
            List<Asociacion> asociaciones = (ArrayList<Asociacion>) Logueo.padron.getAsociaciones();
            asociaciones.remove(Logueo.padron.buscarAsociacion("blanco"));
            if (asociaciones.size() >= 2) {
                Collections.sort(asociaciones, (p1, p2) -> Integer.compare(p2.getNumFirmas(), p1.getNumFirmas()));
                String primera = asociaciones.get(0).getNombre();
                String segunda = asociaciones.get(1).getNombre();
                String tercera = (asociaciones.size() >= 3) ? asociaciones.get(2).getNombre() : "No hay";
                int continuar = JOptionPane.showConfirmDialog(null,
                        "Las listas a aprobar son: \n"
                        + "   1. " + primera
                        + "\n   2.. " + segunda
                        + "\n   3.. " + tercera,
                        "Continuar", JOptionPane.YES_NO_OPTION);
                if (continuar == JOptionPane.YES_OPTION) {
                    boolean error = false;
                    int cantidad = asociaciones.size();
                    for (int i = 3; i < cantidad; i++) {
                        String a = asociaciones.get(3).getNombre();
                        if (Logueo.con.eliminarPartido(a)) {
                            Logueo.padron.eliminarAsociacion(a);
                        } else {
                            error = true;
                        }
                    }
                    if (error) {
                        JOptionPane.showMessageDialog(null, "Hubo un error durante la eliminación de los partidos,\n"
                                + "porfavor revise los partidos y de haber un error\n"
                                + "contacte a soporte e inténtelo de nuevo ");
                    } else {
                        if (Logueo.con.actualizarEstadoAgregacionCandidatos()) {
                            Logueo.padron.setEstadoProcesoRegistro();
                            JOptionPane.showMessageDialog(null, "Se finalizó correctamente el proceso");
                            Manejoasociacionesycandidatos m = new Manejoasociacionesycandidatos();
                            m.setVisible(true);
                            this.dispose();
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Se canceló el proceso");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay suficientes partidos para cerrar el proceso");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El proceso de asociaciones ya finalizó");
        }
    }//GEN-LAST:event_finalizarProceso

    private void jLabel_MostrarLA1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MostrarLA1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_MostrarLA1MouseEntered

    private void jLabel_MostrarLA1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MostrarLA1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_MostrarLA1MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel *
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
            java.util.logging.Logger.getLogger(partidosAprobados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(partidosAprobados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(partidosAprobados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(partidosAprobados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new partidosAprobados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> asociacionesRegistradas;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Atras;
    private javax.swing.JLabel jLabel_MostrarLA;
    private javax.swing.JLabel jLabel_MostrarLA1;
    private javax.swing.JLabel jLabel_MostrarLP;
    private javax.swing.JLabel jLabel_Salir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel_Atras;
    private javax.swing.JPanel jPanel_MostrarLA;
    private javax.swing.JPanel jPanel_MostrarLA1;
    private javax.swing.JPanel jPanel_MostrarLP;
    private javax.swing.JPanel jPanel_Salir;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTextArea jTextArea_ListasSeleccionadas;
    // End of variables declaration//GEN-END:variables
}
