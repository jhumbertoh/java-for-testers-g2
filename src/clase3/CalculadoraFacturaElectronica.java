package clase3;

import java.util.Scanner;

public class CalculadoraFacturaElectronica {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar el costo base del plan");
        double costoBase = scanner.nextDouble();

        System.out.println("Ingresar el exceso de minutos:");
        double minutosExtra = scanner.nextDouble();

        scanner.close();

        double cargoExtra = calcularExcedentes(minutosExtra);
        double montoIgv = calcularIgv(costoBase + cargoExtra);

        calcularImprimirFactura(costoBase, cargoExtra, montoIgv);
    }

    private static void calcularImprimirFactura(double costoBase, double cargoExtra, double montoIgv) {

        double totalFinal = costoBase + cargoExtra + montoIgv;

        System.out.println("Detalle de Factura Telefónica");
        System.out.println("Plan: S/" + String.format("%.2f",costoBase));
        System.out.println("Cargo extra: S/" + String.format("%.2f",cargoExtra));
        System.out.println("Monto IGV: S/" + String.format("%.2f",montoIgv));
        System.out.println("Total: S/" + String.format("%.2f",totalFinal));
    }

    private static double calcularExcedentes(double minutosExtra) {
        double tasa = 0.25;
        double exceso = minutosExtra * tasa;
        return exceso;
    }

    private static double calcularIgv(double subTotal) {
        double igvTasa = 0.18;
        double montoIgv = subTotal * igvTasa;
        return montoIgv;
    }
}