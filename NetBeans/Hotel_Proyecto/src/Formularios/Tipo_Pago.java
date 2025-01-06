package Formularios;
import static Clases.Administracion.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Tipo_Pago extends javax.swing.JPanel {
    ResultSet r = null;
    DefaultTableModel l = new DefaultTableModel();
    public Tipo_Pago() {
        initComponents();
        String[] t = {"Codigo Tipo Pago","Descripción","Estado","Fecha Registro"};
        l.setColumnIdentifiers(t);
        Lista_Camas.setModel(l);
        lista_camas(1,"");
    }
    public final void lista_camas(int t,String c) {
        int f=l.getRowCount();
        if(f>0) {
            for(int i=0;i<f;i++) {
                l.removeRow(0);
            }
        }
        try {
            String[] datos = new String[4];
            switch(t) {
                case 1:
                    r = getS().executeQuery("SELECT codtipopago,descripcion,"
                            + "(CASE    WHEN estado=0 THEN 'Activo'"
                            + "         WHEN estado=1 THEN 'Inactivo'"
                            + " END)  AS estado,fechreg FROM tipopago");
                break;
                case 2:
                    r = getS().executeQuery("SELECT codtipopago,descripcion,"
                            + "(CASE    WHEN estado=0 THEN 'Activo'"
                            + "         WHEN estado=1 THEN 'Inactivo'"
                            + " END)  AS estado,fechreg FROM tipopago WHERE codtipopago like '%"+c+"%'");
                break;
            }
            while(r.next()) {
                datos[0] = (String)r.getString(1);
                datos[1] = (String)r.getString(2);
                datos[2] = (String)r.getString(3);
                datos[3] = (String)r.getString(4);
                l.addRow(datos);
            }
        } catch(SQLException e) {

        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Scroll = new javax.swing.JScrollPane();
        Lista_Camas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo Pago", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        jLabel1.setText("Descripción:");

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Inactivo");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Lista_Camas = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        Lista_Camas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Lista_Camas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Lista_Camas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Lista_CamasMouseReleased(evt);
            }
        });
        Scroll.setViewportView(Lista_Camas);

        jLabel2.setText("Codigo de Cama:");

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    int nc = 0;
    String ti = "";
    private void Lista_CamasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lista_CamasMouseReleased
        if(Lista_Camas.getSelectedRow()>=0){
            int f = Lista_Camas.getSelectedRow();
            nc = Integer.parseInt((String)Lista_Camas.getValueAt(f, 0));
            ti = (String)Lista_Camas.getValueAt(f, 1);
            jTextField1.setEnabled(false);
            jButton1.setText("Modificar");
            if(Lista_Camas.getValueAt(f, 2).equals("Activo")){
                jButton2.setText("Inactivo");
            } else if(Lista_Camas.getValueAt(f, 2).equals("Inactivo")) {
                jButton2.setText("Activo");
            }
            jButton2.setEnabled(true);
        }
    }//GEN-LAST:event_Lista_CamasMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        switch (jButton1.getText()) {
            case "Modificar":
                jTextField1.setEnabled(true);
                jTextField1.setText(ti);
                jButton1.setText("Guardar");
                jButton2.setText("Cancelar");
                jButton2.setEnabled(true);
                break;
            case "Guardar":
                try {
                    getS().executeUpdate("UPDATE tipopago SET descripcion='"+jTextField1.getText()+"' WHERE codcama="+nc);
                    nc = 0;
                    ti = "";
                    jTextField1.setText("");
                    jButton1.setText("Agregar");
                    jButton2.setText("Inactivo");
                    jButton2.setEnabled(true);
                    lista_camas(1,"");
                } catch (SQLException ex) {
                    Logger.getLogger(Tipo_Pago.class.getName()).log(Level.SEVERE, null, ex);
                }   break;
            case "Agregar":
                if(!jTextField1.getText().equals("")) {
                    try {
                        getS().executeUpdate("INSERT INTO tipopago(descripcion,estado,fechreg) VALUES('"+jTextField1.getText()+"',0,NOW())");
                        nc = 0;
                        ti = "";
                        jTextField1.setText("");
                        jButton2.setText("Cancelar");
                        lista_camas(1,"");
                    } catch (SQLException ex) {
                        Logger.getLogger(Tipo_Pago.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }   break;
            default:
                break;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void reseteo(){
        nc = 0;
        ti = "";
        jTextField1.setText("");
        jButton1.setText("Agregar");
        jButton2.setText("Inactivo");
        jButton2.setEnabled(true);
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        switch (jButton2.getText()) {
            case "Cancelar":
                reseteo();
                break;
            case "Inactivo":
                try {
                    getS().executeUpdate("UPDATE tipopago SET estado=1 WHERE codtipopago="+nc);
                    reseteo();
                    lista_camas(1,"");
                } catch (SQLException ex) {
                    Logger.getLogger(Tipo_Pago.class.getName()).log(Level.SEVERE, null, ex);
                }   break;
            case "Activo":
                try {
                    getS().executeUpdate("UPDATE tipopago SET estado=0 WHERE codtipopago="+nc);
                    reseteo();
                    lista_camas(1,"");
                } catch (SQLException ex) {
                    Logger.getLogger(Tipo_Pago.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        lista_camas(2,jTextField2.getText());
    }//GEN-LAST:event_jTextField2KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Lista_Camas;
    private javax.swing.JScrollPane Scroll;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
