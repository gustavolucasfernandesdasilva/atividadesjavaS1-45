public class OrdenaNumeros {
    public static void ordenar(int a, int b, int c) {
        int menor = Math.min(a, Math.min(b, c));
        int maior = Math.max(a, Math.max(b, c));
        int meio = (a + b + c) - (menor + maior);

        System.out.printf("Ordem crescente: %d %d %d%n", menor, meio, maior);
    }

    public static void main(String[] args) {
        ordenar(5, 2, 8);
    }
}
