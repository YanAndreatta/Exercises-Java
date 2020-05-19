/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciocontabanco;

public class ExercicioContaCorrentePoupança {
    
   public static void main(String[] args) {
       ExercicioContaBanco p1 = new ExercicioContaBanco();
       p1.setNumConta(1111);
       p1.setDono("Jubileu");
       p1.abrirConta("CC");
       
       
       
       ExercicioContaBanco p2 = new ExercicioContaBanco();
       p2.setNumConta(2222);
       p2.setDono("Creuza");
       p2.abrirConta("CP");
       
       
       p1.depositar(100);
       p2.depositar(500);
       p2.sacar(100);
       
       p1.sacar(150);
       p1.fecharConta();
       
       p1.estadoAtual();
       p2.estadoAtual();
    }
 
     
}
