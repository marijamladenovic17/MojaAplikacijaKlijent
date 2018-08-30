/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.sluzbenik;

import forme.sluzbenik.FormaZaSluzbenika;
import db.Konstanta;
import domen.Clan;
import domen.Komisija;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.BreakNode;
import komunikacija.KomunikacijaSaServerom;
import konstante.Operacije;
import logika.Kontroler;
import modeli.ModelTabeleKomisija;
import transfer.KlijentskiZahtev;
import transfer.ServerskiOdgovor;

/**
 *
 * @author PC
 */
public class FormaUnosKomisije extends javax.swing.JFrame {

    /**
     * Creates new form FormaUnosKomisije
     */
    public FormaUnosKomisije() {
        initComponents();
        popuniKomboBox1();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int x = (int) tk.getScreenSize().getWidth();
        int y = (int) tk.getScreenSize().getHeight();
        vratiKomiijaID();
        setSize(x, y);
        srediTabelu();
        txtIDkom.setEnabled(false);
        btnPromeni.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIDkom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtUsernameKom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassKom = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnMinus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClanova = new javax.swing.JTable();
        btnUnesiKomisiju = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnGlavni = new javax.swing.JButton();
        btnPromeni = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Unos nove komisije");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setText("ID nove komisije:");

        jLabel2.setText("Username:");

        jLabel3.setText("Password:");

        jLabel7.setText("Molimo unesite clanove:");

        btnMinus.setText("-");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        tabelaClanova.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaClanova);

        btnUnesiKomisiju.setText("Unesi komisiju");
        btnUnesiKomisiju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnesiKomisijuActionPerformed(evt);
            }
        });

        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnGlavni.setText("Zatvori");
        btnGlavni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGlavniActionPerformed(evt);
            }
        });

        btnPromeni.setText("Promeni komisiju");
        btnPromeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromeniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPromeni)
                        .addGap(59, 59, 59)
                        .addComponent(btnGlavni, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnUnesiKomisiju))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(84, 84, 84)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPassKom)
                                    .addComponent(txtUsernameKom)
                                    .addComponent(txtIDkom))))))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIDkom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtUsernameKom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassKom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnMinus)
                    .addComponent(btnPlus))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUnesiKomisiju)
                    .addComponent(btnGlavni)
                    .addComponent(btnPromeni))
                .addGap(101, 101, 101))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUnesiKomisijuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnesiKomisijuActionPerformed
        // TODO add your handling code here:
        ModelTabeleKomisija mtk = (ModelTabeleKomisija) tabelaClanova.getModel();
        ArrayList<Clan> listaC = (ArrayList<Clan>) mtk.getClanovi();
        String id = txtIDkom.getText();
        
        String username = txtUsernameKom.getText();
        String pass = txtPassKom.getText();
        if(id.isEmpty() || username.isEmpty() || pass.isEmpty() || listaC==null) {
             JOptionPane.showMessageDialog(this, "Niste uneli sve podatke!");
             return;
        }
        if(listaC.size()<2){
             JOptionPane.showMessageDialog(this, "Morate uneti bar 2 clana komisije!");
                     return;
        }
        for (int i = 0; i < listaC.size()-1; i++) {
            for (int j = i+1; j < listaC.size(); j++) {
                if(listaC.get(i).equals(listaC.get(j))) {
                     JOptionPane.showMessageDialog(this, "Uneli ste istog clana dva puta!");
                     return;
                }
                
            }
            
        }
        
        int komID = Integer.parseInt(id);
        Komisija kom = new Komisija(komID, username, pass, listaC);
        KlijentskiZahtev kz = new KlijentskiZahtev(Operacije.UNOS_KOMISIJE, kom);
        KomunikacijaSaServerom.getInstance().posaljiKZ(kz);
        ServerskiOdgovor so = KomunikacijaSaServerom.getInstance().prihvatiSO();
        
         if(so.getOdgovor().equals("!")) {
            JOptionPane.showMessageDialog(this,so.getPoruka());
        } else {
        JOptionPane.showMessageDialog(this,so.getPoruka());
        }

    }//GEN-LAST:event_btnUnesiKomisijuActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        ModelTabeleKomisija mtk = (ModelTabeleKomisija) tabelaClanova.getModel();
        int red = tabelaClanova.getSelectedRow();
        if(red==-1) {
            JOptionPane.showMessageDialog(this, "Morate da izaberete red!");
            return;
        }
        mtk.obrisiKomisiju(red);
    }//GEN-LAST:event_btnMinusActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
         FormaZaUnosClanova fzc = new FormaZaUnosClanova(this, true);
        fzc.setVisible(true);
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnGlavniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGlavniActionPerformed
       FormaZaSluzbenika fzs = new FormaZaSluzbenika();
       fzs.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnGlavniActionPerformed

    private void btnPromeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromeniActionPerformed
         ModelTabeleKomisija mtk = (ModelTabeleKomisija) tabelaClanova.getModel();
        ArrayList<Clan> listaC = (ArrayList<Clan>) mtk.getClanovi();
        
        for (int i = 0; i < listaC.size()-1; i++) {
            for (int j = i+1; j < listaC.size(); j++) {
                if(listaC.get(i).equals(listaC.get(j))) {
                     JOptionPane.showMessageDialog(this, "Uneli ste istog clana dva puta!");
                     return;
                }
                
            }
            
        }
        String id = txtIDkom.getText();
        int komID = Integer.parseInt(id);
        String username = txtUsernameKom.getText();
        String pass = txtPassKom.getText();
        if(id.isEmpty() || username.isEmpty() || pass.isEmpty() || listaC==null) {
             JOptionPane.showMessageDialog(this, "Niste uneli sve podatke!");
             return;
        }
        Komisija kom = new Komisija(komID, username, pass, listaC);
         KlijentskiZahtev kz = new KlijentskiZahtev(Operacije.IZMENA_KOMISIJE, kom);
        KomunikacijaSaServerom.getInstance().posaljiKZ(kz);
        ServerskiOdgovor so = KomunikacijaSaServerom.getInstance().prihvatiSO();
        
        
         if(so.getOdgovor().equals("!")) {
            JOptionPane.showMessageDialog(this,so.getPoruka() );
        } else {
        JOptionPane.showMessageDialog(this, so.getPoruka());
        }
    }//GEN-LAST:event_btnPromeniActionPerformed

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
            java.util.logging.Logger.getLogger(FormaUnosKomisije.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormaUnosKomisije.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormaUnosKomisije.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormaUnosKomisije.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormaUnosKomisije().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGlavni;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnPromeni;
    private javax.swing.JButton btnUnesiKomisiju;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaClanova;
    private javax.swing.JTextField txtIDkom;
    private javax.swing.JTextField txtPassKom;
    private javax.swing.JTextField txtUsernameKom;
    // End of variables declaration//GEN-END:variables

    private void popuniKomboBox1() {
//        List<Clan> listaclanova = Kontroler.getInstance().vratiClanove();
//        cmbPrviClan.removeAllItems();
//        cmbDrugiClan.removeAllItems();
//        cmbTreciClan.removeAllItems();
//        for (Clan clan : listaclanova) {
//            cmbPrviClan.addItem(clan);
//        }
//        
//        
//        for (Clan clan : listaclanova) {
//            
//                cmbDrugiClan.addItem(clan);
//            
//        }
//         
//         for (Clan clan : listaclanova) {
//            
//                cmbTreciClan.addItem(clan);
//            
//        }
    }

    private void srediTabelu() {
        ModelTabeleKomisija mtk = new ModelTabeleKomisija();
        tabelaClanova.setModel(mtk);
    }

    void dodajClana(Clan clan) {
        ModelTabeleKomisija mtk = (ModelTabeleKomisija) tabelaClanova.getModel();
        mtk.dodajClana(clan);

    }

    void srediFormu(Komisija kom) {
        txtIDkom.setText(kom.getKomisijaID()+"");
        txtUsernameKom.setText(kom.getUsername());
        txtPassKom.setText(kom.getPassword());
        ArrayList<Clan> lic=(ArrayList<Clan>) kom.getListaClanova();
        ModelTabeleKomisija mtk = new  ModelTabeleKomisija();
        tabelaClanova.setModel(mtk);
        for (Clan clan : lic) {
            mtk.dodajClana(clan);
        }
    }

    void srediDugme() {
      btnPromeni.setVisible(true);
      btnUnesiKomisiju.setVisible(false);
      
    }

    private void vratiKomiijaID() {
        KlijentskiZahtev kz = new KlijentskiZahtev(Operacije.VRATI_MAX_ID_KOMISIJA, null);
        KomunikacijaSaServerom.getInstance().posaljiKZ(kz);
        ServerskiOdgovor so = KomunikacijaSaServerom.getInstance().prihvatiSO();
        txtIDkom.setText(so.getOdgovor()+"");
    }

}
