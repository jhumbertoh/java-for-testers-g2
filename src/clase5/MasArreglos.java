package clase5;

public class MasArreglos {

    public static void main(String[] args) {

        //Errores comunes
        String[] empleados = new String[3];
        empleados[5] = "Empleado 5";

        String[] otrosEmpleados = {"Javier", "Francisco", "Alex"};
        for(int i=0; i<4; i++){
            System.out.println("Hola " + otrosEmpleados[i]);
        }

        //Arreglos de objetos
        Estudiante estudiantes[] = new Estudiante[20];
        estudiantes[0] = new Estudiante("Julio Sanchez");
        estudiantes[1] = new Estudiante("Gisella");

        //Arreglos multidimensionales
        int[][] calificaciones = new int[24][4];

    }
}
