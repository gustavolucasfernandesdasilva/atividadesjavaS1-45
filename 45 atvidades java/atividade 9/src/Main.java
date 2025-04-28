import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Double valor , valorRendimento , juros ;

        juros = 0.70;


        Scanner leia = new Scanner(System.in);

        System.out.println(" deposite valor :");
        valor = leia.nextDouble();

        System.out.println(" valor depositado : " + valor );

        valorRendimento = (valor * juros ) + valor ;

        System.out.println(" valor do rendimento : " + valorRendimento );

    }
}