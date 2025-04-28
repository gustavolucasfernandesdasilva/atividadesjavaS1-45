import java.util.Scanner;

public class NumeroPositivoNegativoZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                System.out.println("Positivo.");
            } else if (numero < 0) {
                System.out.println("Negativo.");
            } else {
                System.out.println("Zero.");
            }
        }

        scanner.close();
    }
}
