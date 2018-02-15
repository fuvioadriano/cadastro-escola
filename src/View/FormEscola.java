/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import ModeloBeans.BeansEscola;
import ModeloBeans.BeansTabela;
import ModeloConection.ConexaoBD;
import ModeloDAO.DaoEscola;
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
public class FormEscola extends javax.swing.JFrame {

    ConexaoBD conection = new ConexaoBD();// conectando no banco de dados
    BeansEscola mod = new BeansEscola();// chamando beans
    DaoEscola daoEscola = new DaoEscola();
    int flag = 0;

    public FormEscola() {
        initComponents();
        preencherTabela("select *from escola order by nome");//ao iniciar o sistema ja vim com as tabelas .
        Image ico = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagem/setalogoClaro.png"));
        this.setIconImage(ico);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jTabbedPaneAbas = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldEnderecoEscola = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldNumeroEscola = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldCidadeEscola = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jFormattedTextFieldCepEscola = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldUfEscola = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldPaisEscola = new javax.swing.JTextField();
        jTextFieldBairroEscola = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jFormattedTextFieldTel01Escola = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        jFormattedTextFieldTel02Escola = new javax.swing.JFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        jFormattedTextFieldTelDiretor02 = new javax.swing.JFormattedTextField();
        jLabel19 = new javax.swing.JLabel();
        jFormattedTextFieldTeldiretor01 = new javax.swing.JFormattedTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jFormattedTextFieldTelDiretorAdjunto01 = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelDiretorAdjunto02 = new javax.swing.JFormattedTextField();
        jTextFieldPesquisarEscola = new javax.swing.JTextField();
        jButtonPesquisarEscola = new javax.swing.JButton();
        jButtonNovoEscola = new javax.swing.JButton();
        jButtonSalvarEscola = new javax.swing.JButton();
        jButtonEditarEscola = new javax.swing.JButton();
        jButtonCancelarEscola = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jTextFieldNomeEscola = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextFieldCnpjEscola = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCodEscola = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldDiretorEscola = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldDiretorAdjuntoEscola = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextFieldEmailEscola = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextFieldEmailDiretor = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextFieldEmailDiretorAdjunto = new javax.swing.JTextField();
        jButtonExcluirEscola = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEscolas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/ImagemCadastroEscola.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(260, 0, 70, 40);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel5.setText("Endereço :");

        jTextFieldEnderecoEscola.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel8.setText("N° :");

        jTextFieldNumeroEscola.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel10.setText("Bairro :");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel11.setText("Cidade :");

        jTextFieldCidadeEscola.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel12.setText("CEP :");

        try {
            jFormattedTextFieldCepEscola.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCepEscola.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel13.setText("UF:");

        jTextFieldUfEscola.setEnabled(false);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel14.setText("País :");

        jTextFieldPaisEscola.setEnabled(false);

        jTextFieldBairroEscola.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEnderecoEscola, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNumeroEscola, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldBairroEscola))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldCidadeEscola, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUfEscola, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldCepEscola, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPaisEscola, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldEnderecoEscola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldNumeroEscola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldBairroEscola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldCidadeEscola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldUfEscola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jFormattedTextFieldCepEscola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldPaisEscola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel16.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel16.setText("Telefone Escola :");

        try {
            jFormattedTextFieldTel01Escola.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTel01Escola.setEnabled(false);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel17.setText("Telefone Escola :");

        try {
            jFormattedTextFieldTel02Escola.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTel02Escola.setEnabled(false);

        jLabel20.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel20.setText("Telefone Diretor(a) Celular:");

        try {
            jFormattedTextFieldTelDiretor02.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTelDiretor02.setEnabled(false);
        jFormattedTextFieldTelDiretor02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldTelDiretor02ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel19.setText("Telefone Diretor(a) Celular:");

        try {
            jFormattedTextFieldTeldiretor01.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTeldiretor01.setEnabled(false);

        jLabel21.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel21.setText("Tel Diretor(a) Adj Celular:");

        jLabel22.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel22.setText("Tel Diretor(a) Adj celular :");

        try {
            jFormattedTextFieldTelDiretorAdjunto01.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTelDiretorAdjunto01.setEnabled(false);

        try {
            jFormattedTextFieldTelDiretorAdjunto02.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTelDiretorAdjunto02.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFormattedTextFieldTel01Escola, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldTelDiretor02, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFormattedTextFieldTel02Escola, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldTeldiretor01, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFormattedTextFieldTelDiretorAdjunto01, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldTelDiretorAdjunto02, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jFormattedTextFieldTel01Escola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jFormattedTextFieldTelDiretor02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jFormattedTextFieldTelDiretorAdjunto01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jFormattedTextFieldTel02Escola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jFormattedTextFieldTeldiretor01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jFormattedTextFieldTelDiretorAdjunto02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTextFieldPesquisarEscola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisarEscolaActionPerformed(evt);
            }
        });

        jButtonPesquisarEscola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/IconePesquisar.png"))); // NOI18N
        jButtonPesquisarEscola.setText("Pesquisar");
        jButtonPesquisarEscola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarEscolaActionPerformed(evt);
            }
        });

        jButtonNovoEscola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/IconeNovo.png"))); // NOI18N
        jButtonNovoEscola.setText("Novo");
        jButtonNovoEscola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoEscolaActionPerformed(evt);
            }
        });

        jButtonSalvarEscola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/IconeSalvar.png"))); // NOI18N
        jButtonSalvarEscola.setText("Salvar");
        jButtonSalvarEscola.setEnabled(false);
        jButtonSalvarEscola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarEscolaActionPerformed(evt);
            }
        });

        jButtonEditarEscola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/IconeEdit.png"))); // NOI18N
        jButtonEditarEscola.setText("Editar");
        jButtonEditarEscola.setEnabled(false);
        jButtonEditarEscola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarEscolaActionPerformed(evt);
            }
        });

        jButtonCancelarEscola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/IconeCancelar.png"))); // NOI18N
        jButtonCancelarEscola.setText("Cancelar");
        jButtonCancelarEscola.setEnabled(false);
        jButtonCancelarEscola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarEscolaActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldNomeEscola.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setText("Nome :");

        try {
            jFormattedTextFieldCnpjEscola.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCnpjEscola.setText("");
        jFormattedTextFieldCnpjEscola.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setText("CNPJ");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel7.setText("COD: ");

        jTextFieldCodEscola.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel9.setText("Diretor(a):");

        jTextFieldDiretorEscola.setEnabled(false);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel18.setText("Diretor(a) Adjunto :");

        jTextFieldDiretorAdjuntoEscola.setEnabled(false);

        jLabel23.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel23.setText("E-mail Escola :");

        jTextFieldEmailEscola.setEnabled(false);

        jLabel24.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel24.setText("E-mail Diretor :");

        jTextFieldEmailDiretor.setEnabled(false);

        jLabel25.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel25.setText("E-mail Diretor Adjunto:");

        jTextFieldEmailDiretorAdjunto.setEnabled(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodEscola, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDiretorEscola, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldEmailDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldDiretorAdjuntoEscola, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldEmailDiretorAdjunto, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNomeEscola, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldCnpjEscola, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldEmailEscola, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldCodEscola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldNomeEscola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCnpjEscola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jTextFieldEmailEscola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldDiretorEscola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jTextFieldEmailDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextFieldDiretorAdjuntoEscola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jTextFieldEmailDiretorAdjunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonExcluirEscola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/IconeExcluir.png"))); // NOI18N
        jButtonExcluirEscola.setText("Excluir");
        jButtonExcluirEscola.setEnabled(false);
        jButtonExcluirEscola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirEscolaActionPerformed(evt);
            }
        });

        jTableEscolas.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableEscolas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEscolasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEscolas);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextFieldPesquisarEscola, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPesquisarEscola))
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jButtonNovoEscola)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSalvarEscola)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEditarEscola)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExcluirEscola)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelarEscola)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisarEscola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarEscola))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovoEscola)
                    .addComponent(jButtonSalvarEscola)
                    .addComponent(jButtonEditarEscola)
                    .addComponent(jButtonCancelarEscola)
                    .addComponent(jButtonExcluirEscola))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jTabbedPaneAbas.addTab("Escola", jPanel3);

        getContentPane().add(jTabbedPaneAbas);
        jTabbedPaneAbas.setBounds(20, 30, 900, 590);

        jLabel1.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 3, 18)); // NOI18N
        jLabel1.setText("Cadastro de Escolas :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(340, 10, 230, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/imagem fundo cadastro usuario.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-30, -10, 1110, 890);

        setSize(new java.awt.Dimension(946, 674));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       //JOptionPane.showMessageDialog(rootPane, "Todos os campos são obrigatorio os preenchimentos ");//Mensagem sera exibida quando chamar a tela .
    }//GEN-LAST:event_formWindowOpened

    private void jTableEscolasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEscolasMouseClicked
        //Mouse clicked , ao clicar no nome da tabela ao preenche os campos .
        String nome_usuario = "" + jTableEscolas.getValueAt(jTableEscolas.getSelectedRow(), 1);
        conection.conexao();
        conection.executaSql("select * from escola where nome ='" + nome_usuario + "'");
        try {
            conection.rs.first();
            jTextFieldCodEscola.setText(String.valueOf(conection.rs.getInt("id_esc")));
            jTextFieldNomeEscola.setText(conection.rs.getString("nome"));
            jFormattedTextFieldCnpjEscola.setText(conection.rs.getString("cnpj_esc"));
            jTextFieldEmailEscola.setText(conection.rs.getString("email_esc"));
            jTextFieldDiretorEscola.setText(conection.rs.getString("dire_esc"));
            jTextFieldEmailDiretor.setText(conection.rs.getString("email_dire_esc"));
            jTextFieldEmailDiretorAdjunto.setText(conection.rs.getString("adj_esc"));
            jTextFieldEmailDiretorAdjunto.setText(conection.rs.getString("email_adj_esc"));
            jFormattedTextFieldTel01Escola.setText(conection.rs.getString("tel01_esc"));
            jFormattedTextFieldTel02Escola.setText(conection.rs.getString("tel02_esc"));
            jFormattedTextFieldTeldiretor01.setText(conection.rs.getString("tel01_dire_esc"));
            jFormattedTextFieldTelDiretor02.setText(conection.rs.getString("tel02_dire_esc"));
            jFormattedTextFieldTelDiretorAdjunto01.setText(conection.rs.getString("tel01_adj_esc"));
            jFormattedTextFieldTelDiretorAdjunto02.setText(conection.rs.getString("tel02_adj_esc"));
            jTextFieldEnderecoEscola.setText(conection.rs.getString("end_esc"));
            jTextFieldNumeroEscola.setText(conection.rs.getString("num_esc"));
            jTextFieldBairroEscola.setText(conection.rs.getString("bairro_esc"));
            jTextFieldCidadeEscola.setText(conection.rs.getString("cid_esc"));
            jTextFieldUfEscola.setText(conection.rs.getString("uf_esc"));
            jFormattedTextFieldCepEscola.setText(conection.rs.getString("cep_esc"));
            jTextFieldPaisEscola.setText(conection.rs.getString("pais_esc"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados/n" + ex);
        }
        conection.desconecta();
        jButtonEditarEscola.setEnabled(true);
        jButtonExcluirEscola.setEnabled(true);
    }//GEN-LAST:event_jTableEscolasMouseClicked

    private void jButtonExcluirEscolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirEscolaActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja Realmente exluir ?");// abre uma caixa pra pergunta se é verdadeiro ou false .
        if (resposta == JOptionPane.YES_OPTION) {
            mod.setCodEscola(Integer.parseInt(jTextFieldCodEscola.getText()));
            daoEscola.Excluir(mod);
            preencherTabela("select *from escola order by nome");

            jTextFieldNomeEscola.setText("");
            jFormattedTextFieldCnpjEscola.setText("");
            jFormattedTextFieldTel01Escola.setText("");
            jFormattedTextFieldTel02Escola.setText("");
            jTextFieldEnderecoEscola.setText("");
            jTextFieldNumeroEscola.setText("");
            jTextFieldBairroEscola.setText("");
            jTextFieldCidadeEscola.setText("");
            jTextFieldUfEscola.setText("");
            jFormattedTextFieldCepEscola.setText("");
            jTextFieldPaisEscola.setText("");
            jTextFieldEmailEscola.setText("");
            jFormattedTextFieldTeldiretor01.setText("");
            jFormattedTextFieldTelDiretor02.setText("");
            jTextFieldEmailDiretor.setText("");
            jFormattedTextFieldTelDiretorAdjunto01.setText("");
            jFormattedTextFieldTelDiretorAdjunto02.setText("");
            jTextFieldEmailDiretorAdjunto.setText("");
            jTextFieldDiretorEscola.setText("");
            jTextFieldDiretorAdjuntoEscola.setText("");
            jTextFieldPesquisarEscola.setText("");
            jButtonEditarEscola.setEnabled(false);
            jButtonExcluirEscola.setEnabled(false);
            jButtonNovoEscola.setEnabled(true);
            jButtonCancelarEscola.setEnabled(false);
            jButtonSalvarEscola.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonExcluirEscolaActionPerformed

    private void jButtonCancelarEscolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarEscolaActionPerformed
        jTextFieldNomeEscola.setEnabled(!true);
        jFormattedTextFieldCnpjEscola.setEnabled(!true);
        jFormattedTextFieldTel01Escola.setEnabled(!true);
        jFormattedTextFieldTel02Escola.setEnabled(!true);
        jTextFieldEnderecoEscola.setEnabled(!true);
        jTextFieldNumeroEscola.setEnabled(!true);
        jTextFieldBairroEscola.setEnabled(!true);
        jTextFieldCidadeEscola.setEnabled(!true);
        jTextFieldUfEscola.setEnabled(!true);
        jFormattedTextFieldCepEscola.setEnabled(!true);
        jTextFieldPaisEscola.setEnabled(!true);
        jTextFieldEmailEscola.setEnabled(!true);
        jFormattedTextFieldTeldiretor01.setEnabled(!true);
        jFormattedTextFieldTelDiretor02.setEnabled(!true);
        jTextFieldEmailDiretor.setEnabled(!true);
        jFormattedTextFieldTelDiretorAdjunto01.setEnabled(!true);
        jFormattedTextFieldTelDiretorAdjunto02.setEnabled(!true);
        jTextFieldEmailDiretorAdjunto.setEnabled(!true);
        jTextFieldDiretorEscola.setEnabled(!true);
        jTextFieldDiretorAdjuntoEscola.setEnabled(!true);
        jButtonSalvarEscola.setEnabled(false);
        jButtonCancelarEscola.setEnabled(false);
        jButtonNovoEscola.setEnabled(true);
        jButtonEditarEscola.setEnabled(false);
        jButtonExcluirEscola.setEnabled(false);
        jTextFieldPesquisarEscola.setEnabled(true);
        jButtonPesquisarEscola.setEnabled(true);
        jTextFieldCodEscola.setText("");
        jTextFieldNomeEscola.setText("");
        jFormattedTextFieldCnpjEscola.setText("");
        jFormattedTextFieldTel01Escola.setText("");
        jFormattedTextFieldTel02Escola.setText("");
        jTextFieldEnderecoEscola.setText("");
        jTextFieldNumeroEscola.setText("");
        jTextFieldBairroEscola.setText("");
        jTextFieldCidadeEscola.setText("");
        jTextFieldUfEscola.setText("");
        jFormattedTextFieldCepEscola.setText("");
        jTextFieldPaisEscola.setText("");
        jTextFieldEmailEscola.setText("");
        jFormattedTextFieldTeldiretor01.setText("");
        jFormattedTextFieldTelDiretor02.setText("");
        jTextFieldEmailDiretor.setText("");
        jFormattedTextFieldTelDiretorAdjunto01.setText("");
        jFormattedTextFieldTelDiretorAdjunto02.setText("");
        jTextFieldEmailDiretorAdjunto.setText("");
        jTextFieldDiretorEscola.setText("");
        jTextFieldDiretorAdjuntoEscola.setText("");
        jTextFieldPesquisarEscola.setText("");
    }//GEN-LAST:event_jButtonCancelarEscolaActionPerformed

    private void jButtonEditarEscolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarEscolaActionPerformed
        flag = 2;
        jTextFieldNomeEscola.setEnabled(true);
        jFormattedTextFieldCnpjEscola.setEnabled(true);
        jFormattedTextFieldTel01Escola.setEnabled(true);
        jFormattedTextFieldTel02Escola.setEnabled(true);
        jTextFieldEnderecoEscola.setEnabled(true);
        jTextFieldNumeroEscola.setEnabled(true);
        jTextFieldBairroEscola.setEnabled(true);
        jTextFieldCidadeEscola.setEnabled(true);
        jTextFieldUfEscola.setEnabled(true);
        jFormattedTextFieldCepEscola.setEnabled(true);
        jTextFieldPaisEscola.setEnabled(true);
        jTextFieldEmailEscola.setEnabled(true);
        jFormattedTextFieldTeldiretor01.setEnabled(true);
        jFormattedTextFieldTelDiretor02.setEnabled(true);
        jTextFieldEmailDiretor.setEnabled(true);
        jFormattedTextFieldTelDiretorAdjunto01.setEnabled(true);
        jFormattedTextFieldTelDiretorAdjunto02.setEnabled(true);
        jTextFieldEmailDiretorAdjunto.setEnabled(true);
        jTextFieldDiretorEscola.setEnabled(true);
        jTextFieldDiretorAdjuntoEscola.setEnabled(true);
        jButtonSalvarEscola.setEnabled(true);
        jButtonCancelarEscola.setEnabled(true);
        jButtonEditarEscola.setEnabled(false);
        jButtonExcluirEscola.setEnabled(false);
        jButtonNovoEscola.setEnabled(false);
    }//GEN-LAST:event_jButtonEditarEscolaActionPerformed

    private void jButtonSalvarEscolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarEscolaActionPerformed
        // Tratando pra nao deixar salvar com campos em branco
        if (jTextFieldNomeEscola.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo NOME para continuar");
            jTextFieldNomeEscola.requestFocus();
        } else if (jFormattedTextFieldCnpjEscola.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo CNPJ para continuar");
            jFormattedTextFieldCnpjEscola.requestFocus();
        }else if (jTextFieldEmailEscola.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo EMAIL ESCOLA  para continuar");
            jTextFieldEmailEscola.requestFocus();
        }else if (jTextFieldDiretorEscola.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo DIRETOR para continuar");
            jTextFieldDiretorEscola.requestFocus();
        }else if (jTextFieldDiretorAdjuntoEscola.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo DIRETOR ADJUNTO para continuar");
            jTextFieldDiretorAdjuntoEscola.requestFocus();
        }else if (jFormattedTextFieldTeldiretor01.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha O PRIMEIRO CAMPO DE TELEFONE DIRETOR  para continuar");
            jFormattedTextFieldTeldiretor01.requestFocus();
        }else if (jFormattedTextFieldTelDiretorAdjunto01.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha O PRIMEIRO CAMPO DE TELEFONE DO DIRETOR ADJUNTO para continuar");
            jFormattedTextFieldTelDiretorAdjunto01.requestFocus();
        }else if (jTextFieldEmailDiretor.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo EMAIL DIRETOR  para continuar");
            jTextFieldEmailDiretor.requestFocus();
        }else if (jTextFieldEmailDiretorAdjunto.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo EMAIL DIRETOR ADJUNTO para continuar");
            jTextFieldEmailDiretorAdjunto.requestFocus();
        }else if (jFormattedTextFieldTel01Escola.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha O PRIMEIRO CAMPO DE TELEFONE DA ESCOLA  para continuar");
            jFormattedTextFieldTel01Escola.requestFocus();
        }else if (jTextFieldEnderecoEscola.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo ENDEREÇO para continuar");
            jTextFieldEnderecoEscola.requestFocus();
        }else if (jTextFieldNumeroEscola.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo NUMERO ENDEREÇO DA ESCOLA  para continuar");
            jTextFieldNumeroEscola.requestFocus();
        }else if (jTextFieldBairroEscola.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo BAIRRO para continuar");
            jTextFieldBairroEscola.requestFocus();
        }else if (jTextFieldCidadeEscola.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo CIDADE  para continuar");
            jTextFieldCidadeEscola.requestFocus();
        }else if (jTextFieldUfEscola.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo UF  para continuar");
            jTextFieldUfEscola.requestFocus();
        }else if (jFormattedTextFieldCepEscola.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo CEP  para continuar");
            jFormattedTextFieldCepEscola.requestFocus();
        }else if (jTextFieldPaisEscola.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo PAÍS  para continuar");
            jTextFieldPaisEscola.requestFocus();
        }else

        // Salvando no banco de dados pelo botão Salvar
        if (flag == 1) {
            mod.setNome(jTextFieldNomeEscola.getText());
            mod.setCnpj(jFormattedTextFieldCnpjEscola.getText());
            mod.setTelefone01(jFormattedTextFieldTel01Escola.getText());
            mod.setTelefone02(jFormattedTextFieldTel02Escola.getText());
            mod.setEndereço(jTextFieldEnderecoEscola.getText());
            mod.setNumero(jTextFieldNumeroEscola.getText());
            mod.setBairro(jTextFieldBairroEscola.getText());
            mod.setCidade(jTextFieldCidadeEscola.getText());
            mod.setUf(jTextFieldUfEscola.getText());
            mod.setCep(jFormattedTextFieldCepEscola.getText());
            mod.setPais(jTextFieldPaisEscola.getText());
            mod.setEmailEscola(jTextFieldEmailEscola.getText());
            mod.setTelefone01Diretor(jFormattedTextFieldTeldiretor01.getText());
            mod.setTelefone02Diretor(jFormattedTextFieldTelDiretor02.getText());
            mod.setEmailDiretor(jTextFieldEmailDiretor.getText());
            mod.setTelefone01DiretorAdjunto(jFormattedTextFieldTelDiretorAdjunto01.getText());
            mod.setTelefone02DiretorAdjunto(jFormattedTextFieldTelDiretorAdjunto02.getText());
            mod.setEmailDiretorAdjunto(jTextFieldEmailDiretorAdjunto.getText());
            mod.setDiretor(jTextFieldDiretorEscola.getText());
            mod.setDiretorAdjunto(jTextFieldDiretorAdjuntoEscola.getText());
            daoEscola.Salvar(mod);
            preencherTabela("select *from escola order by nome");

            // Ao salvar no banco de dados , limpa os campos para nova digitação
            jTextFieldNomeEscola.setText("");
            jFormattedTextFieldCnpjEscola.setText("");
            jFormattedTextFieldTel01Escola.setText("");
            jFormattedTextFieldTel02Escola.setText("");
            jTextFieldEnderecoEscola.setText("");
            jTextFieldNumeroEscola.setText("");
            jTextFieldBairroEscola.setText("");
            jTextFieldCidadeEscola.setText("");
            jTextFieldUfEscola.setText("");
            jFormattedTextFieldCepEscola.setText("");
            jTextFieldPaisEscola.setText("");
            jTextFieldEmailEscola.setText("");
            jFormattedTextFieldTeldiretor01.setText("");
            jFormattedTextFieldTelDiretor02.setText("");
            jTextFieldEmailDiretor.setText("");
            jFormattedTextFieldTelDiretorAdjunto01.setText("");
            jFormattedTextFieldTelDiretorAdjunto02.setText("");
            jTextFieldEmailDiretorAdjunto.setText("");
            jTextFieldDiretorEscola.setText("");
            jTextFieldDiretorAdjuntoEscola.setText("");

            //Bloqueando os campos novamente, o  simbolo ( ! ) significa ao contrario .
            jTextFieldNomeEscola.setEnabled(!true);
            jFormattedTextFieldCnpjEscola.setEnabled(!true);
            jFormattedTextFieldTel01Escola.setEnabled(!true);
            jFormattedTextFieldTel02Escola.setEnabled(!true);
            jTextFieldEnderecoEscola.setEnabled(!true);
            jTextFieldNumeroEscola.setEnabled(!true);
            jTextFieldBairroEscola.setEnabled(!true);
            jTextFieldCidadeEscola.setEnabled(!true);
            jTextFieldUfEscola.setEnabled(!true);
            jFormattedTextFieldCepEscola.setEnabled(!true);
            jTextFieldPaisEscola.setEnabled(!true);
            jTextFieldEmailEscola.setEnabled(!true);
            jFormattedTextFieldTeldiretor01.setEnabled(!true);
            jFormattedTextFieldTelDiretor02.setEnabled(!true);
            jTextFieldEmailDiretor.setEnabled(!true);
            jFormattedTextFieldTelDiretorAdjunto01.setEnabled(!true);
            jFormattedTextFieldTelDiretorAdjunto02.setEnabled(!true);
            jTextFieldEmailDiretorAdjunto.setEnabled(!true);
            jTextFieldDiretorEscola.setEnabled(!true);
            jTextFieldDiretorAdjuntoEscola.setEnabled(!true);
            jButtonSalvarEscola.setEnabled(!true);
        } else {
            //Setando dentro de cada componente oque o usuario digito e salvando no banco de dados .
            mod.setCodEscola(Integer.parseInt(jTextFieldCodEscola.getText()));
            mod.setNome(jTextFieldNomeEscola.getText());
            mod.setCnpj(jFormattedTextFieldCnpjEscola.getText());
            mod.setTelefone01(jFormattedTextFieldTel01Escola.getText());
            mod.setTelefone02(jFormattedTextFieldTel02Escola.getText());
            mod.setEndereço(jTextFieldEnderecoEscola.getText());
            mod.setNumero(jTextFieldNumeroEscola.getText());
            mod.setBairro(jTextFieldBairroEscola.getText());
            mod.setCidade(jTextFieldCidadeEscola.getText());
            mod.setUf(jTextFieldUfEscola.getText());
            mod.setCep(jFormattedTextFieldCepEscola.getText());
            mod.setPais(jTextFieldPaisEscola.getText());
            mod.setEmailEscola(jTextFieldEmailEscola.getText());
            mod.setTelefone01Diretor(jFormattedTextFieldTeldiretor01.getText());
            mod.setTelefone02Diretor(jFormattedTextFieldTelDiretor02.getText());
            mod.setEmailDiretor(jTextFieldEmailDiretor.getText());
            mod.setTelefone01DiretorAdjunto(jFormattedTextFieldTelDiretorAdjunto01.getText());
            mod.setTelefone02DiretorAdjunto(jFormattedTextFieldTelDiretorAdjunto02.getText());
            mod.setEmailDiretorAdjunto(jTextFieldEmailDiretorAdjunto.getText());
            mod.setDiretor(jTextFieldDiretorEscola.getText());
            mod.setDiretorAdjunto(jTextFieldDiretorAdjuntoEscola.getText());
            daoEscola.Editar(mod);// edita todos os dados, fazendo um update
            preencherTabela("select *from escola order by nome");

            // //Bloqueando os campos novamente
            jTextFieldNomeEscola.setEnabled(false);
            jFormattedTextFieldCnpjEscola.setEnabled(false);
            jFormattedTextFieldTel01Escola.setEnabled(false);
            jFormattedTextFieldTel02Escola.setEnabled(false);
            jTextFieldEnderecoEscola.setEnabled(false);
            jTextFieldNumeroEscola.setEnabled(false);
            jTextFieldBairroEscola.setEnabled(false);
            jTextFieldCidadeEscola.setEnabled(false);
            jTextFieldUfEscola.setEnabled(false);
            jFormattedTextFieldCepEscola.setEnabled(false);
            jTextFieldPaisEscola.setEnabled(false);
            jTextFieldEmailEscola.setEnabled(false);
            jFormattedTextFieldTeldiretor01.setEnabled(false);
            jFormattedTextFieldTelDiretor02.setEnabled(false);
            jTextFieldEmailDiretor.setEnabled(false);
            jFormattedTextFieldTelDiretorAdjunto01.setEnabled(false);
            jFormattedTextFieldTelDiretorAdjunto02.setEnabled(false);
            jTextFieldEmailDiretorAdjunto.setEnabled(false);
            jTextFieldDiretorEscola.setEnabled(false);
            jTextFieldDiretorAdjuntoEscola.setEnabled(false);
            jButtonSalvarEscola.setEnabled(false);
            jButtonNovoEscola.setEnabled(true);
            jButtonCancelarEscola.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonSalvarEscolaActionPerformed

    private void jButtonNovoEscolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoEscolaActionPerformed
        // Clicando no botao novo , libera compos para digitação e o botão Salvar.

        flag = 1;
        jTextFieldNomeEscola.setEnabled(true);
        jFormattedTextFieldCnpjEscola.setEnabled(true);
        jFormattedTextFieldTel01Escola.setEnabled(true);
        jFormattedTextFieldTel02Escola.setEnabled(true);
        jTextFieldEnderecoEscola.setEnabled(true);
        jTextFieldNumeroEscola.setEnabled(true);
        jTextFieldBairroEscola.setEnabled(true);
        jTextFieldCidadeEscola.setEnabled(true);
        jTextFieldUfEscola.setEnabled(true);
        jFormattedTextFieldCepEscola.setEnabled(true);
        jTextFieldPaisEscola.setEnabled(true);
        jTextFieldEmailEscola.setEnabled(true);
        jFormattedTextFieldTeldiretor01.setEnabled(true);
        jFormattedTextFieldTelDiretor02.setEnabled(true);
        jTextFieldEmailDiretor.setEnabled(true);
        jFormattedTextFieldTelDiretorAdjunto01.setEnabled(true);
        jFormattedTextFieldTelDiretorAdjunto02.setEnabled(true);
        jTextFieldEmailDiretorAdjunto.setEnabled(true);
        jTextFieldDiretorEscola.setEnabled(true);
        jTextFieldDiretorAdjuntoEscola.setEnabled(true);
        jButtonSalvarEscola.setEnabled(true);
        jButtonNovoEscola.setEnabled(false);
        jButtonCancelarEscola.setEnabled(true);
        jTextFieldCodEscola.setText("");
        jTextFieldNomeEscola.setText("");
        jFormattedTextFieldCnpjEscola.setText("");
        jFormattedTextFieldTel01Escola.setText("");
        jFormattedTextFieldTel02Escola.setText("");
        jTextFieldEnderecoEscola.setText("");
        jTextFieldNumeroEscola.setText("");
        jTextFieldBairroEscola.setText("");
        jTextFieldCidadeEscola.setText("");
        jTextFieldUfEscola.setText("");
        jFormattedTextFieldCepEscola.setText("");
        jTextFieldPaisEscola.setText("");
        jTextFieldEmailEscola.setText("");
        jFormattedTextFieldTeldiretor01.setText("");
        jFormattedTextFieldTelDiretor02.setText("");
        jTextFieldEmailDiretor.setText("");
        jFormattedTextFieldTelDiretorAdjunto01.setText("");
        jFormattedTextFieldTelDiretorAdjunto02.setText("");
        jTextFieldEmailDiretorAdjunto.setText("");
        jTextFieldDiretorEscola.setText("");
        jTextFieldDiretorAdjuntoEscola.setText("");
        jTextFieldPesquisarEscola.setText("");
        jButtonEditarEscola.setEnabled(false);
        jButtonExcluirEscola.setEnabled(false);
        jButtonPesquisarEscola.setEnabled(false);
        jTextFieldPesquisarEscola.setEnabled(false);

    }//GEN-LAST:event_jButtonNovoEscolaActionPerformed

    private void jButtonPesquisarEscolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarEscolaActionPerformed
        mod.setPesquisar(jTextFieldPesquisarEscola.getText());// pesquisa pelo campo nome da escola
        BeansEscola model = daoEscola.buscaEscola(mod);
        // tras do banco e coloca nos campos
        jTextFieldNomeEscola.setText(model.getNome());
        jTextFieldCodEscola.setText(String.valueOf(model.getCodEscola()));
        jFormattedTextFieldCnpjEscola.setText(model.getCnpj());
        jFormattedTextFieldTel01Escola.setText(model.getTelefone01());
        jFormattedTextFieldTel02Escola.setText(model.getTelefone02());
        jTextFieldEnderecoEscola.setText(model.getEndereço());
        jTextFieldNumeroEscola.setText(model.getNumero());
        jTextFieldBairroEscola.setText(model.getBairro());
        jTextFieldCidadeEscola.setText(model.getCidade());
        jTextFieldUfEscola.setText(model.getUf());
        jFormattedTextFieldCepEscola.setText(model.getCep());
        jTextFieldPaisEscola.setText(model.getPais());
        jTextFieldEmailEscola.setText(model.getEmailEscola());
        jFormattedTextFieldTeldiretor01.setText(model.getTelefone01Diretor());
        jFormattedTextFieldTelDiretor02.setText(model.getTelefone02Diretor());
        jTextFieldEmailDiretor.setText(model.getEmailDiretor());
        jFormattedTextFieldTelDiretorAdjunto01.setText(model.getTelefone01DiretorAdjunto());
        jFormattedTextFieldTelDiretorAdjunto02.setText(model.getTelefone02DiretorAdjunto());
        jTextFieldEmailDiretorAdjunto.setText(model.getEmailDiretorAdjunto());
        jTextFieldDiretorEscola.setText(model.getDiretor());
        jTextFieldDiretorAdjuntoEscola.setText(model.getDiretorAdjunto()); 
        jButtonEditarEscola.setEnabled(true);
        jButtonExcluirEscola.setEnabled(true);
    }//GEN-LAST:event_jButtonPesquisarEscolaActionPerformed

    private void jTextFieldPesquisarEscolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarEscolaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisarEscolaActionPerformed

    private void jFormattedTextFieldTelDiretor02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldTelDiretor02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldTelDiretor02ActionPerformed
       //Preenchendo a tabela 
        public void preencherTabela(String sql) {
        ArrayList dados = new ArrayList();
        String[]colunas = new String[]{"COD","Escola","CNPJ","Diretor","Diretor Adj"};
        conection.conexao();
        conection.executaSql(sql);
        try {
            conection.rs.first();
            do {
              dados.add(new Object[]{conection.rs.getInt("id_esc"), conection.rs.getString("nome"), conection.rs.getString("cnpj_esc"),conection.rs.getString("dire_esc"),conection.rs.getString("adj_esc")});
            } while (conection.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Busque por outra Escola para preencher a tabela"+ex);
        }
        BeansTabela modelo = new BeansTabela(dados, colunas);
        jTableEscolas.setModel(modelo);
        jTableEscolas.getColumnModel().getColumn(0).setPreferredWidth(50);// muda tamanho da linha na tabela 
        jTableEscolas.getColumnModel().getColumn(0).setResizable(false);//Nao deixa o usuario mexe o tamanho da coluna
        jTableEscolas.getColumnModel().getColumn(1).setPreferredWidth(230);// muda tamanho da linha na tabela 
        jTableEscolas.getColumnModel().getColumn(1).setResizable(false);//Nao deixa o usuario mexe o tamanho da coluna
        jTableEscolas.getColumnModel().getColumn(2).setPreferredWidth(200);// muda tamanho da linha na tabela 
        jTableEscolas.getColumnModel().getColumn(2).setResizable(false);//Nao deixa o usuario mexe o tamanho da coluna
        jTableEscolas.getColumnModel().getColumn(3).setPreferredWidth(130);// muda tamanho da linha na tabela 
        jTableEscolas.getColumnModel().getColumn(3).setResizable(false);//Nao deixa o usuario mexe o tamanho da coluna
        jTableEscolas.getColumnModel().getColumn(4).setPreferredWidth(250);// muda tamanho da linha na tabela 
        jTableEscolas.getColumnModel().getColumn(4).setResizable(false);//Nao deixa o usuario mexe o tamanho da coluna
        jTableEscolas.getTableHeader().setReorderingAllowed(false); // muda tamanho da linha na tabela 
        jTableEscolas.setAutoResizeMode(jTableEscolas.AUTO_RESIZE_OFF);//Tabela nao podera ser remimensionada
        jTableEscolas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            java.util.logging.Logger.getLogger(FormEscola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEscola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEscola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEscola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEscola().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarEscola;
    private javax.swing.JButton jButtonEditarEscola;
    private javax.swing.JButton jButtonExcluirEscola;
    private javax.swing.JButton jButtonNovoEscola;
    private javax.swing.JButton jButtonPesquisarEscola;
    private javax.swing.JButton jButtonSalvarEscola;
    private javax.swing.JFormattedTextField jFormattedTextFieldCepEscola;
    private javax.swing.JFormattedTextField jFormattedTextFieldCnpjEscola;
    private javax.swing.JFormattedTextField jFormattedTextFieldTel01Escola;
    private javax.swing.JFormattedTextField jFormattedTextFieldTel02Escola;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelDiretor02;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelDiretorAdjunto01;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelDiretorAdjunto02;
    private javax.swing.JFormattedTextField jFormattedTextFieldTeldiretor01;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPaneAbas;
    private javax.swing.JTable jTableEscolas;
    private javax.swing.JTextField jTextFieldBairroEscola;
    private javax.swing.JTextField jTextFieldCidadeEscola;
    private javax.swing.JTextField jTextFieldCodEscola;
    private javax.swing.JTextField jTextFieldDiretorAdjuntoEscola;
    private javax.swing.JTextField jTextFieldDiretorEscola;
    private javax.swing.JTextField jTextFieldEmailDiretor;
    private javax.swing.JTextField jTextFieldEmailDiretorAdjunto;
    private javax.swing.JTextField jTextFieldEmailEscola;
    private javax.swing.JTextField jTextFieldEnderecoEscola;
    private javax.swing.JTextField jTextFieldNomeEscola;
    private javax.swing.JTextField jTextFieldNumeroEscola;
    private javax.swing.JTextField jTextFieldPaisEscola;
    private javax.swing.JTextField jTextFieldPesquisarEscola;
    private javax.swing.JTextField jTextFieldUfEscola;
    // End of variables declaration//GEN-END:variables
}
