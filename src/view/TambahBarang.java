/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import model.koneksidb;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
//import static view.TambahMember.convertUtilDateToSqlDate;
/**
 *
 * @author USER
 */
public class TambahBarang extends javax.swing.JFrame {
    koneksidb datacon = new koneksidb();
    private Connection con;
    int id;
    /**
     * Creates new form TambahBarang
     */
    public TambahBarang() {
        initComponents();
        jButtonupdate.setVisible(false);
        setLocationRelativeTo(null);
    }

    public TambahBarang(int id){
        initComponents();
        this.id=id;
        setLocationRelativeTo(null);
        isiform(id);
        jButtonadd.setVisible(false);
        jTextFieldadd.setText("Edit Barang");
        jButtonadd.setText("Edit");
    }
    public void isiform(int id){
        try
            {
                String sql="SELECT * from `barang` WHERE `id_barang`="+id;
                con = datacon.getConnection();
                java.sql.Statement stm=con.createStatement();
                java.sql.ResultSet rs=stm.executeQuery(sql);
                while(rs.next()){
                    nama.setText(rs.getString(2));
                    harga.setText(rs.getString(3));
                    depresiasi.setText(rs.getString(4));
                    date.setDate(rs.getDate(5));
                    deskripsi.setText(rs.getString(6));
                }
            }catch(Exception e)
            {
                //JOptionPane.showMessageDialog(null,"GAGAL");
            }         
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        harga = new javax.swing.JTextField();
        depresiasi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButtonadd = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        deskripsi = new javax.swing.JTextArea();
        date = new com.toedter.calendar.JDateChooser();
        jButtonupdate = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldadd = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(242, 241, 239));
        jPanel1.setPreferredSize(new java.awt.Dimension(470, 470));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Price");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Depreciation 10%");

        nama.setBackground(new java.awt.Color(242, 241, 239));
        nama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        harga.setBackground(new java.awt.Color(242, 241, 239));
        harga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        harga.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                hargaFocusLost(evt);
            }
        });
        harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaActionPerformed(evt);
            }
        });
        harga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hargaKeyTyped(evt);
            }
        });

        depresiasi.setEditable(false);
        depresiasi.setBackground(new java.awt.Color(242, 241, 239));
        depresiasi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        depresiasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depresiasiActionPerformed(evt);
            }
        });
        depresiasi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                depresiasiKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Entry Date");

        jButtonadd.setBackground(new java.awt.Color(253, 227, 167));
        jButtonadd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonadd.setText("Add");
        jButtonadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonaddMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonaddMousePressed(evt);
            }
        });
        jButtonadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonaddActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(253, 227, 167));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Cancel");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Description");

        deskripsi.setBackground(new java.awt.Color(242, 241, 239));
        deskripsi.setColumns(20);
        deskripsi.setRows(5);
        jScrollPane1.setViewportView(deskripsi);

        jButtonupdate.setBackground(new java.awt.Color(253, 227, 167));
        jButtonupdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonupdate.setText("Update");
        jButtonupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonupdateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addGap(55, 55, 55)
                        .addComponent(depresiasi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5)
                        .addGap(98, 98, 98)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(130, 130, 130)
                                .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(136, 136, 136)
                                .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6)
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonadd)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(depresiasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5))
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonadd)
                    .addComponent(jButton2)
                    .addComponent(jButtonupdate))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(37, 116, 169));

        jTextFieldadd.setEditable(false);
        jTextFieldadd.setBackground(new java.awt.Color(37, 116, 169));
        jTextFieldadd.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldadd.setForeground(new java.awt.Color(242, 241, 239));
        jTextFieldadd.setText("Add New Item");
        jTextFieldadd.setBorder(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/download (1).png"))); // NOI18N

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/left-arrow.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jTextFieldadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back)
                    .addComponent(jTextFieldadd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaActionPerformed

    private void depresiasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depresiasiActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_depresiasiActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_namaActionPerformed

    private void jButtonaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaddActionPerformed
            int price = Integer.parseInt(harga.getText());
            int depresi = Integer.parseInt(depresiasi.getText());
        
            try {
                String sql = "INSERT INTO `barang` (`id_barang`, `nama_barang`, `harga`, `depreciation`, `tgl_masuk`, `deskripsi`) VALUES (NULL, '"+nama.getText()+"', "+price+", "+depresi+", '"+convertUtilDateToSqlDate(date.getDate())+"', '"+deskripsi.getText()+"')";
               con=datacon.getConnection();
               java.sql.PreparedStatement pst=con.prepareStatement(sql);
                 pst.execute();
                JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
            new TambahBarang().setVisible(true);
    }//GEN-LAST:event_jButtonaddActionPerformed

    private void hargaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hargaFocusLost
        // TODO add your handling code here:
        int depretiation = (int) (Integer.parseInt(harga.getText()) * 0.10);
        //String depresi = 
        depresiasi.setText(Integer.toString(depretiation));
    }//GEN-LAST:event_hargaFocusLost

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_backMouseClicked

    private void depresiasiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_depresiasiKeyTyped
        // TODO add your handling code here:
        char karakter = evt.getKeyChar();
        if(!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))){
            getToolkit().beep();
            evt.consume();
}

    }//GEN-LAST:event_depresiasiKeyTyped

    private void hargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hargaKeyTyped
        // TODO add your handling code here:
        char karakter = evt.getKeyChar();
        if(!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_hargaKeyTyped

    private void jButtonaddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonaddMousePressed

    }//GEN-LAST:event_jButtonaddMousePressed

    private void jButtonupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonupdateMouseClicked
        // TODO add your handling code here:
            int price = Integer.parseInt(harga.getText());
            int depresi = Integer.parseInt(depresiasi.getText());
        
            try {
                String sql = "UPDATE `barang` set `nama_barang`='"+nama.getText()+"', `harga`='"+harga.getText()+"', `depreciation`='"+depresiasi.getText()+"', `tgl_masuk`='"+convertUtilDateToSqlDate(date.getDate())+"', `deskripsi`='"+deskripsi.getText()+"' where id_barang="+id+";"; 
                con=datacon.getConnection();
                java.sql.PreparedStatement pst=con.prepareStatement(sql);
                 pst.execute();
                JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
            dispose();
    }//GEN-LAST:event_jButtonupdateMouseClicked
public static java.sql.Date convertUtilDateToSqlDate(java.util.Date date){
    if(date != null) {
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        return sqlDate;
    }
    return null;
}
    private void jButtonaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonaddMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonaddMouseClicked

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
            java.util.logging.Logger.getLogger(TambahBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextField depresiasi;
    private javax.swing.JTextArea deskripsi;
    private javax.swing.JTextField harga;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonadd;
    private javax.swing.JButton jButtonupdate;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldadd;
    private javax.swing.JTextField nama;
    // End of variables declaration//GEN-END:variables

   
}
