import comensales.Adulto;
import comensales.Nino;
import platillos.Platillo;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by ANGELUS on 25/10/16.
 */


public class Menu {
    private Date fechaActual;
    private Scanner scan;
    private LinkedList<Cuenta> cuentas;

    public Menu(){

        scan=new Scanner(System.in);
        fechaActual=new Date();
        cuentas=new LinkedList<>();

    }

    public static Date ParseFecha(String fecha){
        SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate=null;
        try {
            fechaDate=formato.parse(fecha);
        }catch (Exception ex)
        {
            return new Date();
        }
        return fechaDate;
    }

    public  void nuevaLinea(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }catch (Exception ex){

        }

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
                        cuentas.add(c);
                        System.out.println("--Cuenta creada: " + fechaActual.toString());
                        System.out.println("1.-Agregar un Cliente\n");
                        System.out.println("2.-Agregar un Infante\n");
                        System.out.println("3.-Agregar un Platillo\n");
                        System.out.println("4.-Quitar un Platillo\n");
                        System.out.println("5.-Terminar la cuenta\n");
                        opc2=scan.nextInt();
                        switch (opc2){
                            case 1:
                                Adulto adulto=new Adulto();
                                nuevaLinea();
                                System.out.println("---------Ingresar Adultos----------------");
                                System.out.println("Ingresar nombre");
                                adulto.setNombre(scan.next());
                                System.out.println("Ingresar profesion");
                                adulto.setProfesion(scan.next());
                                System.out.println("Ingresar fecha nacimiento");
                                adulto.setFecha_nac(ParseFecha(scan.next()));
                                System.out.println("__________________________________________");
                                c.addAdulto(adulto);
                                break;
                            case 2:
                                Nino n=new Nino();
                                System.out.println("-----Ingresar infante---------------------");
                                System.out.println("Ingresar Nombre");
                                n.setNombre(scan.next());
                                System.out.println("Ingresar Colegio");
                                n.setColegio(scan.next());
                                System.out.println("Ingresar fecha nacimiento");
                                n.setFecha_nac(ParseFecha(scan.next()));
                                System.out.println("------------------------------------------");
                                c.addInfante(n);
                                break;
                            case 3:

                                Platillo pn=new Platillo();
                                System.out.println("_________Lista de Platillos________________");
                                System.out.println(Platillo.listarPlatillos());
                                System.out.println("___________________________________________");
                                System.out.println("Seleccionar un platillo");
                                int opcplatillo=scan.nextInt();
                                pn=Platillo.platillos.get(opcplatillo);
                                c.addPlatillos(pn);
                                System.out.println(pn.toString());
                                System.out.print("Como desea el platillo "+pn.getLlave()+"?");
                                pn.setValor(scan.next());
                                System.out.println("Platillo agregado"+pn.toString());
                                System.out.println("___________________________________________");

                                break;
                            case 4:
                                int opcquitar=0;
                                System.out.println("_________Platillos en la cuenta_______");
                                c.listarPlatillos();
                                System.out.println("_______________________________________");
                                System.out.println("Seleccione un Platillo a quitar");
                                opcquitar=scan.nextInt();
                                c.removePlatillos(opcquitar);
                                System.out.println("_______Platillo Eliminado_______________");

                                break;
                            case 5:
                                System.out.println(c.imprimirTicket());
                                nuevaLinea();
                                break;
                        }
                    }while (opc2!=5);

                    break;
                case 2:
                    System.out.println("--Cuentas Anteriores a la fecha: " + fechaActual.toString());
                    for(int i=0;i<cuentas.size();i++){
                        System.out.println(cuentas.get(i).imprimirTicket());
                    }
                    System.out.println("-------------------------------------");

                    break;
                case 3:
                    menuPlatillos();
                    break;
                default:
                    System.out.println("introdusca otra opcion");
                    break;

            }
        }while(opc!=4);
        System.out.println("Fin del programa");

    }
    public void  menuPlatillos(){
        int opc3=0;
        do {
            System.out.println("--Menu de platillos:" + fechaActual.toString());
            System.out.println("1.-Mostrar platillos\n");
            System.out.println("2.-Agregar un platillo\n");
            System.out.println("3.-Modificar un platillo\n");
            System.out.println("4.-Eliminar un platillo\n");
            System.out.println("5.-Regresar\n");
            opc3=scan.nextInt();
            switch (opc3)
            {
                case 1:
                    System.out.println("---Lista de platillos----");
                    System.out.println(Platillo.listarPlatillos());
                    System.out.println("-------------------------");
                    break;
                case 2:
                    Platillo p=new Platillo();
                    System.out.println("Ingresar nombre del platillo");
                    p.setNombre(scan.next());
                    System.out.println("Ingresar precio del platillo");
                    p.setPrecio(scan.nextFloat());
                    System.out.println("Agregar una caracteristica");
                    p.setLlave(scan.next());
                    System.out.println("----------Producto creado-------------------");
                    Platillo.platillos.add(p);
                    System.out.println(p.toString());
                    System.out.println("--------------------------------------------");
                    break;
                case 3:
                    int opcplatillo=0;
                    System.out.println("---Modificar un platillo----");
                    System.out.println(Platillo.listarPlatillos());
                    System.out.println("----------------------------");
                    System.out.println("--Seleccione un platillo de la lista");
                    opcplatillo=scan.nextInt();
                    Platillo p1=Platillo.platillos.get(opcplatillo);
                    System.out.println("Modificar el nombre de "+p1.getNombre()+" por:");
                    p1.setNombre(scan.next());
                    System.out.println("Modificar el precio actual de "+p1.getPrecio()+" por:");
                    p1.setPrecio(scan.nextFloat());
                    System.out.println("Modificar la caracteristica de "+p1.getLlave()+" por:");
                    p1.setLlave(scan.next());
                    System.out.println("________Producto Modificado____________");
                    System.out.println(p1.toString());
                    System.out.println("_______________________________________");
                    break;
                case 4:
                    int opceliminar=0;
                    System.out.println("---Eliminar un platillo----");
                    System.out.println(Platillo.listarPlatillos());
                    System.out.println("----------------------------");
                    System.out.println("Seleccionar un producto");
                    opceliminar=scan.nextInt();
                    Platillo pl=Platillo.platillos.get(opceliminar);
                    System.out.println("Platillo eliminado --"+pl.getNombre()+"---");
                    Platillo.platillos.remove(opceliminar);
                    System.out.println("___________________________________");
                    break;
            }

        }while(opc3!=5);
    }


}
