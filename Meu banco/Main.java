import java.util.Scanner;

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
