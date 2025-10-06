/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import br.com.siriuscred.Conta;
import br.com.siriuscred.ContaPoupanca;
import javax.swing.JOptionPane;

/**
 *
 * @author 053280
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta conta = null;
        ContaPoupanca contaPoupanca = null;
        StringBuilder sb = new StringBuilder();
        sb.append("<<<< MENU >>>>\n");
        sb.append("1 - Cadastrar Conta\n");
        sb.append("2 - Depositar\n");
        sb.append("3 - Sacar\n");
        sb.append("4 - Exibir dados da conta\n");
        sb.append("5 - Transferir\n");
        sb.append("0 - Sair");
        String menu = sb.toString();
        int op = -1;
        while(op!=0){
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(op){
                case 1:
                    int agencia = Integer.parseInt(JOptionPane.showInputDialog("Informe a agência"));
                    int numero= Integer.parseInt(JOptionPane.showInputDialog("Informe o número"));
                    String titular = JOptionPane.showInputDialog("Informe o titular");
                    float saldo = Float.parseFloat(JOptionPane.showInputDialog("Informe o saldo"));
                    String senha = JOptionPane.showInputDialog("Informe a senha");
                    if(conta == null){
                        conta = new Conta(agencia, numero, titular, saldo, senha);
                    }else if(contaPoupanca == null){
                        contaPoupanca = new ContaPoupanca(agencia, numero, titular, saldo, senha);
                    }else{
                        JOptionPane.showMessageDialog(null, "Contas já cadastradas");
                    }
                break;
                case 2:
                    float valor = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do depósito"));
                    conta.depositar(valor);
                break;
                case 3:
                    float valor2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor que deseja sacar"));
                    conta.sacar(valor2);
                break;
                case 4:
                    if (conta == null || contaPoupanca == null){
                        JOptionPane.showMessageDialog(null, "Contas ainda não foram cadastradas");
                    } else{
                        StringBuilder sb1 = new StringBuilder();
                        sb1.append("\n   DADOS DA CONTA ");
                        sb1.append(conta.toString());
                        sb1.append("\n   DADOS DA CONTA POUPANÇA ");
                        sb1.append(contaPoupanca.toString());
                        JOptionPane.showMessageDialog(null,sb1.toString());
                    }
                break;
                case 5:
                    if (conta == null || contaPoupanca == null){
                        JOptionPane.showMessageDialog(null, "Conta Poupança e Corrente ainda não foram cadastradas");
                    } else {
                    float valorTransferir = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da transferência"));
                    conta.transferir(contaPoupanca ,valorTransferir);
                    
                    }
                break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo do programa");
                break;
            }
        }
        
    }
    
    
    
}
