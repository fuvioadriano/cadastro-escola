/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import ModeloBeans.BeansTabela;
import ModeloBeans.BeansUsuario;
import ModeloConection.ConexaoBD;
import ModeloDAO.DaoUsuario;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Peterson Gomes
 */
public class FormUsuario extends javax.swing.JFrame {

    ConexaoBD conection = new ConexaoBD();
    BeansUsuario mod = new BeansUsuario();
    DaoUsuario DaoUsuario = new DaoUsuario();
    int flag = 0;

    public FormUsuario() {
        initComponents();
        Image ico = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagem/setalogoClaro.png"));
        this.setIconImage(ico);
        preencherTabela("select *from usuario order by id_usu");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNomeCompleto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jFormattedTextFieldCpfUsuario = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldEmailUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPasswordFieldConfirmSenhaUsuario = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jPasswordFieldSenhaUsuario = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxPermissaoUsuario = new javax.swing.JComboBox<>();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jButtonExcluirUsuario = new javax.swing.JButton();
        jButtonPesquisarUsuario = new javax.swing.JButton();
        jButtonNovoUsuario = new javax.swing.JButton();
        jButtonSalvarUsuario = new javax.swing.JButton();
        jButtonCancelarUsuarios = new javax.swing.JButton();
        jButtonAlterarUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuario = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldCodUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 3, 18)); // NOI18N
        jLabel1.setText("Cadastro de Usuários");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(460, 30, 250, 14);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/logoCadastroUser (Copy).png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(360, 0, 100, 70);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel4.setText("Nome Completo :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 60, 110, 30);

        jTextFieldNomeCompleto.setEnabled(false);
        jPanel1.add(jTextFieldNomeCompleto);
        jTextFieldNomeCompleto.setBounds(170, 60, 430, 30);

        jLabel5.setText("Usuário :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(610, 60, 50, 30);

        jTextFieldUser.setEnabled(false);
        jTextFieldUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldUser);
        jTextFieldUser.setBounds(660, 60, 270, 30);

        jLabel6.setText("CPF :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 110, 40, 30);

        try {
            jFormattedTextFieldCpfUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCpfUsuario.setEnabled(false);
        jPanel1.add(jFormattedTextFieldCpfUsuario);
        jFormattedTextFieldCpfUsuario.setBounds(100, 110, 110, 30);

        jLabel7.setText("E-mail :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 160, 50, 30);

        jTextFieldEmailUsuario.setEnabled(false);
        jTextFieldEmailUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldEmailUsuarioMousePressed(evt);
            }
        });
        jTextFieldEmailUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldEmailUsuario);
        jTextFieldEmailUsuario.setBounds(110, 160, 400, 30);

        jLabel8.setText("Senha :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(220, 110, 50, 30);

        jPasswordFieldConfirmSenhaUsuario.setEnabled(false);
        jPasswordFieldConfirmSenhaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldConfirmSenhaUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordFieldConfirmSenhaUsuario);
        jPasswordFieldConfirmSenhaUsuario.setBounds(560, 110, 160, 30);

        jLabel9.setText("Confirmar Senha :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(450, 110, 110, 30);

        jPasswordFieldSenhaUsuario.setEnabled(false);
        jPanel1.add(jPasswordFieldSenhaUsuario);
        jPasswordFieldSenhaUsuario.setBounds(270, 110, 160, 30);

        jLabel10.setText("Permissão :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(740, 110, 90, 30);

        jComboBoxPermissaoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha", "Master", "Cadastro", "Relátorio" }));
        jComboBoxPermissaoUsuario.setEnabled(false);
        jPanel1.add(jComboBoxPermissaoUsuario);
        jComboBoxPermissaoUsuario.setBounds(820, 110, 90, 30);
        jPanel1.add(jTextFieldPesquisar);
        jTextFieldPesquisar.setBounds(190, 200, 330, 30);

        jButtonExcluirUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/IconeExcluir.png"))); // NOI18N
        jButtonExcluirUsuario.setText("Excluir");
        jButtonExcluirUsuario.setEnabled(false);
        jButtonExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonExcluirUsuario);
        jButtonExcluirUsuario.setBounds(650, 480, 100, 30);

        jButtonPesquisarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/IconePesquisar.png"))); // NOI18N
        jButtonPesquisarUsuario.setText("Pesquisar");
        jButtonPesquisarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPesquisarUsuario);
        jButtonPesquisarUsuario.setBounds(60, 200, 110, 30);

        jButtonNovoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/IconeNovo.png"))); // NOI18N
        jButtonNovoUsuario.setText("Novo");
        jButtonNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNovoUsuario);
        jButtonNovoUsuario.setBounds(210, 480, 100, 30);

        jButtonSalvarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/IconeSalvar.png"))); // NOI18N
        jButtonSalvarUsuario.setText("Salvar");
        jButtonSalvarUsuario.setEnabled(false);
        jButtonSalvarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalvarUsuario);
        jButtonSalvarUsuario.setBounds(320, 480, 100, 30);

        jButtonCancelarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/IconeCancelar.png"))); // NOI18N
        jButtonCancelarUsuarios.setText("Cancelar");
        jButtonCancelarUsuarios.setEnabled(false);
        jButtonCancelarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancelarUsuarios);
        jButtonCancelarUsuarios.setBounds(430, 480, 100, 30);

        jButtonAlterarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/IconeEdit.png"))); // NOI18N
        jButtonAlterarUsuario.setText("Alterar");
        jButtonAlterarUsuario.setEnabled(false);
        jButtonAlterarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAlterarUsuario);
        jButtonAlterarUsuario.setBounds(540, 480, 100, 30);

        jTableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUsuario);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 250, 870, 200);

        jLabel11.setText("COD :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(60, 24, 50, 20);

        jTextFieldCodUsuario.setEditable(false);
        jTextFieldCodUsuario.setEnabled(false);
        jPanel1.add(jTextFieldCodUsuario);
        jTextFieldCodUsuario.setBounds(100, 20, 50, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 70, 970, 540);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/imagem fundo cadastro usuario.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-10, 0, 1070, 700);

        setSize(new java.awt.Dimension(1054, 726));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserActionPerformed

    private void jTextFieldEmailUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailUsuarioActionPerformed

    private void jPasswordFieldConfirmSenhaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldConfirmSenhaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldConfirmSenhaUsuarioActionPerformed

    private void jButtonCancelarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarUsuariosActionPerformed
        jTextFieldNomeCompleto.setEnabled(!true);
        jTextFieldUser.setEnabled(!true);
        jPasswordFieldSenhaUsuario.setEnabled(!true);
        jPasswordFieldConfirmSenhaUsuario.setEnabled(!true);
        jComboBoxPermissaoUsuario.setEnabled(!true);
        jTextFieldEmailUsuario.setEnabled(!true);
        jFormattedTextFieldCpfUsuario.setEnabled(!true);
        jButtonPesquisarUsuario.setEnabled(!false);
        jTextFieldPesquisar.setEnabled(!false);
        jButtonSalvarUsuario.setEnabled(!true);
        jButtonNovoUsuario.setEnabled(!false);
        jButtonCancelarUsuarios.setEnabled(!true);
        jButtonExcluirUsuario.setEnabled(false);
        jButtonAlterarUsuario.setEnabled(false);

        jTextFieldNomeCompleto.setText("");
        jTextFieldUser.setText("");
        jFormattedTextFieldCpfUsuario.setText("");
        jPasswordFieldSenhaUsuario.setText("");
        jPasswordFieldConfirmSenhaUsuario.setText("");
        jComboBoxPermissaoUsuario.setSelectedItem("Escolha");
        jTextFieldEmailUsuario.setText("");
    }//GEN-LAST:event_jButtonCancelarUsuariosActionPerformed

    private void jButtonSalvarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarUsuarioActionPerformed
        // Tratando pra nao deixar salvar com campos em branco 
        if (jTextFieldNomeCompleto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo NOME COMPLETO para continuar");
            jTextFieldNomeCompleto.requestFocus();
        } else if (jTextFieldUser.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo USUÁRIO para continuar");
            jTextFieldUser.requestFocus();
        } else if (jFormattedTextFieldCpfUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo CPF para continuar");
            jFormattedTextFieldCpfUsuario.requestFocus();
        } else if (jPasswordFieldSenhaUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo SENHA para continuar");
            jPasswordFieldSenhaUsuario.requestFocus();
        } else if (jPasswordFieldConfirmSenhaUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo CONFIRMAR SENHA para continuar");
            jPasswordFieldConfirmSenhaUsuario.requestFocus();
        } else if (jTextFieldEmailUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo EMAIL para continuar");
            jTextFieldEmailUsuario.requestFocus();
        } else 
            if(jPasswordFieldSenhaUsuario.getText().equals(jPasswordFieldConfirmSenhaUsuario.getText())){
            
             if (flag == 1) {
            // Salvando no banco de dados pelo botão Salvar 
            mod.setNomeCompleto(jTextFieldNomeCompleto.getText());
            mod.setUsuario(jTextFieldUser.getText());
            mod.setSenha(jPasswordFieldSenhaUsuario.getText());
            mod.setPermissao((String) jComboBoxPermissaoUsuario.getSelectedItem());
            mod.setEmail(jTextFieldEmailUsuario.getText());
            mod.setCpf(jFormattedTextFieldCpfUsuario.getText());
           DaoUsuario.Salvar(mod);
            preencherTabela("select *from usuario order by nome_usu"); 
            
            // Ao salvar no banco de dados , limpa os campos para nova digitação 
            jTextFieldNomeCompleto.setText("");
            jTextFieldUser.setText("");
            jFormattedTextFieldCpfUsuario.setText("");
            jPasswordFieldSenhaUsuario.setText("");
            jPasswordFieldConfirmSenhaUsuario.setText("");
            jComboBoxPermissaoUsuario.setSelectedItem("Escolha");
            jTextFieldEmailUsuario.setText("");

            //Bloqueando os campos novamente, o  simbolo ( ! ) significa ao contrario .
            jTextFieldNomeCompleto.setEnabled(!true);
            jTextFieldUser.setEnabled(!true);
            jFormattedTextFieldCpfUsuario.setEnabled(!true);
            jPasswordFieldSenhaUsuario.setEnabled(!true);
            jPasswordFieldConfirmSenhaUsuario.setEnabled(!true);
            jComboBoxPermissaoUsuario.setEnabled(!true);
            jTextFieldEmailUsuario.setEnabled(!true);
            jButtonSalvarUsuario.setEnabled(false);
            jButtonCancelarUsuarios.setEnabled(false);
            jButtonNovoUsuario.setEnabled(true);
            jTextFieldCodUsuario.setText("");

        } else {
            // Salvando no banco de dados pelo botão Salvar 
            mod.setCodUsu(Integer.parseInt(jTextFieldCodUsuario.getText()));
            mod.setNomeCompleto(jTextFieldNomeCompleto.getText());
            mod.setUsuario(jTextFieldUser.getText());
            mod.setSenha(jPasswordFieldSenhaUsuario.getText());
            mod.setPermissao((String) jComboBoxPermissaoUsuario.getSelectedItem());
            mod.setEmail(jTextFieldEmailUsuario.getText());
            mod.setCpf(jFormattedTextFieldCpfUsuario.getText());
            DaoUsuario.Editar(mod);
            preencherTabela("select *from usuario order by nome_usu");
            // Ao salvar no banco de dados , limpa os campos para nova digitação 
            jTextFieldNomeCompleto.setText("");
            jTextFieldUser.setText("");
            jFormattedTextFieldCpfUsuario.setText("");
            jPasswordFieldSenhaUsuario.setText("");
            jPasswordFieldConfirmSenhaUsuario.setText("");
            jComboBoxPermissaoUsuario.setSelectedItem("Escolha");
            jTextFieldEmailUsuario.setText("");
            jTextFieldNomeCompleto.setEnabled(false);
            jTextFieldUser.setEnabled(false);
            jFormattedTextFieldCpfUsuario.setEnabled(false);
            jPasswordFieldSenhaUsuario.setEnabled(false);
            jPasswordFieldConfirmSenhaUsuario.setEnabled(false);
            jTextFieldEmailUsuario.setEnabled(false);
            jTextFieldCodUsuario.setEnabled(false);
            jComboBoxPermissaoUsuario.setEnabled(false);
            jButtonNovoUsuario.setEnabled(true);
            jTextFieldCodUsuario.setText("");
        }  
        }else{
             JOptionPane.showMessageDialog(rootPane,"Senha cadastrada nao se conferem , favor corrigir !!!! ");//Aviso para saber que as senhas sao Invalidas
            }
    }//GEN-LAST:event_jButtonSalvarUsuarioActionPerformed

    private void jButtonNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoUsuarioActionPerformed
        flag = 1;
        // Clicando no botao novo , libera compos para digitação e o botão Salvar.
        jTextFieldNomeCompleto.setEnabled(true);
        jTextFieldUser.setEnabled(true);
        jPasswordFieldSenhaUsuario.setEnabled(true);
        jPasswordFieldConfirmSenhaUsuario.setEnabled(true);
        jComboBoxPermissaoUsuario.setEnabled(true);
        jTextFieldEmailUsuario.setEnabled(true);
        jFormattedTextFieldCpfUsuario.setEnabled(true);
        jButtonPesquisarUsuario.setEnabled(false);
        jTextFieldPesquisar.setEnabled(false);
        jButtonSalvarUsuario.setEnabled(true);
        jButtonNovoUsuario.setEnabled(false);
        jButtonCancelarUsuarios.setEnabled(true);

        jTextFieldNomeCompleto.setText("");
        jTextFieldUser.setText("");
        jFormattedTextFieldCpfUsuario.setText("");
        jPasswordFieldSenhaUsuario.setText("");
        jPasswordFieldConfirmSenhaUsuario.setText("");
        jComboBoxPermissaoUsuario.setSelectedItem("Escolha");
        jTextFieldEmailUsuario.setText("");

    }//GEN-LAST:event_jButtonNovoUsuarioActionPerformed

    private void jButtonPesquisarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarUsuarioActionPerformed
        mod.setPesquisa(jTextFieldPesquisar.getText());// pesquisa pelo campo nome do usuario
        BeansUsuario model = DaoUsuario.buscaUsuario(mod);
        // tras do banco e coloca nos campos 
        jTextFieldNomeCompleto.setText(model.getNomeCompleto());
        jTextFieldCodUsuario.setText(String.valueOf(model.getCodUsu()));
        jTextFieldUser.setText(model.getUsuario());
        jFormattedTextFieldCpfUsuario.setText(model.getCpf());
        jPasswordFieldSenhaUsuario.setText(model.getSenha());
        jPasswordFieldConfirmSenhaUsuario.setText(model.getSenha());
        jComboBoxPermissaoUsuario.setSelectedItem(model.getPermissao());
        jTextFieldEmailUsuario.setText(model.getEmail());
        jButtonNovoUsuario.setEnabled(true);
        preencherTabela("select * from usuario where lower(nome_usu) like lower('%" + mod.getPesquisa()+ "%')");// tras tudo que contem com o especificado
        
    }//GEN-LAST:event_jButtonPesquisarUsuarioActionPerformed

    private void jButtonAlterarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarUsuarioActionPerformed
        flag = 2;
        // Clicando no botao Alterar , libera compos para digitação e o botão Salvar.
        jTextFieldNomeCompleto.setEnabled(true);
        jTextFieldUser.setEnabled(true);
        jPasswordFieldSenhaUsuario.setEnabled(true);
        jPasswordFieldConfirmSenhaUsuario.setEnabled(true);
        jComboBoxPermissaoUsuario.setEnabled(true);
        jTextFieldEmailUsuario.setEnabled(true);
        jFormattedTextFieldCpfUsuario.setEnabled(true);
        jButtonSalvarUsuario.setEnabled(true);
        jButtonExcluirUsuario.setEnabled(false);
        jButtonAlterarUsuario.setEnabled(false);
        
    }//GEN-LAST:event_jButtonAlterarUsuarioActionPerformed

    private void jButtonExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirUsuarioActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja Realmente exluir ?");// abre uma caixa pra pergunta se é verdadeiro ou falso .
        if (resposta == JOptionPane.YES_OPTION) {
            mod.setCodUsu(Integer.parseInt(jTextFieldCodUsuario.getText()));
            DaoUsuario.Excluir(mod);
            preencherTabela("select *from usuario order by nome_usu");
            jTextFieldCodUsuario.setText("");
            jTextFieldNomeCompleto.setText("");
            jTextFieldUser.setText("");
            jFormattedTextFieldCpfUsuario.setText("");
            jPasswordFieldSenhaUsuario.setText("");
            jPasswordFieldConfirmSenhaUsuario.setText("");
            jTextFieldEmailUsuario.setText("");
            jButtonAlterarUsuario.setEnabled(false);
            jButtonCancelarUsuarios.setEnabled(false);
            jButtonNovoUsuario.setEnabled(true);
            jButtonExcluirUsuario.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonExcluirUsuarioActionPerformed

    private void jTableUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuarioMouseClicked
//Mouse clicked , ao clicar no nome da tabela ao preenche os campos .
        String nome_usuario = "" + jTableUsuario.getValueAt(jTableUsuario.getSelectedRow(), 1);
         conection.conexao();
        conection.executaSql("select * from usuario where  nome_usu ='" + nome_usuario + "'");

        try {
            conection.rs.first();
            jTextFieldCodUsuario.setText(String.valueOf(conection.rs.getInt("id_usu")));
            jTextFieldNomeCompleto.setText(conection.rs.getString("nome_usu"));
            jTextFieldUser.setText(conection.rs.getString("usuario_usu"));
            jFormattedTextFieldCpfUsuario.setText(conection.rs.getString("cpf_usu"));
            jPasswordFieldSenhaUsuario.setText(conection.rs.getString("senha_usu"));
            jPasswordFieldConfirmSenhaUsuario.setText(conection.rs.getString("senha_usu"));
            jComboBoxPermissaoUsuario.setSelectedItem(conection.rs.getString("permissao_usu"));
            jTextFieldEmailUsuario.setText(conection.rs.getString("email_usu"));
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados/n" + ex);
        }
        conection.desconecta();
        jButtonNovoUsuario.setEnabled(false);
        jButtonCancelarUsuarios.setEnabled(true);
        jButtonAlterarUsuario.setEnabled(true);
        jButtonExcluirUsuario.setEnabled(true);
        jButtonSalvarUsuario.setEnabled(false);
        jTextFieldNomeCompleto.setEnabled(false);
        jTextFieldUser.setEnabled(false);
        jFormattedTextFieldCpfUsuario.setEnabled(false);
        jPasswordFieldSenhaUsuario.setEnabled(false);
        jPasswordFieldConfirmSenhaUsuario.setEnabled(false);
        jTextFieldEmailUsuario.setEnabled(false);
        jTextFieldCodUsuario.setEnabled(false);
        jComboBoxPermissaoUsuario.setEnabled(false);

    }//GEN-LAST:event_jTableUsuarioMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     //JOptionPane.showMessageDialog(rootPane, "Todos os campos são de preenchimento obrigatorios!!!!");
    }//GEN-LAST:event_formWindowOpened

    private void jTextFieldEmailUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldEmailUsuarioMousePressed
  /*  //Validando se o email da pessoa esta Correto.
      boolean status = ValidacaoEmail.email_validacao(jTextFieldEmailUsuario.getText());
      if(status){
      JOptionPane.showMessageDialog(rootPane, "E-MAIL valido !!!");
     }else{
          JOptionPane.showMessageDialog(rootPane,"Favor colocar E-MAIL valido !!!" );
      }*/
    }//GEN-LAST:event_jTextFieldEmailUsuarioMousePressed

    //Preenchendo a tabela 
    public void preencherTabela(String sql) {
        ArrayList dados = new ArrayList();

        String[] colunas = new String[]{"COD", "Nome", "Usuario", "CPF", "Acesso", "E-mail"};
        conection.conexao();
        conection.executaSql(sql);
        try {
            conection.rs.first();
            do {

                dados.add(new Object[]{conection.rs.getInt("id_usu"), conection.rs.getString("nome_usu"), conection.rs.getString("usuario_usu"),
                    conection.rs.getString("cpf_usu"),conection.rs.getString("permissao_usu"), conection.rs.getString("email_usu")});

            } while (conection.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Busque por outro Usuario para preencher a tabela"+ex);
        }
        BeansTabela modelo = new BeansTabela(dados, colunas);
        jTableUsuario.setModel(modelo);
        jTableUsuario.getColumnModel().getColumn(0).setPreferredWidth(40);// muda tamanho da linha na tabela 
        jTableUsuario.getColumnModel().getColumn(0).setResizable(false);//Nao deixa o usuario mexe o tamanho da coluna
        jTableUsuario.getColumnModel().getColumn(1).setPreferredWidth(210);// muda tamanho da linha na tabela 
        jTableUsuario.getColumnModel().getColumn(1).setResizable(false);//Nao deixa o usuario mexe o tamanho da coluna
        jTableUsuario.getColumnModel().getColumn(2).setPreferredWidth(180);// muda tamanho da linha na tabela 
        jTableUsuario.getColumnModel().getColumn(2).setResizable(false);//Nao deixa o usuario mexe o tamanho da coluna
        jTableUsuario.getColumnModel().getColumn(3).setPreferredWidth(130);// muda tamanho da linha na tabela 
        jTableUsuario.getColumnModel().getColumn(3).setResizable(false);//Nao deixa o usuario mexe o tamanho da coluna
        jTableUsuario.getColumnModel().getColumn(4).setPreferredWidth(100);// muda tamanho da linha na tabela 
        jTableUsuario.getColumnModel().getColumn(4).setResizable(false);//Nao deixa o usuario mexe o tamanho da coluna
        jTableUsuario.getColumnModel().getColumn(5).setPreferredWidth(230);// muda tamanho da linha na tabela 
        jTableUsuario.getColumnModel().getColumn(5).setResizable(false);//Nao deixa o usuario mexe o tamanho da coluna
        jTableUsuario.getTableHeader().setReorderingAllowed(false); // muda tamanho da linha na tabela */
        jTableUsuario.setAutoResizeMode(jTableUsuario.AUTO_RESIZE_OFF);//Tabela nao podera ser remimensionada
        jTableUsuario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conection.desconecta();

    }

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
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FormUsuario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterarUsuario;
    private javax.swing.JButton jButtonCancelarUsuarios;
    private javax.swing.JButton jButtonExcluirUsuario;
    private javax.swing.JButton jButtonNovoUsuario;
    private javax.swing.JButton jButtonPesquisarUsuario;
    private javax.swing.JButton jButtonSalvarUsuario;
    private javax.swing.JComboBox<String> jComboBoxPermissaoUsuario;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpfUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldConfirmSenhaUsuario;
    private javax.swing.JPasswordField jPasswordFieldSenhaUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsuario;
    private javax.swing.JTextField jTextFieldCodUsuario;
    private javax.swing.JTextField jTextFieldEmailUsuario;
    private javax.swing.JTextField jTextFieldNomeCompleto;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables
}
