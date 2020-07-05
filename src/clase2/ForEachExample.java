package clase2;

public class ForEachExample {

    public static void main(String[] args) {

        String[] nombres = new String[3];
        nombres[0] = "José";
        nombres[1] = "Alex";
        nombres[2] = "Francisco";

        for(String nombre: nombres){
            System.out.println(nombre + ", ");
        }

        /*String nombres2 = "Jose";

        for(String nombre: nombres2){
            System.out.println(nombre + ", ");
        }*/

        /*
        String[] nombres3 = new String[3];

        for(String nombre: nombres3){
            System.out.println(nombre + ", ");
        }
        */

        int[] valores = new int[3];
        valores[0] = 10;
        valores[1] = new Integer(5);
        valores[2] = 15;

        for(int i=1; i<valores.length; i++){
            System.out.println((valores[i] - valores[i+1]) + ", ");
        }
    }
}
