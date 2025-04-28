import java.util.Scanner;

public class CategoriaSeguro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        System.out.print("Grupo de risco (1, 2 ou 3): ");
        int grupo = scanner.nextInt();

        if (idade < 17 || idade > 70) {
            System.out.println("Idade fora da faixa permitida para seguro.");
        } else {
            String categoria = "";
            if (idade >= 17 && idade <= 20) {
                categoria = switch (grupo) {
                    case 1 -> "Categoria 1";
                    case 2 -> "Categoria 2";
                    case 3 -> "Categoria 3";
                    default -> "Grupo inválido";
                };
            } else if (idade >= 21 && idade <= 24) {
                categoria = switch (grupo) {
                    case 1 -> "Categoria 2";
                    case 2 -> "Categoria 3";
                    case 3 -> "Categoria 4";
                    default -> "Grupo inválido";
                };
            } else if (idade >= 25 && idade <= 34) {
                categoria = switch (grupo) {
                    case 1 -> "Categoria 3";
                    case 2 -> "Categoria 4";
                    case 3 -> "Categoria 5";
                    default -> "Grupo inválido";
                };
            } else if (idade >= 35 && idade <= 64) {
                categoria = switch (grupo) {
                    case 1 -> "Categoria 4";
                    case 2 -> "Categoria 5";
                    case 3 -> "Categoria 6";
                    default -> "Grupo inválido";
                };
            } else {
                categoria = switch (grupo) {
                    case 1 -> "Categoria 7";
                    case 2 -> "Categoria 8";
                    case 3 -> "Categoria 9";
                    default -> "Grupo inválido";
                };
            }
            System.out.printf("Nome: %s%nIdade: %d%nCategoria: %s%n", nome, idade, categoria);
        }

        scanner.close();
    }
}
