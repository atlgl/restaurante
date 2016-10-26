package platillos;

/**
 * Created by Angelus on 21/10/2016.
 */
public abstract   class  PlatilloFactory {

    public static Platillo createPlatillo(int type,String nombre){
        switch (type){

            case 1:
                return new Pollo(nombre);

            case 2:
                return new Arroz(nombre);

            case 3:
                return new Milaneza(nombre);

            case 4:
                return new Papas(nombre);

            case 5:
                return  new Hamburguesa(nombre);

            case 6:
                return new Pizza(nombre);

            default:
                return null;

        }
    }
}
