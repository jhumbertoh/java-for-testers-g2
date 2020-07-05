package clase1;

import java.util.Scanner;

public class ResultadoGradoMensaje {

    public static void main(String[] args) {

        //Obtener el grado
        System.out.println("Ingresar el grado: ");
        Scanner scanner = new Scanner(System.in);
        String grado = scanner.next();

        scanner.close();

        String mensaje;

        switch (grado.toUpperCase()){
            case "A":
                mensaje = "!Excelente trabajo!, su puntaje es más de 90";
                break;
            case "B":
                mensaje = "Gran Trabajo!, su puntaje es menor a 90 y mayor a 80";
                break;
            case "C":
                mensaje = "Buen Trabajo!, su puntaje es menor a 80 y mayor a 70";
                break;
            case "D":
                mensaje = "Necesitas Trabajar!, su puntaje es mennor a 70 y mayor a 60";
                break;
            case "E":
                mensaje = "No!, su puntaje es mennor a 60";
                break;
            default:
                mensaje = "!Error!, grado inválido";
        }
        System.out.println(mensaje);
    }
}