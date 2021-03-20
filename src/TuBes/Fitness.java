package TuBes;

import com.sun.jmx.snmp.BerDecoder;
import javax.swing.JOptionPane;


public class Fitness extends javax.swing.JFrame {
    public String by ;
    public String t = "Error";
    
    public Fitness() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Nama_Label2 = new javax.swing.JLabel();
        Umur_TextField = new javax.swing.JTextField();
        Umur_Label2 = new javax.swing.JLabel();
        Nama_TextField1 = new javax.swing.JTextField();
        Membership_RadioButton1 = new javax.swing.JRadioButton();
        Membership_ComboBox1 = new javax.swing.JComboBox();
        Fitness_Label2 = new javax.swing.JLabel();
        Fitness_TextField1 = new javax.swing.JTextField();
        Tahun_Label3 = new javax.swing.JLabel();
        Umur_Label4 = new javax.swing.JLabel();
        Lanjut_Button1 = new javax.swing.JButton();
        Batal_Button2 = new javax.swing.JButton();
        Hapus_Button2 = new javax.swing.JButton();
        Bayar_Label2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fitness Center");

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel1.setText("Selamat Datang Di Fitness Center");

        Nama_Label2.setText("Nama :");

        Umur_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Umur_TextFieldActionPerformed(evt);
            }
        });

        Umur_Label2.setText("Umur :");

        Nama_TextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nama_TextField1ActionPerformed(evt);
            }
        });

        Membership_RadioButton1.setText("Membership ");
        Membership_RadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Membership_RadioButton1ItemStateChanged(evt);
            }
        });
        Membership_RadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Membership_RadioButton1ActionPerformed(evt);
            }
        });

        Membership_ComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Durasi Membership (Bulan)", "< 5 Bulan", "5 - 10 Bulan", "> 10 Bulan" }));

        Membership_ComboBox1.setEnabled(false);
        Membership_ComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Membership_ComboBox1ActionPerformed(evt);
            }
        });

        Fitness_Label2.setText("Lama Fitness :");

        Fitness_TextField1.setToolTipText("");
        Fitness_TextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fitness_TextField1ActionPerformed(evt);
            }
        });

        Tahun_Label3.setText("Tahun");

        Umur_Label4.setText("Jam");

        Lanjut_Button1.setText("Lanjutkan");
        Lanjut_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lanjut_Button1ActionPerformed(evt);
            }
        });

        Batal_Button2.setText("Batal");
        Batal_Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Batal_Button2ActionPerformed(evt);
            }
        });

        Hapus_Button2.setText("Hapus");
        Hapus_Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hapus_Button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Membership_RadioButton1)
                            .addComponent(Batal_Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Hapus_Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(Lanjut_Button1))
                            .addComponent(Membership_ComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Umur_Label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Nama_Label2, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                            .addComponent(Fitness_Label2))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Umur_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Fitness_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Umur_Label4)
                                    .addComponent(Tahun_Label3)))
                            .addComponent(Nama_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 100, Short.MAX_VALUE)
                        .addComponent(Bayar_Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(Bayar_Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nama_Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nama_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Umur_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Umur_Label2)
                            .addComponent(Tahun_Label3))
                        .addGap(12, 12, 12)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fitness_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fitness_Label2)
                    .addComponent(Umur_Label4))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Membership_RadioButton1)
                    .addComponent(Membership_ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lanjut_Button1)
                    .addComponent(Batal_Button2)
                    .addComponent(Hapus_Button2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Umur_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Umur_TextFieldActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_Umur_TextFieldActionPerformed

    private void Nama_TextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nama_TextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nama_TextField1ActionPerformed

    private void Fitness_TextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fitness_TextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Fitness_TextField1ActionPerformed

    private void Membership_ComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Membership_ComboBox1ActionPerformed
//        Membership_ComboBox1.setEnabled(false);
//        Membership_ComboBox1.setVisible(false);
    }//GEN-LAST:event_Membership_ComboBox1ActionPerformed

    private void Membership_RadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Membership_RadioButton1ActionPerformed
        
        if(Membership_RadioButton1.isSelected()){
            Membership_ComboBox1.setEnabled(true);
            new Membership().setVisible(true);
            
        }
        
        else {
            Membership_ComboBox1.setEnabled(false);
        }
        
    }//GEN-LAST:event_Membership_RadioButton1ActionPerformed

    private void Batal_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Batal_Button2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Batal_Button2ActionPerformed

    private void Hapus_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hapus_Button2ActionPerformed
        Nama_TextField1.setText("");
        Umur_TextField.setText("");
        Fitness_TextField1.setText("");
        Membership_RadioButton1.setSelected(false);
        Membership_ComboBox1.setEnabled(false);
    }//GEN-LAST:event_Hapus_Button2ActionPerformed

    private void Lanjut_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lanjut_Button1ActionPerformed
        try{
        Total tl = new Total();
        
        String s = Nama_TextField1.getText();
        String t = Umur_TextField.getText();
        tl.Nama_Label5.setText(s + ", " + t + " Tahun");
        
        String r = Fitness_TextField1.getText();
        tl.Jam_Label8.setText(r + " Jam");
        
        int hrg = 0;
        String byr = String.valueOf(bayar(hrg));
        tl.Normal_TextField1.setText("Harga normal    : Rp " + byr);
        
        int umur = Integer.parseInt(Umur_TextField.getText()); 
        int hg = Integer.parseInt(byr);
        uur(hg,umur);
        String umr = String.valueOf(uur(hg,umur));
        
        if(Membership_RadioButton1.isSelected() && Membership_ComboBox1.isVisible()){
            int br = Integer.parseInt(umr);
            this.by = String.valueOf(ship(br));
        }
        else{
             this.by = umr;
        }
        
        tl.Diskon_TextField2.setText("Total harga\t: Rp " + by);
        tl.setVisible(true);
        }
        
        catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Inputan salah", t, 0);
        }
    }//GEN-LAST:event_Lanjut_Button1ActionPerformed

    private void Membership_RadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Membership_RadioButton1ItemStateChanged

    }//GEN-LAST:event_Membership_RadioButton1ItemStateChanged

    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Fitness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fitness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fitness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fitness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fitness().setVisible(true);
            }
        });
    }
    
    int ship(int byr){
        int shp = Membership_ComboBox1.getSelectedIndex();
        if(shp == 1){
            byr= (int) (byr - (byr*0.1));
        }
        else if(shp == 2){
            byr= (int) (byr - (byr*0.15));
        }
        else if (shp == 3){
            byr= (int) (byr - (byr*0.2));
        }
        return byr;
    }
    
    int uur(int hrg, int umur){
        if(umur>=41 && umur<=50){
            hrg = (int) (hrg - (hrg*0.2));     
        }     
        else if(umur>50 && umur<=60){         
            hrg = (int) (hrg - (hrg*0.3));     
        }     
        else if(umur>60){         
            hrg= (int) (hrg - (hrg*0.4));     
        }     
        else{      
        hrg=hrg;  
        }
        return hrg;
    }
    
    int bayar(int hrg){
        int byr = 10000;
        int wkt = Integer.parseInt(Fitness_TextField1.getText());
        if (wkt == 1){
            hrg = byr;
        }
        else if (wkt>1 && wkt <6){
            wkt -= 1;
            hrg = byr + (8000*wkt);
        }
        else if(wkt>5){
             wkt-= 5;
             hrg = byr + (8000*4) + (5000*wkt); 
        }
        return hrg;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Batal_Button2;
    public volatile javax.swing.JLabel Bayar_Label2;
    private javax.swing.JLabel Fitness_Label2;
    private javax.swing.JTextField Fitness_TextField1;
    private javax.swing.JButton Hapus_Button2;
    private javax.swing.JButton Lanjut_Button1;
    public javax.swing.JComboBox Membership_ComboBox1;
    public javax.swing.JRadioButton Membership_RadioButton1;
    private javax.swing.JLabel Nama_Label2;
    public static javax.swing.JTextField Nama_TextField1;
    private javax.swing.JLabel Tahun_Label3;
    private javax.swing.JLabel Umur_Label2;
    private javax.swing.JLabel Umur_Label4;
    private javax.swing.JTextField Umur_TextField;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}


