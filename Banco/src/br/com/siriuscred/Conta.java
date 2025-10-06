/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siriuscred;

import br.com.siriuscred.ContaPoupanca;
import javax.swing.JOptionPane;
public class Conta {
    private int agencia;
    private int numero;
    private String titular;
    private float saldo;
    private String senha;

    public Conta(int agencia, int numero, String titular, float saldo, String senha) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.senha = senha;
    }

    

    
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void depositar(float valor){
        this.saldo = this.saldo + valor;
    }
    
    public float sacar(float valor){
        this.saldo = this.saldo - valor;
        return valor;
    }

    @Override
    public String toString() {
        StringBuilder sb1 = new StringBuilder();
        sb1.append("\nAgência: "+this.getAgencia());
        sb1.append("\nConta  : "+this.getNumero());
        sb1.append("\nTitular: "+this.getTitular());
        sb1.append(String.format("\nSaldo: R$ %.2f", this.getSaldo()));
        return sb1.toString();
    }
    
    public boolean transferir(Conta destino, float valor){
            if (valor <= 0){
                JOptionPane.showMessageDialog(null, "Valor Inválido");
                return false;
           }
            if (this.saldo < valor){
                JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
                return false;
            }
        
            this.sacar(valor);
            destino.depositar(valor);
        return true;
        
    }
    
}
