package platillos;

import java.awt.*;

/**
 * Created by Angelus on 21/10/2016.
 */
public class Arroz extends Platillo {


    private Color color;

    public Arroz(String nombre) {
        super(nombre);
    }

    public Arroz(String nombre, Color color) {
        super(nombre);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Arroz{" +
                "color=" + color +
                '}';
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
