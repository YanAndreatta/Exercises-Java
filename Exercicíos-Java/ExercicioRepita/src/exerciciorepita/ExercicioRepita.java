/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author yandu
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Olá, Mundo", " Boas Vindas", JOptionPane.ERROR_MESSAGE);
        int n,s = 0, cp = 0, ci = 0, cm = 0, qt = 0, m = 0; 
        
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número:  <br><em>(Valor 0 interrompe)</em></hmtl>"));
            s += n;
            if (n == 0)
                break;
            qt++;
            m = (s/qt);
            if (n%2 != 0){
              ci++;
            } else{
              cp++;
            }
            if (n>100){
              cm++;
            }  
            
        } while (n != 0);
        JOptionPane.showMessageDialog(null,"<html>Resultado final <hr>" + "<br>Soma dos valores: " + s +"<br>Total de valores digitados: " + qt + "<br><html>Total de Pares: " + cp + 
                "<br>Total de Ímpares: " + ci + "<br>Acima de 100: " + cm + "<br>Média dos valores: " + m + "</html>");
    }         
           
}
