package clase1;

//Si mi puntaje es menor a 60 - El grado es E
//Si mi puntaje es menor a 70 - El grado es D
//Si mi puntaje es menor a 80 - El grado es C
//Si mi puntaje es menor a 90 - El grado es B
//Si mi puntaje es no cumple ninguna de las condiciones el grado es A

import java.util.Scanner;

public class ResultadoGrado {

    public static void main(String[] args) {

        //Obtener el puntaje de la prueba
        System.out.println("Ingresar el puntaje de la prueba:");
        Scanner scanner = new Scanner(System.in);
        double puntaje = scanner.nextDouble();
        scanner.close();

        char grado;

        if (puntaje < 60) {
            grado = 'E';
        } else if (puntaje < 70) {
            grado = 'D';
        } else if (puntaje < 80) {
            grado = 'C';
        } else if (puntaje < 90) {
            grado = 'B';
        } else {
            grado = 'A';
        }

        System.out.println("Su grado es: " + grado);
    }
}