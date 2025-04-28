import java.util.Scanner;

public class SalarioLiquidoFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        System.out.print("Sexo (M/F): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        System.out.print("Salário fixo: R$ ");
        double salarioFixo = scanner.nextDouble();

        double salarioLiquido = salarioFixo; // Pode incluir descontos ou bônus se especificado

        System.out.printf("Nome: %s | Salário Líquido: R$ %.2f%n", nome, salarioLiquido);

        scanner.close();
    }
}
