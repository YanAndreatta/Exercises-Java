/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula011;

/**
 *
 * @author yandu
 */
public class Aula011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        //Visitante v1 = new Visitante();
        //v1.setNome("Juvenal");
        //v1.setIdade(22);
        //v1.setSexo("M");
        //System.out.println(v1.toString());
        
       /* Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();*/
        
        /*Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        System.out.println(b1.toString());*/
        
        Professor p1 = new Professor();
        p1.setNome("Claudio");
        p1.setSalario(5000);
        p1.receberAumento(1000);
        System.out.println(p1.toString());
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Julis");
        t1.setSexo("M");
        t1.praticar();
        System.out.println(t1.toString());
    }
    
}
