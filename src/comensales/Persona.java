package comensales;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Angelus on 19/10/2016.
 */
public class Persona implements Serializable {


    private int personaid;
    private String nombre;
    private Date fecha_nac;


    public Persona(String nombre, Date fecha_nac) {
        this.nombre = nombre;
        this.fecha_nac = fecha_nac;
    }

    public Persona() {
    }

    @Override
    public String toString() {
        return "comensales.Persona{" +
                "personaid=" + personaid +
                ", nombre='" + nombre + '\'' +
                ", fecha_nac=" + fecha_nac +
                '}';
    }

    public int getPersonaid() {
        return personaid;
    }

    public void setPersonaid(int personaid) {
        this.personaid = personaid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

}
