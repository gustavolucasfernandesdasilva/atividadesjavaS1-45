import java.util.Scanner;

public class NumeroMensagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 80) {
            System.out.println("Maior que 80.");
        } else if (numero < 25) {
            System.out.println("Menor que 25.");
        } else if (numero == 40) {
            System.out.println("Igual a 40.");
        }

        scanner.close();
    }
}
