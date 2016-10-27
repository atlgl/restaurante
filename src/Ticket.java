import platillos.Platillo;

import java.util.List;

/**
 * Created by Angelus on 21/10/2016.
 */
public class Ticket<T> {
    private static int numeroTicket=0;
    private List<T> listaPlatillos;

    public void addPlatillo(T t){
        listaPlatillos.add(t);
    }

    public void removePlatillo(T t){
        listaPlatillos.remove(t);
    }

    public  String toString(){

        String data="";
        for (int i=0;i<=listaPlatillos.size();i++){
            data+=listaPlatillos.get(i).toString();
        }
        return data;
    }

    public String imprimeTicket(String nombre,int numpersonas,String datos){
        String data="---Ticket--";
        data+="\nNombre:"+nombre+"\nNum personas:"+numpersonas+"\nObs:"+datos+toString();
        return data;
    }


}
