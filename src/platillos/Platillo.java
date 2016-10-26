package platillos;

/**
 * Created by Angelus on 21/10/2016.
 */
public class Platillo {

    public static int numPlatillosOrdenados=0;
    public static int numNumPlatillosMenu=0;

    private String nombre;
    private float precio=0.0f;

    public Platillo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Platillo{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
