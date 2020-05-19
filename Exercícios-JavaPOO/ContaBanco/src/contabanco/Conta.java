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
    private double saldo;
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
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
        if("cc".equals(this.getTipo()) && this.getSaldo() >= 12){ // this.tipo == "cc"; || this.getTipo() == "cc";
           this.setSaldo(getSaldo() - 12); // this.saldo -= 12;
           JOptionPane.showMessageDialog(null, "Sua mensalidade foi paga com sucesso!");        
        } else if ("cc".equals(this.getTipo()) && this.getSaldo() < 12){
          JOptionPane.showMessageDialog(null, "Você precisa ter saldo de no mínimo 12!");
        }
        if (this.getTipo() == "cp" && this.getSaldo() >= 20){ // this.tipo == "cp";
            this.setSaldo(getSaldo() - 20); // this.saldo -= 20;
            JOptionPane.showMessageDialog(null, "Sua mensalidade foi paga com sucesso!");
        } else if("cp".equals(this.getTipo()) && this.getSaldo() < 20){
            JOptionPane.showMessageDialog(null, "Você precisa ter saldo de no mínimo 20!");
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
            JOptionPane.showMessageDialog(null,"Você precisa pagar seus débitos antes!");
            //System.out.println("Você precisa pagar seus débitos antes!");
        } else if (this.getSaldo() > 0){
            JOptionPane.showMessageDialog(null, "Você precisa sacar todo seu dinheiro antes!");
            //System.out.println("Você precisa sacar todo seu dinheiro antes!");
        } else {
            JOptionPane.showMessageDialog(null, "Sua conta foi fechada!");
            //System.out.println("Sua conta foi fechada");
            this.setStatus(false);
        }
    }
    
    public void depositar(double valor){
        if(this.isStatus() == true){
            this.setSaldo(getSaldo() + valor); //this.saldo += valor; 
        } else {
            JOptionPane.showMessageDialog(null, "Para você depositar você precisa abrir a conta!");
            //System.out.println("Para você depositar você precisa abrir a conta!");
        }
    }
    public void sacar(double valor){
        if(this.isStatus() == true && this.getSaldo() >= valor){//&& this.getSaldo() >= valor){
            this.setSaldo(getSaldo() - valor); // this.saldo -= valor;
            JOptionPane.showMessageDialog(null,"Seu saque foi efetuado com sucesso!");
        } else if(this.getSaldo() < valor){
            JOptionPane.showMessageDialog(null, "Você precisa ter saldo ou ter a conta aberta!");
            //System.out.println("Você precisa ter saldo e ter a conta aberta!");
        }
    }
    
    public void extratoConta(){
        JOptionPane.showMessageDialog(null, "<html>Tipo da conta: " + this.getTipo() + "<br>Número da conta: " + 
        this.getNumConta() + "<br>Dono da conta: " + this.getDono() + "<br>Estado da conta: "
        + this.Status() + "<br>Saldo da conta: " + this.getSaldo() + "</br></html>");
        
        /*System.out.println(tipo);
        *System.out.println(numConta);
        *System.out.println(dono);
        *System.out.println(status);
        *System.out.println(saldo);
        */
    }
    
}
