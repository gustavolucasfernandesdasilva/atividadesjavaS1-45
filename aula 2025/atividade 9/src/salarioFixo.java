import java.util.Scanner;

public class salarioFixo {
    public static void main(String[] args) {

        Double salario = 0.0, salarioFinal = 0.0, vendas = 0.0, comissao = 0.0;
        String nome;

        comissao = 0.15;

        Scanner ler = new Scanner(System.in);


        System.out.println("leia o valor do salario");
        salario = ler.nextDouble();
        System.out.println("leia o valor do Vendas");
        vendas = ler.nextDouble();
        System.out.println("leia o nome");
        ler.nextLine();
        nome = ler.nextLine();

        salarioFinal = (vendas * comissao) + salario;

        System.out.println(" Nome : " + nome);
        System.out.print(" salario do final do mes : " + salarioFinal);

    }
}