import java.util.Scanner;

public class ServicoMilitar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aptos = 0;
        int inaptos = 0;

        System.out.print("Digite o número de pessoas: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Sexo (M/F): ");
            String sexo = scanner.nextLine().toUpperCase();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Saúde (B para boa / R para ruim): ");
            String saude = scanner.nextLine().toUpperCase();

            if (sexo.equals("M") && idade >= 18 && saude.equals("B")) {
                System.out.println(nome + " está apto para o serviço militar.");
                aptos++;
            } else {
                System.out.println(nome + " não está apto para o serviço militar.");
                inaptos++;
            }
        }

        System.out.println("Total aptos: " + aptos);
        System.out.println("Total inaptos: " + inaptos);
        scanner.close();
    }
}
