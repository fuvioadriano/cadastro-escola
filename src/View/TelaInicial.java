/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import ModeloConection.ConexaoBD;

import java.awt.Image;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Peterson Gomes
 */
public class TelaInicial extends javax.swing.JFrame {
 
    ConexaoBD conection = new ConexaoBD (); // chamando a conexao pra tela inicial 
    FormEscola telaEsco = new FormEscola(); // chamando tela 
    FormUsuario telaUsu = new FormUsuario();
    FormAluno telaAlu = new FormAluno();
    FormCondutor telaCond = new FormCondutor();
    private SystemTray sisTray  = SystemTray.getSystemTray();
    private TrayIcon   trayIcon = null;
    
    private TelaInicial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    public TelaInicial(String usuario) {
        criarSystemTray();
        try {
            sisTray.add(trayIcon); // Adiciona na bandeja do sistema
            trayIcon.displayMessage("Usuário conectado ao Sistema BR5","Sistema Versão 1.0", TrayIcon.MessageType.INFO); // Exibindo um "tooltip" para o tray
        } catch(Exception ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(), "Execução do Sistema", JOptionPane.ERROR_MESSAGE);
        }
        initComponents();
        Image ico = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagem/setalogoClaro.png"));
        this.setIconImage(ico);
        jLabelUsuario.setText(usuario);
        conection.conexao();//chamando todas as intruçoes do metodo criado no ConexaoBD.
        //setExtendedState(JFrame.MAXIMIZED_BOTH); // inicia a tela do JFRAME maximizada
        //Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        //ImageIcon imagem = new ImageIcon(getClass().getResource("/Imagem/Asfalto.jpg"));
        //jLabelCorfundo.setSize(tela);
        //ImageIcon imagenFondoRedimensionado = new ImageIcon(imagem.getImage().getScaledInstance(jLabelCorfundo.getWidth(),   jLabelCorfundo.getHeight(), java.awt.Image.SCALE_SMOOTH));
        // jLabelCorfundo.setIcon(imagenFondoRedimensionado);
   }
        private void criarSystemTray() {
        PopupMenu menu = new PopupMenu();
        Image icon = Toolkit.getDefaultToolkit().createImage("C://Users//Peterson Gomes//Documents//NetBeansProjects//ProjetoBR5//src//Imagem//setalogoClaro.png"); // Icone que será exibido na bandeja
        trayIcon = new TrayIcon(icon, "BR5", menu);
        if(!SystemTray.isSupported()) {
        JOptionPane.showMessageDialog(null, "Não é possivel executar o sistema na bandeja!", "BR5", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameBenvindo = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelInternalFrame = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabelCorfundo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jMenuBarMenu = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadAlunos = new javax.swing.JMenuItem();
        jMenuItemCadCondutores = new javax.swing.JMenuItem();
        jMenuItemCadEscolas = new javax.swing.JMenuItem();
        jMenuItemCadUsuario = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BR5");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jInternalFrameBenvindo.setBackground(new java.awt.Color(204, 204, 204));
        jInternalFrameBenvindo.setClosable(true);
        jInternalFrameBenvindo.setTitle("Tela cadastro - Bem vindo ao sistema !!!");
        jInternalFrameBenvindo.setVisible(true);
        jInternalFrameBenvindo.getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.setLayout(null);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/ImageBotaoCondutor.png"))); // NOI18N
        jButton7.setToolTipText("Cadastro de Condutor");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(340, 100, 170, 140);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/ImagemBotaoCartao.png"))); // NOI18N
        jButton9.setToolTipText("Cadastro de Permições");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9);
        jButton9.setBounds(830, 100, 170, 140);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/ImagemBotaoAluno.png"))); // NOI18N
        jButton6.setToolTipText("Cadastro de Aluno");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(120, 100, 150, 140);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/ImageBotaoEscola.gif"))); // NOI18N
        jButton8.setToolTipText("Cadastro de Escola");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);
        jButton8.setBounds(580, 100, 150, 140);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/IconeImpressora.png"))); // NOI18N
        jButton2.setText("Relátorio de Usuario");
        jButton2.setToolTipText("Relátorio de USUÁRIO");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(830, 270, 170, 40);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/IconeImpressora.png"))); // NOI18N
        jButton1.setText("Relátorio de Escola");
        jButton1.setToolTipText("Relátorio de ESCOLA");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(580, 270, 160, 40);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/IconeImpressora.png"))); // NOI18N
        jButton3.setText("Relátorio de Condutor");
        jButton3.setToolTipText("Relátorio de CONDUTOR");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(340, 270, 170, 40);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/IconeImpressora.png"))); // NOI18N
        jButton4.setText("Relátorio de Aluno");
        jButton4.setToolTipText("Relátorio de ALUNO");
        jPanel2.add(jButton4);
        jButton4.setBounds(120, 270, 160, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/ImagePainelBotoes.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 1150, 400);

        jInternalFrameBenvindo.getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 90, 1150, 400);

        jLabelInternalFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/FundoInternalFrame02.jpg"))); // NOI18N
        jInternalFrameBenvindo.getContentPane().add(jLabelInternalFrame);
        jLabelInternalFrame.setBounds(-10, 0, 1210, 600);

        getContentPane().add(jInternalFrameBenvindo);
        jInternalFrameBenvindo.setBounds(60, 50, 1200, 550);

        jLabelHora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelHora);
        jLabelHora.setBounds(1220, 620, 70, 30);

        jLabelData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelData);
        jLabelData.setBounds(1110, 620, 110, 30);

        jLabelCorfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Asfalto.jpg"))); // NOI18N
        jLabelCorfundo.setPreferredSize(new java.awt.Dimension(1300, 650));
        getContentPane().add(jLabelCorfundo);
        jLabelCorfundo.setBounds(0, 0, 1295, 620);

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0))));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel2.setText("Usuário : ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 0, 70, 30);

        jLabelUsuario.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabelUsuario.setText(" jLabel3");
        jPanel1.add(jLabelUsuario);
        jLabelUsuario.setBounds(90, 0, 490, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, 620, 1310, 30);

        jMenuBarMenu.setToolTipText("");

        jMenuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/IconeCadastro.png"))); // NOI18N
        jMenuCadastro.setText("Cadastro");

        jMenuItemCadAlunos.setText("Aluno");
        jMenuItemCadAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadAlunosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadAlunos);

        jMenuItemCadCondutores.setText("Condutor");
        jMenuItemCadCondutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadCondutoresActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadCondutores);

        jMenuItemCadEscolas.setText("Escola");
        jMenuItemCadEscolas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadEscolasActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadEscolas);

        jMenuItemCadUsuario.setText("Usuário");
        jMenuItemCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadUsuarioActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadUsuario);

        jMenuBarMenu.add(jMenuCadastro);

        jMenuRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/IconeImpressora.png"))); // NOI18N
        jMenuRelatorio.setText("Relátorio");

        jMenuItem2.setText("Aluno");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuItem2);

        jMenuItem3.setText("Condutor");
        jMenuRelatorio.add(jMenuItem3);

        jMenuItem4.setText("Escola");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuItem4);

        jMenuItem5.setText("Usuário");
        jMenuRelatorio.add(jMenuItem5);

        jMenuBarMenu.add(jMenuRelatorio);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/IconePainel.png"))); // NOI18N
        jMenu1.setText("Painel");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBarMenu.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/IconeSistema.png"))); // NOI18N
        jMenu2.setText("Sistema");

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBarMenu.add(jMenu2);

        setJMenuBar(jMenuBarMenu);

        setSize(new java.awt.Dimension(1300, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        jInternalFrameBenvindo.setVisible(true); // Ao fechar chama novamente a Tela de Bem vindo .
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenuItemCadAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadAlunosActionPerformed
      // Chamando a tela de alunos
       try {
            conection.executaSql("select *from usuarios where user_usuario='"+jLabelUsuario.getText()+"'");//pesquisar se o usuarios esta no banco de dados 
            conection.rs.first();
            if(conection.rs.getString("permissao_usuario").equals("Master")||(conection.rs.getString("permissao_usuario").equals("Cadastro"))){ // metodo pra acessar tela que esteja com as permissões Master ,puxada no banco de dados
                if (telaAlu == null){
                    telaAlu = new FormAluno();
                    telaAlu.setVisible(true);
                    telaAlu.setResizable(false);
                }else{
                    telaAlu.setVisible(true);
                    telaAlu.setResizable(false);
                }
        }else{
              JOptionPane.showMessageDialog(rootPane, "Acesso não Permitido !!!");
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Acesso não Permitido !!!");
        }
    }//GEN-LAST:event_jMenuItemCadAlunosActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      // Chamando a tela de alunos
       try {
            conection.executaSql("select *from usuarios where user_usuario='"+jLabelUsuario.getText()+"'");//pesquisar se o usuarios esta no banco de dados 
            conection.rs.first();
            if(conection.rs.getString("permissao_usuario").equals("Master")||(conection.rs.getString("permissao_usuario").equals("Cadastro"))){ // metodo pra acessar tela que esteja com as permissões Master ,puxada no banco de dados
                if (telaAlu == null){
                    telaAlu = new FormAluno();
                    telaAlu.setVisible(true);
                    telaAlu.setResizable(false);
                }else{
                    telaAlu.setVisible(true);
                    telaAlu.setResizable(false);
                }
        }else{
              JOptionPane.showMessageDialog(rootPane, "Acesso não Permitido !!!");
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Acesso não Permitido !!!");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItemCadCondutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadCondutoresActionPerformed
      try {
            conection.executaSql("select *from usuarios where user_usuario='"+jLabelUsuario.getText()+"'");//pesquisar se o usuarios esta no banco de dados 
            conection.rs.first();
            if(conection.rs.getString("permissao_usuario").equals("Master")||(conection.rs.getString("permissao_usuario").equals("Cadastro"))){ // metodo pra acessar tela que esteja com as permissões Master ,puxada no banco de dados
                if (telaCond == null){
                    telaCond = new FormCondutor();
                    telaCond.setVisible(true);
                    telaCond.setResizable(false);
                }else{
                    telaCond.setVisible(true);
                    telaCond.setResizable(false);
                }
        }else{
              JOptionPane.showMessageDialog(rootPane, "Acesso não Permitido !!!");
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Acesso não Permitido !!!");
        }
    }//GEN-LAST:event_jMenuItemCadCondutoresActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Tela indisponivel nesta versão!");
        /*try {
            conection.executaSql("select *from usuarios where user_usuario='"+jLabelUsuario.getText()+"'");//pesquisar se o usuarios esta no banco de dados 
            conection.rs.first();
            if(conection.rs.getString("permissao_usuario").equals("Master")||(conection.rs.getString("permissao_usuario").equals("Cadastro"))){ // metodo pra acessar tela que esteja com as permissões Master ,puxada no banco de dados
                if (telaCond == null){
                    telaCond = new FormCondutor();
                    telaCond.setVisible(true);
                    telaCond.setResizable(false);
                }else{
                    telaCond.setVisible(true);
                    telaCond.setResizable(false);
                }
        }else{
              JOptionPane.showMessageDialog(rootPane, "Acesso não Permitido !!!");
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Acesso não Permitido !!!");
        }*/
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
            //Chamando Tela de Escola no menu , e a permissão
        try {
            conection.executaSql("select *from usuarios where user_usuario='"+jLabelUsuario.getText()+"'");//pesquisar se o usuarios esta no banco de dados 
            conection.rs.first();
            if(conection.rs.getString("permissao_usuario").equals("Master")||(conection.rs.getString("permissao_usuario").equals("Cadastro"))){ // metodo pra acessar tela que esteja com as permissões Master ,puxada no banco de dados
                if (telaEsco == null){
                    telaEsco = new FormEscola();
                    telaEsco.setVisible(true);
                    telaEsco.setResizable(false);
                }else{
                    telaEsco.setVisible(true);
                    telaEsco.setResizable(false);
                }
        }else{
              JOptionPane.showMessageDialog(rootPane, "Acesso não Permitido !!!");
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Acesso não Permitido !!!");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jMenuItemCadEscolasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadEscolasActionPerformed
             //Chamando Tela de Escola no menu , e a permissão
        try {
            conection.executaSql("select *from usuarios where user_usuario='"+jLabelUsuario.getText()+"'");//pesquisar se o usuarios esta no banco de dados 
            conection.rs.first();
            if(conection.rs.getString("permissao_usuario").equals("Master")){ // metodo pra acessar tela que esteja com as permissões Master ,puxada no banco de dados
                FormEscola tela= new FormEscola();// abrindo tele de escola
               tela.setVisible(true);// deixando ela visivel
            }else if (conection.rs.getString("permissao_usuario").equals("Cadastro")){// metodo pra acessar tela que esteja com as permissões Cadastro ,puxada no banco de dados
              FormEscola tela= new FormEscola();
              tela.setVisible(true);
        }else{
              JOptionPane.showMessageDialog(rootPane, "Acesso não Permitido !!!");
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Acesso não Permitido !!!");
        }
    }//GEN-LAST:event_jMenuItemCadEscolasActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
            //Chamando a Tela no BOTAO , e a permissão
        try {
            conection.executaSql("select *from usuarios where user_usuario='"+jLabelUsuario.getText()+"'");//pesquisar se o usuarios esta no banco de dados 
            conection.rs.first();
            if(conection.rs.getString("permissao_usuario").equals("Master")){ // metodo pra acessar tela que esteja com as permissões Master ,puxada no banco de dados
            if (telaUsu == null){
                    telaUsu = new FormUsuario();
                    telaUsu.setVisible(true);
                    telaUsu.setResizable(false);
                }else{
                    telaUsu.setVisible(true);
                    telaUsu.setResizable(false);
                }
        }else{
             JOptionPane.showMessageDialog(rootPane, "Acesso não Permitido !!!");
                }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(rootPane, "Acesso não Permitido !!!");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jMenuItemCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadUsuarioActionPerformed
           //Chamando a Tela no BOTAO , e a permissão de usuario
        try {
            conection.executaSql("select *from usuarios where user_usuario='"+jLabelUsuario.getText()+"'");//pesquisar se o usuarios esta no banco de dados 
            conection.rs.first();
            if(conection.rs.getString("permissao_usuario").equals("Master")){ // metodo pra acessar tela que esteja com as permissões Master, puxada no banco de dados
               if (telaUsu == null){
                    telaUsu = new FormUsuario();
                    telaUsu.setVisible(true);
                    telaUsu.setResizable(false);
                }else{
                    telaUsu.setVisible(true);
                    telaUsu.setResizable(false);
                }
            }else{  
               JOptionPane.showMessageDialog(rootPane, "Acesso não Permitido !!!");
                }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(rootPane, "Acesso não Permitido !!!");
        }
    }//GEN-LAST:event_jMenuItemCadUsuarioActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // mostrando a data 
        Date dataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        jLabelData.setText(formato.format(dataSistema));
        
        // mostrando a hora 
        Timer timer = new  Timer(1000,new hora());
        timer.start ();
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
           System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       // Metodo pra Relatorio de escola 
        try{
           conection.executaSql("select * from escolas");
           JRResultSetDataSource relatResul = new JRResultSetDataSource(conection.rs);//passa um ResultSet para o relatorio !
           JasperPrint jpPrint = JasperFillManager.fillReport("C://Users//Peterson Gomes//Documents//NetBeansProjects//ProjetoBR5//src//Report//Relatorio Escola 1.0.jasper", new HashMap(), relatResul);
           JasperViewer jv = new JasperViewer(jpPrint,false);// Cria instancia para impressao
           jv.setVisible(true); // Chama relatorio para visualizaçao
           jv.toFront();
          } catch(JRException ex){
           JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o relatorio!!\n Erro"+ex);
       }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
      
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       // Mouse clicked pra relatorio de escola 
        try{
           conection.executaSql("select * from escolas");
           JRResultSetDataSource relatResul = new JRResultSetDataSource(conection.rs);//passa um ResultSet para o relatorio !
           JasperPrint jpPrint = JasperFillManager.fillReport("C://Users//Peterson Gomes//Documents//NetBeansProjects//ProjetoBR5//src//Report//Relatorio Escola 1.0.jasper", new HashMap(), relatResul);
           JasperViewer jv = new JasperViewer(jpPrint,false);// Cria instancia para impressao
           jv.setVisible(true); // Chama relatorio para visualizaçao
           jv.toFront();
          } catch(JRException ex){
           JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o relatorio!!\n Erro"+ex);
       }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
      /* // Metodo pra Relatorio de Alunos
        try{
           conection.executaSql("select * from alunos");
           JRResultSetDataSource relatResul = new JRResultSetDataSource(conection.rs);//passa um ResultSet para o relatorio !
           JasperPrint jpPrint = JasperFillManager.fillReport("C://Users//Peterson Gomes//Documents//NetBeansProjects//ProjetoBR5//src//Report//Relatorio Escola 1.0.jasper", new HashMap(), relatResul);
           JasperViewer jv = new JasperViewer(jpPrint,false);// Cria instancia para impressao
           jv.setVisible(true); // Chama relatorio para visualizaçao
           jv.toFront();
          } catch(JRException ex){
           JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o relatorio!!\n Erro"+ex);
          }*/
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       // Mouse clicked pra relatorio de escola 
        try{
           conection.executaSql("select * from escolas");
           JRResultSetDataSource relatResul = new JRResultSetDataSource(conection.rs);//passa um ResultSet para o relatorio !
           JasperPrint jpPrint = JasperFillManager.fillReport("C://Users//Peterson Gomes//Documents//NetBeansProjects//ProjetoBR5//src//Report//", new HashMap(), relatResul);
           JasperViewer jv = new JasperViewer(jpPrint,false);// Cria instancia para impressao
           jv.setVisible(true); // Chama relatorio para visualizaçao
           jv.toFront();
          } catch(JRException ex){
           JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o relatorio!!\n Erro"+ex);
       }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JInternalFrame jInternalFrameBenvindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCorfundo;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelInternalFrame;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBarMenu;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItemCadAlunos;
    private javax.swing.JMenuItem jMenuItemCadCondutores;
    private javax.swing.JMenuItem jMenuItemCadEscolas;
    private javax.swing.JMenuItem jMenuItemCadUsuario;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    //Metodo pra mostrar hora 
    class hora implements ActionListener{
      
        @Override
        public void actionPerformed (ActionEvent e){
            Calendar now = Calendar.getInstance();
            jLabelHora.setText(String.format("%1$tH:%1$tM:%1$tS",now));
        }
    }
    
}
