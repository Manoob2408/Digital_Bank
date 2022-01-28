import java.util.Random;

public abstract class Conta {

    protected static int SEQUENCIAL = 1;
    protected int numeroConta;
    protected int agencia;
    protected double saldo;
    protected Cliente cliente;

    Random random = new Random();

    public Conta(Cliente cliente){
        this.agencia = random.nextInt(1000);
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void transferir(Conta contaDestino, double valor){
        this.saldo -= valor;
        contaDestino.depositar(valor);
    }

    public void extrato(){
        System.out.println(Banco.NOME_BANCO);
        System.out.println("Número do Banco: " + Banco.NUMERO_BANCO);
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Data de Abertura: " + this.cliente.getDataAbertura());
        System.out.println("Número da Conta: " + this.numeroConta);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("\n\n");
    }

    public abstract void imprimirExtrato();
}
