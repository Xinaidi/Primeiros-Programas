import java.util.Scanner;

public class Conta {
    private String nomeCliente;
    private int numeroConta;
    private double saldo;

    public Conta(String nomeCliente, int numeroConta, double saldoInicial) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void mostrarInformacoes() {
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo atual: " + saldo);
    }


    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o nome do cliente: ");
            String nomeCliente = scanner.nextLine();

            System.out.print("Digite o número da conta: ");
            int numeroConta = scanner.nextInt();

            System.out.print("Digite o saldo inicial: ");
            double saldoInicial = scanner.nextDouble();

            Conta conta = new Conta(nomeCliente, numeroConta, saldoInicial);

            System.out.print("Digite o valor do depósito: ");
            double valorDeposito = scanner.nextDouble();
            conta.depositar(valorDeposito);

            System.out.print("Digite o valor do saque: ");
            double valorSaque = scanner.nextDouble();
            conta.sacar(valorSaque);

            System.out.println("\nInformações da conta:");
            conta.mostrarInformacoes();

            scanner.close();
        }
    }
}
