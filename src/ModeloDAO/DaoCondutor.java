/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloBeans.BeansCondutor;
import ModeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Peterson Gomes
 */
public class DaoCondutor {

    ConexaoBD conection = new ConexaoBD();// chamando o metodo do banco de dados 
    BeansCondutor mod = new BeansCondutor(); // chamando o metodo de getter e setter

    // metodo pra salvar no banco de dados 
    public void Salvar(BeansCondutor mod) {
        conection.conexao();// conectando com o banco 
        try {
            PreparedStatement pst = conection.conn.prepareStatement("insert into condutor(nome_condutor,rg_condutor,cnh_condutor,"
                    + "emissao_cnh_condutor,validade_cnh_condutor,nascimento_condutor,estado_civil_condutor,categoria_cnh_condutor,"
                    + "tel_residencial_condutor,tel_celular_condutor,tel_celular_outro_condutor,endereco_condutor,numero_condutor,complemento_condutor,"
                    + "bairro_condutor,cidade_condutor,uf_condutor,cep_condutor,pais_condutor,sexo_condutor,cpf_condutor)values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getRg());
            pst.setString(3, mod.getCnh());
            pst.setString(4, mod.getEmissaoCnh());
            pst.setString(5, mod.getValidadeCnh());
            pst.setString(6, mod.getNascimento());
            pst.setString(7, mod.getCivil());
            pst.setString(8, mod.getCatHabilitacao());
            pst.setString(9, mod.getTelefone01());
            pst.setString(10, mod.getCelular());
            pst.setString(11, mod.getTelefone02());
            pst.setString(12, mod.getEndereço());
            pst.setString(13, mod.getNumero());
            pst.setString(14, mod.getComplemento());
            pst.setString(15, mod.getBairro());
            pst.setString(16, mod.getCidade());
            pst.setString(17, mod.getUf());
            pst.setString(18, mod.getCep());
            pst.setString(19, mod.getPais());
            pst.setString(20, mod.getSexo());
            pst.setString(21, mod.getCpf());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir no banco de dados/n ERRO !!" + ex);
        }

        conection.desconecta();

    }
 // criar metodo de pesquisa 
    
    public BeansCondutor buscaCondutor(BeansCondutor mod){
        conection.conexao();
        conection.executaSql("select * from condutor where lower (nome_condutor) like lower('%"+mod.getPesquisar()+"%')");//pesquisando no banco por nome tanto minusculo como maiusculo
        try {
            conection.rs.first();
            mod.setCodCondutor(conection.rs.getInt("id_Consutor"));
            mod.setNome(conection.rs.getString("nome_condutor"));
            mod.setRg(conection.rs.getString("rg_condutor"));
            mod.setCnh(conection.rs.getString("cnh_condutor"));
            mod.setEmissaoCnh(conection.rs.getString("emissao_cnh_condutor"));
            mod.setValidadeCnh(conection.rs.getString("validade_cnh_condutor"));
            mod.setNascimento(conection.rs.getString("nascimento_condutor"));
            mod.setCivil(conection.rs.getString("estado_civil_condutor"));
            mod.setCatHabilitacao(conection.rs.getString("categoria_cnh_condutor"));
            mod.setTelefone01(conection.rs.getString("tel_residencial_condutor"));
            mod.setCelular(conection.rs.getString("tel_celular_condutor"));
            mod.setTelefone02(conection.rs.getString("tel_celular_outro_condutor"));
            mod.setEndereço(conection.rs.getString("endereco_condutor"));
            mod.setNumero(conection.rs.getString("numero_condutor"));
            mod.setComplemento(conection.rs.getString("complemento_condutor"));
            mod.setBairro(conection.rs.getString("bairro_condutor"));
            mod.setCidade(conection.rs.getString("cidade_condutor"));
            mod.setUf(conection.rs.getString("uf_condutor"));
            mod.setCep(conection.rs.getString("cep_condutor"));
            mod.setPais(conection.rs.getString("pais_condutor"));
            mod.setSexo(conection.rs.getString("sexo_condutor"));
            mod.setCpf(conection.rs.getString("cpf_condutor"));
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Condutor não cadastrada!!!"+ex); 
        }
   
        conection.desconecta();
           return mod;
    }      
}
