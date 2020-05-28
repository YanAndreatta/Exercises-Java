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
public class Peixe extends Animal{
    
    private String corEscama;
    
    public void soltarBolha(){
        System.out.println("Soltando bolha");
    }
    
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substâncias");
    }

    @Override
    public void emiterSom() {
        System.out.println("Peixenão faz som");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
