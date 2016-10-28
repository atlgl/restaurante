package comensales;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Angelus on 19/10/2016.
 */
public class Nino extends Persona implements Serializable{

    public static int numNino=0;

    private String colegio;

    public Nino(){
        numNino++;

    }

    public Nino(String nombre, Date fecha_nac, String colegio) {
        super(nombre, fecha_nac);
        numNino++;
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
