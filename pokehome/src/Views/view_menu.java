/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.util.Random;

/**
 *
 * @author luize
 */
public class view_menu extends javax.swing.JFrame {
    private int saldo=10;
    private String saldostr;
    private String nome;
    private int aleatorio;
    Random gerador = new Random();
    /**
     * Creates new form view_menu
     */
    public view_menu() {
        nome = "Luiz";
        
        initComponents();
        saldostr = Integer.toString(saldo);
        saldotxt.setText("Saldo: "+ saldostr);
        nometxt.setText("Treinador: "+ nome);
        addsaldo.setVisible(false);
        enviarbut.setVisible(false);
        txtpoke.setVisible(false);
        endbut.setVisible(false);
        panelfundo.setVisible(false);
        blastoiseimg.setVisible(false);
        bulbasaurimg.setVisible(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        playbut = new javax.swing.JButton();
        endbut = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        saldotxt = new javax.swing.JLabel();
        nometxt = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        addsaldo = new javax.swing.JTextField();
        enviarbut = new javax.swing.JButton();
        panelfundo = new javax.swing.JPanel();
        blastoiseimg = new javax.swing.JLabel();
        bulbasaurimg = new javax.swing.JLabel();
        nomepoketxt = new javax.swing.JLabel();
        txtpoke = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        jDialog1.setAlwaysOnTop(true);

        jLabel1.setText("SEM SALDO PARA INICIAR");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        playbut.setText("Play");
        playbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playbutActionPerformed(evt);
            }
        });
        getContentPane().add(playbut, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        endbut.setText("End");
        endbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endbutActionPerformed(evt);
            }
        });
        getContentPane().add(endbut, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/img1 (1).png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 300, 340));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/picasion.com_d0c9adeb67c3d4c5acdbb86827550da6.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 300, 340));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ash editar (1).png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 70, 66);

        saldotxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(saldotxt);
        saldotxt.setBounds(76, 48, 76, 22);

        nometxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(nometxt);
        nometxt.setBounds(76, 20, 150, 22);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(120, 120, 120, 110);

        jButton3.setText("Add Saldo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(190, 10, 90, 23);

        addsaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsaldoActionPerformed(evt);
            }
        });
        jPanel1.add(addsaldo);
        addsaldo.setBounds(310, 20, 59, 30);

        enviarbut.setText("Enviar");
        enviarbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarbutActionPerformed(evt);
            }
        });
        jPanel1.add(enviarbut);
        enviarbut.setBounds(370, 20, 70, 30);

        panelfundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        blastoiseimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/blastoise oficial.png"))); // NOI18N
        panelfundo.add(blastoiseimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, 100, 450, 290));

        bulbasaurimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/bulbasaur oficial.png"))); // NOI18N
        panelfundo.add(bulbasaurimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 490, 430));

        nomepoketxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nomepoketxt.setForeground(new java.awt.Color(255, 255, 255));
        panelfundo.add(nomepoketxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 100, 30));

        txtpoke.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtpoke.setForeground(new java.awt.Color(255, 255, 255));
        txtpoke.setText("Você ganhou o Pokémon:");
        panelfundo.add(txtpoke, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 190, 40));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fundo preto e branco.jpg"))); // NOI18N
        panelfundo.add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 510, 460));

        jPanel1.add(panelfundo);
        panelfundo.setBounds(350, 120, 340, 460);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 800, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playbutActionPerformed
        if(saldo>=1){
        jLabel2.setVisible(true);
        saldo-=1;
        jLabel3.setVisible(false);
        saldostr = Integer.toString(saldo);
        saldotxt.setText("Saldo: "+ saldostr);
        txtpoke.setVisible(true);
        playbut.setVisible(false);
        endbut.setVisible(true);
        panelfundo.setVisible(false);
        blastoiseimg.setVisible(false);
        
        }
        else{
            jDialog1.setSize(500, 500);
             jDialog1.setVisible(true);
             
            }
    }//GEN-LAST:event_playbutActionPerformed

    private void endbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endbutActionPerformed
        jLabel2.setVisible(false);
        jLabel3.setVisible(true);
        playbut.setVisible(true);
        endbut.setVisible(false);
        
        
        aleatorio = gerador.nextInt(2);
        switch(aleatorio){
            case 0:
                nomepoketxt.setText("BLASTOISE");
                panelfundo.setVisible(true);
                blastoiseimg.setVisible(true);
                bulbasaurimg.setVisible(false);
                nomepoketxt.setVisible(true);
                break;
            case 1:
                nomepoketxt.setText("BULBASAUR");
                panelfundo.setVisible(true);
                bulbasaurimg.setVisible(true);
                nomepoketxt.setVisible(true);
                break;
            case 2:
                nomepoketxt.setText("CATERPIE");
                panelfundo.setVisible(true);
                blastoiseimg.setVisible(true);
                nomepoketxt.setVisible(true);
                break;
            default: 
                break;
        }
    }//GEN-LAST:event_endbutActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        addsaldo.setVisible(true);
        enviarbut.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void addsaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addsaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addsaldoActionPerformed

    private void enviarbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarbutActionPerformed
        saldo += Integer.parseInt (addsaldo.getText());
        saldostr = Integer.toString(saldo);
        saldotxt.setText("Saldo: "+ saldostr);
        addsaldo.setVisible(false);
        enviarbut.setVisible(false);
    }//GEN-LAST:event_enviarbutActionPerformed

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
            java.util.logging.Logger.getLogger(view_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addsaldo;
    private javax.swing.JLabel blastoiseimg;
    private javax.swing.JLabel bulbasaurimg;
    private javax.swing.JButton endbut;
    private javax.swing.JButton enviarbut;
    private javax.swing.JLabel fundo;
    private javax.swing.JButton jButton3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nomepoketxt;
    private javax.swing.JLabel nometxt;
    private javax.swing.JPanel panelfundo;
    private javax.swing.JButton playbut;
    private javax.swing.JLabel saldotxt;
    private javax.swing.JLabel txtpoke;
    // End of variables declaration//GEN-END:variables
}
