import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

          double dolar , cotacao , conversao;

        Scanner leia = new Scanner(System.in);

        System.out.println("quantia em dolar: " );
        dolar = leia.nextDouble();
        System.out.println("cotacao do dolar: " );
        cotacao  = leia.nextDouble();


        conversao = (dolar*cotacao);
        System.out.println(" valor convertido e: " + conversao + "R$" );
    }
}