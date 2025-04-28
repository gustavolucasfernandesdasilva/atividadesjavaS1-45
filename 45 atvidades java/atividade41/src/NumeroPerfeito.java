public class NumeroPerfeito {

    public static boolean ehPerfeito(int num) {
        int soma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                soma += i;
            }
        }
        return soma == num;
    }

    public static void main(String[] args) {
        int numero = 6;
        System.out.println("É perfeito? " + ehPerfeito(numero));
    }
}
