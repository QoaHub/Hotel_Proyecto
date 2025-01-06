package Formularios;
import static Clases.Cliente.*;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Cuentas extends javax.swing.JPanel {
    public Cuentas() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        clave = new javax.swing.JPasswordField();
        rclave = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        nombres = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        apellidos = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        nacimiento = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dni = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Clave:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, 20));

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Usuario:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 187, -1));

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Tipo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Recepcionista" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 187, -1));

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Nombres:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, 20));
        jPanel1.add(clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 187, -1));
        jPanel1.add(rclave, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 187, -1));

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Repetir Clave:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 274, -1, 30));
        jPanel1.add(nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 187, -1));

        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Apellidos:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));
        jPanel1.add(apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 187, -1));

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 120, -1));
        jPanel1.add(nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 186, -1));

        jLabel9.setText("Nacimiento:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("DNI:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, 20));
        jPanel1.add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 187, -1));

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Correo:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 194, -1, 30));
        jPanel1.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 187, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    public void limpiar() {
        usuario.setText("");
        nombres.setText("");
        apellidos.setText("");
        jComboBox1.setSelectedIndex(0);
        clave.setText("");
        rclave.setText("");
        usuario.requestFocus();
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jButton1.getText().equals("Crear")){
            if(!usuario.getText().equals("")&&!clave.getText().equals("")&&
                    !rclave.getText().equals("")){
                if(clave.getText().equals(rclave.getText())){
                    String dia = Integer.toString(nacimiento.getCalendar().get(Calendar.DAY_OF_MONTH));
                    String mes = Integer.toString(nacimiento.getCalendar().get(Calendar.MONTH)+1);
                    String año = Integer.toString(nacimiento.getCalendar().get(Calendar.YEAR));
                    String nf = año + "-" + mes +"-"+dia;
                    try {
                        getS().executeUpdate("INSERT INTO usuario(tipo,nombres,apellidos,nacimiento,correo,usuario,clave,estado) "
                                + "VALUES ("+jComboBox1.getSelectedIndex()+",'"+nombres.getText()+"','"+apellidos.getText()+"','"+nf+"','"+correo.getText()+"','"+usuario.getText()+"',"
                                        + "'"+clave.getText()+"',0)");
                        JOptionPane.showMessageDialog(null,"Se ha creado nuevo usuario.");
                        limpiar();
                    } catch (SQLException ex) {
                        Logger.getLogger(Cuentas.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos;
    private javax.swing.JPasswordField clave;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField dni;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser nacimiento;
    private javax.swing.JTextField nombres;
    private javax.swing.JPasswordField rclave;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
