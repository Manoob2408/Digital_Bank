public class ContaCorrente extends Conta{

    //A Conta Corrente cria seu Construtor utilizando o Construtor de Conta
    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    //Sobrescreve o método imprimirExtrato de Conta e adiciona o método extrato ao mesmo
    //Polimorfismo
   @Override
    public void imprimirExtrato(){
       System.out.println("----Conta Corrente----");
       super.extrato();
   }
}
