package project;

import com.config.MyConfig;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JTable;



public class MainUI extends javax.swing.JFrame {
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/db_pipsterr";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";
    
    public MainUI (){
        try {
            initComponents();
            connection = DriverManager.getConnection(DB_URL, DB_USER , DB_PASS);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Connection: Gagal");
        }
    }
    
    public void clear(){
        box_namaBarang.setText("");
        box_hargaBarang.setText("");
        box_jumlahBarang.setText("");
        box_namaBarang.requestFocus();
    }
    
    public void insertData(){
        int index = jTable1.getRowCount();
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{
            index += 1,
            box_namaBarang.getText(),
            box_hargaBarang.getText(),
            box_jumlahBarang.getText()
    });
    }
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        namaToko = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        box_namaBarang = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        box_hargaBarang = new javax.swing.JTextField();
        box_jumlahBarang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_tambah = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        btn_hitung = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        btn_showDatabase = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(41, 47, 54));
        jPanel1.setForeground(new java.awt.Color(78, 205, 196));
        jPanel1.setPreferredSize(new java.awt.Dimension(790, 56));

        namaToko.setBackground(new java.awt.Color(25, 220, 150));
        namaToko.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        namaToko.setForeground(new java.awt.Color(242, 242, 242));
        namaToko.setText("MrPipsterr");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(namaToko, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(namaToko, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jPanel5.setBackground(new java.awt.Color(165, 151, 139));

        box_namaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_namaBarangActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setText("Nama");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setText("Harga");

        box_hargaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_hargaBarangActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setText("Jumlah");

        btn_tambah.setBackground(new java.awt.Color(21, 127, 31));
        btn_tambah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_tambah.setText("Tambah");
        btn_tambah.setPreferredSize(new java.awt.Dimension(80, 30));
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_edit.setBackground(new java.awt.Color(48, 188, 237));
        btn_edit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_edit.setText("Edit");
        btn_edit.setPreferredSize(new java.awt.Dimension(73, 30));
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(48, 188, 237));
        btn_delete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.setPreferredSize(new java.awt.Dimension(73, 30));
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_clear.setBackground(new java.awt.Color(48, 188, 237));
        btn_clear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.setPreferredSize(new java.awt.Dimension(73, 30));
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(137, 6, 32));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setText("Total");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(242, 242, 242));
        jLabel5.setText("Tunai");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(242, 242, 242));
        jLabel6.setText("Kembali");

        jTextField4.setMinimumSize(new java.awt.Dimension(64, 25));
        jTextField4.setPreferredSize(new java.awt.Dimension(64, 25));

        jTextField5.setMinimumSize(new java.awt.Dimension(64, 25));
        jTextField5.setPreferredSize(new java.awt.Dimension(64, 25));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setMinimumSize(new java.awt.Dimension(64, 25));
        jTextField6.setPreferredSize(new java.awt.Dimension(64, 25));

        btn_hitung.setBackground(new java.awt.Color(255, 233, 0));
        btn_hitung.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_hitung.setForeground(new java.awt.Color(0, 0, 0));
        btn_hitung.setText("Hitung");
        btn_hitung.setBorderPainted(false);
        btn_hitung.setPreferredSize(new java.awt.Dimension(72, 30));
        btn_hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hitungActionPerformed(evt);
            }
        });

        btn_simpan.setBackground(new java.awt.Color(255, 233, 0));
        btn_simpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_simpan.setForeground(new java.awt.Color(0, 0, 0));
        btn_simpan.setText("Simpan");
        btn_simpan.setBorderPainted(false);
        btn_simpan.setPreferredSize(new java.awt.Dimension(72, 30));
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_showDatabase.setBackground(new java.awt.Color(255, 233, 0));
        btn_showDatabase.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_showDatabase.setForeground(new java.awt.Color(0, 0, 0));
        btn_showDatabase.setText("Show Database");
        btn_showDatabase.setBorderPainted(false);
        btn_showDatabase.setPreferredSize(new java.awt.Dimension(72, 30));
        btn_showDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showDatabaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(btn_hitung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_showDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_hitung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_showDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(142, 125, 190));

        jTable1.setForeground(new java.awt.Color(18, 30, 49));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama", "Harga", "Jumlah"
            }
        ));
        jTable1.setDragEnabled(true);
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setInheritsPopupMenu(true);
        jTable1.setShowGrid(false);
        jTable1.setShowVerticalLines(true);
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(30);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel3.setBackground(new java.awt.Color(165, 151, 139));
        jPanel3.setMaximumSize(new java.awt.Dimension(880, 1000));
        jPanel3.setPreferredSize(new java.awt.Dimension(880, 24));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box_hargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_jumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_hargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_jumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here:
        if (box_namaBarang.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nama barang belum di input");
            box_namaBarang.requestFocus();
        } else if (box_hargaBarang.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Harga barang belum di input");
            box_hargaBarang.requestFocus();
        } else if (box_jumlahBarang.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Jumlah barang belum di input");
            box_jumlahBarang.requestFocus();
        } else{
            insertData();
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
            clear();
        }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        int jumlahRowData = jTable1.getRowCount();
        int indexDataSelect = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        if (jumlahRowData == 0) {
            JOptionPane.showMessageDialog(null, "Belum ada data");
        } else {
            if (indexDataSelect != -1) {
                if (btn_edit.getText() == "Edit"){
                btn_tambah.setEnabled(false);
                btn_delete.setEnabled(false);
                btn_edit.setText("Update");

                box_namaBarang.setText(model.getValueAt(indexDataSelect, 1).toString());
                box_hargaBarang.setText(model.getValueAt(indexDataSelect, 2).toString());
                box_jumlahBarang.setText(model.getValueAt(indexDataSelect, 3).toString());
            } else {
                btn_tambah.setEnabled(true);
                btn_delete.setEnabled(true);
                btn_edit.setText("Edit");

                model.setValueAt(box_namaBarang.getText().toString(), indexDataSelect, 1);
                model.setValueAt(box_hargaBarang.getText().toString(), indexDataSelect, 2);
                model.setValueAt(box_jumlahBarang.getText().toString(), indexDataSelect, 3);

                clear();           
                }
            } else {
                JOptionPane.showMessageDialog(null, "Silakan pilih data yang ingin di edit");
            }
        } 
    }//GEN-LAST:event_btn_editActionPerformed

    private void box_namaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_namaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_namaBarangActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        int jumlahRowData = jTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        if (jumlahRowData == 0) {
            JOptionPane.showMessageDialog(null, "Belum ada data");
        } else {
            // Menghapus semua data dalam database sebelum menyimpan data baru
            MyConfig.deleteAllData();

            for (int i = 0; i < jumlahRowData; i++) {
                String namaBarang = model.getValueAt(i, 1).toString();
                int hargaBarang = Integer.parseInt(model.getValueAt(i, 2).toString());
                int jumlahBarang = Integer.parseInt(model.getValueAt(i, 3).toString());

                MyConfig.insertData(namaBarang, hargaBarang, jumlahBarang);
            }
            model.setRowCount(0);
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan ke dalam database");
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hitungActionPerformed
        // TODO add your handling code here:
        int jumlahRowData = jTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        int totalHarga = 0;
        int inputTunai = 0;

        for (int i = 0; i < jumlahRowData; i++) {
            int hargaBarang = Integer.parseInt(model.getValueAt(i, 2).toString());
            int jumlahBarang = Integer.parseInt(model.getValueAt(i, 3).toString());

            int subTotal = hargaBarang * jumlahBarang;
            totalHarga += subTotal;
        }
        
        String tunai = jTextField5.getText();
        if (!tunai.isEmpty()) {
            try {
                inputTunai = Integer.parseInt(tunai);
            } catch (NumberFormatException e) {
                String total = String.valueOf(totalHarga);
                jTextField4.setText(total);
                JOptionPane.showMessageDialog(null, "Input tunai tidak valid. Harap masukkan angka");
                return; // Menghentikan eksekusi lebih lanjut jika input tidak valid
            }
        } else {
            String total = String.valueOf(totalHarga);
            jTextField4.setText(total);
            JOptionPane.showMessageDialog(null, "Input tunai kosong. Harap masukkan angka");
            return; // Menghentikan eksekusi lebih lanjut jika input kosong
        }

        String total = String.valueOf(totalHarga);
        jTextField4.setText(total);

        if (inputTunai < totalHarga) {
            JOptionPane.showMessageDialog(null, "Tunai harus lebih besar atau sama dengan total harga");
            jTextField6.setText("");
            return; // Menghentikan eksekusi lebih lanjut jika tunai kurang dari total harga
        } else {
            int kembalian = inputTunai - totalHarga;
            String kembali = String.valueOf(kembalian);
            jTextField6.setText(kembali);
            JOptionPane.showMessageDialog(null, "Berhasil menghitung");
        }
    }//GEN-LAST:event_btn_hitungActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
        String tunai = jTextField5.getText();
        jTextField5.setText(tunai);
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        int jumlahRowData = jTable1.getRowCount();
        int indexDataSelect = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        if (jumlahRowData == 0) {
            JOptionPane.showMessageDialog(null, "Belum ada data");
        } else {
            if (indexDataSelect != -1) {
                model.removeRow(indexDataSelect);
            } else {
                JOptionPane.showMessageDialog(null, "Silakan pilih data yang ingin di hapus");
            }
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    
    private void btn_showDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showDatabaseActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0); // Menghapus semua baris yang ada pada tabel

            try {
                MyConfig.connection();
                statement = connection.createStatement();
                resultSet = statement.executeQuery("SELECT * FROM `db_barang`");
                
                int nomorCounter= 1;
                boolean isEmpty = true;

                while (resultSet.next()) {
                    isEmpty = false;
                    
                    int id = nomorCounter++;
                    String nama = resultSet.getString("Nama");
                    int harga = resultSet.getInt("Harga");
                    int jumlah = resultSet.getInt("Jumlah");

                    model.addRow(new Object[]{id, nama, harga, jumlah});
                }
                
                if (isEmpty){
                    JOptionPane.showMessageDialog(null, "Database Kosong");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
    }//GEN-LAST:event_btn_showDatabaseActionPerformed

    private void box_hargaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_hargaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_hargaBarangActionPerformed

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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField box_hargaBarang;
    private javax.swing.JTextField box_jumlahBarang;
    private javax.swing.JTextField box_namaBarang;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hitung;
    private javax.swing.JButton btn_showDatabase;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel namaToko;
    // End of variables declaration//GEN-END:variables
}
