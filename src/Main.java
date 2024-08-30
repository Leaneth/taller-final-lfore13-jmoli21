import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        int opcion;
        int opcion1;
        int opcion2;
        int opcion3;
        int opcion4;
        int opcion5;

        System.out.println("Digita la opción deseada: ");

        Scanner scannerMenu = new Scanner(System.in);



  do{
        System.out.println("-------------------------------------------------");
        System.out.println("-        MENU CAPÍTULO DE PROGRAMACIÓN          -");
        System.out.println("-      GABRIELA MOLINA - LEANETH FORERO         -");
        System.out.println("-            JMOLI21   -   LFORE13              -");
        System.out.println("-------------------------------------------------");
        System.out.println("-          1.  Datos Primitivos                 -");
        System.out.println("-          2.  String                           -");
        System.out.println("-          3.  Constantes                       -");
        System.out.println("-          4.  Tipo de Operadores               -");
        System.out.println("-          5.  Condicional IF -ELSE -IF ELSE    -");
        System.out.println("-          6.  Condicional Switch               -");
        System.out.println("-          7.  Condicional Ternaría             -");
        System.out.println("-          8.  Bucle  DO  WHILE                 -");
        System.out.println("-          9.  Bucle  WHILE                     -");
        System.out.println("-          10. Bucle  FOR                       -");
        System.out.println("-          0.  Salir                            -");
        System.out.println("-------------------------------------------------");

      opcion = scannerMenu.nextInt();


        switch (opcion) {

            case 1:
                do{
                    System.out.println("-------------------------------------------------");
                    System.out.println("-               DATOS PRIMITIVOS                -");
                    System.out.println("-------------------------------------------------");
                    System.out.println("-              1. Explicación byte              -");
                    System.out.println("-              2. Explicación short             -");
                    System.out.println("-              3. Explicación int               -");
                    System.out.println("-              4. Explicación long              -");
                    System.out.println("-              5. Explicación float             -");
                    System.out.println("-              6. Explicación double            -");
                    System.out.println("-              7. Explicación char              -");
                    System.out.println("-              8. Explicación boolean           -");
                    System.out.println("-              0. Volver                         -");
                    System.out.println("-------------------------------------------------");

                    opcion1 = scannerMenu.nextInt();

                    switch (opcion1){
                        case 1:
                            System.out.println("-------------------------------------------------");
                            System.out.println("-                  EXPLICACIÓN BYTE             -");
                            System.out.println("-------------------------------------------------");
                            System.out.println("Utilizado para datos pequeños y optimización de  ");
                            System.out.println("memoria en arrays grandes.                       ");
                            System.out.println("-Ejemplo:                                        ");
                            System.out.println("        'byte edad = 25;'                        ");
                            System.out.println("-------------------------------------------------");
                            break;
                        case 2:
                            System.out.println("-------------------------------------------------");
                            System.out.println("-                  EXPLICACIÓN SHORT            -");
                            System.out.println("-------------------------------------------------");
                            System.out.println("Útil para datos númericos más grandes que 'byte' ");
                            System.out.println("pero aún pequeños.                               ");
                            System.out.println("-Ejemplo:                                        ");
                            System.out.println("        'short año = 2023;'                      ");
                            System.out.println("-------------------------------------------------");
                            break;
                        case 3:
                            System.out.println("-------------------------------------------------");
                            System.out.println("-                  EXPLICACIÓN INT              -");
                            System.out.println("-------------------------------------------------");
                            System.out.println("El tipo de dato entero más comúnmente usado,     ");
                            System.out.println("representa un conjunto de enteros de 32 bits cuyo");
                            System.out.println("rango va des el -2.147.483.648 al 2.147.483.647. ");
                            System.out.println("-Ejemplo:                                        ");
                            System.out.println("        'int salario = 50000;'                   ");
                            System.out.println("-------------------------------------------------");
                            break;
                        case 4:
                            System.out.println("-------------------------------------------------");
                            System.out.println("-                  EXPLICACIÓN LONG             -");
                            System.out.println("-------------------------------------------------");
                            System.out.println("Utilizado para valores enteros muy grandes, como ");
                            System.out.println("la población mundial, el tamaño de archivos muy  ");
                            System.out.println("grandes.                                         ");
                            System.out.println("-Ejemplo:                                        ");
                            System.out.println("        'long distancia = 150000000001;'         ");
                            System.out.println("-------------------------------------------------");
                            break;
                        case 5:
                            System.out.println("-------------------------------------------------");
                            System.out.println("-                  EXPLICACIÓN FLOAT            -");
                            System.out.println("-------------------------------------------------");
                            System.out.println("Números en coma flotante de precisión simple.    ");
                            System.out.println("-Ejemplo:                                        ");
                            System.out.println("        'float numeropi = 3.1416f;'              ");
                            System.out.println("-------------------------------------------------");
                            break;
                        case 6:
                            System.out.println("-------------------------------------------------");
                            System.out.println("-                  EXPLICACIÓN DOUBLE           -");
                            System.out.println("-------------------------------------------------");
                            System.out.println("Números en coma flotante de doble precisión.     ");
                            System.out.println("-Ejemplo:                                        ");
                            System.out.println("        'double pi = 3.14159265358979323846      ");
                            System.out.println("-------------------------------------------------");
                            break;
                        case 7:
                            System.out.println("-------------------------------------------------");
                            System.out.println("-                  EXPLICACIÓN CHAR             -");
                            System.out.println("-------------------------------------------------");
                            System.out.println("Almacena un solo carácter Unicode.               ");
                            System.out.println("-Ejemplo:                                        ");
                            System.out.println("        'char inicial = 'A';'                    ");
                            System.out.println("-------------------------------------------------");
                            break;
                        case 8:
                            System.out.println("-------------------------------------------------");
                            System.out.println("-               EXPLICACIÓN BOOLEAN             -");
                            System.out.println("-------------------------------------------------");
                            System.out.println("Es utilizado para almacenar un valor de verdadero");
                            System.out.println("o falso.                                         ");
                            System.out.println("-Ejemplo:                                        ");
                            System.out.println("        'esMayorDeEdad = true;'                  ");
                            System.out.println("-------------------------------------------------");
                            break;
                        case 0:
                            System.out.println("-------------------------------------------------");
                            System.out.println("-                    Volver                     -");
                            System.out.println("-------------------------------------------------");
                            break;
                        default:
                            System.out.println("-------------------------------------------------");
                            System.out.println("-  OPCIÓN NO VALIDA/INGRESA UNA OPCIÓN DEL MENÚ -");
                            System.out.println("-------------------------------------------------");

                    }

                    scannerMenu.nextLine();//Limpiamos buffer del System.in
                    System.out.println("\n\t\t PRESIONE ENTER PARA CONTINUAR...");
                    scannerMenu.nextLine();//Ahora el programa se detiene hasta que se pulse ENTER


                } while (opcion1 != 0);

                break;

            case 2:
                do{
                    System.out.println("-------------------------------------------------");
                    System.out.println("-                    STRING                     -");
                    System.out.println("-------------------------------------------------");
                    System.out.println("-           1.Qué es un String                  -");
                    System.out.println("-           2.Ejemplo                           -");
                    System.out.println("-           0.Volver                            -");
                    System.out.println("-------------------------------------------------");
                    opcion2 = scannerMenu.nextInt();

                    switch (opcion2){
                        case 1:
                            System.out.println("---------------------------------------------------");
                            System.out.println("-                  EXPLICACIÓN String             -");
                            System.out.println("---------------------------------------------------");
                            System.out.println("En java, los String son un objeto el cual nos      ");
                            System.out.println("permite almacenar muchos caracteres.               ");
                            System.out.println("---------------------------------------------------");
                            break;
                        case 2:
                            System.out.println("---------------------------------------------------");
                            System.out.println("-                  EJEMPLO String                 -");
                            System.out.println("---------------------------------------------------");
                            System.out.println("String MENSAJE = ''Hola mundo''                    ");
                            System.out.println("---------------------------------------------------");
                        break;
                        case 0:
                            System.out.println("-------------------------------------------------");
                            System.out.println("-                    Volver                     -");
                            System.out.println("-------------------------------------------------");
                            break;
                        default:
                            System.out.println("-------------------------------------------------");
                            System.out.println("-  OPCIÓN NO VALIDA/INGRESA UNA OPCIÓN DEL MENÚ -");
                            System.out.println("-------------------------------------------------");
                    }
                    scannerMenu.nextLine();//Limpiamos buffer del System.in
                    System.out.println("\n\t\t PRESIONE ENTER PARA CONTINUAR...");
                    scannerMenu.nextLine();//Ahora el programa se detiene hasta que se pulse ENTER


                }while(opcion2 != 0);

                break;

            case 3:

                do{
                    System.out.println("-------------------------------------------------");
                    System.out.println("-                  CONSTANTES                   -");
                    System.out.println("-------------------------------------------------");
                    System.out.println("-           1.Qué es una constante              -");
                    System.out.println("-           2.Ejemplo                           -");
                    System.out.println("-           0.Volver                            -");
                    System.out.println("-------------------------------------------------");
                    opcion3 = scannerMenu.nextInt();

                    switch(opcion3){
                        case 1:
                            System.out.println("---------------------------------------------------");
                            System.out.println("-                  EXPLICACIÓN Constante          -");
                            System.out.println("---------------------------------------------------");
                            System.out.println("En java, una constante es un valor que no cambia   ");
                            System.out.println("durante la ejecución del programa. Las constantes  ");
                            System.out.println("se utilizan para representar valores fijos y de    ");
                            System.out.println("lectura única, lo que ayuda a que el código sea más");
                            System.out.println("legible y menos propenso a errores. Las constante  ");
                            System.out.println("en java se declaran usando la palabra clave final. ");
                            System.out.println("---------------------------------------------------");
                            break;
                        case 2:
                            System.out.println("---------------------------------------------------");
                            System.out.println("-                  EJEMPLO Constante              -");
                            System.out.println("---------------------------------------------------");
                            System.out.println("public static final int TIEMPO_ESPERA_CONEXION=30; ");
                            System.out.println("public static final boolean MODO_DEPURACION=true;  ");
                            System.out.println("---------------------------------------------------");
                            break;
                        case 0:
                            System.out.println("-------------------------------------------------");
                            System.out.println("-                    Volver                     -");
                            System.out.println("-------------------------------------------------");
                            break;
                        default:
                            System.out.println("-------------------------------------------------");
                            System.out.println("-  OPCIÓN NO VALIDA/INGRESA UNA OPCIÓN DEL MENÚ -");
                            System.out.println("-------------------------------------------------");
                    }
                    scannerMenu.nextLine();//Limpiamos buffer del System.in
                    System.out.println("\n\t\t PRESIONE ENTER PARA CONTINUAR...");
                    scannerMenu.nextLine();//Ahora el programa se detiene hasta que se pulse ENTER

                }while (opcion3 != 0);
                break;


             case 4:
                 do{
                     System.out.println("-------------------------------------------------");
                     System.out.println("-              TIPOS DE OPERADORES              -");
                     System.out.println("-------------------------------------------------");
                     System.out.println("-              1.Aritméticos                    -");
                     System.out.println("-              2.Relacionales                   -");
                     System.out.println("-              3.Logicos                        -");
                     System.out.println("-              4.Asignación                     -");
                     System.out.println("-              5.Incremento/Decremento          -");
                     System.out.println("-              0.Volver                         -");
                     System.out.println("-------------------------------------------------");
                     opcion4 = scannerMenu.nextInt();

                     switch (opcion4){
                         case 1:
                             System.out.println("--------------------------------------------------- ");
                             System.out.println("-                  ARITMETICOS                     -");
                             System.out.println("--------------------------------------------------- ");
                             System.out.println(" + int suma = 5+3; suma dos operandos.Resultado:8   ");
                             System.out.println(" - int resta = 5-3; resta el segundo operando del   ");
                             System.out.println("   primero.Resultado:2                              ");
                             System.out.println(" * int multiplicacion=5*3; multiplica dos operandos.");
                             System.out.println("   Resultado:15                                     ");
                             System.out.println(" / int division = 6/3; divide el primer operando por");
                             System.out.println("   el segundo.Resultado:2                           ");
                             System.out.println(" % int modulo=5%3; devuelve el resto de la división ");
                             System.out.println("   del primer operando por el segundo.Resultado:2   ");
                             System.out.println("---------------------------------------------------");
                             break;
                         case 2:
                             System.out.println("------------------------------------------------------");
                             System.out.println("-                  RELACIONALES                      -");
                             System.out.println("------------------------------------------------------");
                             System.out.println(" == boolean esIgual=(5==3); comprueba si los valores  ");
                             System.out.println("    de dos operandos son iguales.Resultado:false      ");
                             System.out.println(" != boolean noEsIgual=(5!=3); comprueba si los valores");
                             System.out.println("    de dos operandos no son iguales.Resultado:true"    );
                             System.out.println(" > boolean mayor=(5>3); comprueba si el valor del     ");
                             System.out.println("   primer operando es mayor que el segundo.           ");
                             System.out.println("   Resultado:true                                     ");
                             System.out.println(" < boolean menor=(5<3); comprueba si el valor del     ");
                             System.out.println("   primer operando es menor que el segundo.           ");
                             System.out.println("   Resultado:false                                    ");
                             System.out.println(" >= boolean mayorOIgual=(5>=3); comprueba si el valor ");
                             System.out.println("    del primer operando es mayor o igual que el segundo");
                             System.out.println("    Resultado:true                                    ");
                             System.out.println(" <= boolean menorOIgual=(5<=3); comprueba si el valor ");
                             System.out.println("    del primer operando es menor o igual que el segundo");
                             System.out.println("    Resultado:false                                   ");
                             System.out.println("------------------------------------------------------");
                             break;
                         case 3:
                             System.out.println("--------------------------------------------------------");
                             System.out.println("-                  LOGICOS                             -");
                             System.out.println("--------------------------------------------------------");
                             System.out.println(" && boolean resultado=(5>3&&3<4); devuelve true si ambos");
                             System.out.println("    operandos son true.Resultado:true                   ");
                             System.out.println(" || boolean resultado=(5>3||3<4); devuelve true si al   ");
                             System.out.println("    menos una de ellas es true                          ");
                             System.out.println(" ! boolean resultado =!(5>3); invierte el valor de un   ");
                             System.out.println("   operando booleano.Resultado:false                    ");
                             System.out.println("--------------------------------------------------------");
                             break;
                         case 4:
                             System.out.println("--------------------------------------------------------");
                             System.out.println("-                  ASIGNACION                          -");
                             System.out.println("--------------------------------------------------------");
                             System.out.println(" = int a=5; asigna el valor del operando derecho al     ");
                             System.out.println("   operando izquierdo                                   ");
                             System.out.println(" += int a=5;a+=3; suma el operando derecho al operando  ");
                             System.out.println("    al operando izquierdo y asigna el resultado al      ");
                             System.out.println("    operando izquierdo.Resultado:8                      ");
                             System.out.println(" -= int a=5;a-=3; resta el operando derecho del         ");
                             System.out.println("    operando izquierdo y asigna el resultado al operando");
                             System.out.println("    izquierdo.Resultado:2                               ");
                             System.out.println(" *= int a=5;a*=3; multiplica el operando derecho por    ");
                             System.out.println("    el operando izquierdo y asigna el resultado al      ");
                             System.out.println("    operando izquierdo.Resultado:15                     ");
                             System.out.println(" /= int a=6;a/=3; divide el operando izquierdo por el   ");
                             System.out.println("    operando derecho y asigna el resultado al           ");
                             System.out.println("    operando izquierdo.Resultado:2                      ");
                             System.out.println(" %= int a=5;a%=3; cálcula el módulo del operando        ");
                             System.out.println("    izquierdo por el operando derecho y asigna el       ");
                             System.out.println("    resultado al operando izquierdo.Resultado:2         ");
                             System.out.println("--------------------------------------------------------");
                             break;
                         case 5:
                             System.out.println("--------------------------------------------------------");
                             System.out.println("-                  INCREMENTO/DECREMENTO               -");
                             System.out.println("--------------------------------------------------------");
                             System.out.println(" ++ int a=5;a++; incrementa el valor del operando en 1  ");
                             System.out.println("    Resultado:6                                         ");
                             System.out.println(" -- int a=5;a--; decrementa el valor del operando en 1  ");
                             System.out.println("    Resultado:4                                         ");
                             System.out.println("--------------------------------------------------------");
                             break;
                         case 0:
                             System.out.println("--------------------------------------------------------");
                             System.out.println("-                           Volver                     -");
                             System.out.println("--------------------------------------------------------");
                             break;
                         default:
                             System.out.println("-------------------------------------------------");
                             System.out.println("-  OPCIÓN NO VALIDA/INGRESA UNA OPCIÓN DEL MENÚ -");
                             System.out.println("-------------------------------------------------");
                     }
                     scannerMenu.nextLine();//Limpiamos buffer del System.in
                     System.out.println("\n\t\t PRESIONE ENTER PARA CONTINUAR...");
                     scannerMenu.nextLine();//Ahora el programa se detiene hasta que se pulse ENTER
                 }while(opcion4 != 0);
                 break;


            case 5:
                do{
                    System.out.println("-------------------------------------------------");
                    System.out.println("-             IF - ELSE -  IF ELSE              -");
                    System.out.println("-------------------------------------------------");
                    System.out.println("-              1.Explicación de IF              -");
                    System.out.println("-              2.Explicación de ELSE IF         -");
                    System.out.println("-              3.Explicación de ELSE            -");
                    System.out.println("-              4.PROGRAMA DE IF,ELSE IF/ELSE    -");
                    System.out.println("-              0.Volver                         -");
                    System.out.println("-------------------------------------------------");

                    opcion5 = scannerMenu.nextInt();
                    switch (opcion5){
                        case 1:
                            System.out.println("---------------------------------------------------------");
                            System.out.println("-                  EXPLICACIÓN DE IF                    -");
                            System.out.println("---------------------------------------------------------");
                            System.out.println("-Se utiliza para tomar decisiones basadas en condiciones-");
                            System.out.println("-especificas, permite que se ejecute un bloque de código-");
                            System.out.println("-solo si una condición especifica es verdadera.Si la    -");
                            System.out.println("-condición es falsa, el bloque de código dentro del 'if'-");
                            System.out.println("- Ejemplo                                               -");
                            System.out.println("-  int edad=20;                                         -");
                            System.out.println("-  if(edad>=18){                                        -");
                            System.out.println("-       System.out.println(Eres mayor de edad);         -");
                            System.out.println("-      }                                                -");
                            System.out.println("---------------------------------------------------------");
                            break;
                        case 2:
                            System.out.println("---------------------------------------------------------");
                            System.out.println("-                  EXPLICACIÓN DE ELSE IF               -");
                            System.out.println("---------------------------------------------------------");
                            System.out.println("-Se utiliza para comprobar múltiples condiciones.Si la  -");
                            System.out.println("-condición en el if inicial es falsa,el programa verifica-");
                            System.out.println("-la siguiente condición en el else if.Se puede tener    -");
                            System.out.println("-tantos else if como se necesite.                       -");
                            System.out.println("-  Ejemplo                                              -");
                            System.out.println("-  int edad=20;                                         -");
                            System.out.println("-  if(edad<18){                                         -");
                            System.out.println("-       System.out.println(Eres menor de edad);         -");
                            System.out.println("-   }else if(edad>=18 && edad<65){                      -");
                            System.out.println("-       System.out.println(Eres adulto);                -");
                            System.out.println("-   }                                                   -");
                            System.out.println("---------------------------------------------------------");
                            break;
                        case 3:
                            System.out.println("---------------------------------------------------------");
                            System.out.println("-                  EXPLICACIÓN DE ELSE                  -");
                            System.out.println("---------------------------------------------------------");
                            System.out.println("-Se utiliza junto con if para ejecutar un bloque de     -");
                            System.out.println("-código alternativo si la condición del if es falsa.    -");
                            System.out.println("-  Ejemplo                                              -");
                            System.out.println("-  int edad=70;                                         -");
                            System.out.println("-  if(edad>=65){                                        -");
                            System.out.println("-       System.out.println(Eres un adulto mayor);       -");
                            System.out.println("-   }else{                                              -");
                            System.out.println("-       System.out.println(Eres adulto);                -");
                            System.out.println("-   }                                                   -");
                            System.out.println("---------------------------------------------------------");
                            break;
                        case 4:
                            break;
                        case 0:
                            System.out.println("--------------------------------------------------------");
                            System.out.println("-                           Volver                     -");
                            System.out.println("--------------------------------------------------------");
                            break;
                        default:
                            System.out.println("-------------------------------------------------");
                            System.out.println("-  OPCIÓN NO VALIDA/INGRESA UNA OPCIÓN DEL MENÚ -");
                            System.out.println("-------------------------------------------------");
                    }
                    scannerMenu.nextLine();//Limpiamos buffer del System.in
                    System.out.println("\n\t\t PRESIONE ENTER PARA CONTINUAR...");
                    scannerMenu.nextLine();//Ahora el programa se detiene hasta que se pulse ENTER
                }while(opcion5 != 0);
                break;

            case 6:
                System.out.println("-------------------------------------------------");
                System.out.println("-                    SWITCH                     -");
                System.out.println("-------------------------------------------------");
                break;
            case 7:
                System.out.println("-------------------------------------------------");
                System.out.println("-                   TERNARÍA                    -");
                System.out.println("-------------------------------------------------");
                break;
            case 8:
                System.out.println("-------------------------------------------------");
                System.out.println("-                   DO WHILE                    -");
                System.out.println("-------------------------------------------------");
                break;
            case 9:
                System.out.println("-------------------------------------------------");
                System.out.println("-                    TERNARÍA                   -");
                System.out.println("-------------------------------------------------");
                break;
            case 10:
                System.out.println("-------------------------------------------------");
                System.out.println("-                      FOR                      -");
                System.out.println("-------------------------------------------------");
                break;
            case 0:
                System.out.println("-------------------------------------------------");
                System.out.println("-                     SALIR                     -");
                System.out.println("-------------------------------------------------");
              //xit = true; // Cambia la variable para salir del bucle
                break;


            default :
                System.out.println("-------------------------------------------------");
                System.out.println("-  OPCIÓN NO VALIDA/INGRESA UNA OPCIÓN DEL MENÚ -");
                System.out.println("-------------------------------------------------");
        }

      //Para pausar la ejecución del programa
     /* scannerMenu.nextLine();//Limpiamos buffer del System.in
      System.out.println("\n\t\t PRESIONE ENTER PARA CONTINUAR...");
      scannerMenu.nextLine();//Ahora el programa se detiene hasta que se pulse ENTER*/


  }while (opcion!=0);
        System.out.println("HASTA LUEGO");
    }

}