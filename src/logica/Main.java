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
                            break; ////////////////////////AQUI LLEGUE GABY//////////////////////////////////////////////////////////////////////////////////
                        case 4:
                            System.out.println("---------------------------------------------------------");
                            System.out.println("-                        EJEMPLO                        -");
                            System.out.println("---------------------------------------------------------");

                            int A;
                            int B;
                            int C;
                            System.out.println("ingrese valor para A: ");
                            Scanner scannerLea = new Scanner(System.in);
                            A = scannerLea.nextInt();
                            System.out.println("ingrese valor para B: ");
                            B = scannerLea.nextInt();
                            System.out.println("ingrese valor para C: ");
                            C = scannerLea.nextInt();

                            if (A != B && B != C && C != A) {
                                if (A > B && A > C) {
                                    System.out.println("A es el mayor ");
                                    if (B > C) {
                                        System.out.println("C es el Menor ");
                                    } else {
                                        System.out.println("B es el Menor ");
                                    }

                                } else if (B > A && B > C) {
                                    System.out.println("B es el mayor ");
                                    if (A > C) {
                                        System.out.println("C es el Menor ");
                                    } else {
                                        System.out.println("A es el Menor ");
                                    }

                                } else {
                                    System.out.println("C es el mayor ");
                                    if (A > B) {
                                        System.out.println("B es el Menor ");
                                    } else {
                                        System.out.println("A es el Menor ");
                                    }

                                }

                            } else {
                                System.out.println("Los valores no pueden ser iguales ");

                            }


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
                        System.out.println("-------------------------------------------------");
                        System.out.println("-                   Qué es Switch               -");
                        System.out.println("-El switch en Java es una estructura de control  \n-que permite ejecutar diferentes bloques de código \n-en función del valor de una variable. En Java,-  \n-esta estructura es ideal cuando se tienen múltiples  \n-caminos posibles y se desea simplificar la lógica \nde decisión. ");
                    break;

                    case 2:

                        System.out.println("-------------------------------------------------");
                        System.out.println("-                   Sintaxis                    -");
                        System.out.println("switch(x) {     \ncase 'valor1':  // if (x === 'valor1') \n...  \nbreak; \ncase 'valor2':  // if (x === 'valor2') \n... \n;break  \ndefault:   \n...  \nbreak }");
                        System.out.println("-------------------------------------------------");
                    break;

                    case 3:
                        System.out.println("-------------------------------------------------");
                        System.out.println("-                   Ejemplo                     -");
                        System.out.println("-indique en qué categoría se encuentra la nota. \nTenga en cuanta los siguientes datos de acuerdo \nal número ingresado:\n" +
                              "- Si es 1 o 2 imprime \"Su calificación es: F\"\n" +
                              "- Si es 3 o 4 imprime \"Su calificación es: D\"\n" +
                              "- Si es 5 o 6 imprime \"Su calificación es: C\"\n" +
                              "- Si es 7 o 8 imprime \"Su calificación es: B\"\n" +
                              "- Si es 9 o 10 imprime \"Su calificación es: A\"\n" +
                              "- Si es diferente al rango imprime \"Número no válido, por favor verifique\"\n" +
                              "Para esto debe usar switch.                    -");


                        System.out.println("ingrese su nota: ");
                        int nota;

                        nota = scannerMenu.nextInt();

                                    switch (nota) {

                                        case 1:
                                        case 2:
                                            System.out.println("Su Calificación es: F");
                                            break;

                                        case 3:
                                        case 4:
                                            System.out.println("Su Calificación es: D");
                                            break;

                                        case 5:
                                        case 6:
                                            System.out.println("Su Calificación es: C");
                                            break;

                                        case 7:
                                        case 8:
                                            System.out.println("Su Calificación es: B");
                                            break;

                                        case 9:
                                        case 10:
                                            System.out.println("Su Calificación es: A");
                                            break;

                                        default :
                                            System.out.println("Numero no valido por favor verifique");
                                    }
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
                    int vble1;
                    int vble2;
                    int mayor;

                switch (opcion7) {
                    case 1:
                     System.out.println("-------------------------------------------------");
                     System.out.println("-               Operador Ternario               -");
                     System.out.println("-El operador ternario es otro de los operadores \ncondicionales. Es una forma reducida de escribir \nun if-then-else. Este es representado mediante el \nsímbolo ?:La estructura del operador ternario es: \n(expresion)?valor_true:valor_false;");
                        break;
                    case 2:
                        System.out.println("-------------------------------------------------");
                        System.out.println("-                   Ejemplo                     -");
                        System.out.println("El operador ternario se suele utilizar para decidir \nque valor asignar. Un ejemplo de código del \noperador ternario sería:");
                        System.out.println("ingrese el valor: ");

                        vble1 = scannerMenu.nextInt();
                        vble2 = scannerMenu.nextInt();

                        mayor = (vble1 > vble2)?vble1:vble2;

                        System.out.println("El mayor de los dos números es " + mayor);
                        System.out.println("NOTA:En el caso de que la expresión tenga \nun valor de true se retorna el valor \nindicado después del cierre de interrogación (?) \nY si la expresión tiene un valor de false se retorna \nel valor que esté después de los dos puntos (:). ");
                        System.out.println("-------------------------------------------------");
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
                            System.out.println("-------------------------------------------------");
                            System.out.println("-               Bucle DO WHILE                  -");
                            System.out.println("- La sentencia do-while en Java es una estructura \nde control de ciclo que ejecuta un bloque de \ncódigo una o más veces mientras se cumple \nuna condición específica.");
                            System.out.println("-------------------------------------------------");
                            System.out.println("- El ciclo do-while en Java se utiliza cuando se \ndesea garantizar que el código se ejecute al \nmenos una vez, independientemente de si se \ncumple la condición.");
                            System.out.println("- Su estructura sería la siguinte: \nint i = 1; \ndo { \nSystem.out.println(i);  \ni++;   \n} while (i <= 10); ");
                            break;
                        case 2:
                            System.out.println("-------------------------------------------------");
                            System.out.println("-                     Ejemplo                   -");
                            System.out.println("-------------------------------------------------");

                            int i = 1;
                            do {
                                System.out.println(i);
                                i++;
                            } while (i <= 5);
                            System.out.println("- Este Ejemplo imprime los números menores e iguales a 5.");


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
                            System.out.println("-------------------------------------------------");
                            System.out.println("-               Ciclo  WHILE                    -");
                            System.out.println("- Este nos permiten ejecutar una o varias líneas \nde código de manera repetitiva sin necesidad de \ntener un valor inicial e incluso a veces sin \nsiquiera conocer cuando se va a dar el valor \nfinal que esperamos, los ciclos while, no \ndependen directamente de valores numéricos, \nsino de valores booleanos, es decir su ejecución \ndepende del valor de verdad de una condición \ndada, verdadera o falso, nada más");
                            System.out.println("-------------------------------------------------");
                            System.out.println("- Su estructura es la siguiente: \nwhile(condición de finalización) //por ejemplo numero == 500    \n{     \n....    \n....     \nBloque de Instrucciones....       \n....       \n....         \n} ");
                            System.out.println("-------------------------------------------------");
                        break;
                        case 2:

                            System.out.println("-------------------------------------------------");
                            System.out.println("-                     Ejemplo                   -");
                            System.out.println("-------------------------------------------------");

                            int j = 0;
                            while (j < 10) {
                                System.out.println(j);
                                j++;
                            }
                            System.out.println("- Este Ejemplo imprime los números del 0 al 9. La \nvariable j se inicializa con 0 antes del ciclo \ny se incrementa en 1 dentro del ciclo, por lo \nque después de 10 iteraciones la condición j < 10 \nserá falsa y el ciclo se detendrá.\n" );


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
                            System.out.println("-------------------------------------------------");
                            System.out.println("-               Ciclo  FOR                      -");
                            System.out.println("- El bucle for en Java, es una estructura lógica \nque te permite realizar una y otra vez una acción, \nsiempre y cuando se cumpla una condición booleana");
                            System.out.println("-------------------------------------------------");
                            System.out.println("- Su estructura es la siguiente: \nfor (inicialización; condición; actualización) \n{ // bloque de código a ejecutar \n}");
                            System.out.println("-------------------------------------------------");

                            break;
                        case 2:

                            System.out.println("-------------------------------------------------");
                            System.out.println("-                     Ejemplo                   -");
                            System.out.println("-------------------------------------------------");

                            for (int i = 2; i <= 20; i += 2) {
                                System.out.println(i);
                            }
                            System.out.println("- Imprimir solo los números pares del 2 al 20   ");

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