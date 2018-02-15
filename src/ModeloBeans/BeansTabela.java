/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBeans;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Peterson Gomes
 */
public class BeansTabela extends AbstractTableModel{
   private ArrayList linhas = null;
    private String[] colunas = null;
    
    public BeansTabela(ArrayList lin,String[] col){
        setLinhas(lin);
        setColunas(col);
    }

    /**
     * @return the linhas
     */
    public ArrayList getLinhas() {
        return linhas;
    }

    /**
     * @param linhas the linhas to set
     */
    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    /**
     * @return the colunas
     */
    public String[] getColunas() {
        return colunas;
    }

    /**
     * @param colunas the colunas to set
     */
    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
    
    // Metodo conta o numero de colunas     
   @Override
    public int getColumnCount(){ 
        return colunas.length;
    }
    //Metodo conta quantas linhas na nossa array
   @Override
    public int getRowCount(){
        return linhas.size();
    }
    //Metodo responsavel por pegar o nome da coluna e retorna quantas colunas deu 
   @Override
    public String getColumnName(int numCol){
        return colunas[numCol];
    }
    // Metodo responsavel por monta nossa tabela (as linhas )
   @Override
    public Object getValueAt(int numLin,int numCol){
        Object[] linha = (Object[])getLinhas().get(numLin);
        return linha[numCol];
    }
    
}

    

