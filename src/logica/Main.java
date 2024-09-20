package logica;


import explicaciones.Detalles;
import menus.MenuPrincipal;
import menus.Submenu;
import programas.Ejemplos;
import utilidades.Utilidades;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        int opcion;

        int opcion1;
        int opcion2;
        int opcion3;
        int opcion4;
        int opcion5;

        int opcion6;
        int opcion7;
        int opcion8;
        int opcion9;
        int opcion10;




        Scanner scannerMenu = new Scanner(System.in);
        Scanner scannerIfPrograma = new Scanner(System.in);
        Scanner scannerSwitchPrograma = new Scanner(System.in);
        Scanner scannerTernariaPrograma = new Scanner(System.in);



  do{
       //va menu principal
      MenuPrincipal.menuprincipal();


      opcion = scannerMenu.nextInt();


        switch (opcion) {

            case 1:
                do{
                   Submenu.menuDatosPrimitivos();
                    opcion1 = scannerMenu.nextInt();
                    switch (opcion1){
                        case 1:
                        Detalles.explicacionByte();
                            break;
                        case 2:
                            Detalles.explicacionShort();
                            break;
                        case 3:
                            Detalles.explicacionInt();
                            break;
                        case 4:
                            Detalles.explicacionLong();
                            break;
                        case 5:
                            Detalles.explicacionFloat();
                            break;
                        case 6:
                            Detalles.explicacionDouble();
                            break;
                        case 7:
                            Detalles.explicacionChar();
                            break;
                        case 8:
                            Detalles.explicacionBoolean();
                            break;
                        case 0:
                            Utilidades.volver();
                            break;
                        default:
                            Utilidades.opcionNoValida();

                    }

                    scannerMenu.nextLine();//Limpiamos buffer del System.in
                    System.out.println("\n\t\t PRESIONE ENTER PARA CONTINUAR...");
                    scannerMenu.nextLine();//Ahora el programa se detiene hasta que se pulse ENTER


                    } while (opcion1 != 0);

                break;

            case 2:
                do{
                    Submenu.menuString();
                    opcion2 = scannerMenu.nextInt();
                    switch (opcion2){
                        case 1:
                              Detalles.explicacionString();
                            break;
                        case 2:
                            Ejemplos.proString();
                        break;
                        case 0:
                            Utilidades.volver();
                            break;
                        default:
                            Utilidades.opcionNoValida();
                    }
                    scannerMenu.nextLine();//Limpiamos buffer del System.in
                    System.out.println("\n\t\t PRESIONE ENTER PARA CONTINUAR...");
                    scannerMenu.nextLine();//Ahora el programa se detiene hasta que se pulse ENTER


                }while(opcion2 != 0);

                break;

            case 3:

                do{
                    Submenu.menuConstantes();
                    opcion3 = scannerMenu.nextInt();
                    switch(opcion3){
                        case 1:
                            Detalles.explicacionConstantes();
                            break;
                        case 2:
                            Ejemplos.proConstantes();
                            break;
                        case 0:
                            Utilidades.volver();
                            break;
                        default:
                            Utilidades.opcionNoValida();
                    }
                    scannerMenu.nextLine();//Limpiamos buffer del System.in
                    System.out.println("\n\t\t PRESIONE ENTER PARA CONTINUAR...");
                    scannerMenu.nextLine();//Ahora el programa se detiene hasta que se pulse ENTER

                }while (opcion3 != 0);
                break;


             case 4:
                 do{
                     Submenu.menuOperadores();
                     opcion4 = scannerMenu.nextInt();
                     switch (opcion4){
                         case 1:
                             Detalles.explicacionesAritmeticas();
                             break;
                         case 2:
                             Detalles.explicacionesRelacionales();
                             break;
                         case 3:
                             Detalles.explicacionesLogicos();
                             break;
                         case 4:
                             Detalles.explicacionesAsignacion();
                             break;
                         case 5:
                             Detalles.explicacinesIncrementoDecremento();
                             break;
                         case 0:
                             Utilidades.volver();
                             break;
                         default:
                             Utilidades.opcionNoValida();
                     }
                     scannerMenu.nextLine();//Limpiamos buffer del System.in
                     System.out.println("\n\t\t PRESIONE ENTER PARA CONTINUAR...");
                     scannerMenu.nextLine();//Ahora el programa se detiene hasta que se pulse ENTER
                 }while(opcion4 != 0);
                 break;

            case 5:
                do{
                    Submenu.menuIf();
                    opcion5 = scannerMenu.nextInt();
                    switch (opcion5){
                        case 1:
                           Detalles.explicacionIF();
                            break;
                        case 2:
                            Detalles.explicacionElseIf();
                            break;
                        case 3:
                            Detalles.explicacionElse();
                            break;
                        case 4:
                            Ejemplos.programaIf(scannerIfPrograma);
                            break;
                        case 0:
                            Utilidades.volver();
                            break;
                        default:
                            Utilidades.opcionNoValida();
                    }
                    scannerMenu.nextLine();//Limpiamos buffer del System.in
                    System.out.println("\n\t\t PRESIONE ENTER PARA CONTINUAR...");
                    scannerMenu.nextLine();//Ahora el programa se detiene hasta que se pulse ENTER
                }while(opcion5 != 0);
                break;

            case 6:
                do{
                    Submenu.menuSwitch();
                    opcion6 = scannerMenu.nextInt();
                switch (opcion6) {
                    case 1:
                       Detalles.explicacionSwitch();
                    break;
                    case 2:
                        Detalles.sintaxiSwitch();
                        break;

                    case 3:
                        Ejemplos.programaSwitch(scannerSwitchPrograma);
                    break;
                    case 4:
                        Utilidades.volver();
                        break;
                    default :
                        Utilidades.opcionNoValida();

                }

                    scannerMenu.nextLine(); //Limpiamos buffer del System.in
                    System.out.println("\n\t\tPRESIONE ENTER PARA CONTINUAR..."); //Mensaje en pantalla
                    scannerMenu.nextLine(); //Ahora el programa se detiene hasta que se pulse ENTER*/
                        }while (opcion6!=4);
                break;
            case 7:
                do{
                    Submenu.menuTernaria();
                    opcion7 = scannerMenu.nextInt();
                switch (opcion7) {
                    case 1:
                     Detalles.explicacionTernaria();
                        break;
                    case 2:
                        Ejemplos.programaTernaria(scannerTernariaPrograma);
                        break;
                    case 3:
                        Utilidades.volver();
                        break;
                    default :
                        Utilidades.opcionNoValida();

                                 }
                    scannerMenu.nextLine(); //Limpiamos buffer del System.in
                    System.out.println("\n\t\tPRESIONE ENTER PARA CONTINUAR..."); //Mensaje en pantalla
                    scannerMenu.nextLine(); //Ahora el programa se detiene hasta que se pulse ENTER*/

                }while (opcion7!=3);
                break;
            case 8 :
                do {
                    Submenu.menuDowhile();
                    opcion8 = scannerMenu.nextInt();
                    switch (opcion8) {
                        case 1:
                            Detalles.explicacionDoWhile();
                            break;
                        case 2:
                            Ejemplos.programaDoWhile();
                            break;
                        case 3:
                            Utilidades.volver();
                            break;
                        default :
                            Utilidades.opcionNoValida();

                    }
                    scannerMenu.nextLine(); //Limpiamos buffer del System.in
                    System.out.println("\n\t\tPRESIONE ENTER PARA CONTINUAR..."); //Mensaje en pantalla
                    scannerMenu.nextLine(); //Ahora el programa se detiene hasta que se pulse ENTER*/

                }while (opcion8!=3);
                break;
            case 9:
                do {
                    Submenu.menuWhile();
                    opcion9 = scannerMenu.nextInt();
                    switch (opcion9) {
                        case 1:
                            Detalles.explicacionWhile();
                        break;
                        case 2:
                            Ejemplos.programaWhile();
                        break;
                        case 3:
                            Utilidades.volver();
                            break;
                        default :
                            Utilidades.opcionNoValida();

                    }
                    scannerMenu.nextLine(); //Limpiamos buffer del System.in
                    System.out.println("\n\t\tPRESIONE ENTER PARA CONTINUAR..."); //Mensaje en pantalla
                    scannerMenu.nextLine(); //Ahora el programa se detiene hasta que se pulse ENTER*/
                }while (opcion9!=3);
                break;
            case 10:
                do {
                    Submenu.menuFor();
                    opcion10 = scannerMenu.nextInt();
                    switch (opcion10) {
                        case 1:
                            Detalles.explicacionFor();
                            break;
                        case 2:
                            Ejemplos.programaFor();
                            break;
                        case 3:
                            Utilidades.volver();
                            break;
                            default :
                                Utilidades.opcionNoValida();

                    }

                    scannerMenu.nextLine(); //Limpiamos buffer del System.in
                    System.out.println("\n\t\tPRESIONE ENTER PARA CONTINUAR..."); //Mensaje en pantalla
                    scannerMenu.nextLine(); //Ahora el programa se detiene hasta que se pulse ENTER*/

                }while (opcion10!=3);
                break;


            case 0:
                System.out.println("-------------------------------------------------");
                System.out.println("-                      Salir                    -");
                System.out.println("-------------------------------------------------");
                break;
            default :
                Utilidades.opcionNoValida();
        }

      //Para pausar la ejecución del programa


     /* scannerMenu.nextLine(); //Limpiamos buffer del System.in
      System.out.println("\n\t\tPRESIONE ENTER PARA CONTINUAR..."); //Mensaje en pantalla
      scannerMenu.nextLine(); //Ahora el programa se detiene hasta que se pulse ENTER*/



  }while (opcion!=0);
        System.out.println("HASTA LUEGO");
    }

}