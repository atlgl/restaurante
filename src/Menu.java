import java.util.Scanner;

/**
 * Created by ANGELUS on 25/10/16.
 */


public class Menu {
    private Scanner scan;
    public Menu(){

        scan=new Scanner(System.in);

    }

    public void menuPrincipal(){
        int opc=0;
        System.out.println("--Bienvenido Restaurante Papaloti---\n");
        System.out.println("--2.-Ingresar un adulto---\n");
        System.out.println("--3.-Ingresar un infante---\n");
        System.out.println("--4.-Nueva cuenta---\n");
        System.out.println("--Selecciona un platillo\n");
        switch (opc){
            case 1:
                break;
            case 2:
                break;
            case  3:
                break;
            case  4:
                break;
            default:
            break;

        }

    }
    public void  menuPlatillos(){
        int opc=0;
        System.out.println("--Menu--");
        System.out.println("1.-Arroz");
        System.out.println("2.-Milaneza");
        System.out.println("3.-Papas");
        System.out.println("4.-Pizza");
        System.out.println("5.-Hamburguesa");
        System.out.println("6.-Pollo");
        System.out.println("Selecciona un platillo\n");
        switch (opc) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;

        }
    }
}
