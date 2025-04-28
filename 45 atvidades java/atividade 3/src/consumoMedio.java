import java.util.Scanner;

public class consumoMedio {
    public static void main (String[] args) {

        Double distanciaP = 0.0 , combustivelG = 0.0  , consumoM = 0.0 ;

        Scanner leia = new Scanner(System.in);

        System.out.print("informe a distancia percorrida : " );
        distanciaP = leia.nextDouble();
        System.out.print("informe a quantidade de combustivel gasto : " );
        combustivelG = leia.nextDouble();

        consumoM = (distanciaP/combustivelG);

        System.out.print("o consumo medio foi de : " + consumoM );

    }

}