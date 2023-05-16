import java.util.Scanner;

public class PARES {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[10];

		System.out.println("Insira 10 números para uma verificação: ");

		for (int cont = 0; cont < 10; cont++) {
			numeros[cont] = scan.nextInt();
		}
		System.err.println("NÚMERO PARES: ");
		for (int cont = 0; cont < 10; cont++) {
			if (numeros[cont] % 2 == 0) {
				System.out.println(numeros[cont]);
			}
		}
	}
}