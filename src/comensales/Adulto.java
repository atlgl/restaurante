package comensales;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Angelus on 19/10/2016.
 */
public class Adulto extends Persona implements Serializable {

    public static int numAdulto=0;

    public String profesion;

    public Adulto(){
        numAdulto++;
    }

    public Adulto(String profesion) {
        numAdulto++;
        this.profesion = profesion;
    }

    public Adulto(String nombre, Date fecha_nac, String profesion) {
        super(nombre, fecha_nac);
        numAdulto++;
        this.profesion = profesion;
    }

    public String getProfesion() {
        return profesion;
    }


    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        return "Adulto{" +
                "profesion='" + profesion + '\'' +
                '}';
    }
}
