
package Ex1;

import javax.swing.JOptionPane;


public class ContaCorrente extends ContaBancaria implements Imprimivel{
   private static final double taxaDeOperacao= 0.01;

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo, String nDeConta) {
        super(saldo, nDeConta);
    }

   
    @Override
    public void depositar(double deposito) {
        setSaldo(deposito + getSaldo());
    }

    @Override
    public void levantar(double sacar) {
        if( getSaldo() >= (sacar + getSaldo()*taxaDeOperacao) ){
            JOptionPane.showMessageDialog(null,"O saldo inicial era:" + getSaldo());
            setSaldo( getSaldo() - sacar - getSaldo()*taxaDeOperacao );
            return;
        } 
           
        }

    @Override
    public void imprimir() {
          JOptionPane.showMessageDialog(null, "numero de Conta" + getnDeConta() + "  com o saldo " + getSaldo());
    }

}
