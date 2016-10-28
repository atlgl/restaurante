package platillos;

import sun.rmi.transport.ObjectTable;

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
    public static LinkedList<Platillo> platillos=new LinkedList<>();

    public static String listarPlatillos(){
        String info="";
        if(platillos.size()>0){

            for (int i=0;i<platillos.size();i++){
                info+=i+"-"+platillos.get(i).toString()+"\n";
            }
        }
        else
            info="No hay platillos";

        return info;

    }



    private String nombre;
    private float precio=0.0f;
    private String llave;
    private String valor;
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

    public String getLlave() {
        return llave;
    }

    public void setLlave(String llave) {
        this.llave = llave;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void addCaracteristica(String caracteristica, Object valor){
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
