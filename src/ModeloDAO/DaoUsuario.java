/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloBeans.BeansUsuario;
import ModeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Peterson Gomes
 */
public class DaoUsuario {

    ConexaoBD conection = new ConexaoBD();// chamando o metodo do banco de dados 
    BeansUsuario mod = new BeansUsuario(); // chamando o metodo de getter e setter

    // metodo pra salvar no banco de dados 
    public void Salvar(BeansUsuario mod) {
        conection.conexao();
        try {
            PreparedStatement pst = conection.conn.prepareStatement("insert into usuario(nome_usu,usuario_usu,"
                    + "cpf_usu,senha_usu,permissao_usu,email_usu)values (?,?,?,?,?,?)");
            pst.setString(1, mod.getNomeCompleto());
            pst.setString(2, mod.getUsuario());
            pst.setString(3, mod.getCpf());
            pst.setString(4, mod.getSenha());
            pst.setString(5, mod.getPermissao());
            pst.setString(6, mod.getEmail());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir no banco de dados!!!\n Verificar Duplicidade no CPF."+ex);
        }
        conection.desconecta();
    }

    //metodo de editar
    public void Editar(BeansUsuario mod) {
        conection.conexao();
        try {
            PreparedStatement pst = conection.conn.prepareStatement("update usuario set nome_usu =?,usuario_usu =?,cpf_usu =?,senha_usu =?,"
                    + "permissao_usu =?,email_usu =? where id_usu =?");

            pst.setString(1, mod.getNomeCompleto());
            pst.setString(2, mod.getUsuario());
            pst.setString(3, mod.getCpf());
            pst.setString(4, mod.getSenha());
            pst.setString(5, mod.getPermissao());
            pst.setString(6, mod.getEmail());
            pst.setInt(7, mod.getCodUsu());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração do usuário"+ex);
        }
        conection.desconecta();
    }

    // Metodo de Exclusao
    public void Excluir(BeansUsuario mod) {
        conection.conexao();
        try {
            PreparedStatement pst = conection.conn.prepareStatement("delete from usuario where id_usu =?");

            pst.setInt(1, mod.getCodUsu());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuario Excluido com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir usuário!!!");
        }
        conection.desconecta();
    }

    // metodo de pesquisa 
    public BeansUsuario buscaUsuario(BeansUsuario mod) {
        conection.conexao();
        conection.executaSql("select * from usuario where lower (nome_usu) like lower('%" + mod.getPesquisa() + "%')");//pesquisando no banco por nome tanto minusculo como maiusculo
        try {
            conection.rs.first();
            mod.setCodUsu(conection.rs.getInt("id_usu"));
            mod.setNomeCompleto(conection.rs.getString("nome_usu"));
            mod.setUsuario(conection.rs.getString("usuario_usu"));
            mod.setCpf(conection.rs.getString("cpf_usu"));
            mod.setSenha(conection.rs.getString("senha_usu"));
            mod.setPermissao(conection.rs.getString("permissao_usu"));
            mod.setEmail(conection.rs.getString("email_usu"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuario não cadastrado(a)!!!"+ex);
        }
        conection.desconecta();
        return mod;
    }
}
