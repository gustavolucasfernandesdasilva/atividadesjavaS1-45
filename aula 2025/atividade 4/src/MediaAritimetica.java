import java.util.Scanner;

public class MediaAritimetica {
    public static void main(String[] args) {

        Double  Nota1 = 0.0 , Nota2 = 0.0, Nota3 = 0.0 ;
        String  nome ;

        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva o nome  : " );
        nome = ler.nextLine();
        System.out.println("Escreva a primeira nota : " );
        Nota1 = ler.nextDouble();
        System.out.println("Escreva a segunda nota : " );
        Nota1 = ler.nextDouble();
        System.out.println("Escreva a terceira nota : " );
        Nota1 = ler.nextDouble();

        Double NotaMedia = (Nota1+Nota2+Nota3) / 3;;
        System.out.println(" Nome : " + nome + " nota : " + NotaMedia );


    }



}