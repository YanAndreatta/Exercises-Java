/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabanco;

import javax.swing.JOptionPane;

/**
 *
 * @author yandu
 */
public final class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    

    public Conta() {        // Constructor
        this.saldo = 0.0f;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void getStatus() {
        if(status == true){
            System.out.println("Conta aberta");  
        } else {
            System.out.println("Conta fechada");   
        }   
    }

    
    public String Status(){
        if (this.isStatus() == true){
            String a = "Conta Aberta";
            return a;
        } else {
            String b = "Conta fechada";
            return b;
        }
    } 
    
    public boolean isStatus(){
        return status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
        
    } 
    
    public void pagarMensal(){
        if("cc".equals(this.getTipo())){ // this.tipo == "cc"; || this.getTipo() == "cc";
           this.setSaldo(getSaldo() - 20); // this.saldo -= 12;
        } else if ("cp".equals(this.getTipo())){ // this.tipo == "cp";
            this.setSaldo(getSaldo() - 20); // this.saldo -= 20;
        }
    }
    
    
    public void abrirConta(){
        if("cc".equals(this.getTipo())){
            this.setSaldo(50);
            this.setStatus(true);
        } else if("cp".equals(this.getTipo())) {
            this.setSaldo(150);
            this.setStatus(true);
        } 
    }
    
    public void fecharConta(){
        if (this.getSaldo() < 0){
            System.out.println("Você precisa pagar seus débitos antes!");
        } else if (this.getSaldo() > 0){
            System.out.println("Você precisa sacar todo seu dinheiro antes!");
        } else {
            System.out.println("Sua conta está fechada!");
            this.setStatus(false);
        }
    }
    
    public void depositar(float valor){
        if(this.isStatus() == true){
            this.setSaldo(getSaldo() - valor); //this.saldo += valor; 
        } else {
            System.out.println("Para você depositar você precisa abrir a conta!");
        }
    }
    public void sacar(float valor){
        if(this.isStatus() == true && this.getSaldo() > 0){
            this.setSaldo(getSaldo() - valor); // this.saldo -= valor;
        } else {
            System.out.println("Você precisa ter saldo e ter a conta aberta!");
        }
    }
    
    public void extratoConta(){
        JOptionPane.showMessageDialog(null, "<html>Tipo da conta: " + tipo + "<br>Número da conta: " + numConta + "<br>Dono da conta: " + dono + "<br>Estado da conta: "
                + this.Status() + "<br>Saldo conta: " );
        System.out.println(tipo);
        System.out.println(numConta);
        System.out.println(dono);
        System.out.println(status);
        System.out.println(saldo);
    
    }
    
}
