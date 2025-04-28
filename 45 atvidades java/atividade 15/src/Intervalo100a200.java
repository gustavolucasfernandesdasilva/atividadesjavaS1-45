import java.util.Scanner;

public class Intervalo100a200 {
    public static void main(String[] args) {

        int numero ;

        Scanner scanner = new Scanner(System.in);

        // Solicita um número ao usuário
        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        // Verifica se o número está no intervalo entre 100 e 200
        if (numero >= 100 && numero <= 200) {
            System.out.println("O número está no intervalo entre 100 e 200.");
        } else {
            System.out.println("O número NÃO está no intervalo entre 100 e 200.");
        }

        scanner.close();
    }
}