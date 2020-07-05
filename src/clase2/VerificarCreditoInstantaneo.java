package clase2;

import java.util.Scanner;

/*
 * Escriba un programa de "verificación de crédito instantánea" que apruebe
 * cualquier persona que gane
 * más de S/ 25,000 y tenga un score de crédito de 700 o mejor.
 * Rechaza a todos los demás.
 * Variales globales : salario(double), score(int), scanner
 *
 * //Se van a llamar desde el metodo void main
 * Metodo que va a devolver un Booleano ( true, false) , verificar si el usuario califica
 * Metodo que va a notificar al Usuario
 *
 * Un Metodo que va a preguntar por pantalla el salario y lo va a devolver
 * Un Metodo que va a preguntar por pantalla el score crediticio y lo va devolver
 *
 */
public class VerificarCreditoInstantaneo {

    //Declaración de variables globales

    private static int salarioRequerido = 25000;
    private static int scoreCrediticio = 700;
    private static  Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        double salario = getSalario();
        int score = getScoreCrediticio();

        scanner.close();

        //Verificar si el usario esta calificado o no
         boolean califica = esUsuarioCalificado(salario, score);

        //Notificar al usuario
        notificarUsuario(califica);

    }

    public  static double getSalario(){
        System.out.println("Ingresar su salario");
        double salario = scanner.nextDouble();
        return salario;
    }

    public static  int getScoreCrediticio(){
        System.out.println("Ingresar su score crediticio");
        int score = scanner.nextInt();
        return score;
    }

    public static boolean esUsuarioCalificado(double salario, int score){
        if(score >= scoreCrediticio && salario >= salarioRequerido)
            return getTrue();
        else
            return false;
    }

    public static boolean getTrue(){
        return true;
    }

    public static void notificarUsuario(boolean califica){
        //Muestra mensaje
        if (califica){
            System.out.println("Felicitaciones! Usted califica a un crédito");
        }
        else{
            System.out.println("Lo sentimos. Usted no califica a un crédito");
        }
    }
}