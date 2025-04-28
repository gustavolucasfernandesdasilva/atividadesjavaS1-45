import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double aumentoTotal = 0;

        System.out.print("Digite o valor do salário mínimo: R$ ");
        double salarioMinimo = scanner.nextDouble();
        scanner.nextLine(); // limpar buffer

        for (int i = 1; i <= 584; i++) {
            System.out.print("Digite o nome do funcionário: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o salário atual de " + nome + ": R$ ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // limpar buffer

            double reajuste;
            if (salario < 3 * salarioMinimo) {
                reajuste = salario * 0.50;
            } else if (salario <= 10 * salarioMinimo) {
                reajuste = salario * 0.20;
            } else if (salario <= 20 * salarioMinimo) {
                reajuste = salario * 0.15;
            } else {
                reajuste = salario * 0.10;
            }

            double novoSalario = salario + reajuste;
            System.out.printf("Funcionário: %s | Reajuste: R$ %.2f | Novo salário: R$ %.2f%n", nome, reajuste, novoSalario);

            aumentoTotal += reajuste;
        }

        System.out.printf("Aumento total na folha de pagamento: R$ %.2f%n", aumentoTotal);
        scanner.close();
    }
}
