package Formularios;
import static Clases.Cliente.*;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Cliente_Formulario extends javax.swing.JPanel {
    static ResultSet r = null;
    int e = 0;
    public Cliente_Formulario() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        nombre = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ruc = new javax.swing.JTextField();
        razon = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dni = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tipo_cliente = new javax.swing.JComboBox<>();
        apellido = new javax.swing.JTextField();
        mensaje = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre.setEditable(false);
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 163, -1));

        telefono.setEditable(false);
        jPanel2.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 163, -1));

        correo.setEditable(false);
        jPanel2.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 163, -1));

        agregar.setText("AGREGAR");
        agregar.setEnabled(false);
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        jPanel2.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Persona Jurídica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 0, 51))); // NOI18N

        jLabel3.setForeground(new java.awt.Color(204, 0, 51));
        jLabel3.setText("RAZON SOCIAL:");

        ruc.setEditable(false);
        ruc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rucKeyReleased(evt);
            }
        });

        razon.setEditable(false);

        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setText("RUC:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ruc, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(razon, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(razon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setText("Nombre:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

        jLabel5.setForeground(new java.awt.Color(204, 0, 51));
        jLabel5.setText("Apellido:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        dni.setMaximumSize(new java.awt.Dimension(8, 8));
        dni.setMinimumSize(new java.awt.Dimension(8, 8));
        dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dniKeyReleased(evt);
            }
        });
        jPanel2.add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 163, -1));

        jLabel7.setForeground(new java.awt.Color(204, 0, 51));
        jLabel7.setText("Telefono:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("DNI:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        jLabel8.setForeground(new java.awt.Color(204, 0, 51));
        jLabel8.setText("Correo:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        jLabel9.setForeground(new java.awt.Color(204, 0, 51));
        jLabel9.setText("Tipo de Cliente:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, -1));

        tipo_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Natural", "Jurídica" }));
        tipo_cliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tipo_clienteItemStateChanged(evt);
            }
        });
        tipo_cliente.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                tipo_clienteCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        tipo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_clienteActionPerformed(evt);
            }
        });
        jPanel2.add(tipo_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

        apellido.setEditable(false);
        jPanel2.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 163, -1));
        jPanel2.add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 210, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tipo_clienteCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tipo_clienteCaretPositionChanged

    }//GEN-LAST:event_tipo_clienteCaretPositionChanged

    private void tipo_clienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipo_clienteItemStateChanged
   
    }//GEN-LAST:event_tipo_clienteItemStateChanged

    public void juridica(boolean e){
        ruc.setEditable(e);
        if(e==false){
            ruc.setText("");
            razon.setText("");
        }
    }
    
    private void tipo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_clienteActionPerformed
        if(tipo_cliente.getSelectedIndex()==1){
            juridica(true);
        } else {
            juridica(false);
            razon.setEditable(false);
        }
    }//GEN-LAST:event_tipo_clienteActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        if(nombre.isEditable()==true&&apellido.isEditable()==true){
            String[] datos = new String[8];
            datos[0] = ruc.getText();
            datos[1] = razon.getText();
            datos[2] = dni.getText();
            datos[3] = apellido.getText();
            datos[4] = nombre.getText();
            datos[5] = telefono.getText();
            datos[6] = correo.getText();
            datos[7] = String.valueOf(tipo_cliente.getSelectedIndex());
            try {
                Agrego(datos);
                mensaje.setText("* Cliente Agregado.");
                dni.setText("");
                dni.setEditable(true);
                juridica(false);
                tipo_cliente.setSelectedIndex(0);
                datoscliente(false);
            } catch (SQLException ex) {
                
            }
        }
    }//GEN-LAST:event_agregarActionPerformed
    String fdni = "";
    public void datoscliente(boolean a) {
        apellido.setEditable(a);
        nombre.setEditable(a);
        telefono.setEditable(a);
        correo.setEditable(a);
        agregar.setEnabled(a);
        if(a==false){
            apellido.setText("");
            nombre.setText("");
            telefono.setText("");
            correo.setText("");
        }
    }
    
    public static boolean verifico_numero(KeyEvent e){
        boolean n = false;
        int t = e.getKeyCode();
        if((t>=KeyEvent.VK_0 && t<=KeyEvent.VK_9) || (t==KeyEvent.VK_DELETE) || t==KeyEvent.VK_LEFT  || t==KeyEvent.VK_RIGHT || t==8){
            n=true;
        }
        return n;
    }
    
    private void dniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniKeyReleased
        mensaje.setText("");
        if(verifico_numero(evt)==true){
            if(dni.getText().length()==8) {
                try {
                    r = Existe("dni",dni.getText());
                    while(r.next()){
                        apellido.setText(r.getString(7));
                        nombre.setText(r.getString(6));
                        telefono.setText(r.getString(8));
                        correo.setText(r.getString(9));
                        e++;
                    }
                    if(e==0){
                        datoscliente(true);
                    } else {
                        e=0;
                    }
                } catch (SQLException e){

                }
            } else if(dni.getText().length()<=8){
                fdni = dni.getText();
                datoscliente(false);
            } else {
                dni.setText(fdni);
                datoscliente(false);
            }
       } else {
            dni.setText(fdni);
        }
    }//GEN-LAST:event_dniKeyReleased
    String fruc = "";
    private void rucKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rucKeyReleased
        mensaje.setText("");
        if(verifico_numero(evt)==true){
            if(ruc.getText().length()==11){
                fruc=ruc.getText();
                try {
                    r = Existe("ruc",fruc);
                    while(r.next()){
                        razon.setText(r.getString(5));
                        dni.setText(r.getString(3));
                        apellido.setText(r.getString(7));
                        nombre.setText(r.getString(6));
                        telefono.setText(r.getString(8));
                        correo.setText(r.getString(9));
                        e++;
                    }
                    if(e==0){
                        razon.setEditable(true);
                        dni.setEditable(true);
                        dni.setText("");
                        razon.setText("");
                        datoscliente(true);
                    } else {
                        datoscliente(false);
                        dni.setText("");
                        dni.setEditable(false);
                        e=0;
                    }
                    r = null;
                } catch(SQLException e) {
                    
                }
            } else if(ruc.getText().length()<11) {
                fruc=ruc.getText();
                razon.setEditable(false);
            } else {
                ruc.setText(fruc);
            }
        } else {
            ruc.setText(fruc);
        }
    }//GEN-LAST:event_rucKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField dni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mensaje;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField razon;
    private javax.swing.JTextField ruc;
    private javax.swing.JTextField telefono;
    private javax.swing.JComboBox<String> tipo_cliente;
    // End of variables declaration//GEN-END:variables
}
