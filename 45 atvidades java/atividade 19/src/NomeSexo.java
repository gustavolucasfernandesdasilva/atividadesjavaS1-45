import java.util.Scanner;

public class NomeSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalHomens = 0;
        int totalMulheres = 0;

        for (int i = 1; i <= 56; i++) {
            System.out.print("Digite o nome da " + i + "ª pessoa: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o sexo (M/F): ");
            String sexo = scanner.nextLine().toUpperCase();

            if (sexo.equals("M")) {
                System.out.println(nome + " é Homem.");
                totalHomens++;
            } else if (sexo.equals("F")) {
                System.out.println(nome + " é Mulher.");
                totalMulheres++;
            } else {
                System.out.println("Sexo inválido.");
            }
        }

        System.out.println("Total de homens: " + totalHomens);
        System.out.println("Total de mulheres: " + totalMulheres);
        scanner.close();
    }
}
