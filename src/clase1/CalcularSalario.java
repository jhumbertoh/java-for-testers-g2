package clase1;

import java.util.Scanner;

public class CalcularSalario {

    public static void main(String args[]){

        //Paso 1 : Obtener las horas trabajadas
        System.out.println("¿Cuantas horas ha trabajado el empleado?");
        Scanner scanner = new Scanner(System.in);
        int horas = scanner.nextInt();

        //Paso 2: Obtener la tarifa de Pago por hora
        System.out.println("¿Cuál es la tarifa de pago por hora?");
        double tarifa = scanner.nextDouble();

        scanner.close();

        //Paso 3: Multiplar las horas y la tasa de pago
        double sueldo =  Math.round (horas * tarifa);

        //Paso 4: Mostrar el resultado
        System.out.println("El Salario calculado es:" +sueldo);
    }
}