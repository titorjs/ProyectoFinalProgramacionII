package capadelcliente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import capadenegocio.Facultades;
import capadenegocio.Facultades.Facultad;
import extras.ClaseValidacion;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class ingresoPropuesta extends javax.swing.JFrame {

    int xMouse, yMouse;

    public ingresoPropuesta() {
        initComponents();
        this.setLocationRelativeTo(null);
        actualizar();
    }

    public void actualizar() {
        asociacionesRegistradas.removeAllItems();
        for (capadenegocio.Asociacion a : Logueo.padron.getAsociaciones()) {
            if(!a.getNombre().equals("blanco")){
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
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Propuesta5 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_Propuesta1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_Propuesta2 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea_Propuesta3 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea_Propuesta4 = new javax.swing.JTextArea();
        jPanel_Continuar = new javax.swing.JPanel();
        jLabel_Continuar = new javax.swing.JLabel();
        jPanel_Modificar = new javax.swing.JPanel();
        jLabel_Modificar = new javax.swing.JLabel();
        jPanel_Guardar = new javax.swing.JPanel();
        jLabel_Guardar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel_Salir = new javax.swing.JPanel();
        jLabel_Salir = new javax.swing.JLabel();
        jPanel_Atras = new javax.swing.JPanel();
        jLabel_Atras = new javax.swing.JLabel();
        asociacionesRegistradas = new javax.swing.JComboBox<>();
        categoria = new javax.swing.JComboBox<>();
        jPanel_Buscar = new javax.swing.JPanel();
        jLabel_Buscar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(150, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/udla_logo_blanco_1.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 88, 48));

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, 70));

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel10.setText("Asociacion");
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, 30));

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel11.setText("Categoría:");
        bg.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel3.setText("A continuación se presentan las 5 propuestas de la asociación:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 6, 561, -1));

        jTextArea_Propuesta5.setEditable(false);
        jTextArea_Propuesta5.setColumns(20);
        jTextArea_Propuesta5.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Propuesta5);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 410, 40));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel4.setText("N° 1");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel5.setText("N° 2");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jTextArea_Propuesta1.setEditable(false);
        jTextArea_Propuesta1.setColumns(20);
        jTextArea_Propuesta1.setRows(5);
        jScrollPane2.setViewportView(jTextArea_Propuesta1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 410, 40));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel6.setText("N° 5");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jTextArea_Propuesta2.setEditable(false);
        jTextArea_Propuesta2.setColumns(20);
        jTextArea_Propuesta2.setRows(5);
        jScrollPane3.setViewportView(jTextArea_Propuesta2);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 410, 40));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel7.setText("N° 3");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jTextArea_Propuesta3.setEditable(false);
        jTextArea_Propuesta3.setColumns(20);
        jTextArea_Propuesta3.setRows(5);
        jScrollPane4.setViewportView(jTextArea_Propuesta3);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 410, 40));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel8.setText("N° 4");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jTextArea_Propuesta4.setEditable(false);
        jTextArea_Propuesta4.setColumns(20);
        jTextArea_Propuesta4.setRows(5);
        jScrollPane5.setViewportView(jTextArea_Propuesta4);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 410, 40));

        jPanel_Continuar.setBackground(new java.awt.Color(150, 0, 0));
        jPanel_Continuar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel_Continuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_Continuar.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jLabel_Continuar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Continuar.setText("ACEPTAR");
        jLabel_Continuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ContinuarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_ContinuarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ContinuarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel_ContinuarLayout = new javax.swing.GroupLayout(jPanel_Continuar);
        jPanel_Continuar.setLayout(jPanel_ContinuarLayout);
        jPanel_ContinuarLayout.setHorizontalGroup(
            jPanel_ContinuarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ContinuarLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel_Continuar)
                .addGap(27, 27, 27))
        );
        jPanel_ContinuarLayout.setVerticalGroup(
            jPanel_ContinuarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ContinuarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Continuar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel_Continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 130, 40));

        jPanel_Modificar.setBackground(new java.awt.Color(150, 0, 0));
        jPanel_Modificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel_Modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_Modificar.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jLabel_Modificar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Modificar.setText("MODIFICAR");
        jLabel_Modificar.setDoubleBuffered(true);
        jLabel_Modificar.setEnabled(false);
        jLabel_Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarPropuestas(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_ModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ModificarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel_ModificarLayout = new javax.swing.GroupLayout(jPanel_Modificar);
        jPanel_Modificar.setLayout(jPanel_ModificarLayout);
        jPanel_ModificarLayout.setHorizontalGroup(
            jPanel_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Modificar)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel_ModificarLayout.setVerticalGroup(
            jPanel_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Modificar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 110, 40));

        jPanel_Guardar.setBackground(new java.awt.Color(150, 0, 0));
        jPanel_Guardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel_Guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_Guardar.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jLabel_Guardar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Guardar.setText("GUARDAR CAMBIOS");
        jLabel_Guardar.setEnabled(false);
        jLabel_Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarCambios(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_GuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_GuardarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel_GuardarLayout = new javax.swing.GroupLayout(jPanel_Guardar);
        jPanel_Guardar.setLayout(jPanel_GuardarLayout);
        jPanel_GuardarLayout.setHorizontalGroup(
            jPanel_GuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_GuardarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Guardar)
                .addGap(27, 27, 27))
        );
        jPanel_GuardarLayout.setVerticalGroup(
            jPanel_GuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_GuardarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Guardar)
                .addContainerGap())
        );

        jPanel2.add(jPanel_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 170, 40));

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 800, 350));

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

        jPanel_Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_Salir.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jLabel_Salir.setText("X");
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
                .addGap(14, 14, 14)
                .addComponent(jLabel_Salir)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel_SalirLayout.setVerticalGroup(
            jPanel_SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SalirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Salir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 756, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

        asociacionesRegistradas.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        asociacionesRegistradas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg.add(asociacionesRegistradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 110, 30));

        categoria.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        categoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg.add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 140, 30));

        jPanel_Buscar.setBackground(new java.awt.Color(150, 0, 0));
        jPanel_Buscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel_Buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_Buscar.setFont(new java.awt.Font("Rockwell Condensed", 0, 18)); // NOI18N
        jLabel_Buscar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Buscar.setText("BUSCAR");
        jLabel_Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarPropuestas(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_BuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_BuscarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel_BuscarLayout = new javax.swing.GroupLayout(jPanel_Buscar);
        jPanel_Buscar.setLayout(jPanel_BuscarLayout);
        jPanel_BuscarLayout.setHorizontalGroup(
            jPanel_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );
        jPanel_BuscarLayout.setVerticalGroup(
            jPanel_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        bg.add(jPanel_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
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

    private void jLabel_ContinuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ContinuarMouseClicked
        Manejoasociacionesycandidatos mac = new Manejoasociacionesycandidatos();
        mac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel_ContinuarMouseClicked

    private void jLabel_ContinuarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ContinuarMouseEntered
        jPanel_Continuar.setBackground(new Color(200, 0, 0));
    }//GEN-LAST:event_jLabel_ContinuarMouseEntered

    private void jLabel_ContinuarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ContinuarMouseExited
        jPanel_Continuar.setBackground(new Color(150, 0, 0));

    }//GEN-LAST:event_jLabel_ContinuarMouseExited

    private void jLabel_AtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AtrasMouseClicked
        Manejoasociacionesycandidatos mac = new Manejoasociacionesycandidatos();
        mac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel_AtrasMouseClicked

    private void jLabel_AtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AtrasMouseEntered
        jPanel_Atras.setBackground(new Color(150, 0, 0));
        jLabel_Atras.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel_AtrasMouseEntered

    private void jLabel_AtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AtrasMouseExited
        jPanel_Atras.setBackground(Color.WHITE);
        jLabel_Atras.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel_AtrasMouseExited

    private void buscarPropuestas(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarPropuestas
        boolean registrado;
        String asociacion = asociacionesRegistradas.getSelectedItem().toString();
        String propuestas[] = new String[5];
        if (categoria.getSelectedIndex() == 0) {
            registrado = Logueo.padron.buscarAsociacion(asociacion).getPresidenteGeneral() != null
                    && Logueo.padron.buscarAsociacion(asociacion).getVicepresidenteGeneral() != null;
            if (registrado) {
                propuestas = Logueo.padron.buscarAsociacion(asociacion).getPresidenteGeneral().getPropuestas();
            }
        } else {
            Facultad facultad = Facultad.valueOf(categoria.getSelectedItem().toString());
            registrado = Logueo.padron.buscarAsociacion(asociacion).
                    getPresidentesFacultad().get(facultad) != null
                    && Logueo.padron.buscarAsociacion(asociacion).
                            getVicepresidentesFacultad().get(facultad) != null;
            if (registrado) {
                propuestas = Logueo.padron.buscarAsociacion(asociacion).
                        getPresidentesFacultad().get(facultad).getPropuestas();
            }
        }
        if (registrado) {
            jTextArea_Propuesta1.setText(propuestas[0]);
            jTextArea_Propuesta2.setText(propuestas[1]);
            jTextArea_Propuesta3.setText(propuestas[2]);
            jTextArea_Propuesta4.setText(propuestas[3]);
            jTextArea_Propuesta5.setText(propuestas[4]);
            jLabel_Modificar.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Recuerda que tanto el presidente como el vicepresidente\n"
                    + "deben estar registrados en la dignidad para poder inscribir\n"
                    + "sus propuestas");
            jTextArea_Propuesta1.setText("");
            jTextArea_Propuesta2.setText("");
            jTextArea_Propuesta3.setText("");
            jTextArea_Propuesta4.setText("");
            jTextArea_Propuesta5.setText("");
            jLabel_Modificar.setEnabled(false);
        }


    }//GEN-LAST:event_buscarPropuestas

    private void jLabel_BuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BuscarMouseEntered
        jPanel_Buscar.setBackground(new Color(200, 0, 0));
    }//GEN-LAST:event_jLabel_BuscarMouseEntered

    private void jLabel_BuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BuscarMouseExited
        jPanel_Buscar.setBackground(new Color(150, 0, 0));
    }//GEN-LAST:event_jLabel_BuscarMouseExited

    private void jLabel_ModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarMouseEntered
        jPanel_Modificar.setBackground(new Color(200, 0, 0));
    }//GEN-LAST:event_jLabel_ModificarMouseEntered

    private void jLabel_ModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarMouseExited
        jPanel_Modificar.setBackground(new Color(150, 0, 0));
    }//GEN-LAST:event_jLabel_ModificarMouseExited

    private void guardarCambios(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarCambios
        jTextArea_Propuesta1.setEditable(false);
        jTextArea_Propuesta2.setEditable(false);
        jTextArea_Propuesta3.setEditable(false);
        jTextArea_Propuesta4.setEditable(false);
        jTextArea_Propuesta5.setEditable(false);

        String[] propuestas = new String[5];
        propuestas[0] = jTextArea_Propuesta1.getText();
        propuestas[1] = jTextArea_Propuesta2.getText();
        propuestas[2] = jTextArea_Propuesta3.getText();
        propuestas[3] = jTextArea_Propuesta4.getText();
        propuestas[4] = jTextArea_Propuesta5.getText();

        String asociacion = asociacionesRegistradas.getSelectedItem().toString();

        if (ClaseValidacion.validarLongitusString(propuestas[0], 150)
                && ClaseValidacion.validarLongitusString(propuestas[1], 150)
                && ClaseValidacion.validarLongitusString(propuestas[2], 150)
                && ClaseValidacion.validarLongitusString(propuestas[3], 150)
                && ClaseValidacion.validarLongitusString(propuestas[4], 150)) {
            if (categoria.getSelectedIndex() == 0) {
                if (Logueo.con.modificarPropuestasGeneral(asociacion, propuestas, true)
                        && Logueo.con.modificarPropuestasGeneral(asociacion, propuestas, false)) {
                    Logueo.padron.buscarAsociacion(asociacion).getPresidenteGeneral().modificarPropuestas(propuestas);
                    Logueo.padron.buscarAsociacion(asociacion).getVicepresidenteGeneral().modificarPropuestas(propuestas);
                    JOptionPane.showMessageDialog(null, "Propuestas actualizadas con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "Fallo al actualizar propuestas, refresque las propuestas,\n"
                            + "reviselas y vuelva a intentar cambiarlas incluso si parecen estar bien");
                }
            } else {
                if (Logueo.con.modificarPropuestasFacultad(asociacion, categoria.getSelectedItem().toString(), propuestas, true)
                        && Logueo.con.modificarPropuestasFacultad(asociacion, categoria.getSelectedItem().toString(), propuestas, false)) {
                    Logueo.padron.buscarAsociacion(asociacion).getPresidentesFacultad().
                            get(Facultad.valueOf(categoria.getSelectedItem().toString())).modificarPropuestas(propuestas);
                    Logueo.padron.buscarAsociacion(asociacion).getVicepresidentesFacultad().
                            get(Facultad.valueOf(categoria.getSelectedItem().toString())).modificarPropuestas(propuestas);
                    JOptionPane.showMessageDialog(null, "Propuestas actualizadas con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "Fallo al actualizar propuestas, refresque las paropuestas,\n"
                            + "reviselas y vuelva a intentar cambiarlas incluso si parecen estar bien");
                }
            }
            jLabel_Modificar.setEnabled(true);
            jLabel_Guardar.setEnabled(false);
            jLabel_Continuar.setEnabled(true);
            jLabel_Buscar.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Alguna de las propuestas ingresadas \ntiene más de 150 caracteres");
        }


    }//GEN-LAST:event_guardarCambios

    private void jLabel_GuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_GuardarMouseEntered
        jPanel_Guardar.setBackground(new Color(200, 0, 0));
    }//GEN-LAST:event_jLabel_GuardarMouseEntered

    private void jLabel_GuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_GuardarMouseExited
        jPanel_Guardar.setBackground(new Color(150, 0, 0));
    }//GEN-LAST:event_jLabel_GuardarMouseExited

    private void modificarPropuestas(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarPropuestas
        jTextArea_Propuesta1.setEditable(true);
        jTextArea_Propuesta2.setEditable(true);
        jTextArea_Propuesta3.setEditable(true);
        jTextArea_Propuesta4.setEditable(true);
        jTextArea_Propuesta5.setEditable(true);

        jLabel_Buscar.setEnabled(false);
        jLabel_Modificar.setEnabled(false);
        jLabel_Continuar.setEnabled(true);
        jLabel_Guardar.setEnabled(true);
    }//GEN-LAST:event_modificarPropuestas

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
            java.util.logging.Logger.getLogger(ingresoPropuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ingresoPropuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ingresoPropuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ingresoPropuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ingresoPropuesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> asociacionesRegistradas;
    private javax.swing.JPanel bg;
    private javax.swing.JComboBox<String> categoria;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Atras;
    private javax.swing.JLabel jLabel_Buscar;
    private javax.swing.JLabel jLabel_Continuar;
    private javax.swing.JLabel jLabel_Guardar;
    private javax.swing.JLabel jLabel_Modificar;
    private javax.swing.JLabel jLabel_Salir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel_Atras;
    private javax.swing.JPanel jPanel_Buscar;
    private javax.swing.JPanel jPanel_Continuar;
    private javax.swing.JPanel jPanel_Guardar;
    private javax.swing.JPanel jPanel_Modificar;
    private javax.swing.JPanel jPanel_Salir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea_Propuesta1;
    private javax.swing.JTextArea jTextArea_Propuesta2;
    private javax.swing.JTextArea jTextArea_Propuesta3;
    private javax.swing.JTextArea jTextArea_Propuesta4;
    private javax.swing.JTextArea jTextArea_Propuesta5;
    // End of variables declaration//GEN-END:variables
}
