/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloConection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Peterson Gomes
 */
public class ConexaoBD {
     // Não esquecer que ao criar tem que ir em biblioteca e add o pacote da conexao do banco .
    
   public Statement stm;// responsavel por preparar e realizar pesquisa no banco de dados   
   public ResultSet rs; // responsavel por armazenar o resultado de uma pesquisa , passada para o statement
   private String driver = "org.postgresql.Driver"; // responsavel por identificar o serviço de  banco de dados
   private String caminho = "jdbc:postgresql://localhost:5432/Br5";// responsavel por setar o local do banco de dados
   private String usuario = "postgres";//do banco de dados
   private String senha = "admin";// do banco de dados
   public Connection conn;//responsavel por realizar a conexão com o banco de dados
   
   // Metodo responsavel por conectar com o banco de dados
   public void conexao(){
     
       try { //tentativa inicial 
           System.setProperty("jdbc.Drivers", driver);// seta a propriedade do driver de conexão 
           conn = DriverManager.getConnection(caminho, usuario, senha);//realiza conexão com o banco de dados
           //JOptionPane.showMessageDialog(null,"Conectado com sucesso!!!");//imprime uma caixa de mensagem 
       } catch (SQLException ex) { // excessão
           JOptionPane.showMessageDialog(null,"Erro de conexão!!!\n"+ex.getMessage());//imprime uma caixa de mensagem  e o EX.GETMESSAGE exibi o erro
       }
    }
    public void executaSql(String sql){
        try {
            stm =conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);// CONCUR _READ podera acessar os registro tanto do inicio quando do fim .
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Erro ExecutaSql\n"+ex.getMessage());
        }
    }
   
   public void desconecta(){// metodo para fechar a conexão com o banco de dados
       try {
           conn.close();// fecha a conexão
          // JOptionPane.showMessageDialog(null,"Desconectado com sucesso!!!");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao desconectar  a conexão!!!\n"+ex.getMessage());
       }
   } 
}

    
    

