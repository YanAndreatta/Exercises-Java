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
public class Professor extends Pessoa {
    
    private String especialidade;
    private float salario;
    
    
    public float receberAumento(float aumento){
        setSalario(getSalario() + aumento);  
        System.out.println(this.getNome() + " recebeu um aumento de: " + aumento);
        return aumento;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" + "especialidade=" + especialidade + ", salario=" + salario + '}';
    }
    
}
