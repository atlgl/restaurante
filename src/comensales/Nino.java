package comensales;

import java.util.Date;

/**
 * Created by Angelus on 19/10/2016.
 */
public class Nino extends Persona {
    private static int numNino=0;
     private String colegio;

    public Nino(String nombre, Date fecha_nac, String colegio) {
        super(nombre, fecha_nac);
        this.colegio = colegio;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    @Override
    public String toString() {
        return super.toString()+"comensales.Nino{" +
                "colegio='" + colegio + '\'' +
                '}';
    }
}
