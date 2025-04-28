import java.util.Scanner;

public class CarangoDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalDesconto = 0;
        double totalPago = 0;

        while (true) {
            System.out.print("Digite o valor do veículo (0 para encerrar): R$ ");
            double valor = scanner.nextDouble();
            if (valor == 0) break;

            System.out.print("Digite o tipo de combustível (A - Álcool, G - Gasolina, D - Diesel): ");
            char combustivel = scanner.next().toUpperCase().charAt(0);

            double desconto = 0;
            switch (combustivel) {
                case 'A':
                    desconto = valor * 0.25;
                    break;
                case 'G':
                    desconto = valor * 0.21;
                    break;
                case 'D':
                    desconto = valor * 0.14;
                    break;
                default:
                    System.out.println("Tipo de combustível inválido.");
                    continue;
            }

            double valorFinal = valor - desconto;
            System.out.printf("Desconto: R$ %.2f | Valor a pagar: R$ %.2f%n", desconto, valorFinal);

            totalDesconto += desconto;
            totalPago += valorFinal;
        }

        System.out.printf("Total de descontos: R$ %.2f%n", totalDesconto);
        System.out.printf("Total pago pelos clientes: R$ %.2f%n", totalPago);
        scanner.close();
    }
}
