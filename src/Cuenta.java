import com.sun.javafx.logging.PulseLogger;
import comensales.Adulto;
import comensales.Nino;
import platillos.Platillo;

import java.io.Serializable;
import java.util.LinkedList;

/**
 * Created by ANGELUS on 26/10/16.
 */
public class Cuenta implements Serializable{
    public static int  numcuentas=0;
    private LinkedList<Adulto> adultos;
    private LinkedList<Nino> infantes;
    private LinkedList<Platillo> platillos;

    public Cuenta() {
        adultos=new LinkedList<>();
        infantes=new LinkedList<>();
        platillos=new LinkedList<>();
    }

    public void addAdulto(Adulto a){
        adultos.add(a);
    }

    public void addInfante(Nino i){
        infantes.add(i);
    }

    public void addPlatillos(Platillo p){
        platillos.add(p);
    }
    public void removePlatillos(int i){
        platillos.remove(i);
    }

    public float cuentaTotal(){
        float total=0;
        for(int i=0;i<platillos.size();i++){
            total+=platillos.get(i).getPrecio();
        }
        return total;
    }

    public String listarPlatillos(){
        String dato="";
        if(platillos.size()>0) {
            for (int i = 0; i < platillos.size(); i++) {
                dato += i + "-" + platillos.get(i).toString() + "\n";
            }
        }
        else {
            dato="No hay platillos";
        }
        return dato;
    }

    public String listarAdultos(){
        String dato="";
        if(adultos.size()>0) {
            for (int i = 0; i < adultos.size(); i++) {
                dato += i + "-" + adultos.get(i).toString() + "\n";
            }
        }
        else {
            dato="No hay Adultos";
        }
        return dato;
    }
    public String listarInfantes(){
        String dato="";
        if(infantes.size()>0) {
            for (int i = 0; i < infantes.size(); i++) {
                dato += i + "-" + infantes.get(i).toString() + "\n";
            }
        }
        else {
            dato="No hay Infantes";
        }
        return dato;
    }

    public String imprimirTicket(){
        String datos="";
        datos+="------------------Ticket-------------------\n";
        datos+="Num Adultos"+Adulto.numAdulto+"\n";
        datos+="Num Infantes"+Nino.numNino+"\n";
        datos+="------------------------------------------\n";
        datos+="Platillos \n"+listarPlatillos()+"\n";
        datos+="Total:"+cuentaTotal()+"\n";
        datos+="------------------------------------------\n";
        datos+=listarAdultos()+"\n";
        datos+=listarInfantes()+"\n";
        datos+="------------------------------------------\n";
        return datos;
    }
}
