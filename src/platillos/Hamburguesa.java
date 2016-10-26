package platillos;

/**
 * Created by Angelus on 21/10/2016.
 */
public class Hamburguesa extends Platillo {

    private String tipo;

    public Hamburguesa(String nombre) {
        super(nombre);
    }

    public Hamburguesa(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Hamburguesa{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
