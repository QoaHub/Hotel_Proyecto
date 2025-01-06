package Formularios;
import java.awt.Color;
import static Clases.Cliente.*;
import static Clases.Habitacion.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;
public class Habitaciones extends javax.swing.JPanel  {
    ResultSet r = null;
    Hotel_Proyecto_1 h = new Hotel_Proyecto_1();
    int nh = 0;
    public void actualizo_estado() throws SQLException{
        r = estado_habitaciones();
        int c = 0,l=0,e=0,o=0,m=0;
        while(r.next()){
            c++;
            if(r.getInt(1)==1){
                e++;
                switch(c){
                    case 1:
                        h1.setBackground(new Color(51, 153, 255));
                    break;
                    case 2:
                        h2.setBackground(new Color(51, 153, 255));
                    break;
                    case 3:
                        h3.setBackground(new Color(51, 153, 255));
                    break;
                    case 4:
                        h4.setBackground(new Color(51, 153, 255));
                    break;
                    case 5:
                        h5.setBackground(new Color(51, 153, 255));
                    break;
                    case 6:
                        h6.setBackground(new Color(51, 153, 255));
                    break;
                    case 7:
                        h7.setBackground(new Color(51, 153, 255));
                    break;
                    case 8:
                        h8.setBackground(new Color(51, 153, 255));
                    break;
                    case 9:
                        h9.setBackground(new Color(51, 153, 255));
                    break;
                    case 10:
                        h10.setBackground(new Color(51, 153, 255));
                    break;
                    case 11:
                        h11.setBackground(new Color(51, 153, 255));
                    break;
                    case 12:
                        h12.setBackground(new Color(51, 153, 255));
                    break;
                }
            } else if(r.getInt(1)==2){
                o++;
                switch(c){
                    case 1:
                        h1.setBackground(new Color(255,50,50));
                    break;
                    case 2:
                        h2.setBackground(new Color(255,50,50));
                    break;
                    case 3:
                        h3.setBackground(new Color(255,50,50));
                    break;
                    case 4:
                        h4.setBackground(new Color(255,50,50));
                    break;
                    case 5:
                        h5.setBackground(new Color(255,50,50));
                    break;
                    case 6:
                        h6.setBackground(new Color(255,50,50));
                    break;
                    case 7:
                        h7.setBackground(new Color(255,50,50));
                    break;
                    case 8:
                        h8.setBackground(new Color(255,50,50));
                    break;
                    case 9:
                        h9.setBackground(new Color(255,50,50));
                    break;
                    case 10:
                        h10.setBackground(new Color(255,50,50));
                    break;
                    case 11:
                        h11.setBackground(new Color(255,50,50));
                    break;
                    case 12:
                        h12.setBackground(new Color(255,50,50));
                    break;
                }
            } else if(r.getInt(1)==3){
                m++;
                switch(c){
                    case 1:
                        h1.setBackground(new Color(153, 51, 51));
                    break;
                    case 2:
                        h2.setBackground(new Color(153, 51, 51));
                    break;
                    case 3:
                        h3.setBackground(new Color(153, 51, 51));
                    break;
                    case 4:
                        h4.setBackground(new Color(153, 51, 51));
                    break;
                    case 5:
                        h5.setBackground(new Color(153, 51, 51));
                    break;
                    case 6:
                        h6.setBackground(new Color(153, 51, 51));
                    break;
                    case 7:
                        h7.setBackground(new Color(153, 51, 51));
                    break;
                    case 8:
                        h8.setBackground(new Color(153, 51, 51));
                    break;
                    case 9:
                        h9.setBackground(new Color(153, 51, 51));
                    break;
                    case 10:
                        h10.setBackground(new Color(153, 51, 51));
                    break;
                    case 11:
                        h11.setBackground(new Color(153, 51, 51));
                    break;
                    case 12:
                        h12.setBackground(new Color(153, 51, 51));
                    break;
                }
            } else {
                l++;
            }
        }
        libres.setText(l+"");
        enuso.setText(o+"");
        reservadas.setText(e+"");
        mantenimiento.setText(m+"");
    }
    public Habitaciones() throws SQLException {
        initComponents();
        actualizo_estado();
        btnalquilar.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        h1 = new javax.swing.JButton();
        h2 = new javax.swing.JButton();
        h3 = new javax.swing.JButton();
        h4 = new javax.swing.JButton();
        h5 = new javax.swing.JButton();
        h6 = new javax.swing.JButton();
        h7 = new javax.swing.JButton();
        h8 = new javax.swing.JButton();
        h9 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        h10 = new javax.swing.JButton();
        h11 = new javax.swing.JButton();
        h12 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        libres = new javax.swing.JLabel();
        reservadas = new javax.swing.JLabel();
        enuso = new javax.swing.JLabel();
        mantenimiento = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Panel_Accion = new javax.swing.JPanel();
        btnreservar = new javax.swing.JButton();
        btnalquilar = new javax.swing.JButton();
        btnmantenimiento = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        slch = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestionar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 0, 0))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 1_PrimerPiso.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 3_TercerPiso.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 2_SegundoPiso.png"))); // NOI18N

        h1.setBackground(new java.awt.Color(0, 255, 51));
        h1.setForeground(new java.awt.Color(255, 255, 255));
        h1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 1_VisualII.png"))); // NOI18N
        h1.setText("#1");
        h1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        h1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h1ActionPerformed(evt);
            }
        });

        h2.setBackground(new java.awt.Color(0, 255, 51));
        h2.setForeground(new java.awt.Color(255, 255, 255));
        h2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 1_VisualII.png"))); // NOI18N
        h2.setText("#2");
        h2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        h2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h2ActionPerformed(evt);
            }
        });

        h3.setBackground(new java.awt.Color(0, 255, 51));
        h3.setForeground(new java.awt.Color(255, 255, 255));
        h3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 1_VisualII.png"))); // NOI18N
        h3.setText("#3");
        h3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        h3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h3ActionPerformed(evt);
            }
        });

        h4.setBackground(new java.awt.Color(0, 255, 51));
        h4.setForeground(new java.awt.Color(255, 255, 255));
        h4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 1_VisualII.png"))); // NOI18N
        h4.setText("#4");
        h4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        h4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h4ActionPerformed(evt);
            }
        });

        h5.setBackground(new java.awt.Color(0, 255, 51));
        h5.setForeground(new java.awt.Color(255, 255, 255));
        h5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 1_VisualII.png"))); // NOI18N
        h5.setText("#5");
        h5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        h5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h5ActionPerformed(evt);
            }
        });

        h6.setBackground(new java.awt.Color(0, 255, 51));
        h6.setForeground(new java.awt.Color(255, 255, 255));
        h6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 1_VisualII.png"))); // NOI18N
        h6.setText("#6");
        h6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        h6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h6ActionPerformed(evt);
            }
        });

        h7.setBackground(new java.awt.Color(0, 255, 51));
        h7.setForeground(new java.awt.Color(255, 255, 255));
        h7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 1_VisualII.png"))); // NOI18N
        h7.setText("#7");
        h7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        h7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h7ActionPerformed(evt);
            }
        });

        h8.setBackground(new java.awt.Color(0, 255, 51));
        h8.setForeground(new java.awt.Color(255, 255, 255));
        h8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 1_VisualII.png"))); // NOI18N
        h8.setText("#8");
        h8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        h8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h8ActionPerformed(evt);
            }
        });

        h9.setBackground(new java.awt.Color(0, 255, 51));
        h9.setForeground(new java.awt.Color(255, 255, 255));
        h9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 1_VisualII.png"))); // NOI18N
        h9.setText("#9");
        h9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        h9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h9ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 4_CuartoPiso.png"))); // NOI18N

        h10.setBackground(new java.awt.Color(0, 255, 51));
        h10.setForeground(new java.awt.Color(255, 255, 255));
        h10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 1_VisualII.png"))); // NOI18N
        h10.setText("#10");
        h10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        h10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h10ActionPerformed(evt);
            }
        });

        h11.setBackground(new java.awt.Color(0, 255, 51));
        h11.setForeground(new java.awt.Color(255, 255, 255));
        h11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 1_VisualII.png"))); // NOI18N
        h11.setText("#11");
        h11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        h11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h11ActionPerformed(evt);
            }
        });

        h12.setBackground(new java.awt.Color(0, 255, 51));
        h12.setForeground(new java.awt.Color(255, 255, 255));
        h12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 1_VisualII.png"))); // NOI18N
        h12.setText("#12");
        h12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        h12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h12ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Leyenda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(255, 50, 50));
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 87, -1, 24));

        jLabel7.setText("En uso:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 87, -1, 24));

        libres.setText("0");
        jPanel2.add(libres, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 32, 20, -1));

        reservadas.setText("0");
        jPanel2.add(reservadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 62, 20, -1));

        enuso.setText("0");
        enuso.setToolTipText("");
        jPanel2.add(enuso, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 92, 20, -1));

        mantenimiento.setText("0");
        mantenimiento.setToolTipText("");
        jPanel2.add(mantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 122, 20, -1));

        jLabel8.setText("Mantenimiento:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 117, -1, 24));

        jButton4.setBackground(new java.awt.Color(153, 51, 51));
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 117, -1, 24));

        jButton1.setBackground(new java.awt.Color(0, 255, 51));
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 27, -1, 24));

        jLabel1.setText("Libres:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 27, -1, 24));

        jButton2.setBackground(new java.awt.Color(51, 153, 255));
        jButton2.setEnabled(false);
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 57, -1, 24));

        jLabel6.setText("Reservadas:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 57, -1, 24));

        Panel_Accion.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Accion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acción", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        Panel_Accion.setForeground(new java.awt.Color(204, 204, 204));
        Panel_Accion.setToolTipText("");

        btnreservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tag.png"))); // NOI18N
        btnreservar.setText("Reservar");
        btnreservar.setEnabled(false);
        btnreservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreservarActionPerformed(evt);
            }
        });

        btnalquilar.setText("Alquilar");
        btnalquilar.setEnabled(false);

        btnmantenimiento.setText("Mantenimiento");
        btnmantenimiento.setEnabled(false);
        btnmantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmantenimientoActionPerformed(evt);
            }
        });

        jLabel9.setText("Habitación: #");

        slch.setText("-");
        slch.setName(""); // NOI18N

        javax.swing.GroupLayout Panel_AccionLayout = new javax.swing.GroupLayout(Panel_Accion);
        Panel_Accion.setLayout(Panel_AccionLayout);
        Panel_AccionLayout.setHorizontalGroup(
            Panel_AccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_AccionLayout.createSequentialGroup()
                .addGroup(Panel_AccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_AccionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_AccionLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(Panel_AccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnreservar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnalquilar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnmantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_AccionLayout.setVerticalGroup(
            Panel_AccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_AccionLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(Panel_AccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(slch))
                .addGap(18, 18, 18)
                .addComponent(btnreservar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnalquilar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnmantenimiento)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(h7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(h4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(h1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(h10, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(h8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(h5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(h2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(h11, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(h9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(h6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(h3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(h12, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Panel_Accion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(h3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(h2)
                            .addComponent(h1)))
                    .addComponent(jLabel2))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(h6)
                    .addComponent(h4)
                    .addComponent(jLabel4)
                    .addComponent(h5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(h7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(h8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(h10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(h11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel_Accion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void h4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h4ActionPerformed
        accion(4,h4);
    }//GEN-LAST:event_h4ActionPerformed

    public void accion(int n,JButton a) {
        bloqueo();
        nh = n;
        setNh(nh);
        slch.setText(nh+"");
        Color f = a.getBackground();
        String c = f.getRed()+","+f.getGreen()+","+f.getBlue();
        if(c.equals("0,255,51")) {
                btnreservar.setText("Reservar");
                btnreservar.setEnabled(true);
                btnalquilar.setEnabled(true);
                btnmantenimiento.setEnabled(true);
                btnmantenimiento.setText("Mantenimiento");
        } else if(c.equals("51,153,255")) {
                btnreservar.setText("Cancelar Reserva");
                btnreservar.setEnabled(true);
                btnalquilar.setEnabled(false);
                btnmantenimiento.setEnabled(false);
        } else if(c.equals("255,50,50")) {
                btnreservar.setText("Cancelar Servicio");
                btnreservar.setEnabled(true);
                btnalquilar.setEnabled(false);
                btnmantenimiento.setEnabled(false);
        } else if (c.equals("153,51,51")) {
                btnreservar.setText("Reservar");
                btnreservar.setEnabled(false);
                btnalquilar.setEnabled(false);
                btnmantenimiento.setEnabled(true);
                btnmantenimiento.setText("Disponible");
        }
    }
    
    private void h1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h1ActionPerformed
        accion(1,h1);  
    }//GEN-LAST:event_h1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void h6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h6ActionPerformed
        accion(6,h6);
    }//GEN-LAST:event_h6ActionPerformed

    private void h12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h12ActionPerformed
        accion(12,h12);
    }//GEN-LAST:event_h12ActionPerformed

    private void h3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h3ActionPerformed
        accion(3,h3);
    }//GEN-LAST:event_h3ActionPerformed

    private void h9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h9ActionPerformed
        accion(9,h9);
    }//GEN-LAST:event_h9ActionPerformed

    private void h5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h5ActionPerformed
        accion(5,h5);
    }//GEN-LAST:event_h5ActionPerformed

    private void h8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h8ActionPerformed
        accion(8,h8);
    }//GEN-LAST:event_h8ActionPerformed

    private void h11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h11ActionPerformed
        accion(11,h11);
    }//GEN-LAST:event_h11ActionPerformed

    private void h7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h7ActionPerformed
        accion(7,h7);
    }//GEN-LAST:event_h7ActionPerformed

    private void h10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h10ActionPerformed
        accion(10,h10);
    }//GEN-LAST:event_h10ActionPerformed
    public static void ventana(JPanel a){
        a.setSize(422,174);
        a.setLocation(0,0);
        Panel_Accion.removeAll();
        Panel_Accion.add(a);
        Panel_Accion.repaint();
        Panel_Accion.revalidate();
    }
    public void bloqueo(){
        h1.setEnabled(false);
        h2.setEnabled(false);
        h3.setEnabled(false);
        h4.setEnabled(false);
        h5.setEnabled(false);
        h6.setEnabled(false);
        h7.setEnabled(false);
        h8.setEnabled(false);
        h9.setEnabled(false);
        h10.setEnabled(false);
        h11.setEnabled(false);
        h12.setEnabled(false);
    }
    
    void limpio_panel() {
        try {
            h.l.limpio_panel(new Habitaciones());
        } catch (SQLException ex) {
            Logger.getLogger(Habitaciones.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    private void btnreservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreservarActionPerformed
        switch (btnreservar.getText()) {
            case "Reservar":
                ventana(new Formulario_Reserva());
                break;
            case "Cancelar Reserva":
                try {
                    getS().executeUpdate("UPDATE habitacion SET estado=0 WHERE codhabitacion="+nh);
                } catch (SQLException ex) {
                    Logger.getLogger(Habitaciones.class.getName()).log(Level.SEVERE, null, ex);
                }
                limpio_panel();
                break;
            case "Cancelar Servicio":
                try {
                    getS().executeUpdate("UPDATE habitacion SET estado=0 WHERE codhabitacion="+nh);
                } catch (SQLException ex) {
                    Logger.getLogger(Habitaciones.class.getName()).log(Level.SEVERE, null, ex);
                }
                limpio_panel();
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnreservarActionPerformed

    private void h2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h2ActionPerformed
        accion(2,h2);
    }//GEN-LAST:event_h2ActionPerformed

    private void btnmantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmantenimientoActionPerformed
    try {
        if(btnmantenimiento.getText().equals("Disponible")){
            cambio_mantenimiento(nh,0);
        } else if(btnmantenimiento.getText().equals("Mantenimiento")){
            cambio_mantenimiento(nh,3);
        }
        limpio_panel();
    } catch (SQLException ex) {
        Logger.getLogger(Habitaciones.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnmantenimientoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel Panel_Accion;
    private javax.swing.JButton btnalquilar;
    private javax.swing.JButton btnmantenimiento;
    private javax.swing.JButton btnreservar;
    private javax.swing.JLabel enuso;
    private javax.swing.JButton h1;
    private javax.swing.JButton h10;
    private javax.swing.JButton h11;
    private javax.swing.JButton h12;
    private javax.swing.JButton h2;
    private javax.swing.JButton h3;
    private javax.swing.JButton h4;
    private javax.swing.JButton h5;
    private javax.swing.JButton h6;
    private javax.swing.JButton h7;
    private javax.swing.JButton h8;
    private javax.swing.JButton h9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel libres;
    private javax.swing.JLabel mantenimiento;
    private javax.swing.JLabel reservadas;
    private javax.swing.JLabel slch;
    // End of variables declaration//GEN-END:variables
}
