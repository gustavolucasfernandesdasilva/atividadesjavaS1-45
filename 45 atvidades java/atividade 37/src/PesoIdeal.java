import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sexo (M/F): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        double pesoIdeal;

        // Cálculo do peso ideal
        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido.");
            scanner.close();
            return;
        }

        // Resultado
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Peso ideal: %.2f kg%n", pesoIdeal);

        scanner.close();
    }
}
