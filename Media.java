import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[2];
        int media = 0;
        int i;

        System.out.println("Digite 2 números para o cálculo da média: ");
        for (i = 0; i < 2; i++) {
            numeros[i] = scan.nextInt();
        }
        for (i = 0; i < 2; i++) {
            media = media + numeros[i];
        }
        media = media / 2;
        System.out.println("A média dos dois valores é: " + media);
    }
}
