package clase3;

public class Rectangulo {

    private double largo;
    private double ancho;

    public Rectangulo() {
        this.ancho = 0;
        this.largo = 0;
    }

    public Rectangulo(double largo, double ancho) {
        this.largo = largo; // Forma 1
        setAncho(ancho); // Forma 2
    }

    public Rectangulo(double largo) {
        this.largo = largo;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double calcularArea() {
        return largo * ancho;
    }

    public double calcularPerimetro() {

        return (2 * largo) + (2 * ancho);
    }
}