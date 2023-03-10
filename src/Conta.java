public abstract class Conta {

    private String nomeCliente;
    private int numConta;

    public static void imprime(String msg) { System.out.print(msg); }
    public abstract double depositar(double valor);

    public abstract double sacar(double valor);

    public abstract void exibirSaldo();

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
}