import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double valorP , ValorParcelado;

        Scanner leia = new Scanner(System.in);
        System.out.print("informe o valor do produto " );
        valorP = leia.nextDouble();


        ValorParcelado = valorP / 5 ;

        System.out.print("esse e o valor divido em 5 prestacoes : " + ValorParcelado );


    }
}