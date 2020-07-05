package clase2;

import java.util.Scanner;

public class PuntajesPruebaPromedio {

    //Ingresar por pantalla el puntaje de cada prueba de un estudiante
    //En total son 4 pruebas, luego ingresar las 4 se debe calcular el promedio de estas y mostrarse en pantalla.
    //Asi sucesivamente hasta competar los 5 estudiantes.

    // Valores fijos:
    //#Numero estudiantes = 5
    //#Numero pruebas = 4

    public static void main(String[] args) {

        //Inicializar los valores conocidos
        int numeroDeEstudiantes = 5;
        int numeroDePruebas = 4;

        Scanner scanner = new Scanner(System.in);

        //Procesar a todos los estudiantes
        for (int i=0; i<numeroDeEstudiantes; i++){
            double total = 0;
            for (int j=0; j<numeroDePruebas; j++){
                System.out.println("Ingrese el puntaje de la prueba #" +(j+1));
                double puntaje = scanner.nextDouble();
                total = total + puntaje;
            }

            double promedio = total/numeroDePruebas;
            System.out.println("El promedio del examen para el estudiante #" +(i+1) + " es " + promedio);
        }

        scanner.close();

    }

}