import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double celsio , Fahrenheit  ;


        Scanner leia = new Scanner(System.in);

        System.out.println("temperatura em celsio : " );
         celsio = leia.nextDouble();

        Fahrenheit  = (9 * celsio +160) / 5;

        System.out.println("a temperatura convertida e : " + Fahrenheit + "F");

    }
}