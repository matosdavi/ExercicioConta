import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        imprime("Você deseja entrar em uma Conta Corrente ou Conta Poupança?\n1- Conta Corrente\n2- Conta Poupança\n");
        int escolhaConta = Integer.parseInt(entrada.nextLine());

        Conta conta = null;

        if (escolhaConta == 1) {
            conta = new ContaCorrente();

            imprime("Digite seu nome: ");
            conta.setNomeCliente(entrada.nextLine());
            imprime("Digite o número da conta: ");
            conta.setNumConta(Integer.parseInt(entrada.nextLine()));
            imprime("Digite o saldo da conta: ");
            ((ContaCorrente) conta).setSaldoCC(Double.parseDouble(entrada.nextLine()));

        } else if (escolhaConta == 2) {
            conta = new ContaPoupanca();

            imprime("Digite seu nome: ");
            conta.setNomeCliente(entrada.nextLine());
            imprime("Digite o número da conta: ");
            conta.setNumConta(Integer.parseInt(entrada.nextLine()));
            imprime("Digite o saldo da conta: ");
            ((ContaPoupanca) conta).setSaldoCP(Double.parseDouble(entrada.nextLine()));

        } else {
            imprime("Por favor, insira uma opção válida.");
        }

        imprime("Você deseja Depositar ou Sacar?\n1- Depositar\n2- Sacar\n");
        int escolhaOperacao = Integer.parseInt(entrada.nextLine());

        if (escolhaOperacao == 1) {
            imprime("Insira o valor que deseja depositar: ");
            conta.depositar(Double.parseDouble(entrada.nextLine()));
            conta.exibirSaldo();

        } else if (escolhaOperacao == 2) {
            imprime("Insira o valor que deseja sacar: ");
            conta.sacar(Double.parseDouble(entrada.nextLine()));
            conta.exibirSaldo();
        } else {
            imprime("Por favor, insira uma opção válida.");
        }
    }
    public static void imprime(String msg) { System.out.print(msg); }
}