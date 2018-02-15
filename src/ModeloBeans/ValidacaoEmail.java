/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBeans;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Peterson Gomes
 */
public class ValidacaoEmail {
    // Validando se o email esta nos padrões corretos 
    public static boolean email_validacao(String email){
        boolean status = false;
        
        String email_Pattern ="^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)­*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A­-Za-z]{2,})$";
         
       Pattern pattern = Pattern.compile(email);
       Matcher matcher = pattern.matcher(email);
       if(matcher.matches()){
           status = true;
       }else{
           status = false;
       }
       return status ;
    } 
    
}
