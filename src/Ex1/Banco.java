/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Marco Cangela Garujo
 */
public class Banco implements Imprimivel {

    public Banco() {
    }
    
    
    
    private static ArrayList<ContaBancaria> contas = new ArrayList<>();

    public ArrayList<ContaBancaria> getContas() {
        return contas;
    }

    public void setContas(ArrayList<ContaBancaria> contas) {
        this.contas = contas;
    }
    
    public void inserir(ContaBancaria o){
        contas.add(o);
        
    }
    
    public void remover(Object o){
        contas.remove((ContaBancaria) o);
    }
    
    public Object procurar(int i){
        for (ContaBancaria conta1 : contas){
        if(Integer.parseInt(conta1.getnDeConta())== i){
            return conta1;
        }
    } 
        return null;
    }
    
    @Override
     public void imprimir() {
         for (ContaBancaria conta : contas){
             if (conta instanceof ContaCorrente) {
                 ((ContaCorrente) conta).imprimir();
//                 JOptionPane.showMessageDialog(null, "Esta a funcionar");
                 
             } else{
                 ((ContaPoupanca) conta).imprimir();
                 
             }
 }
     
}
     
}

