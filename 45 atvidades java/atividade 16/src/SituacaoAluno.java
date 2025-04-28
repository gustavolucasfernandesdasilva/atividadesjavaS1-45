import java.util.Scanner;

public class SituacaoAluno {
    public static void main(String[] args) {

        double nota1 , nota2 , nota3 ,media;

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();


        System.out.print("Digite a primeira nota: ");
         nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
         nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
         nota3 = scanner.nextDouble();


         media = (nota1 + nota2 + nota3) / 3;

        // Exibe o nome, a média e a situação do aluno
        System.out.printf("Aluno: " + nome);
        System.out.printf("Média: " + media);

        if (media >= 7.0) {
            System.out.println("Situação: Aprovado");
        } else if (media <= 5.0) {
            System.out.println("Situação: Reprovado");
        } else {
            System.out.println("Situação: Recuperação");
        }

        scanner.close();
    }
}
