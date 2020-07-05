package clase1;

/*
    Para calificar un préstamo, una persona debe ganar al menos S/2500
    y debe tener una experiencia laboral de al menos 2 años
    Mostrar un mensaje de Exito "Usted ha calificado para el préstamo" en caso aplica.
    Mostrar un mensaje en caso no tenga la experiencia profesional requerida
    Mostrar un mensaje en caso no gane al menos 2500
 */


import java.util.Scanner;

public class CalificarPrestamo {

    public static void main(String[] args) {

        //Inicializar los valores conocidos
        int salarioRequerido = 2500;
        int experienciaLaboralRequerida = 2;

        //Obtener los valores
        System.out.println("Ingresar su salario");
        Scanner scanner = new Scanner(System.in);
        double salario = scanner.nextDouble();

        System.out.println("Ingrese la cantidad de años de experiencia profesional");
        double años = scanner.nextDouble();

        scanner.close();

        //Realizar la comparación
        if (salario >= salarioRequerido) {
            if (años >= experienciaLaboralRequerida) {
                System.out.println("Felicitaciones! Usted ha calificado para el préstamo");
            } else {
                System.out.println("No cumple con la experiencia profesional requerida de " + experienciaLaboralRequerida + ".Ya que usted cuenta con solo " +
                        años + " años");
            }
        } else {
            System.out.println("Lo sentimos, debes ganar al menos " + salarioRequerido);
        }


        //Realizar la comparación
        /*if (salario >= salarioRequerido && años >= experienciaLaboralRequerida) {

                System.out.println("Calificó Prestamo");

        } else {
            System.out.println("No calificó");
        }*/
    }
}