/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condiçãosimplesprogramaidade;

import java.util.Scanner;

/**
 *
 * @author yandu
 */
public class CondiçãoSimplesProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        System.out.print("Em que ano você nasceu? ");
        int nasc = t.nextInt();
        int idade = 2020 - nasc;
        System.out.println("Sua idade é " + idade);
        if (idade>=18) {
            System.out.println("Maior de Idade");
        } else {
            System.out.println("Menor de Idade");
        }
    }
    
}
