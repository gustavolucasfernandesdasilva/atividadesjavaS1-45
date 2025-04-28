import java.util.Scanner;

public class SalarioProfessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nível do professor (1, 2 ou 3): ");
        int nivel = scanner.nextInt();

        System.out.print("Digite a quantidade de horas/aula: ");
        int horas = scanner.nextInt();

        double valorHora;
        switch (nivel) {
            case 1: valorHora = 12.00; break;
            case 2: valorHora = 17.00; break;
            case 3: valorHora = 25.00; break;
            default:
                System.out.println("Nível inválido.");
                return;
        }

        double salario = horas * valorHora;
        System.out.printf("Salário: R$ %.2f%n", salario);

        scanner.close();
    }
}
