package platillos;

import java.awt.font.TextLayout;
import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedList;

/**
 * Created by Angelus on 21/10/2016.
 */
public class Platillo implements Serializable {

    public static int numPlatillosOrdenados=0;
    public static int numNumPlatillosMenu=0;


    private String nombre;
    private float precio=0.0f;
    private LinkedList<Caracteristica> caracteristicas;

    public Platillo() {
        caracteristicas=new LinkedList<>();
    }

    public Platillo(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
        caracteristicas=new LinkedList<>();
    }

    public Platillo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void addCaracteristica(String caracteristica,Object valor){
        caracteristicas.add(new Caracteristica(caracteristica,valor));
    }

    public String printCaracteristica(){
        String info="";
        for (int i=0;i<=caracteristicas.size();i++){
            info+=caracteristicas.get(i).getPropiedad()+"-"+caracteristicas.get(i).getValor();
        }
        return  info;
    }



    @Override
    public String toString() {
        return "Platillo{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }


}
