import java.util.Scanner;

public class somadedoisnumeros {
    public static void main(String[] args) {

        double num1 = 0.0, num2 = 0.0, soma;


        Scanner leia = new Scanner(System.in);

        System.out.print("escreva um numero : ");
        num1 = leia.nextDouble();
        System.out.print("escreva um numero : ");
        num2 = leia.nextDouble();

        soma = (num1 + num2);
        System.out.println("a soma dos dois numeros e : " + soma);
    }