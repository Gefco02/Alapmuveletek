package alapmuvgyak;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import static java.lang.Math.random;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Muveletek extends javax.swing.JFrame {
    String mentettFajl; 
    /**
     * Creates new form Muveletek
     */
    public Muveletek() {
        initComponents();
    }
    Random random = new Random();
    int osszKerdes=0;
    int osszOsszeadas=0;
    int osszOsztas=0;
    int osszKivonas=0;
    int osszSzorzas=0;
    int osszProba=0;
    int probaOsszead=0;
    int probaKivonas=0;
    int probaOsztas=0;
    int probaSzorzas=0;
    double eredmeny;
    int valasz;
    int szam1 = 25;
    int szam2 = 6;
    int szam3;
    int muvelet;
    int osztasProba=0;
    int osztasKerdes=0;
    int osszeadProba=0;
    int osszeadKerdes=0;
    int szorzasKerdes=0;
    int szorzasProba=0;
    int kivonasProba=0;
    int kivonasKerdes=0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlGyakorlas = new javax.swing.JPanel();
        lblFeladat = new javax.swing.JLabel();
        txtEredmeny = new javax.swing.JTextField();
        btnEllenorzes = new javax.swing.JButton();
        lblValasz = new javax.swing.JLabel();
        btnUj = new javax.swing.JButton();
        btnMegoldas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblOsszKerdes = new javax.swing.JLabel();
        lblOsszProba = new javax.swing.JLabel();
        lblEredmeny = new javax.swing.JLabel();
        lblOsszeadKerdes = new javax.swing.JLabel();
        lblKivonasKerdes = new javax.swing.JLabel();
        lblOsztasKerdes = new javax.swing.JLabel();
        lblSzorzasKerdes = new javax.swing.JLabel();
        lblOsszeadProba = new javax.swing.JLabel();
        lblKivonasProba = new javax.swing.JLabel();
        lblOsztasProba = new javax.swing.JLabel();
        lblSzorzasProba = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFajl = new javax.swing.JMenu();
        mnuFajlMegnyit = new javax.swing.JMenuItem();
        mnuFajlMent = new javax.swing.JMenuItem();
        mnuFajlMentMaskent = new javax.swing.JMenuItem();
        mnuFajlSep1 = new javax.swing.JPopupMenu.Separator();
        mnuFajlKilep = new javax.swing.JMenuItem();
        mnuMuvelet = new javax.swing.JMenu();
        mnuMuveletOsszeadas = new javax.swing.JRadioButtonMenuItem();
        mnuMuveletKivonas = new javax.swing.JRadioButtonMenuItem();
        mnuMuveletOsztas = new javax.swing.JRadioButtonMenuItem();
        mnuMuveletSzorzas = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alapműveletek gyakoroltatása");

        pnlGyakorlas.setBorder(javax.swing.BorderFactory.createTitledBorder("Gyakorlás"));

        lblFeladat.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btnEllenorzes.setText("Ellenőrzés");
        btnEllenorzes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEllenorzesActionPerformed(evt);
            }
        });

        lblValasz.setText("visszajelzés");

        javax.swing.GroupLayout pnlGyakorlasLayout = new javax.swing.GroupLayout(pnlGyakorlas);
        pnlGyakorlas.setLayout(pnlGyakorlasLayout);
        pnlGyakorlasLayout.setHorizontalGroup(
            pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblValasz, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                        .addComponent(lblFeladat, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnEllenorzes)
                .addContainerGap())
        );
        pnlGyakorlasLayout.setVerticalGroup(
            pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFeladat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEllenorzes)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValasz, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnUj.setText("Új feladat");
        btnUj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUjActionPerformed(evt);
            }
        });

        btnMegoldas.setText("Megoldás");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Statisztika"));

        lblOsszKerdes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOsszKerdes.setText("Össz kérdések száma: 1");

        lblOsszProba.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOsszProba.setText("Össz Probálkozások száma: 1");

        lblEredmeny.setText("Eredmény: 0 %");

        lblOsszeadKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszeadKerdes.setText("Összeadás: 0");

        lblKivonasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblKivonasKerdes.setText("Kivonás: 0");

        lblOsztasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsztasKerdes.setText("Osztás: 0");

        lblSzorzasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSzorzasKerdes.setText("Szorzás: 0");

        lblOsszeadProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszeadProba.setText("Összeadás: 0");

        lblKivonasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblKivonasProba.setText("Kivonás: 0");

        lblOsztasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsztasProba.setText("Osztás: 0");

        lblSzorzasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSzorzasProba.setText("Szorzás: 0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblEredmeny)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsszeadKerdes)
                            .addComponent(lblKivonasKerdes)
                            .addComponent(lblOsztasKerdes)
                            .addComponent(lblSzorzasKerdes)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblOsszKerdes, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOsztasProba, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSzorzasProba, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsszeadProba, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblKivonasProba, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(24, 24, 24))
                    .addComponent(lblOsszProba, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblKivonasKerdes, lblOsszeadKerdes, lblOsztasKerdes, lblSzorzasKerdes});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOsszKerdes)
                    .addComponent(lblOsszProba))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOsszeadKerdes)
                    .addComponent(lblOsszeadProba))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKivonasKerdes)
                    .addComponent(lblKivonasProba))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOsztasKerdes)
                    .addComponent(lblOsztasProba))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSzorzasKerdes)
                    .addComponent(lblSzorzasProba))
                .addGap(32, 32, 32)
                .addComponent(lblEredmeny)
                .addGap(23, 23, 23))
        );

        mnuFajl.setText("Fájl");

        mnuFajlMegnyit.setText("Megnyit");
        mnuFajlMegnyit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFajlMegnyitActionPerformed(evt);
            }
        });
        mnuFajl.add(mnuFajlMegnyit);

        mnuFajlMent.setText("Ment");
        mnuFajlMent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFajlMentActionPerformed(evt);
            }
        });
        mnuFajl.add(mnuFajlMent);

        mnuFajlMentMaskent.setText("Mentés másként...");
        mnuFajlMentMaskent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFajlMentMaskentActionPerformed(evt);
            }
        });
        mnuFajl.add(mnuFajlMentMaskent);
        mnuFajl.add(mnuFajlSep1);

        mnuFajlKilep.setText("Kilép");
        mnuFajl.add(mnuFajlKilep);

        jMenuBar1.add(mnuFajl);

        mnuMuvelet.setText("Műveletek");

        buttonGroup1.add(mnuMuveletOsszeadas);
        mnuMuveletOsszeadas.setText("Összeadás");
        mnuMuveletOsszeadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMuveletOsszeadasActionPerformed(evt);
            }
        });
        mnuMuvelet.add(mnuMuveletOsszeadas);

        buttonGroup1.add(mnuMuveletKivonas);
        mnuMuveletKivonas.setText("Kivonás");
        mnuMuveletKivonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMuveletKivonasActionPerformed(evt);
            }
        });
        mnuMuvelet.add(mnuMuveletKivonas);

        buttonGroup1.add(mnuMuveletOsztas);
        mnuMuveletOsztas.setText("Osztás");
        mnuMuveletOsztas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMuveletOsztasActionPerformed(evt);
            }
        });
        mnuMuvelet.add(mnuMuveletOsztas);

        buttonGroup1.add(mnuMuveletSzorzas);
        mnuMuveletSzorzas.setText("Szorzás");
        mnuMuveletSzorzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMuveletSzorzasActionPerformed(evt);
            }
        });
        mnuMuvelet.add(mnuMuveletSzorzas);

        jMenuBar1.add(mnuMuvelet);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlGyakorlas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUj, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMegoldas, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMegoldas))
                    .addComponent(pnlGyakorlas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuFajlMentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFajlMentActionPerformed

        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Mentés!");
        fc.setCurrentDirectory(new File("."));
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int kivalaszt = fc.showSaveDialog(this);

        if (kivalaszt == JFileChooser.APPROVE_OPTION) {
            File f = fc.getSelectedFile();
            if (f.isDirectory()) {
                lblEredmeny.setText("<html>Elérés: " + f.getPath() + "<br>Könyvtár: " + f.getName() + "</html>");
                try {
                    Files.write(Paths.get(f.getPath(), "stat.txt"), "Statisztika: ".getBytes());
                } catch (IOException ex) {
                    Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        
        if (mentettFajl == null) {
            /* az első mentés során a mentés másként metódus kell */
            mnuFajlMentMaskentActionPerformed(evt);
   
        } else {
            try {
                /* további mentések */
                Files.write(Paths.get(mentettFajl), tartalomOsszellitas().getBytes());
            } catch (IOException ex) {
                Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_mnuFajlMentActionPerformed

    private void mnuFajlMentMaskentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFajlMentMaskentActionPerformed
        JFileChooser fc = new JFileChooser(new File("."));
        fc.setDialogTitle("Mentés másként!");
        fc.setAcceptAllFileFilterUsed(false);
        
        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("PNG és GIF képek", "png", "gif");
        fc.addChoosableFileFilter(imgFilter);
        
        FileNameExtensionFilter txtFilter = new FileNameExtensionFilter("csak szöveg (*.txt)", "txt");
        fc.addChoosableFileFilter(txtFilter);
        
        FileNameExtensionFilter kkFilter = new FileNameExtensionFilter("speciális (*.kk)", "kk");
        fc.addChoosableFileFilter(kkFilter);
        
        fc.setFileFilter(txtFilter);
        int kivalaszt = fc.showSaveDialog(this);

        if (kivalaszt == JFileChooser.APPROVE_OPTION) {
            File f = fc.getSelectedFile();
            
            String[] kiterjesztes = ((FileNameExtensionFilter)fc.getFileFilter()).getExtensions();
            String fn = f.getName(); //+ "." +kiterjesztes[0];
            
            /* kiterjezstés van e*/
            if(!fn.endsWith("." + kiterjesztes[0])){
                fn += "." + kiterjesztes[0];
            }
            /* kiterjezstés van e VÉGE*/
            
            mentettFajl = fn;
            Path path = Paths.get(fn);
            boolean mentes = true;
            /* létezik e*/
            if(Files.exists(path)){
                kivalaszt = JOptionPane.showConfirmDialog(this, "Felülírjam", "A fájl létezik", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if(kivalaszt == JOptionPane.NO_OPTION){
                    mentes = false;
                    
                }
            }
            
            /* létezik e VÉGE*/
            
            lblEredmeny.setText("<html>Elérés: " + f.getPath() + "<br>Fájl neve: " + fn + "</html>");
            try {
                /* tényleges kiiratás */
                if(mentes){
                    Files.write(path, tartalomOsszellitas().getBytes());
                }
                /* tényleges kiiratás VÉGE*/
            } catch (IOException ex) {
                Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
            }

        }else {
            JOptionPane.showMessageDialog(this, "Mentés megszakítva", "Nincs mentés", JOptionPane.INFORMATION_MESSAGE);
        }

//        File mentes = fileChooser.getSelectedFile();          
//        String eleresiUt = mentes.getAbsolutePath()+ ".txt"; 
//        Files.write(Paths.get(eleresiUt), kiirat.getBytes());

/* tesztesetek

- kiterjesztés megváltoztatása
- olyan kiterjesztés írása, ami nincs a listában
- üresen marad a fájl neve
- másik mappa kiválasztása

- kiterjesztéssel választom a meglevő fájlt, és szintén mögé rakja a kiterjesztést
- ha létezik, kérdés nélkül felülírja
*/
    }//GEN-LAST:event_mnuFajlMentMaskentActionPerformed

    private void mnuFajlMegnyitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFajlMegnyitActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Megnyitás!");
        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("PNG és GIF képek", "png", "gif");
        fc.addChoosableFileFilter(imgFilter);
        
        FileNameExtensionFilter txtFilter = new FileNameExtensionFilter("csak szöveg (*.txt)", "txt");
        fc.addChoosableFileFilter(txtFilter);
        
        FileNameExtensionFilter kkFilter = new FileNameExtensionFilter("speciális (*.kk)", "kk");
        fc.addChoosableFileFilter(kkFilter);

        
        int kivalaszt = fc.showSaveDialog(this);
        File f = fc.getSelectedFile();
        int megnyit = JOptionPane.showConfirmDialog(this, "Biztos meg akarod nyitni?", "Visszajelzés", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(megnyit == JOptionPane.YES_OPTION){
            lblEredmeny.setText("<html>Elérés: " + f.getPath() + "<br>Könyvtár: " + f.getName() + "</html>"); 
        }else{
            JOptionPane.showMessageDialog(this, "Megnyitás megszakítva", "Nincs megnyitás", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_mnuFajlMegnyitActionPerformed

    private void mnuMuveletOsztasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMuveletOsztasActionPerformed
        muvelet = 1;
        osszKerdes++;
        osztasKerdes++;
        muvelet = 1;
        btnEllenorzes.setEnabled(true);
        lblValasz.setText("Visszajelzés");
        txtEredmeny.setText("");
        osztas();
    }//GEN-LAST:event_mnuMuveletOsztasActionPerformed

    private void btnEllenorzesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEllenorzesActionPerformed
     osszProba++;
        if (muvelet == 1) {
            osztasProba++;
            try {
                valasz = Integer.valueOf(txtEredmeny.getText());
                if (szam1 / szam2 == valasz) {
                    lblValasz.setText("A megoldásod helyes!");
                    btnEllenorzes.setEnabled(false);
                    
                } else {
                    lblValasz.setText("A megoldásod helytelen!");
                }
            } catch (Exception e) {
                lblValasz.setText("Adj meg szám értéket!");
            }
        } else if (muvelet == 2) {
            kivonasProba++;
            try {
                valasz = Integer.valueOf(txtEredmeny.getText());
                if (szam1 - szam2 == valasz) {
                    lblValasz.setText("A megoldásod helyes!");
                    btnEllenorzes.setEnabled(false);
                } else {
                    lblValasz.setText("A megoldásod helytelen!");
                }
            } catch (Exception e) {
                lblValasz.setText("Adj meg szám értéket!");
            }
        } else if (muvelet == 3) {
            szorzasProba++;
            try {
                valasz = Integer.valueOf(txtEredmeny.getText());
                if (szam1 * szam2 == valasz) {
                    lblValasz.setText("A megoldásod helyes!");
                    btnEllenorzes.setEnabled(false);
                } else {
                    lblValasz.setText("A megoldásod helytelen!");
                }
            } catch (Exception e) {
                lblValasz.setText("Adj meg szám értéket!");
            }
        } else {
            osszeadProba++;
            try {
                valasz = Integer.valueOf(txtEredmeny.getText());
                if (szam1 + szam2 == valasz) {
                    lblValasz.setText("A megoldásod helyes!");
                    btnEllenorzes.setEnabled(false);
                } else {
                    lblValasz.setText("A megoldásod helytelen!");
                }
            } catch (Exception e) {
                lblValasz.setText("Adj meg szám értéket!");
            }
        }
        
        eredmeny=((double)osszKerdes/(double)osszProba)*100;
        lblOsszKerdes.setText("Össz kérdések száma: "+osszKerdes);
        lblOsszProba.setText("Össz próbálkozások száma: "+osszProba);
        lblEredmeny.setText("Eredményed: "+eredmeny+"%");
        lblOsztasKerdes.setText("Osztás: "+osztasKerdes);
        lblOsztasProba.setText("Osztás: "+osztasProba);
        lblOsszeadKerdes.setText("Összeadás: "+osszeadKerdes);
        lblOsszeadProba.setText("Összeadás: "+osszeadProba);
        lblSzorzasKerdes.setText("Szorzás: "+szorzasKerdes);
        lblSzorzasProba.setText("Szorzás: "+szorzasProba);
        lblKivonasKerdes.setText("Kivonás: "+kivonasKerdes);
        lblKivonasProba.setText("Kivonás: "+kivonasProba);
        
        System.out.println(eredmeny);
    }//GEN-LAST:event_btnEllenorzesActionPerformed

    private void btnUjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUjActionPerformed

                if (muvelet == 1) {
                    osztasKerdes++;
            osztas();
        } else if (muvelet == 2) {
            kivonasKerdes++;
            kivonas();
        } else if (muvelet == 3) {
            szorzas();
            szorzasKerdes++;
        } else {
            osszeadas();
            osszeadKerdes++;
        }
        txtEredmeny.setText("");
        btnEllenorzes.setEnabled(true);
        osszKerdes++;
    }//GEN-LAST:event_btnUjActionPerformed

    private void mnuMuveletKivonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMuveletKivonasActionPerformed
        btnEllenorzes.setEnabled(true);
        kivonasKerdes++;
        lblValasz.setText("Visszajelzés");
        txtEredmeny.setText("");
        muvelet = 2;
        kivonas();
        osszKerdes++;
    }//GEN-LAST:event_mnuMuveletKivonasActionPerformed

    private void mnuMuveletOsszeadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMuveletOsszeadasActionPerformed
        btnEllenorzes.setEnabled(true);
        osszeadKerdes++;
        lblValasz.setText("Visszajelzés");
        txtEredmeny.setText("");
        muvelet = 4;
        osszeadas();
        osszKerdes++;
    }//GEN-LAST:event_mnuMuveletOsszeadasActionPerformed

    private void mnuMuveletSzorzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMuveletSzorzasActionPerformed
        btnEllenorzes.setEnabled(true);
        szorzasKerdes++;
        lblValasz.setText("Visszajelzés");
        txtEredmeny.setText("");
        muvelet = 3;
        szorzas();
        osszKerdes++;
    }//GEN-LAST:event_mnuMuveletSzorzasActionPerformed

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
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Muveletek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEllenorzes;
    private javax.swing.JButton btnMegoldas;
    private javax.swing.JButton btnUj;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblEredmeny;
    private javax.swing.JLabel lblFeladat;
    private javax.swing.JLabel lblKivonasKerdes;
    private javax.swing.JLabel lblKivonasProba;
    private javax.swing.JLabel lblOsszKerdes;
    private javax.swing.JLabel lblOsszProba;
    private javax.swing.JLabel lblOsszeadKerdes;
    private javax.swing.JLabel lblOsszeadProba;
    private javax.swing.JLabel lblOsztasKerdes;
    private javax.swing.JLabel lblOsztasProba;
    private javax.swing.JLabel lblSzorzasKerdes;
    private javax.swing.JLabel lblSzorzasProba;
    private javax.swing.JLabel lblValasz;
    private javax.swing.JMenu mnuFajl;
    private javax.swing.JMenuItem mnuFajlKilep;
    private javax.swing.JMenuItem mnuFajlMegnyit;
    private javax.swing.JMenuItem mnuFajlMent;
    private javax.swing.JMenuItem mnuFajlMentMaskent;
    private javax.swing.JPopupMenu.Separator mnuFajlSep1;
    private javax.swing.JMenu mnuMuvelet;
    private javax.swing.JRadioButtonMenuItem mnuMuveletKivonas;
    private javax.swing.JRadioButtonMenuItem mnuMuveletOsszeadas;
    private javax.swing.JRadioButtonMenuItem mnuMuveletOsztas;
    private javax.swing.JRadioButtonMenuItem mnuMuveletSzorzas;
    private javax.swing.JPanel pnlGyakorlas;
    private javax.swing.JTextField txtEredmeny;
    // End of variables declaration//GEN-END:variables

    private String tartalomOsszellitas() {
String statisztika = "Alampműveletek gyakoroltatása statisztika: \n";
        JLabel[] lblTomb = new JLabel[]{lblOsszKerdes, lblOsszProba, lblOsszeadKerdes, lblOsszeadProba, lblKivonasKerdes, lblKivonasProba, lblOsztasKerdes, lblOsztasProba, lblSzorzasKerdes, lblSzorzasProba};

        for (int i = 0; i < lblTomb.length-1; i += 2) {
            JLabel labKerdes = lblTomb[i];
            JLabel labProba = lblTomb[i+1];

            String kerdes = labKerdes.getText();
            final int HE = 3;
            int kerdesMaxHossz = kerdes.length();

            String proba = labProba.getText();
            int probaMaxHossz = proba.length();
            String formazo = "%"+ (kerdesMaxHossz+HE) + "s%" + (probaMaxHossz+HE) +"s\n";
            statisztika += String.format(formazo, labKerdes.getText(), labProba.getText());
        }


        return statisztika;  
    }

    private void osztas() {
        szam1=10;
        szam2=11;
        while (szam1 % szam2 != 0) {
            szam1 = random.nextInt(100) + 1;
            szam2 = random.nextInt(100) + 1;
            if (szam2 > szam1) {
                szam3 = szam2;
                szam2 = szam1;
                szam1 = szam3;
            }
        }

        lblFeladat.setText(szam1 + "/" + szam2 + "=");
    }

    private void kivonas() {
              szam1 = random.nextInt(100) + 1;
        szam2 = random.nextInt(100) + 1;
        lblFeladat.setText(szam1 + "-" + szam2 + "=");
    }

    private void szorzas() {
                szam1 = random.nextInt(20) + 1;
        szam2 = random.nextInt(20) + 1;
        lblFeladat.setText(szam1 + "*" + szam2 + "=");
    }

    private void osszeadas() {
        szam1 = random.nextInt(100) + 1;
        szam2 = random.nextInt(100) + 1;
        lblFeladat.setText(szam1 + "+" + szam2 + "=");
    }
}
