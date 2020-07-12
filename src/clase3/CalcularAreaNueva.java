package clase3;

//Ejemplo: Escribamos una clase “CalcularAreaNueva” que
// calcule el area de un baño y una cocina y muestre en pantalla el area total de las habitaciones
// . La Clase debe tener un método que me devuelva un rectangulo y otro método que calcule el
// area total del baño y cocina, este método debe recibir como parámetro dos rectangulos.

import java.util.Scanner;

public class CalcularAreaNueva {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        CalcularAreaNueva calcularAreaNueva = new CalcularAreaNueva();

        Rectangulo cocina = calcularAreaNueva.getRectangulo("cocina");
        Rectangulo baño = calcularAreaNueva.getRectangulo("baño");

        double area = calcularAreaNueva.calcularAreaTotal(cocina, baño);

        System.out.println("El area total es: " + area);

        calcularAreaNueva.scanner.close();
    }

    public Rectangulo getRectangulo(String nameRectangulo) {

        System.out.println("Ingrese el largo de " + nameRectangulo + ": ");
        double largo = scanner.nextDouble();

        System.out.println("Ingrese el ancho de " + nameRectangulo + ": ");
        double ancho = scanner.nextDouble();

        /*Rectangulo rectangulo = new Rectangulo(largo, ancho);
        return rectangulo;*/

        return new Rectangulo(largo, ancho);
    }

    public double calcularAreaTotal(Rectangulo rectangulo1, Rectangulo rectangulo2) {

        /*double areaTotalR1 = rectangulo1.calcularArea();
        double areaTotalR2 = rectangulo2.calcularArea();
        double areaTotal = areaTotalR1 + areaTotalR2;

        return areaTotal;*/

        return rectangulo1.calcularArea() + rectangulo2.calcularArea();
    }
}