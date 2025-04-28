
import java.util.Scanner;

public class ArquivoMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char escolha;

        // Loop infinito com for (i == 0, condição sempre verdadeira)
        for (int i = 0; i == 0; ) {
            System.out.println("Digite: N - Novo arquivo");
            System.out.println("Digite: A - Abrir arquivo");
            System.out.println("Digite: F - Fechar arquivo");
            System.out.println("Digite: S - Para sair");
            System.out.print("Digite sua opção: ");

            escolha = scanner.nextLine().toUpperCase().charAt(0); // Lê a primeira letra e transforma em maiúscula

            if (escolha == 'N') {
                System.out.println("Novo arquivo criado com sucesso!");
            } else if (escolha == 'A') {
                System.out.println("Abrindo arquivo!");
            } else if (escolha == 'F') {
                System.out.println("Arquivo fechado com sucesso!");
            } else if (escolha == 'S') {
                System.out.println("Obrigado por utilizar o sistema!");
                break; // Sai do laço
            } else {
                System.out.println("Valor incorreto");
            }
        }

        scanner.close();
    }
}
