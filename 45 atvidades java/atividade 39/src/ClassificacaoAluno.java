import java.util.Scanner;

public class ClassificacaoAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Número de matrícula: ");
        int matricula = scanner.nextInt();

        System.out.print("Nota do trabalho de laboratório: ");
        double lab = scanner.nextDouble();

        System.out.print("Nota da avaliação semestral: ");
        double avaliacao = scanner.nextDouble();

        System.out.print("Nota do exame final: ");
        double exame = scanner.nextDouble();

        double mediaFinal = (lab * 2 + avaliacao * 3 + exame * 5) / 10;

        String classificacao;
        if (mediaFinal >= 8) {
            classificacao = "A";
        } else if (mediaFinal >= 7) {
            classificacao = "B";
        } else if (mediaFinal >= 6) {
            classificacao = "C";
        } else if (mediaFinal >= 5) {
            classificacao = "D";
        } else {
            classificacao = "R";
        }

        System.out.printf("Aluno: %s%nMatrícula: %d%nNota Final: %.2f%nClassificação: %s%n", nome, matricula, mediaFinal, classificacao);

        scanner.close();
    }
}
