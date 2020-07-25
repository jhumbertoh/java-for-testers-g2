package clase5;

public class Rectangulo {

    protected double largo;
    protected double ancho;
    protected double lados = 4;

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

    public double getLados() {
        return lados;
    }

    public void setLados(double lados) {
        this.lados = lados;
    }

    public double calcularPerimetro() {
        return (2 * largo) + (2 * ancho);
    }

    public void imprimir() {
        System.out.println("Yo soy un rectángulo");
    }
}
