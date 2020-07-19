package clase5;

public class ProbarPOO {

    public static void main(String[] args) {

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

        Mujer mujer = new Mujer();
        mujer.setEdad(19);
        mujer.setNombre("Micaela");

        System.out.println("Mujer: " +mujer.toString());
    }
}
