package clase5;

import java.util.Scanner;

public class Calificaciones {

    private static int calificaciones[];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("¿Cuantas calificaciones usted desearía ingresar?");
        calificaciones = new int[scanner.nextInt()];

        getCalificaciones();

        System.out.println("Promedio: " + String.format("%.2f", calcularPromedio()));
        System.out.println("Mayor calificación: " + getMayorCalificacion());
        System.out.println("Menor calificación: " + getMenorCalificacion());
    }

    public static void getCalificaciones() {
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Ingresar calificación #" + (i + 1));
            calificaciones[i] = scanner.nextInt();
        }
    }

    public static int calcularSuma() {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma = suma + calificacion;
        }
        return suma;
    }

    public static double calcularPromedio() {
        return calcularSuma() / calificaciones.length;
    }

    //[1,2,3,4,5]
    public static int getMayorCalificacion() {
        int mayorCalificacion = calificaciones[0];
        for (int calificacion : calificaciones) {
            if (calificacion > mayorCalificacion) {
                mayorCalificacion = calificacion;
            }
        }
        return mayorCalificacion;
    }

    public static int getMenorCalificacion() {
        int menorCalificacion = calificaciones[0];
        for (int calificacion : calificaciones) {
            if (calificacion < menorCalificacion) {
                menorCalificacion = calificacion;
            }
        }
        return menorCalificacion;
    }
}
