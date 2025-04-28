public class Potencia {

    public static double calcularPotencia(double x, int z) {
        return Math.pow(x, z);
    }

    public static void main(String[] args) {
        System.out.println("Resultado: " + calcularPotencia(2, 3));
    }
}
