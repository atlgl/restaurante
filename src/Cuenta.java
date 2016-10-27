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


}
