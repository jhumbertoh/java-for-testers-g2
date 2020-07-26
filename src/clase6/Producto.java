package clase6;

public interface Producto {

    double getPrecio();
    void setPrecio(double precio);

    String getNombre();
    void setNombre(String nombre);

    String getColor();
    void setColor(String color);

    default String getCodigoBarras(){
        return "no tiene código de barras";
    }
}
