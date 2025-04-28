public class SerieFatorial {

    public static double calcularSerie(int n) {
        double s = 1.0;
        for (int i = 1; i <= n; i++) {
            s += 1.0 / fatorial(i);
        }
        return s;
    }

    private static int fatorial(int num) {
        int fat = 1;
        for (int i = 2; i <= num; i++) {
            fat *= i;
        }
        return fat;
    }

    public static void main(String[] args) {
        System.out.printf("Valor de S: %.4f%n", calcularSerie(5));
    }
}
