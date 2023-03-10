public class ContaCorrente extends Conta{

    private double saldoCC;

    public double getSaldoCC() {
        return saldoCC;
    }

    public void setSaldoCC(double saldoCC) {
        this.saldoCC = saldoCC;
    }

    @Override
    public double depositar(double valor) {
        this.saldoCC = this.saldoCC + valor;
        return this.saldoCC;
    }

    @Override
    public double sacar(double valor) {
        if (this.saldoCC > valor) {
            this.saldoCC = this.saldoCC - valor;
            imprime("Depósito feito com sucesso!");
        } else {
            imprime("Não foi possível realizar o saque, saldo insuficiente.");
        }
        return 0;
    }

    @Override
    public void exibirSaldo() {
        imprime("Nome: " + this.getNomeCliente());
        imprime("Número da Conta: " + this.getNumConta());
        imprime("Saldo: " + this.saldoCC);
    }
}