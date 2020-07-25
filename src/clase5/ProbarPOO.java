package clase5;

public class ProbarPOO {

    public static void main(String[] args) {

        /*Mujer mujer = new Mujer();
        mujer.setEdad(19);
        mujer.setNombre("Micaela");

        System.out.println("Mujer: " +mujer.toString());*/

        Madre madre = new Madre();
        madre.setNombre("Rosa");

        System.out.println(madre.getNombre() + " es de género "+ madre.getGenero());

        //testCuadradoOverride();
        //testOverload();

    }

    public static void testCuadradoOverride(){

        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setLargo(4);
        rectangulo.setAncho(8);
        System.out.println(rectangulo.calcularPerimetro());

        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLargo(4);
        cuadrado.setAncho(8);
        System.out.println(cuadrado.calcularPerimetro());

    }

    public static void testOverload(){
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.imprimir();

        Cuadrado cuadrado = new Cuadrado();
        cuadrado.imprimir("cuadrado");
    }


    public static void testHerencia(){
        Empleado empleado = new Empleado();
        empleado.setNombre("Javier");
        empleado.setEdad(30);
        empleado.setGenero("Masculino");
        empleado.setIdEmpleado("0512007063");
        empleado.setCargo("QA Automation Engineer");

        System.out.println("Empleado: " + empleado.toString());

        System.out.println("Nombre empleado: " + empleado.getNombre());
        System.out.println(" Edad: " + empleado.getEdad());
        System.out.println(" Genero: " + empleado.getGenero());
        System.out.println(" IdEmpleado: " + empleado.getIdEmpleado());
        System.out.println(" Cargo: " + empleado.getCargo());
    }
}
