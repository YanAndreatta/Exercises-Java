/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testador;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author yandu
 */
public class Testador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner tc = new Scanner(System.in);
        System.out.println("Ano: ");
        int a = tc.nextInt();
        System.out.println("Mês: ");
        int m = tc.nextInt();
        System.out.println("Dias: ");
        int d = tc.nextInt();
        
        //int ano = 365;
        //int meses = 30;
       // int dias = 0;
        
        int calc = (a*365) + (m*30) + (d);
        
        //System.out.print(a);
        //System.out.print(m);
        //System.out.print(d);
        System.out.println("Total de Dias que você viveu: " + calc);
      
    }
}
