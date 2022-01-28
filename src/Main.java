public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Emanuela");
        cliente1.setDataAbertura("11/02/2006");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Joaozinho");
        cliente2.setDataAbertura("24/07/2015");

        Conta conta1 = new ContaCorrente(cliente1); //Upcasting
        Conta conta2 = new ContaPoupanca(cliente2); //Upcasting

        conta1.depositar(1000);
        conta1.transferir(conta2,300);
        conta1.imprimirExtrato();
        conta2.imprimirExtrato();
    }
}
