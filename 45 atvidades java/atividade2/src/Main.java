import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     Double num1 = 0.0 , num2 = 0.0  , soma , mult , divi , subt ;


     Scanner leia = new Scanner(System.in);

         System.out.println("escreva o pemeiro numero");
         num1 =  leia.nextDouble();
         System.out.println("escreva o segundo numero");
         num2 = leia.nextDouble();

         soma = (num1+num2);
         mult = (num1*num2);
         divi = (num1/num2);
         subt = (num1-num2);

        System.out.println("escreva a soma do numero : " + soma );
        System.out.println("escreva a multiplicacao do numero : " + mult );
        System.out.println("escreva a divisao  do numero : " + divi );
        System.out.println("escreva a subtracao do 5numero : " + subt);



    }
}
