package platillos;

/**
 * Created by Angelus on 21/10/2016.
 */
public class Pizza extends Platillo  {
    private String combinacion;

    public Pizza(String nombre, String combinacion) {
        super(nombre);
        this.combinacion = combinacion;
    }

    public Pizza(String nombre) {
        super(nombre);
    }

    public String getCombinacion() {
        return combinacion;
    }

    public void setCombinacion(String combinacion) {
        this.combinacion = combinacion;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "combinacion='" + combinacion + '\'' +
                '}';
    }
}
