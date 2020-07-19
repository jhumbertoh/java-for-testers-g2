package clase5;

public class Empleado extends Persona{

    private String idEmpleado;

    private String cargo;

    public Empleado() {
        //super("Jose");
    }

    /*public Empleado(){

    }

    public Empleado(String idEmpleado, String cargo) {
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
    }*/

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "Nombre='" + getNombre() + '\'' +
                "Genero='" + getGenero() + '\'' +
                "Edad='" + getEdad() + '\'' +
                "idEmpleado='" + idEmpleado + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
