package clase4;

/*
    Ejercicio: Crear una aplicación que genere un ticket de lotería
    con 6 números aleatorios entre 1 – 69.
    1 | 2 | 56 | 5 | 23 | 12 |
 */

import java.util.Arrays;
import java.util.Random;

public class TicketLoteriaBusquedas {

    private static final int LONGITUD = 6;
    private static final int MAXIMO_NUMERO_TICKET = 69;

    public static void main(String[] args) {


        int[] ticket = generarNumeros();
        imprimirTicketLoteria(ticket);
    }

    public static int[] generarNumeros(){

        int[] ticketLoteria = new int[6];

        Random random = new Random();

        for (int i=0; i<LONGITUD; i++){

            int numeroRamdom;

            /*
                Generar un número ramdom y luego buscar para asegurar de
                que no existe en la matriz. Si existe, generar uno nuevo y buscar nuevo.
             */

            do{
                numeroRamdom = random.nextInt(MAXIMO_NUMERO_TICKET) + 1;
            } while (buscar(ticketLoteria, numeroRamdom));

            ticketLoteria[i] = numeroRamdom;
        }

        return ticketLoteria;
    }

    private static boolean buscar(int[] array, int numeroBuscar) {
            /*
              Esto llama a un bucle ,
              Se itera a traves de 'array' y cada vez asigna el elemento actual a
              'valor'.
             */

            for (int valor : array){
                if(valor == numeroBuscar){
                    return true;
                }
            }

            /*
            SI HEMOS LLEGADO A ESTE PUNTO, SE BUSCÓ EN TODA LA MATRIZ
            Y EL VALOR NO FUE ENCONTRADO
             */
            return false;
    }

    public static boolean busquedaBinaria(int[] array, int numeroABuscar){

        //El arreglo se debe ordenar primero
        Arrays.sort(array);

        int index = Arrays.binarySearch(array, numeroABuscar);
        if(index >=0){
            return true;
        }else return false;
    }

    public static void imprimirTicketLoteria(int ticket[]){

        for (int i=0; i<ticket.length; i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}