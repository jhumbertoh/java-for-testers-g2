package clase1;

import java.util.Scanner;

public class MesNumero {

    //Paso 1: Obtener un numero del Mes

    //Paso 2: Obtener el nombre del Mes

    //Paso 3: Mostrar la concatenacion de ambos "El Mes 1 es  Enero"


    public static void main(String[] args) {

        //paso 1:es obtener el número del mes
        System.out.println("¿Cuál es el numero del mes?");
        Scanner scanner= new Scanner(System.in); //es scanner es para el robot lea el valor que yo ingreso por pantalla
        int numero=scanner.nextInt(); //una vez q lo lee, lo guarda en variable horas.


        //Paso 2: Obtener el nombre de mes
        System.out.println("¿Cuá es el nombre del mes?");
        String nombre= scanner.next();

        scanner.close();

        //Paso 3: Mostrar la concanetación de ambos

        System.out.println("El mes "+numero+" es " +nombre);

    }
}
