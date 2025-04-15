public class tabuada {
    public static void main(String[] args) {

        Double num , conta , resultado;

        conta = 5.0 ;
        num = 1.0;

        while  (num <= 10)  {
            resultado = (conta * num );
            System.out.println("escreva resultado " + resultado);
            num = (num+1) ;
        }

    }
}