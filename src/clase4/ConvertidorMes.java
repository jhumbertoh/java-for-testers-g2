package clase4;

import java.util.Scanner;

public class ConvertidorMes {

    public static void main(String[] args) {

        //Debería mostrar "Febrero"
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número del mes a convertir");
        System.out.println(Mes.getMes(scanner.nextInt()));

        //Debería mostrar "1"
        System.out.println("Ingrese el nombre del mes a convertir");
        System.out.println(Mes.getMes(scanner.next()));

        scanner.close();
    }
}