import java.util.Scanner;

public class VerificaNumeroMaiorQueDez {
    public static void main(String[] args) {

        float numero ;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        if (numero > 10) {
            System.out.println("O número é maior que 10!");
        }

        scanner.close();
    }
}
