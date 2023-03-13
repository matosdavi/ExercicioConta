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

    public double depositarEsp(double valor) {
        this.saldoCP = this.saldoCP + valor;
        this.saldoCP = this.saldoCP + (valor * 0.05);
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
    public double sacarEsp(double valor) {
        return 0;
    }

    @Override
    public void exibirSaldo() {
        imprime("\nNome: " + this.getNomeCliente());
        imprime("\nNúmero da Conta: " + this.getNumConta());
        imprime("\nSaldo: " + this.saldoCP);
    }
}