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
      
        String decision = "";
        
        JOptionPane.showMessageDialog(null, "Bem-vindo ao Banco de Papel");
        conta1.setTipo(JOptionPane.showInputDialog("<html>Você quer abrir uma conta corrente ou uma conta poupança?<br> [CC/CP]</br></html>"));
        conta1.setDono(JOptionPane.showInputDialog("<html>Qual seu nome?<br>Completo</br></html>"));
        conta1.setNumConta(Integer.parseInt(JOptionPane.showInputDialog("Escolha um número para sua conta:"))); // Poderia ser gerado automáticamente;
        decision = (JOptionPane.showInputDialog(null, "Você quer ATIVAR a conta agora? [S/N]"));
        if ("S".equals(decision) || "s".equals(decision)){   
            int c, n;
            do {
                c = Integer.parseInt(JOptionPane.showInputDialog(null,"<html>Banco de Papel<br><em>(Aperte 0 para sair ou 1 para continuar!)</em></html>"));
                
                if (c == 0){
                    break;
                }else {
                n = Integer.parseInt(JOptionPane.showInputDialog(null,"<html>Digite 1 [Ativar a conta]<br>Digite 2 [Extrato]<br>Digite 3 [Fechar a conta]<br>Digite 4 [Depositar]"
                + "<br>Digite 5 [Sacar]<br>Digite 6 [Pagar Mensalidade]<br>Digite 0 [SAIR]"));
                    switch(n){
                    case 0:
                        break;
                    case 1:
                        conta1.abrirConta();
                        break;
                    case 2:    
                        conta1.extratoConta();
                        break;
                    case 3:
                        conta1.fecharConta();
                        break;
                    case 4:
                       double a = Double.parseDouble(JOptionPane.showInputDialog("Quanto você quer depositar? "));
                       conta1.depositar(a);
                       break;
                    case 5:
                       double b = Double.parseDouble(JOptionPane.showInputDialog("Quanto você quer sacar? "));
                       conta1.sacar(b);
                       break;
                    case 6:
                       conta1.pagarMensal();
                       break;
                    }
                    
                }
                
            } while (c != 0);
            
        }

    }
    
}
