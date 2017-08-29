package Ex1;

import javax.swing.JOptionPane;


public abstract class ContaBancaria {
    private double saldo;
    private String nDeConta;
    

    public ContaBancaria() {
    }

    public ContaBancaria(double saldo, String nDeConta) {
        this.saldo = saldo;
        this.nDeConta = nDeConta;
    }
    
    
    public abstract void depositar (double deposito );
    
    public abstract void levantar(double sacar); 

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getnDeConta() {
        return nDeConta;
    }

    public void setnDeConta(String nDeConta) {
        this.nDeConta = nDeConta;
    }

    public boolean transferir (double valor,ContaBancaria conta){
        if (this.saldo>= valor) {
            this.levantar(valor);
            conta.depositar(valor);
            JOptionPane.showMessageDialog(null,"Transferencia efectuada com sucesso, novo saldo da conta "+this.getnDeConta()+" e "+this.getSaldo()+"mt   .");
            return true;  
   }
        return false;
  }        
}
