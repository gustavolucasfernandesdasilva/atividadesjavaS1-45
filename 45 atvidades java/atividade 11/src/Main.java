import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      float valorProduto , porcentagem , valorFinal;

        Scanner leia = new Scanner(System.in);

          System.out.println("valor do produto " );
          valorProduto = leia.nextFloat();

          System.out.println("valor da porcentagem " );
          porcentagem = leia.nextFloat();

         valorFinal = (porcentagem+valorProduto);

        System.out.println("valor final do produto : " + valorFinal + "R$" );

    }
}