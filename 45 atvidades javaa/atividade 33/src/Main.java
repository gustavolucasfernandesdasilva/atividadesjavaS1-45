import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        int a = scanner.nextInt();

        System.out.print("Digite o lado B: ");
        int b = scanner.nextInt();

        System.out.print("Digite o lado C: ");
        int c = scanner.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero.");
            } else if (a == b || b == c || a == c) {
                System.out.println("Triângulo Isósceles.");
            } else {
                System.out.println("Triângulo Escaleno.");
            }
        } else {
            System.out.println("Não é um triângulo.");
        }

        scanner.close();
    }
}
