import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do trabalho de laboratório: ");
        double lab = scanner.nextDouble();

        System.out.print("Digite a nota da avaliação semestral: ");
        double avaliacao = scanner.nextDouble();

        System.out.print("Digite a nota do exame final: ");
        double exame = scanner.nextDouble();

        double mediaFinal = (lab * 2 + avaliacao * 3 + exame * 5) / 10;

        System.out.printf("A média final é: %.2f%n", mediaFinal);

        scanner.close();
    }
}
