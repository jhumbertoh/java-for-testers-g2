package clase4;

/*
    Ejercicio: Crear una aplicación que genere un ticket de lotería
    con 6 números aleatorios entre 1 – 69.
    1 | 2 | 56 | 5 | 23 | 12 |
 */

import java.util.Random;

public class TicketLoteria {

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

            //int i=1; i<=LONGITUD
            /*ticketLoteria[0] = 12;
            ticketLoteria[1] = 13;
            ticketLoteria[2] = 14;
            ticketLoteria[3] = 12;
            ticketLoteria[4] = 12;
            ticketLoteria[5] = 12;
            */

            ticketLoteria[i] = random.nextInt(MAXIMO_NUMERO_TICKET) + 1;
        }

        return ticketLoteria;
    }

    public static void imprimirTicketLoteria(int ticket[]){

        for (int i=0; i<ticket.length; i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}