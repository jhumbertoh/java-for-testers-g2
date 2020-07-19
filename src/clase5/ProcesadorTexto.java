package clase5;

public class ProcesadorTexto {

    public static void main(String[] args) {
        contarPalabras("A mi me gusta la automatización de pruebas");

        revertirString("quiero una manzana");

        agregarEspacios("Hola!EstamosAutomatizandoElMundo!");
    }

    public static void contarPalabras(String texto) {

        String[] palabras = texto.split(" ");
        int numeroDePalabras = palabras.length;

        String message = String.format("Su texto contiene %d palabras: ", numeroDePalabras);
        System.out.println(message);

        //System.out.println("Su texto contiene " + numeroDePalabras + " :");

        for (int i = 0; i < numeroDePalabras; i++) {
            System.out.println(palabras[i]);
        }
    }

    public static void revertirString(String texto) {
        System.out.println("Longitud del texto: " + texto.length());
        System.out.println("Posicion 0 del texto: " + texto.charAt(5));

        //quiero una manzana
        for (int i = texto.length() - 1; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }
    }


    //Hola!EstamosAutomatizandoElMundo!
    public static void agregarEspacios(String texto) {

        StringBuilder textoModificado = new StringBuilder(texto);

        for (int i = 0; i < textoModificado.length(); i++) {
            if (i!=0 && Character.isUpperCase(textoModificado.charAt(i))) {
                textoModificado.insert(i, " ");
                i++;
            }
        }

        System.out.println(textoModificado);
    }
}