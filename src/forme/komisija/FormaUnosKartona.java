/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.komisija;

import db.Konstanta;
import domen.GrupaZadatka;
import domen.Kandidat;
import domen.Karton;
import domen.Resenje;
import domen.Test;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import komunikacija.KomunikacijaSaServerom;
import konstante.Operacije;
import logika.Kontroler;
import modeli.ModelTabeleResenjaZadataka;
import transfer.KlijentskiZahtev;
import transfer.ServerskiOdgovor;

/**
 *
 * @author PC
 */
public class FormaUnosKartona extends javax.swing.JFrame {

    /**
     * Creates new form FormaUnosKartona
     */
    public FormaUnosKartona() {
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int x = tk.getScreenSize().width;
        int y = tk.getScreenSize().height;
        postaviKartonID();
        setSize(x, y);
       // vratiKartonId();
        popuniGrupuZadataka();
        lblTest.setVisible(false);
        srediTabelu();
        lblTekst.setVisible(false);
        lblUkupanBrPoena.setVisible(false);
        txtPrezimeKandidata.setVisible(false);
        txtBrojUnosaKartona.setText("1");
        
        txtBrojUnosaKartona.setEnabled(false);
        txtImeKandidata.setVisible(false);
        lblIme.setVisible(false);
        lblPrezime.setVisible(false);
//        vratiBrUnosaKartona();
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
        cmbGZ = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        lblTest = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelOdgovora = new javax.swing.JTable();
        btnUkupanBrojPoena = new javax.swing.JButton();
        lblTekst = new javax.swing.JLabel();
        lblUkupanBrPoena = new javax.swing.JLabel();
        lblIme = new javax.swing.JLabel();
        txtImeKandidata = new javax.swing.JTextField();
        lblPrezime = new javax.swing.JLabel();
        txtPrezimeKandidata = new javax.swing.JTextField();
        btnSacuvajKarton = new javax.swing.JButton();
        btnProveriPodatke = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtSifraPrijave = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtKartonID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtBrojKartona = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtBrojUnosaKartona = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Unos kartona ");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        cmbGZ.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbGZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGZActionPerformed(evt);
            }
        });

        jLabel6.setText("Grupa zadataka: ");

        lblTest.setBackground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Unos odgovora"));

        tabelOdgovora.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelOdgovora);

        btnUkupanBrojPoena.setText("Izracunaj ukupan broj osvojenih poena");
        btnUkupanBrojPoena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUkupanBrojPoenaActionPerformed(evt);
            }
        });

        lblTekst.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTekst.setText("UKUPAN BROJ OSTVARENIH POENA");

        lblUkupanBrPoena.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUkupanBrojPoena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTekst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUkupanBrPoena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnUkupanBrojPoena)
                        .addGap(49, 49, 49)
                        .addComponent(lblTekst)
                        .addGap(18, 18, 18)
                        .addComponent(lblUkupanBrPoena, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(157, 157, 157))
        );

        lblIme.setText("Ime kandidata:");

        lblPrezime.setText("Prezime kandidata:");

        btnSacuvajKarton.setText("SACUVAJ KARTON");
        btnSacuvajKarton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajKartonActionPerformed(evt);
            }
        });

        btnProveriPodatke.setText("PROVERI PODATKE KARTONA");
        btnProveriPodatke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveriPodatkeActionPerformed(evt);
            }
        });

        jLabel8.setText("Sifra prijave:");

        jButton1.setText("Glavna forma");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblIme)
                                .addGap(34, 34, 34)
                                .addComponent(txtImeKandidata, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(lblPrezime)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrezimeKandidata, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(225, 225, 225))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(58, 58, 58)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSacuvajKarton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProveriPodatke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbGZ, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(lblTest, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSifraPrijave, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTest, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbGZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtSifraPrijave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIme)
                    .addComponent(txtImeKandidata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrezime)
                    .addComponent(txtPrezimeKandidata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProveriPodatke))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSacuvajKarton)
                    .addComponent(jButton1))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setText("KartonID:");

        jLabel2.setText("Broj kartona:");

        jLabel3.setText("[Redni broj kartona u bazi]");

        jLabel4.setText("[Broj kartona napisan na samom kartonu]");

        jLabel5.setText("Broj unosa kartona:");

        jLabel7.setText("[Prvi ili drugi unos]");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtKartonID, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtBrojUnosaKartona, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBrojKartona, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(283, 283, 283)
                        .addComponent(jLabel4)))
                .addGap(47, 47, 47))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKartonID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtBrojKartona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtBrojUnosaKartona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbGZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGZActionPerformed
        GrupaZadatka gz = (GrupaZadatka) cmbGZ.getSelectedItem();
        if (gz != null) {
            lblTest.setText(gz.getTest().toString());
            lblTest.setVisible(true);
            srediTabelu();
        }

    }//GEN-LAST:event_cmbGZActionPerformed

    private void btnUkupanBrojPoenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUkupanBrojPoenaActionPerformed
        double ukupanBrojBodova = 0;
        GrupaZadatka gz = (GrupaZadatka) cmbGZ.getSelectedItem();
        ArrayList<Resenje> listaResenja = (ArrayList<Resenje>) gz.getListaResenihZadataka();
        ModelTabeleResenjaZadataka mrz = (ModelTabeleResenjaZadataka) tabelOdgovora.getModel();
        ArrayList<Resenje> listaOdgovora = mrz.vraiResenja();
        for (Resenje resenje : listaResenja) {
            for (Resenje resenje1 : listaOdgovora) {
                if (resenje.getRbZadatka() == resenje1.getRbZadatka()) {
                    String s1 = resenje.getOdgovor() + "";
                    s1 = s1.toUpperCase();
                    System.out.println("+"+s1+"+");
                    String s2 = resenje1.getOdgovor() + "";
                    s2 = s2.toUpperCase();
                    System.out.println("+"+s1+"+");
                    if (s2.equals(" ")) {
                        ukupanBrojBodova = ukupanBrojBodova - 1;
                        break;
                    }
                    if (!s2.equals("N")) {
                        if (s1.toUpperCase().equals(s2.toUpperCase())) {
                            ukupanBrojBodova += 3;
                        } else {
                            ukupanBrojBodova = ukupanBrojBodova - 0.3;
                        }
                    }
                }
            }
        }
        lblTekst.setVisible(true);
        lblUkupanBrPoena.setText(ukupanBrojBodova + "");
        lblUkupanBrPoena.setVisible(true);
        btnUkupanBrojPoena.setVisible(false);
        txtPrezimeKandidata.setVisible(true);
        txtImeKandidata.setVisible(true);
        lblIme.setVisible(true);
        lblPrezime.setVisible(true);

    }//GEN-LAST:event_btnUkupanBrojPoenaActionPerformed

    private void btnSacuvajKartonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajKartonActionPerformed
        String kid = txtKartonID.getText();
        String brUnosa = txtBrojUnosaKartona.getText();
        String brojKar = txtBrojKartona.getText();
        if (kid.isEmpty() || brUnosa.isEmpty() || brojKar.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Popunite sve podatke o kartonu!");
            return;
        }

        GrupaZadatka gz = (GrupaZadatka) cmbGZ.getSelectedItem();
        String rezultat = lblUkupanBrPoena.getText();
        String brojPrijave = txtSifraPrijave.getText();
        if(rezultat.isEmpty() || brojPrijave.isEmpty() || gz==null){
            JOptionPane.showMessageDialog(this, "Niste uneli sva polja!");
            return;
        }
        int kartonID = Integer.parseInt(kid);
        int brojUnosa = Integer.parseInt(brUnosa);
        int brojKartona = Integer.parseInt(brojKar);
        double rez = Double.parseDouble(rezultat);
        Kandidat kandidat = Kontroler.getInstance().proveriKarton(brojPrijave);
        Karton karton = new Karton(kartonID, brojKartona, brojPrijave,rez, brojUnosa, gz, kandidat);
        boolean sacuvano = Kontroler.getInstance().unesiKarton(karton);
        if(sacuvano){
            JOptionPane.showMessageDialog(this, "Uspesno sacuvan karton!");
        }else {
        JOptionPane.showMessageDialog(this, "Neuspesno sacuvan karton!");
        }
        //int
    }//GEN-LAST:event_btnSacuvajKartonActionPerformed

    private void btnProveriPodatkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveriPodatkeActionPerformed
        String ime = txtImeKandidata.getText();
        String prezime = txtPrezimeKandidata.getText();
        String brojPrijave = txtSifraPrijave.getText();
        Kandidat kandidat = Kontroler.getInstance().proveriKarton(brojPrijave);
        if (kandidat == null) {
            JOptionPane.showMessageDialog(this, "Kandidat sa ovom sifrom prijave ne postoji u bazi!");
            return;
        }
        if (kandidat.getIme().toUpperCase().equals(ime.toUpperCase()) && kandidat.getPrezime().toUpperCase().equals(prezime.toUpperCase())) {
            JOptionPane.showMessageDialog(this, "Podaci su ispravni! Mozete sacuvati ovaj karton!");
        } else {
            JOptionPane.showMessageDialog(this, "Doslo je do greske! Ime i prezime kandidata se ne poklapaju sa sifrom prijave!");
        }
    }//GEN-LAST:event_btnProveriPodatkeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FormaZaKomisiju fzk = new FormaZaKomisiju();
        fzk.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FormaUnosKartona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormaUnosKartona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormaUnosKartona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormaUnosKartona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormaUnosKartona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProveriPodatke;
    private javax.swing.JButton btnSacuvajKarton;
    private javax.swing.JButton btnUkupanBrojPoena;
    private javax.swing.JComboBox cmbGZ;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIme;
    private javax.swing.JLabel lblPrezime;
    private javax.swing.JLabel lblTekst;
    private javax.swing.JLabel lblTest;
    private javax.swing.JLabel lblUkupanBrPoena;
    private javax.swing.JTable tabelOdgovora;
    private javax.swing.JTextField txtBrojKartona;
    private javax.swing.JTextField txtBrojUnosaKartona;
    private javax.swing.JTextField txtImeKandidata;
    private javax.swing.JTextField txtKartonID;
    private javax.swing.JTextField txtPrezimeKandidata;
    private javax.swing.JTextField txtSifraPrijave;
    // End of variables declaration//GEN-END:variables

    private void vratiKartonId() {
        int kartonID = Kontroler.getInstance().vratiKartonID();
        txtKartonID.setText(kartonID + "");
    }

//    private void vratiBrUnosaKartona() {
//        String brKarton = txtBrojKartona.getText();
//        String regex = "[0-9]+";
//        if(regex)
//        int brKartona = Integer.parseInt(brKarton);
//        int brojUnosa = Kontroler.getInstance().vratiBrUnosa();
//        if(brojUnosa==1) {
//            txtBrojUnosaKartona.setText("PRVI UNOS!");
//        }
//        if(brojUnosa==2) {
//            txtBrojUnosaKartona.setText("DRUGI UNOS!");
//        }
//        if(brojUnosa>2) {
//            JOptionPane.showMessageDialog(this, "Ovaj karton je vec unet 2 puta!");
//        }
//                
//    }
    private void popuniGrupuZadataka() {
        KlijentskiZahtev kz = new KlijentskiZahtev(Operacije.VRATI_GRUPU_ZADATKA, null);
        KomunikacijaSaServerom.getInstance().posaljiKZ(kz);
        ServerskiOdgovor so = KomunikacijaSaServerom.getInstance().prihvatiSO();
        ArrayList<GrupaZadatka> listGZ = (ArrayList<GrupaZadatka>) so.getOdgovor();

        cmbGZ.removeAllItems();

        for (GrupaZadatka grupaZadatka : listGZ) {
            cmbGZ.addItem(grupaZadatka);
        }

    }

    private void srediTabelu() {
        ModelTabeleResenjaZadataka mrs = new ModelTabeleResenjaZadataka();
        tabelOdgovora.setModel(mrs);
        GrupaZadatka gz = (GrupaZadatka) cmbGZ.getSelectedItem();
        Test t = gz.getTest();
        if (t.getTestID() == 1) {
            for (int i = 0; i < 20; i++) {
                mrs.dodajResenje(i + 1, ' ');
            }
        } else {
            for (int i = 0; i < 30; i++) {
                mrs.dodajResenje(i + 1, ' ');
            }
        }

    }

    private void postaviKartonID() {
        KlijentskiZahtev kz = new KlijentskiZahtev(Operacije.VRATI_MAX_ID_KARTONA, null);
        KomunikacijaSaServerom.getInstance().posaljiKZ(kz);
        ServerskiOdgovor so = KomunikacijaSaServerom.getInstance().prihvatiSO();
        
        int br  = (int) so.getOdgovor();
        txtKartonID.setText(br+"");
        txtKartonID.setEnabled(false);
    }

    void postaviUnosK() {
        txtBrojUnosaKartona.setText("2");
    }
}
