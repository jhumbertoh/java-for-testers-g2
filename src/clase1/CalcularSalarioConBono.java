package clase1;

/*
Todos los vendedores reciben un pago de S/1000.00 por semana.
Los vendedores que superen las 10 ventas obtienen un bono adicional de S/250.00
 */

import java.util.Scanner;

public class CalcularSalarioConBono {

    public static void main(String[] args) {

        //Inicializar los valores conocidos
        double salario = 1000;
        double bono = 250;
        int ventasTope = 10;

        //Obtener los valores
        System.out.println("¿Cuántas ventas hizo el vendedor esta semana?");
        Scanner obtenerVentas = new Scanner(System.in);
        int numeroVentas = obtenerVentas.nextInt();
        obtenerVentas.close();

        //Comparar quienes superan las ventas
        if (numeroVentas > ventasTope) {
            salario = salario + bono;
        }

        //Mostrar Los resultados
        System.out.println("El pago del vendedor es S/" + salario);
    }
}