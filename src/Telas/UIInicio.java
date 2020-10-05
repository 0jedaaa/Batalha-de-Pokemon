/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import java.net.URL;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author pejoo
 */
public class UIInicio extends javax.swing.JFrame {

    public UIInicio() {
        initComponents();
    }

    public void PokemonsImagenIcon() {
        //PokemonsImagenIcon icon = new PokemonsImagenIcon(getClass().getResource("Pikachu.png"));
        //MeutimeIcon.setIcon((Icon) icon);
        //JOptionPane.showMessageDialog(null, "Ok");
        JLabel MeuTime = new JLabel();
        MeuTime.getClass().getResource("Charmander.jpg");
        MeuTime.setIcon((Icon) MeuTime);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BatalharBtn = new javax.swing.JButton();
        TimeInimigo = new javax.swing.JComboBox<>();
        MeuTime = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(930, 460));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BatalharBtn.setText("ESCOLHER");
        BatalharBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatalharBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BatalharBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, -1, -1));

        TimeInimigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Charmander", "Pikachu" }));
        TimeInimigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeInimigoActionPerformed(evt);
            }
        });
        jPanel1.add(TimeInimigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, -1, -1));

        MeuTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Charmander", "Pikachu" }));
        MeuTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeuTimeActionPerformed(evt);
            }
        });
        jPanel1.add(MeuTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("TIME INIMIGO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setText("SEU TIME");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jLabel3.setText("Escolha o Seu Pokemon");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, -1, 30));

        jLabel4.setText("Escolha o Seu Pokemon");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/TelaFundo.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Pokebola.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 230, 270));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Pokebola.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 230, 270));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Fundo.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(930, 460));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MeuTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeuTimeActionPerformed
        if (MeuTime.getSelectedItem().equals("Charmander")) {

        }
    }//GEN-LAST:event_MeuTimeActionPerformed

    private void TimeInimigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeInimigoActionPerformed

    }//GEN-LAST:event_TimeInimigoActionPerformed

    private void BatalharBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatalharBtnActionPerformed
        if (MeuTime.getSelectedItem().equals("Charmander") && TimeInimigo.getSelectedItem().equals("Charmander")) {
            BatalhaCharVsChar Tela = new BatalhaCharVsChar();
            Tela.setVisible(true);
            dispose();

        } else if (MeuTime.getSelectedItem().equals("Charmander") && TimeInimigo.getSelectedItem().equals("Pikachu")) {
            BatalhaCharVsPika Tela = new BatalhaCharVsPika();
            Tela.setVisible(true);
            dispose();
    }//GEN-LAST:event_BatalharBtnActionPerformed
         else if (MeuTime.getSelectedItem().equals("Pikachu") && TimeInimigo.getSelectedItem().equals("Charmander")) {
            BatalhaPikaVsChar Tela = new BatalhaPikaVsChar();
            Tela.setVisible(true);
            dispose();
        }
        
         else if (MeuTime.getSelectedItem().equals("Pikachu") && TimeInimigo.getSelectedItem().equals("Pikachu")) {
            BatalhaPikaVsPika Tela = new BatalhaPikaVsPika();
            Tela.setVisible(true);
            dispose();
        }
    }

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
            java.util.logging.Logger.getLogger(UIInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BatalharBtn;
    private javax.swing.JComboBox<String> MeuTime;
    private javax.swing.JComboBox<String> TimeInimigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private static class PokemonsImagenIcon {

        public PokemonsImagenIcon(URL resource) {
        }
    }
}
