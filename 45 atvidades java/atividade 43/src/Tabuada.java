public class Tabuada {

    public static void tabuada(int n, String operador, int t) {
        for (int i = 1; i <= t; i++) {
            int resultado = switch (operador.toLowerCase()) {
                case "soma" -> n + i;
                case "subtracao" -> n - i;
                case "multiplicacao" -> n * i;
                case "divisao" -> i != 0 ? n / i : 0;
                default -> 0;
            };
            System.out.printf("%d %s %d = %d%n", n, operador, i, resultado);
        }
    }

    public static void main(String[] args) {
        tabuada(5, "soma", 10);
    }
}
