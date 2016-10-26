package platillos;

/**
 * Created by Angelus on 21/10/2016.
 */
public class Papas extends Platillo {

    private String forma;

    public Papas(String nombre) {
        super(nombre);
    }

    public Papas(String nombre, String forma) {
        super(nombre);
        this.forma = forma;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    @Override
    public String toString() {
        return "Papas{" +
                "forma='" + forma + '\'' +
                '}';
    }
}
