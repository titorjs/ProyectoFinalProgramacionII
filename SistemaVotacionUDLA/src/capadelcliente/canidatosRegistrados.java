package capadelcliente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import capadenegocio.Asociacion;
import capadenegocio.Candidato;
import capadenegocio.Estudiante;
import capadenegocio.Facultades;
import capadenegocio.Facultades.Facultad;
import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class canidatosRegistrados extends javax.swing.JFrame {

    int xMouse, yMouse;

    public canidatosRegistrados() {
        initComponents();
        this.setLocationRelativeTo(null);
        actualizar();
        MouseEvent evt = null;
        mostrarTodos(evt);
    }

    public void actualizar() {
        asociacionesRegistradas.removeAllItems();
        for (capadenegocio.Asociacion a : Logueo.padron.getAsociaciones()) {
            if (!a.getNombre().equals("blanco")) {
                asociacionesRegistradas.addItem(a.getNombre());
            }
        }
        categoria.removeAllItems();
        categoria.addItem("ASEUDLA General");
        for (Facultades.Facultad f : Facultades.Facultad.values()) {
            categoria.addItem(f.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_PropuestasAprobadas = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        categoria = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        asociacionesRegistradas = new javax.swing.JComboBox<>();
        jPanel_MostrarPA = new javax.swing.JPanel();
        jLabel_MostrarPA = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dignidad = new javax.swing.JComboBox<>();
        jPanel_MostrarPA1 = new javax.swing.JPanel();
        jLabel_MostrarPA1 = new javax.swing.JLabel();
        jPanel_MostrarPA2 = new javax.swing.JPanel();
        jLabel_MostrarPA2 = new javax.swing.JLabel();
        jPanel_MostrarPA3 = new javax.swing.JPanel();
        jLabel_MostrarPA3 = new javax.swing.JLabel();
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

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel3.setText("A continuación se presentan los candidatos que han sido registrados:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 30));

        jScrollPane3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextArea_PropuestasAprobadas.setBackground(new java.awt.Color(236, 234, 234));
        jTextArea_PropuestasAprobadas.setColumns(20);
        jTextArea_PropuestasAprobadas.setRows(5);
        jScrollPane3.setViewportView(jTextArea_PropuestasAprobadas);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 460, 290));

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel11.setText("Dignidad:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, 30));

        categoria.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        categoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 130, 30));

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel10.setText("Asociación:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, -1, 30));

        asociacionesRegistradas.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        asociacionesRegistradas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(asociacionesRegistradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 130, 30));

        jPanel_MostrarPA.setBackground(new java.awt.Color(150, 0, 0));
        jPanel_MostrarPA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel_MostrarPA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_MostrarPA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarCandidato(evt);
            }
        });

        jLabel_MostrarPA.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jLabel_MostrarPA.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_MostrarPA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_MostrarPA.setText("MOSTRAR");
        jLabel_MostrarPA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarCandidato(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_MostrarPAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MostrarPAMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel_MostrarPALayout = new javax.swing.GroupLayout(jPanel_MostrarPA);
        jPanel_MostrarPA.setLayout(jPanel_MostrarPALayout);
        jPanel_MostrarPALayout.setHorizontalGroup(
            jPanel_MostrarPALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_MostrarPA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
        );
        jPanel_MostrarPALayout.setVerticalGroup(
            jPanel_MostrarPALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MostrarPALayout.createSequentialGroup()
                .addComponent(jLabel_MostrarPA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel_MostrarPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, 40));

        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel12.setText("Categoría:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, 30));

        dignidad.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        dignidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRESIDENTE", "VICEPRESIDENTE" }));
        dignidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(dignidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 130, 30));

        jPanel_MostrarPA1.setBackground(new java.awt.Color(150, 0, 0));
        jPanel_MostrarPA1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel_MostrarPA1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_MostrarPA1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarTodos(evt);
            }
        });

        jLabel_MostrarPA1.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jLabel_MostrarPA1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_MostrarPA1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_MostrarPA1.setText("TODOS");
        jLabel_MostrarPA1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarTodos(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_MostrarPA1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MostrarPA1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel_MostrarPA1Layout = new javax.swing.GroupLayout(jPanel_MostrarPA1);
        jPanel_MostrarPA1.setLayout(jPanel_MostrarPA1Layout);
        jPanel_MostrarPA1Layout.setHorizontalGroup(
            jPanel_MostrarPA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MostrarPA1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_MostrarPA1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_MostrarPA1Layout.setVerticalGroup(
            jPanel_MostrarPA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_MostrarPA1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel_MostrarPA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, -1, 40));

        jPanel_MostrarPA2.setBackground(new java.awt.Color(150, 0, 0));
        jPanel_MostrarPA2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel_MostrarPA2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_MostrarPA2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarCandidato(evt);
            }
        });

        jLabel_MostrarPA2.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jLabel_MostrarPA2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_MostrarPA2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_MostrarPA2.setText("ELIMINAR");
        jLabel_MostrarPA2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarCandidato(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_MostrarPA2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MostrarPA2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel_MostrarPA2Layout = new javax.swing.GroupLayout(jPanel_MostrarPA2);
        jPanel_MostrarPA2.setLayout(jPanel_MostrarPA2Layout);
        jPanel_MostrarPA2Layout.setHorizontalGroup(
            jPanel_MostrarPA2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_MostrarPA2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        jPanel_MostrarPA2Layout.setVerticalGroup(
            jPanel_MostrarPA2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MostrarPA2Layout.createSequentialGroup()
                .addComponent(jLabel_MostrarPA2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel_MostrarPA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, -1, 40));

        jPanel_MostrarPA3.setBackground(new java.awt.Color(150, 0, 0));
        jPanel_MostrarPA3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel_MostrarPA3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_MostrarPA3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_MostrarPA3mostrarTodos(evt);
            }
        });

        jLabel_MostrarPA3.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jLabel_MostrarPA3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_MostrarPA3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_MostrarPA3.setText("FINALIZAR PROCESO");
        jLabel_MostrarPA3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finalizarProceso(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_MostrarPA3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MostrarPA3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel_MostrarPA3Layout = new javax.swing.GroupLayout(jPanel_MostrarPA3);
        jPanel_MostrarPA3.setLayout(jPanel_MostrarPA3Layout);
        jPanel_MostrarPA3Layout.setHorizontalGroup(
            jPanel_MostrarPA3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_MostrarPA3, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
        );
        jPanel_MostrarPA3Layout.setVerticalGroup(
            jPanel_MostrarPA3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_MostrarPA3, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel_MostrarPA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, -1, 40));

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 800, 380));

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
        jLabel_Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel_Atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

    private void jLabel_MostrarPAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MostrarPAMouseEntered
        jPanel_MostrarPA.setBackground(new Color(200, 0, 0));
    }//GEN-LAST:event_jLabel_MostrarPAMouseEntered

    private void jLabel_MostrarPAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MostrarPAMouseExited
        jPanel_MostrarPA.setBackground(new Color(150, 0, 0));
    }//GEN-LAST:event_jLabel_MostrarPAMouseExited

    private void mostrarCandidato(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarCandidato
        int dignidad = this.dignidad.getSelectedIndex();
        String asociacion = asociacionesRegistradas.getSelectedItem().toString();
        String id;
        Candidato c = null;
        String texto = "";
        Asociacion as = Logueo.padron.buscarAsociacion(asociacion);
        if (categoria.getSelectedIndex() == 0) {
            if (dignidad == 0) {
                c = as.getPresidenteGeneral();
                texto = "CANDIDATO PRESIDENTE GENERAL";
            } else {
                c = as.getVicepresidenteGeneral();
                texto = "CANDIDATO VICEPRESIDENTE GENERAL";
            }
        } else {
            String facultad = categoria.getSelectedItem().toString();
            if (dignidad == 0) {
                c = as.getPresidentesFacultad().get(Facultad.valueOf(facultad));
                texto = "CANDIDATO PRESIDENTE FACULTAD";
            } else {
                c = as.getVicepresidentesFacultad().get(Facultad.valueOf(facultad));
                texto = "CANDIDATO VICEPRESIDENTE FACULTAD";
            }
        }
        if (c != null) {
            id = c.getEstudiante();
            Estudiante e = Logueo.padron.buscarEstudiante(id);
            texto += "\n\n"
                    + "Nombres: " + e.getNombre() + " " + e.getApellido()
                    + "\nFacultad: " + e.getFacultad().toString()
                    + "\nPromedio General: " + e.getPromedioGeneral()
                    + "\nEstado Diciplinario: " + ((e.isEstadoDiciplinario()) ? "en orden" : "falta(s) registrada(s)");
        } else {
            texto = "No se ha registrado aún este candidato.";
        }
        jTextArea_PropuestasAprobadas.setText(texto);
    }//GEN-LAST:event_mostrarCandidato

    private void jLabel_MostrarPA1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MostrarPA1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_MostrarPA1MouseEntered

    private void jLabel_MostrarPA1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MostrarPA1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_MostrarPA1MouseExited

    private void mostrarTodos(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarTodos
        String texto = "";
        for (Asociacion a : Logueo.padron.getAsociaciones()) {
            if (!a.getNombre().equals("blanco")) {
                texto += "PARTIDO " + a.getNombre() + "\n\n"
                        + "Eslogan: " + a.getEslogan() + "\n\n"
                        + "CANDIDATOS\n\n";
                if (a.getPresidenteGeneral() != null) {
                    texto += "Candidato Presidente General(id): " + a.getPresidenteGeneral().getEstudiante() + "\n";
                } else {
                    texto += "Candidato Presidente General(id): no agregado aún\n";
                }
                if (a.getVicepresidenteGeneral() != null) {
                    texto += "Candidato Vicepresidente General(id): " + a.getVicepresidenteGeneral().getEstudiante() + "\n";
                } else {
                    texto += "Candidato Vicepresidente General(id): no agregado aún\n";
                }
                for (Facultad f : Facultad.values()) {
                    Candidato p = a.getPresidentesFacultad().get(f);
                    if (p != null) {
                        texto += "Candidato Presidente " + f.toString() + "(id): " + p.getEstudiante() + "\n";
                    } else {
                        texto += "Candidato Presidente " + f.toString() + "(id): no agregado aún\n";
                    }
                    Candidato v = a.getVicepresidentesFacultad().get(f);
                    if (v != null) {
                        texto += "Candidato Vicepresidente " + f.toString() + "(id): " + v.getEstudiante() + "\n";
                    } else {
                        texto += "Candidato Vicepresidente " + f.toString() + "(id): no agregado aún\n";
                    }
                }
            }
        }
        jTextArea_PropuestasAprobadas.setText(texto);
    }//GEN-LAST:event_mostrarTodos

    private void jLabel_MostrarPA2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MostrarPA2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_MostrarPA2MouseEntered

    private void jLabel_MostrarPA2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MostrarPA2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_MostrarPA2MouseExited

    private void finalizarProceso(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalizarProceso
        if (Logueo.padron.getEstadoProceso() == 1) {
            if (Logueo.padron.candidatosCompletos()) {
                if (Logueo.con.actualizarEstadoVotaciones()) {
                    Logueo.padron.setEstadoProcesoVotaciones();
                    JOptionPane.showMessageDialog(null, "Proceso finalizado con éxito");
                    Manejoasociacionesycandidatos m = new Manejoasociacionesycandidatos();
                    m.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo finalizar el proceso,\n"
                            + "inténtelo de nuevo más tarde");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No puede finalizar el proces,\n"
                        + "no todos los candidatos han sido registrados");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El proceso ya finalizó");
        }

    }//GEN-LAST:event_finalizarProceso

    private void jLabel_MostrarPA3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MostrarPA3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_MostrarPA3MouseEntered

    private void jLabel_MostrarPA3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MostrarPA3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_MostrarPA3MouseExited

    private void jPanel_MostrarPA3mostrarTodos(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_MostrarPA3mostrarTodos
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel_MostrarPA3mostrarTodos

    private void eliminarCandidato(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarCandidato
        if (Logueo.padron.getEstadoProceso() == 1) {
            String asociacion = asociacionesRegistradas.getSelectedItem().toString();
            int dignidad = this.dignidad.getSelectedIndex();
            if (categoria.getSelectedIndex() == 0) {
                if (dignidad == 0) {
                    if (Logueo.con.eliminarCandidatoGeneral(asociacion, true)) {
                        Logueo.padron.buscarAsociacion(asociacion).eliminarCandidatoGeneral(true);
                        JOptionPane.showMessageDialog(null, "Candidato eliminado con éxito, refresque para verificar");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al eliminar el candidato,\n"
                                + "Inténtelo de nuevo más tarde");
                    }
                } else {
                    if (Logueo.con.eliminarCandidatoGeneral(asociacion, false)) {
                        Logueo.padron.buscarAsociacion(asociacion).eliminarCandidatoGeneral(false);
                        JOptionPane.showMessageDialog(null, "Candidato eliminado con éxito, refresque para verificar");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al eliminar el candidato,\n"
                                + "Inténtelo de nuevo más tarde");
                    }
                }
            } else {
                if (dignidad == 0) {
                    String facultad = categoria.getSelectedItem().toString();
                    if (Logueo.con.eliminarCandidatoFacultad(asociacion, facultad, true)) {
                        Logueo.padron.buscarAsociacion(asociacion).eliminarCandidatoFacultad(true, Facultad.valueOf(facultad));
                        JOptionPane.showMessageDialog(null, "Candidato eliminado con éxito, refresque para verificar");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al eliminar el candidato,\n"
                                + "Inténtelo de nuevo más tarde");
                    }
                } else {
                    String facultad = categoria.getSelectedItem().toString();
                    if (Logueo.con.eliminarCandidatoFacultad(asociacion, facultad, false)) {
                        Logueo.padron.buscarAsociacion(asociacion).eliminarCandidatoFacultad(false, Facultad.valueOf(facultad));
                        JOptionPane.showMessageDialog(null, "Candidato eliminado con éxito, refresque para verificar");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al eliminar el candidato,\n"
                                + "Inténtelo de nuevo más tarde");
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Opción no disponible, ya finalizo el proceso");
        }
    }//GEN-LAST:event_eliminarCandidato

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
    private javax.swing.JComboBox<String> categoria;
    private javax.swing.JComboBox<String> dignidad;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Atras;
    private javax.swing.JLabel jLabel_MostrarPA;
    private javax.swing.JLabel jLabel_MostrarPA1;
    private javax.swing.JLabel jLabel_MostrarPA2;
    private javax.swing.JLabel jLabel_MostrarPA3;
    private javax.swing.JLabel jLabel_Salir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel_Atras;
    private javax.swing.JPanel jPanel_MostrarPA;
    private javax.swing.JPanel jPanel_MostrarPA1;
    private javax.swing.JPanel jPanel_MostrarPA2;
    private javax.swing.JPanel jPanel_MostrarPA3;
    private javax.swing.JPanel jPanel_Salir;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTextArea jTextArea_PropuestasAprobadas;
    // End of variables declaration//GEN-END:variables
}
