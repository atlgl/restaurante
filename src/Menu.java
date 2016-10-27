import comensales.Adulto;

import java.util.Date;
import java.util.Scanner;

/**
 * Created by ANGELUS on 25/10/16.
 */


public class Menu {
    private Date fechaActual;
    private Scanner scan;
    public Menu(){

        scan=new Scanner(System.in);
        fechaActual=new Date();

    }

    public void menuPrincipal(){
        int opc = 0;
        do {
            System.out.println("--Fecha: "+fechaActual.toString()+"---\n");
            System.out.println("--Bienvenido Restaurante Papaloti---\n");
            System.out.println("--1.-Ingresar nueva cuenta---\n");
            System.out.println("--2.-Mostrar Cuentas anteriores---\n");
            System.out.println("--3.-Mostrar Menu de Platillos---\n");
            System.out.println("--4.-Salir\n");
            System.out.println("--Selecciona una opcion\n");
            opc = scan.nextInt();
            switch (opc) {
                case 1:
                    int opc2=0;
                    do {
                        Cuenta c=new Cuenta();
                        System.out.println("--Cuenta creada: " + fechaActual.toString());
                        System.out.println("1.-Agregar un Cliente\n");
                        System.out.println("2.-Agregar un Infante\n");
                        System.out.println("3.-Agregar un platillo\n");
                        System.out.println("4.-Quitar un platillo\n");
                        System.out.println("5.-Terminar la cuenta\n");
                        opc2=scan.nextInt();
                        switch (opc2){
                            case 1:
                                Adulto adulto=new Adulto();
                                System.out.println("Ingresar nombre");
                                adulto.setNombre(scan.next());
                                System.out.println("Ingresar profesion");
                                adulto.setProfesion(scan.next());
                                System.out.println("Ingresar fecha nacimiento");
                                //adulto.setFecha_nac(scan.next());


                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                        }
                    }while (opc2!=5);

                    break;
                case 2:
                    System.out.println("--Cuentas Anteriores a la fecha: " + fechaActual.toString());
                    break;
                case 3:
                    int opc3=0;
                    do {
                        System.out.println("--Cuenta creada :" + fechaActual.toString());
                        System.out.println("1.-Mostrar platillos\n");
                        System.out.println("2.-Agregar un platillo\n");
                        System.out.println("3.-Modificar un platillo\n");
                        System.out.println("4.-Eliminar un platillo\n");
                        opc3=scan.nextInt();
                    }while(opc3!=5);
                    break;
                default:
                    break;

            }
        }while(opc!=4);
        System.out.println("Fin del programa");

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
