package Ex1;

import javax.swing.JOptionPane;

public class ContaPoupanca extends ContaBancaria implements Imprimivel {
    private static final double limite = 500;

    public ContaPoupanca() {
    }

    public ContaPoupanca(double saldo, String nDeConta) {
        super(saldo, nDeConta);
    }

    
    
    @Override
    public void depositar(double deposito) {
        setSaldo(getSaldo() + deposito);
    }

    @Override
    public void levantar(double sacar) {
        if(getSaldo() + limite >= sacar){
            JOptionPane.showMessageDialog(null,"O saldo inicial era:" + getSaldo());
            setSaldo(getSaldo() - sacar);
            JOptionPane.showMessageDialog(null,"O levantamento foi efectuado com sucesso, o novo saldo "+ getSaldo() );            
        } else{
            JOptionPane.showMessageDialog(null,"Nao e possivel efectuar o levantamento");
        }
    }

    
    @Override
    public void imprimir() {
         JOptionPane.showMessageDialog(null, "numero de Conta" + getnDeConta() + "  com o saldo " + getSaldo());
    }
   
}
