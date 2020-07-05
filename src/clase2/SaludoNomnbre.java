package clase2;

 //Escriba un método que le pregunte a un usuario su nombre,
 // luego lo saluda por su nombre.


import java.util.Scanner;

public class SaludoNomnbre {

    private static String apellidos = "Agurto";

    public static void main(String[] args) {

        System.out.println("Ingrese su nombre");
        Scanner scanner = new Scanner(System.in);
        String nombre1 = scanner.next();
        scanner.close();

        saludarUsuario(nombre1);
        String mensaje = getMensaje(nombre1);
        System.out.println(mensaje);
    }

    public static void saludarUsuario(String nombre){
        //Saludar al Usuario

        System.out.println("Hola, "+nombre+ " "+apellidos);

    }

    public static String getMensaje(String nombre){
        //Bienvenida
        String mensaje = "Bienvenido, "+nombre+ apellidos;
        return mensaje;
    }
}