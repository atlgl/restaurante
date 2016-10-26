package platillos;

/**
 * Created by Angelus on 21/10/2016.
 */
public class Milaneza extends Platillo {
    public static enum Terminos {Medio,Cocido,Tostado,Normal};

    private Terminos termino;

    public Milaneza(String nombre) {
        super(nombre);
    }

    public Milaneza(String nombre, Terminos termino) {
        super(nombre);
        this.termino = termino;
    }

    public Terminos getTermino() {
        return termino;
    }

    public void setTermino(Terminos termino) {
        this.termino = termino;
    }

    @Override
    public String toString() {
        return "Milaneza{" +
                "termino=" + termino +
                '}';
    }
}
