import java.util.Scanner;

public class LucroPrejuizo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaCusto = 0;
        double somaVenda = 0;

        for (int i = 1; i <= 40; i++) {
            System.out.print("Preço de custo do produto " + i + ": R$ ");
            double custo = scanner.nextDouble();

            System.out.print("Preço de venda do produto " + i + ": R$ ");
            double venda = scanner.nextDouble();

            somaCusto += custo;
            somaVenda += venda;

            if (venda > custo) {
                System.out.println("Lucro.");
            } else if (venda < custo) {
                System.out.println("Prejuízo.");
            } else {
                System.out.println("Empate.");
            }
        }

        System.out.printf("Média de preço de custo: R$ %.2f%n", somaCusto / 40);
        System.out.printf("Média de preço de venda: R$ %.2f%n", somaVenda / 40);

        scanner.close();
    }
}
