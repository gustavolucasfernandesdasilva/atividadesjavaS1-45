import java.util.Scanner;

public class CarangoVelho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalAte2000 = 0;
        int totalGeral = 0;
        String continuar;

        do {
            System.out.print("Digite o ano do veículo: ");
            int ano = scanner.nextInt();
            System.out.print("Digite o valor do veículo: R$ ");
            double valor = scanner.nextDouble();

            double desconto;
            if (ano <= 2000) {
                desconto = valor * 0.12;
                totalAte2000++;
            } else {
                desconto = valor * 0.07;
            }

            double valorFinal = valor - desconto;

            System.out.printf("Desconto: R$ %.2f%n", desconto);
            System.out.printf("Valor a ser pago: R$ %.2f%n", valorFinal);

            totalGeral++;

            System.out.print("Deseja continuar calculando desconto? (S/N): ");
            continuar = scanner.next().toUpperCase();

        } while (continuar.equals("S"));

        System.out.println("Total de carros até ano 2000: " + totalAte2000);
        System.out.println("Total geral de carros: " + totalGeral);

        scanner.close();
    }
}
