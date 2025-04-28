import java.util.Scanner;

public class CustoConsumidorCarro {
    public static void main(String[] args) {

        double custoFabrica , percentualImpostos , percentualDistribuidor ,  custoConsumidor , custoComImpostos ;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: R$ ");
         custoFabrica = scanner.nextDouble();


        percentualImpostos = 0.45;    // 45% de impostos
         percentualDistribuidor = 0.28; // 28% do distribuidor


         custoComImpostos = custoFabrica + (custoFabrica * percentualImpostos);


        custoConsumidor = custoComImpostos + (custoComImpostos * percentualDistribuidor);


        System.out.printf("O custo ao consumidor do carro é: R$ %.2f%n", custoConsumidor);

        scanner.close();
    }
}
