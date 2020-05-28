/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula012;

/**
 *
 * @author yandu
 */
public class Aula012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Animal n = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga  t = new Tartaruga();
        Goldfish  g = new Goldfish();
        Arara  e = new Arara();
        
        
        c.locomover();
        c.emiterSom();
        k.locomover();
        k.emiterSom();
        
       /* m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emiterSom(); */
        
        /*a.locomover();
        p.locomover();
        r.locomover();*/
    }
    
}
