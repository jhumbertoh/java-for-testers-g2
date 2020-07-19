package clase5;

public class TipoDeDatos {

    public static void main(String[] args) {
        int numero1 = 5;

        Integer numero2 = 5;

        double[] numeros = {1.5, 3.99, 45.5, 222.6};

        for(Double numero: numeros){
            System.out.println(numero.intValue());
        }
    }

}
