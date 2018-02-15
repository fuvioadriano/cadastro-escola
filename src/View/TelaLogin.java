/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import ModeloConection.ConexaoBD;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * 04/01/2016
 * @author Peterson Gomes e Fuvio Adriano
 * Dando Funcionalidade a tela de login do sistema .
 */
public class TelaLogin extends javax.swing.JFrame {
     
      ConexaoBD con = new ConexaoBD();
    
    public TelaLogin() {
        initComponents();
        // colocando icone de simbolo no sistema 
        Image ico = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagem/setalogoClaro.png"));
        this.setIconImage(ico);
        con.conexao();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.if 
     * {
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelLogo01 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BR5 TRANSPORTES");
        setIconImages(null);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Usuario01.PNG"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51), 3));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 80, 40, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Senha01.PNG"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51), 3));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(280, 130, 40, 30);

        jPasswordFieldSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 3, true));
        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(330, 130, 200, 30);

        jTextFieldUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(330, 80, 200, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("suporte@clicksoluction.com.br");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(420, 290, 180, 40);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Seu sonho mais seguro ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 140, 120, 30);

        jLabelLogo01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/LogoBR5.PNG"))); // NOI18N
        getContentPane().add(jLabelLogo01);
        jLabelLogo01.setBounds(70, 40, 250, 190);

        jButton3.setBackground(new java.awt.Color(0, 0, 51));
        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cancelar");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(440, 180, 90, 21);

        jButton4.setBackground(new java.awt.Color(0, 0, 51));
        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Entrar");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton4KeyPressed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(330, 180, 90, 21);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/TelaFundoAzul.PNG"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, -10, 690, 370);

        setSize(new java.awt.Dimension(637, 373));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     // chamando a Tela Inicial , somente se o usuario e senha for validos sem banco de dados
        try {
              con.executaSql("select *from usuarios where user_usuario='"+jTextFieldUsuario.getText()+"'");// pega o que o usuario digito e verifica se e igual no banco user_usuario
              con.rs.first();//pega o usuario que foi encontrado e salva dentro do RS
            if(con.rs.getString("senha_usuario").equals(jPasswordFieldSenha.getText())){
                  TelaInicial tela =new TelaInicial(jTextFieldUsuario.getText());
                  tela.setVisible(true);
                  dispose();
            }else{
                  JOptionPane.showMessageDialog(rootPane, "Usuário ou senha invalidos !!!");
              }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(rootPane, "Usuário ou senha invalidos !!!"+ex);
          }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldSenhaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Tirando opçao de sair do sistema e so marca OPÇAO UDECORATED ,dando opçao de sair do sistema 
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyPressed
        // Dando funçao ao teclado tecla enter
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){// essa linha e oque faz o comando do enter do teclado
            try {
              con.executaSql("select *from usuarios where user_usuario='"+jTextFieldUsuario.getText()+"'");// pega o que o usuario digito e verifica se e igual no banco do usuario
              con.rs.first();//pega o usuario que foi encontrado e salva dentro do RS(ResultSet)
              if(con.rs.getString("senha_usuario").equals(jPasswordFieldSenha.getText())){
                  TelaInicial tela =new TelaInicial(jTextFieldUsuario.getText());
                  tela.setVisible(true);
                  dispose();
              }else{
                  JOptionPane.showMessageDialog(rootPane, "Usuário ou senha invalidos !!!");
              }
            } catch (SQLException ex) {
             JOptionPane.showMessageDialog(rootPane, "Usuário ou senha invalidos !!!"+ex);
          }
       }
    }//GEN-LAST:event_jButton4KeyPressed
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelLogo01;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}