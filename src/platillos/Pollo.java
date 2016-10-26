package platillos;

/**
 * Created by Angelus on 21/10/2016.
 */
public class Pollo extends Platillo {

    public Pollo(String nombre) {
        super(nombre);
    }

    public static enum Piezas {Ala,Muslo,Pierna,Huacal,Pechuga,Cabeza,Patas};
    private Piezas pieza;

    public Pollo(String nombre, Piezas pieza) {
        super(nombre);
        this.pieza = pieza;
    }

    public Piezas getPieza() {
        return pieza;
    }

    public void setPieza(Piezas pieza) {
        this.pieza = pieza;
    }

    @Override
    public String toString() {
        return "Pollo{" +
                "pieza=" + pieza.toString() +
                '}';
    }
}
