import java.util.Scanner;

public class ContaLuz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tipo de cliente (1-Residência, 2-Comércio, 3-Indústria): ");
        int tipo = scanner.nextInt();

        System.out.print("Digite o consumo em KW/h: ");
        double consumo = scanner.nextDouble();

        double valorKW;
        switch (tipo) {
            case 1: valorKW = 0.60; break;
            case 2: valorKW = 0.48; break;
            case 3: valorKW = 1.29; break;
            default:
                System.out.println("Tipo inválido.");
                return;
        }

        double valorConta = consumo * valorKW;
        System.out.printf("Valor da conta: R$ %.2f%n", valorConta);

        scanner.close();
    }
}
