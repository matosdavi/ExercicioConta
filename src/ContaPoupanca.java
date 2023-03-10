public class ContaPoupanca extends Conta {

    private double saldoCP;

    public double getSaldoCP() {
        return saldoCP;
    }

    public void setSaldoCP(double saldoCP) {
        this.saldoCP = saldoCP;
    }

    @Override
    public double depositar(double valor) {
        this.saldoCP = this.saldoCP + valor;
        return this.saldoCP;
    }

    @Override
    public double sacar(double valor) {
        if (saldoCP > valor) {
            this.saldoCP = this.saldoCP - valor;
            imprime("Depósito feito com sucesso!" + this.saldoCP);
        } else {
            imprime("Não foi possível realizar o saque, saldo insuficiente.");
        }
        return valor;
    }

    @Override
    public void exibirSaldo() {
        imprime("Nome: " + this.getNomeCliente());
        imprime("Número da Conta: " + this.getNumConta());
        imprime("Saldo: " + this.saldoCP);
    }
}