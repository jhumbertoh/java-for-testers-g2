package clase3;

public class CalcularAreaRectangulo {

    public static void main(String[] args) {

        /**
         * Rectangulo 1
         */
        //Crear la instancia del rectangulo 1
        Rectangulo rectangulo1 = new Rectangulo();

        System.out.println("Stop!");

        rectangulo1.setAncho(25);
        rectangulo1.setLargo(50);


        System.out.println("El ancho del rectangulo 1 es: " + rectangulo1.getAncho());
        System.out.println("El largo del rectangulo 1 es: " +rectangulo1.getLargo());

        double areaRectangulo1 = rectangulo1.calcularArea();
        double perimetroRectangulo1 = rectangulo1.calcularPerimetro();
        System.out.println("El area del rectangulo 1 es: " + areaRectangulo1);
        System.out.println("El perimetro del rectangulo 1 es: " + perimetroRectangulo1);

        //Calcular el perimetro del rectangulo 1


        /**
         * Rectangulo 2
         */
        Rectangulo rectangulo2 = new Rectangulo(30, 75);

        System.out.println("El ancho del rectangulo 2 es: " +rectangulo2.getAncho());
        System.out.println("El largo del rectangulo 2 es: " +rectangulo2.getLargo());

        double areaRectangulo2 = rectangulo2.calcularArea();
        double perimetroRectangulo2 = rectangulo2.calcularPerimetro();
        System.out.println("El area del rectangulo 2 es: " + areaRectangulo2);
        System.out.println("El perimetro del rectangulo 2 es: " + perimetroRectangulo2);

        double areaTotal = areaRectangulo1 + areaRectangulo2;
        double perimetroTotal = perimetroRectangulo1 + perimetroRectangulo2;


        //El Area total de los rectangulos
        System.out.println("El area total de los dos rectangulos es: " + areaTotal);

        //El Perimetro total de os rectangulos
        System.out.println("El perimetro total de los dos rectangulos es: " + perimetroTotal);
    }
}
