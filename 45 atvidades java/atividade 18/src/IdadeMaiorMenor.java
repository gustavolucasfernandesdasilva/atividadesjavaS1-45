import java.util.Scanner;

public class IdadeMaiorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 75; i++) {
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = scanner.nextInt();
            if (idade >= 18) {
                System.out.println("Maior de idade.");
            } else {
                System.out.println("Menor de idade.");
            }
        }
        scanner.close();
    }
}
