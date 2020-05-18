/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabanco;

import javax.swing.JOptionPane;



/**
 *
 * @author yandu
 */
public class ContaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta conta1 = new Conta();
        int c = 0;
        
        
        JOptionPane.showMessageDialog(null, "Bem-vindo ao Banco da casa do caralho!");
        conta1.setTipo(JOptionPane.showInputDialog("<html>Você quer abrir uma conta corrente ou uma conta poupança?<br> [CC/CP]</br></html>"));
        conta1.setDono(JOptionPane.showInputDialog("<html>Qual seu nome?<br>Seu caralhudo</br></html>"));
        conta1.setNumConta(Integer.parseInt(JOptionPane.showInputDialog("Escolha um número de caralhudo para sua conta caralhuda:")));
        
        conta1.extratoConta();
        //while (c != 0) {    
        //if(c == 0){
        //    break;
        //}
        
        //}
        
        
    }
    
}
