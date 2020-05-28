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
public class Tecnico extends Aluno{
    private int registroProfissional;
    
    public void praticar(){
        System.out.println("O aluno está praticando!");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    @Override
    public String toString() {
        return "Tecnico{" + "registroProfissional=" + registroProfissional + "Nome=" + nome + '}';
    }

    
}
