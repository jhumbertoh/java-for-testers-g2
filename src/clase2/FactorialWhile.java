package clase2;

import java.util.Scanner;

public class FactorialWhile {

    //5!  = 1*2*3*4*5 = 120

    public static void main(String[] args) {

        System.out.println("Ingresa el número a calcular: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        sc.close();

        long factorial = 1; // Factorial se inicializa a 1
        int i = 1; // El valor inicial de i es 1

        while (i <= numero){
            factorial = factorial * i;
            i++;
        }

        System.out.println("El factorial de " + numero + " es " +factorial);
    }
}