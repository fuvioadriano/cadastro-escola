/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloBeans.BeansAluno;
import ModeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Peterson Gomes
 */
public class DaoAluno {
    
    
    ConexaoBD conection = new ConexaoBD();// chamando o metodo do banco de dados 
    BeansAluno mod = new BeansAluno(); // chamando o metodo de getter e setter

    // metodo pra salvar no banco de dados 
    public void Salvar(BeansAluno mod) {
        conection.conexao();
        try {
            PreparedStatement pst = conection.conn.prepareStatement("insert into aluno(nome_alu,rg_alu,cpf_alu,nasc_alu,sexo_alu,esc_matri,resp_nome_alu,resp_rg_alu,resp_cpf_alu,"
                    + "resp_nasc_alu,resp_sexo_alu,tel_alu,cel01_alu,tel_rec_alu,end_alu,num_alu,comple_alu,bairro_alu,cid_alu,uf_alu,cep_alu,pais_alu,obs_alu,foto,serie_alu)values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getRg());
            pst.setString(3, mod.getCpf());
            pst.setString(4, mod.getNasc());
            pst.setString(5, mod.getSexo());
            pst.setString(6, mod.getEsc_Matri());
            pst.setString(7, mod.getNomeResp());
            pst.setString(8, mod.getRgResp());
            pst.setString(9, mod.getCpfResp());
            pst.setString(10, mod.getNascResp());
            pst.setString(11, mod.getSexoResp());
            pst.setString(12, mod.getTelCasa());
            pst.setString(13, mod.getTelCel());
            pst.setString(14, mod.getTelRec());
            pst.setString(15, mod.getEndereco());
            pst.setString(16, mod.getNumero());
            pst.setString(17, mod.getComplemento());
            pst.setString(18, mod.getBairro());
            pst.setString(19, mod.getCidade());
            pst.setString(20, mod.getUf());
            pst.setString(21, mod.getCep());
            pst.setString(22, mod.getPais());
            pst.setString(23, mod.getObservacao());
            pst.setBytes(24, mod.getFoto()); 
            pst.setString(25, mod.getSerieCursando());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Aluno Cadastrado com  sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Aluno!!!\n Verifique a UF Cadastrada" );
        }

        conection.desconecta();
    }
  // criar metodo de pesquisa 
    public BeansAluno buscaAluno(BeansAluno mod) {
        conection.conexao();
        conection.executaSql("select * from aluno where lower (nome_alu) like lower('%" + mod.getPesquisar()+ "%')");//pesquisando no banco por nome tanto minusculo como maiusculo
        try {
            conection.rs.first();
            mod.setCodAluno(conection.rs.getInt("id_alu"));
            mod.setNome(conection.rs.getString("nome_alu"));
            mod.setRg(conection.rs.getString("rg_alu"));
            mod.setCpf(conection.rs.getString("cpf_alu"));
            mod.setNasc(conection.rs.getString("nasc_alu"));
            mod.setSexo(conection.rs.getString("sexo_alu"));
            mod.setEsco_Matri(conection.rs.getString("esc_alu"));
            mod.setNomeResp(conection.rs.getString("resp_nome_alu"));
            mod.setRgResp(conection.rs.getString("resp_rg_alu"));
            mod.setCpfResp(conection.rs.getString("resp_cpf_alu"));
            mod.setNascResp(conection.rs.getString("resp_nasc_alu"));
            mod.setSexoResp(conection.rs.getString("resp_sexo_alu"));
            mod.setTelCasa(conection.rs.getString("tel_alu"));
            mod.setTelCel(conection.rs.getString("cel01_alu"));
            mod.setTelRec(conection.rs.getString("tel_rec_alu"));
            mod.setEndereco(conection.rs.getString("end_alu"));
            mod.setNumero(conection.rs.getString("num_alu"));
            mod.setComplemento(conection.rs.getString("comple_alu"));
            mod.setBairro(conection.rs.getString("bairro_alu"));
            mod.setCidade(conection.rs.getString("cid_alu"));
            mod.setUf(conection.rs.getString("uf_alu"));
            mod.setCep(conection.rs.getString("cep_alu"));
            mod.setPais(conection.rs.getString("pais_alu"));
            mod.setObservacao(conection.rs.getString("obs_alu"));
            mod.setFoto(conection.rs.getBytes("foto"));// FOTO
            mod.setSerieCursando(conection.rs.getString("serie_alu"));
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Aluno não cadastrado(a)!!!");
        }
        conection.desconecta();
        return mod;
    }
       //metodo de editar .
    public void Editar(BeansAluno mod) {
        conection.conexao();
        try {
            PreparedStatement pst = conection.conn.prepareStatement("update aluno set nome_alu =?,rg_alu =?,cpf_alu =?,nasc_alu =?,sexo_alu =?,esc_alu =?,"
                    + "resp_nome_alu =?,resp_rg_alu=?,resp_cpf_alu =?,resp_nasc_alu =?,resp_sexo_alu =?,tel_alu =?,"
                    + "cel01_alu =?,tel_rec_alu =?,end_alu =?,num_alu =?,comple_alu =?,"
                    + "bairro_alu =?,cid_alu =?,uf_alu =?,cep_alu =?,pais_alu =?,obs_alu =?,foto =?,serie_alu =? where id_alu =?");
            
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getRg());
            pst.setString(3, mod.getCpf());
            pst.setString(4, mod.getNasc());
            pst.setString(5, mod.getSexo());
            pst.setString(6, mod.getEsco_Matri());
            pst.setString(7, mod.getNomeResp());
            pst.setString(8, mod.getRgResp());
            pst.setString(9, mod.getCpfResp());
            pst.setString(10, mod.getNascResp());
            pst.setString(11, mod.getSexoResp());
            pst.setString(12, mod.getTelCasa());
            pst.setString(13, mod.getTelCel());
            pst.setString(14, mod.getTelRec());
            pst.setString(15, mod.getEndereco());
            pst.setString(16, mod.getNumero());
            pst.setString(17, mod.getComplemento());
            pst.setString(18, mod.getBairro());
            pst.setString(19, mod.getCidade());
            pst.setString(20, mod.getUf());
            pst.setString(21, mod.getCep());
            pst.setString(22, mod.getPais());
            pst.setString(23, mod.getObservacao());
            pst.setBytes(24, mod.getFoto());
            pst.setString(25, mod.getSerieCursando());
            pst.setInt(26, mod.getCodAluno());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados\n Verifique se a UF esta preenchida corretamente !!!!");
        }
        conection.desconecta();
    }
       // Metodo de Exclusao .
    public void Excluir(BeansAluno mod){
        conection.conexao();
        try {
            PreparedStatement pst = conection.conn.prepareStatement("delete from aluno where id_alu =?");
            
            pst.setInt(1, mod.getCodAluno());
            pst.execute();
                  JOptionPane.showMessageDialog(null,"Aluno excluido com sucesso!!!");                   
                    } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null,"Erro ao excluir Aluno!!!");  
        }
        conection.desconecta();
   }
}
 