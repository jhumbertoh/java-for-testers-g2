package clase2;

import java.util.Scanner;

public class FactorialFor {

    public static void main(String[] args) {

        System.out.println("Ingresa el número a calcular: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int factorial = 1;

        sc.close(); //streams , parallel stream

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println("EL factorial de " + n + " es " + factorial);
    }
}
