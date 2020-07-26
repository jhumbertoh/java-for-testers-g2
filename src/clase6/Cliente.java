package clase6;

public class Cliente {

    public static void main(String[] args) {

        Producto libro = new Libro();
        libro.setPrecio(10.99);
        libro.setNombre("El Principito");
        libro.setColor("Amarillo");

        ((Libro)libro).setAutor("Jorge Ramirez");
        ((Libro)libro).setPaginas(345);
        ((Libro)libro).setIsbn("23232332454554545");


    }
}
