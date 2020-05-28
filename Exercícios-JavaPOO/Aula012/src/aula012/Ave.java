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
public class Ave extends Animal{
    
    private String corPena;
    
    public void fazerNinho(){
        System.out.println("Construindo Ninho");
    }
    
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas");
    }

    @Override
    public void emiterSom() {
        System.out.println("Som de Ave");
    }
    
}
