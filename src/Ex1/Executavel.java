package Ex1;


public class Executavel {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(1000, "1379542680");
//        conta1.depositar(1000);
//        conta1.levantar(1900);
    
        ContaPoupanca conta2 = new ContaPoupanca(1300, "159732486");
//        conta2.depositar(700);
//        conta2.levantar(2000);
        conta2.transferir(1000, conta1);
        
        conta1.imprimir();
        conta2.imprimir();
//        System.out.println(conta2.imprimir());
//        Relatorio rela = new Relatorio();
//        System.out.println(rela.gerarRelatorio(conta2));
//        System.out.println(rela.gerarRelatorio(conta1));
//        
        
    }
}
