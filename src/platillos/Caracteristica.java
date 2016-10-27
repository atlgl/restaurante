package platillos;

import java.io.Serializable;

/**
 * Created by ANGELUS on 26/10/16.
 */
public class Caracteristica implements Serializable {
    private String propiedad;
    private Object valor;

    public Caracteristica(String propiedad, Object valor) {
        this.propiedad = propiedad;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Caracteristica{" +
                "propiedad='" + propiedad + '\'' +
                ", valor=" + valor +
                '}';
    }

    public String getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(String propiedad) {
        this.propiedad = propiedad;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }
}
