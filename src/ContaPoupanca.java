public class ContaPoupanca extends Conta{

    //A Conta Poupança cria seu Construtor utilizando o Construtor de Conta
    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }

    //Sobrescreve o método imprimirExtrato de Conta e adiciona o método extrato ao mesmo
    //Polimorfismo
    @Override
    public void imprimirExtrato(){
        System.out.println("----Conta Poupança----");
        super.extrato();
    }
}
