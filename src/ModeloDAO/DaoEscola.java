package ModeloDAO;

import ModeloBeans.BeansEscola;
import ModeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Peterson Gomes
 */
public class DaoEscola {

    ConexaoBD conection = new ConexaoBD();// chamando o metodo do banco de dados 
    BeansEscola mod = new BeansEscola(); // chamando o metodo de getter e setter

    // metodo pra salvar no banco de dados 
    public void Salvar(BeansEscola mod) {
        conection.conexao();
        try {
            PreparedStatement pst = conection.conn.prepareStatement("insert into escola(nome,cnpj_esc,email_esc,dire_esc,email_dire_esc,adj_esc,email_adj_esc,"
                    + "tel01_esc,tel02_esc,tel01_dire_esc,tel02_dire_esc,tel01_adj_esc,tel02_adj_esc,end_esc,num_esc,bairro_esc,cid_esc,uf_esc,cep_esc,pais_esc)"
                    + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getCnpj());
            pst.setString(3, mod.getEmailEscola());
            pst.setString(4, mod.getDiretor());
            pst.setString(5, mod.getEmailDiretor());
            pst.setString(6, mod.getDiretorAdjunto());
            pst.setString(7, mod.getEmailDiretorAdjunto());
            pst.setString(8, mod.getTelefone01());
            pst.setString(9, mod.getTelefone02());
            pst.setString(10, mod.getTelefone01Diretor());
            pst.setString(11, mod.getTelefone02Diretor());
            pst.setString(12, mod.getTelefone01DiretorAdjunto());
            pst.setString(13, mod.getTelefone02DiretorAdjunto());
            pst.setString(14, mod.getEndereço());
            pst.setString(15, mod.getNumero());
            pst.setString(16, mod.getBairro());
            pst.setString(17, mod.getCidade());
            pst.setString(18, mod.getUf());
            pst.setString(19, mod.getCep());
            pst.setString(20, mod.getPais());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir no banco de dados !!"+ex );
        }
        conection.desconecta();
    }

    // Metodo de Exclusao
    
    public void Excluir(BeansEscola mod){
        conection.conexao();
        try {
            PreparedStatement pst = conection.conn.prepareStatement("delete from escola where id_esc =?");
            
            pst.setInt(1, mod.getCodEscola());
            pst.execute();
                       JOptionPane.showMessageDialog(null,"Escola excluida com sucesso!!!");                
                    } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null,"Erro ao excluir dados!!!"+ex);  
        }
            conection.desconecta();
        
        
    }
        
    //metodo de editar
    public void Editar(BeansEscola mod) {
        conection.conexao();
        try {
            PreparedStatement pst = conection.conn.prepareStatement("update escola set nome =?,cnpj_esc =?,email_esc =?,dire_esc =?,email_dire_esc =?,adj_esc =?,"
                    + "email_adj_esc =?,tel01_esc=?,tel02_esc =?,tel01_dire_esc =?,tel02_dire_esc =?,tel01_adj_esc =?,"
                    + "tel02_adj_esc =?,end_esc =?,num_esc =?,bairro_esc =?,cid_esc =?,"
                    + "uf_esc =?,cep_esc =?,pais_esc =? where id_esc =?");
            
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getCnpj());
            pst.setString(3, mod.getEmailEscola());
            pst.setString(4, mod.getDiretor());
            pst.setString(5, mod.getEmailDiretor());
            pst.setString(6, mod.getDiretorAdjunto());
            pst.setString(7, mod.getEmailDiretorAdjunto());
            pst.setString(8, mod.getTelefone01());
            pst.setString(9, mod.getTelefone02());
            pst.setString(10, mod.getTelefone01Diretor());
            pst.setString(11, mod.getTelefone02Diretor());
            pst.setString(12, mod.getTelefone01DiretorAdjunto());
            pst.setString(13, mod.getTelefone02DiretorAdjunto());
            pst.setString(14, mod.getEndereço());
            pst.setString(15, mod.getNumero());
            pst.setString(16, mod.getBairro());
            pst.setString(17, mod.getCidade());
            pst.setString(18, mod.getUf());
            pst.setString(19, mod.getCep());
            pst.setString(20, mod.getPais());
            pst.setInt(21, mod.getCodEscola());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados"+ex );
        }
        conection.desconecta();
    }

    // criar metodo de pesquisa 
    public BeansEscola buscaEscola(BeansEscola mod) {
        conection.conexao();
        conection.executaSql("select * from escola where lower (nome) like lower('%" + mod.getPesquisar() + "%')");//pesquisando no banco por nome tanto minusculo como maiusculo
        try {
            conection.rs.first();
            mod.setCodEscola(conection.rs.getInt("id_esc"));
            mod.setNome(conection.rs.getString("nome"));
            mod.setCnpj(conection.rs.getString("cnpj_esc"));
            mod.setEmailEscola(conection.rs.getString("email_esc"));
            mod.setDiretor(conection.rs.getString("dire_esc"));
            mod.setEmailDiretor(conection.rs.getString("email_dire_esc"));
            mod.setDiretorAdjunto(conection.rs.getString("adj_esc"));
            mod.setEmailDiretorAdjunto(conection.rs.getString("email_adj_esc"));
            mod.setTelefone01(conection.rs.getString("tel01_esc"));
            mod.setTelefone02(conection.rs.getString("tel02_esc"));
            mod.setTelefone01Diretor(conection.rs.getString("tel01_dire_esc"));
            mod.setTelefone02Diretor(conection.rs.getString("tel02_dire_esc"));
            mod.setTelefone01DiretorAdjunto(conection.rs.getString("tel01_adj_esc"));
            mod.setTelefone02DiretorAdjunto(conection.rs.getString("tel02_adj_esc"));
            mod.setEndereço(conection.rs.getString("end_esc"));
            mod.setNumero(conection.rs.getString("num_esc"));
            mod.setBairro(conection.rs.getString("bairro_esc"));
            mod.setCidade(conection.rs.getString("cid_esc"));
            mod.setUf(conection.rs.getString("uf_esc"));
            mod.setCep(conection.rs.getString("cep_esc"));
            mod.setPais(conection.rs.getString("pais_esc"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Escola não cadastrada!!!"+ex);
        }
        conection.desconecta();
        return mod;
    }
}
