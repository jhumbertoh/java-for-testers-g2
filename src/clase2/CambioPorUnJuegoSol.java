package clase2;

import java.util.Scanner;

public class CambioPorUnJuegoSol {

    public static void main(String[] args) {

        double unCentimo = 0.01;
        double cincoCentimos = 0.05;
        double diezCentimos = 0.10;
        double veinteCincoCentimos = 0.25;

        int sol = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al juego 'Cambio por un SOl'! " +
                "Su meta es ingresar suficiente cambio para hacer exactamente S/1.00");

        System.out.println("Ingresar sus monedas de 0.01 :");
        int numDeUnCentimo = scanner.nextInt();

        System.out.println("Ingresar sus monedas de 0.05 :");
        int numDeCincoCentimos = scanner.nextInt();

        System.out.println("Ingresar sus monedas de 0.10 :");
        int numDeDiezCentimos = scanner.nextInt();

        System.out.println("Ingresar sus monedas de 0.25 :");
        int numDeVeinteCincoCentimos = scanner.nextInt();

        scanner.close();

        double total = numDeUnCentimo * unCentimo + numDeCincoCentimos * cincoCentimos + numDeDiezCentimos * diezCentimos + numDeVeinteCincoCentimos * veinteCincoCentimos;

        if (total < sol) {
            double montoFalta = sol - total;
            System.out.println("Lo siento, perdiste Te falta " + String.format("%.2f",montoFalta) + " céntimos.");
        } else if (total > sol) {
            double montoExcede = total - sol;
            System.out.println("Lo siento, perdiste! Te has excedido en " + String.format("%.2f",montoExcede) + " céntimos.");
        } else {
            System.out.println("Muy bien! !Es exactamente " + total + " !Ganaste!");
        }
    }
}