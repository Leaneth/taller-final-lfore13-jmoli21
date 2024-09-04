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
                             System.out.println("--------------------------------------------------------");
                             System.out.println("-                      ARITMETICOS                     -");
                             System.out.println("--------------------------------------------------------");
                             System.out.println("| + | int suma = 5+3 | suma dos operandos.Resultado:8   ");
                             System.out.println("| - | int resta = 5-3| resta el segundo operando del    ");
                             System.out.println("|     primero.Resultado:2                               ");
                             System.out.println("| * | int multiplicacion=5*3 | multiplica dos operandos.");
                             System.out.println("|     Resultado:15                                      ");
                             System.out.println("| / | int division = 6/3 | divide el primer operando por");
                             System.out.println("|     el segundo.Resultado:2                            ");
                             System.out.println("| % | int modulo=5%3 | devuelve el resto de la división ");
                             System.out.println("|     del primer operando por el segundo.Resultado:2    ");
                             System.out.println("--------------------------------------------------------");
                             break;
                         case 2:
                             System.out.println("-----------------------------------------------------------");
                             System.out.println("-                       RELACIONALES                      -");
                             System.out.println("-----------------------------------------------------------");
                             System.out.println("| == | boolean esIgual=(5==3) | comprueba si los valores   ");
                             System.out.println("|    de dos operandos son iguales.Resultado:false          ");
                             System.out.println("| != | boolean noEsIgual=(5!=3) | comprueba si los valores ");
                             System.out.println("|    de dos operandos no son iguales.Resultado:true        ");
                             System.out.println("| >  | boolean mayor=(5>3) | comprueba si el valor del     ");
                             System.out.println("|      primer operando es mayor que el segundo.            ");
                             System.out.println("|      Resultado:true                                      ");
                             System.out.println("| <  | boolean menor=(5<3) | comprueba si el valor del     ");
                             System.out.println("|      primer operando es menor que el segundo.            ");
                             System.out.println("|      Resultado:false                                     ");
                             System.out.println("| >= | boolean mayorOIgual=(5>=3) | comprueba si el valor  ");
                             System.out.println("|      del primer operando es mayor o igual que el segundo ");
                             System.out.println("|      Resultado:true                                      ");
                             System.out.println("| <= | boolean menorOIgual=(5<=3) | comprueba si el valor  ");
                             System.out.println("|      del primer operando es menor o igual que el segundo ");
                             System.out.println("|      Resultado:false                                     ");
                             System.out.println("-----------------------------------------------------------");
                             break;
                         case 3:
                             System.out.println("-------------------------------------------------------------");
                             System.out.println("-                       LOGICOS                             -");
                             System.out.println("-------------------------------------------------------------");
                             System.out.println("| && | boolean resultado=(5>3&&3<4) | devuelve true si ambos ");
                             System.out.println("|      operandos son true.Resultado:true                     ");
                             System.out.println("| || | boolean resultado=(5>3||3<4) | devuelve true si al    ");
                             System.out.println("|    | menos una de ellas es true                            ");
                             System.out.println("| !  | boolean resultado =!(5>3) | invierte el valor de un   ");
                             System.out.println("|      operando booleano.Resultado:false                     ");
                             System.out.println("-------------------------------------------------------------");
                             break;
                         case 4:
                             System.out.println("------------------------------------------------------------");
                             System.out.println("-                      ASIGNACION                          -");
                             System.out.println("------------------------------------------------------------");
                             System.out.println("| = | int a=5 | asigna el valor del operando derecho al     ");
                             System.out.println("|     operando izquierdo                                    ");
                             System.out.println("| +=| int a=5;a+=3 | suma el operando derecho al operando   ");
                             System.out.println("|     al operando izquierdo y asigna el resultado al        ");
                             System.out.println("|     operando izquierdo.Resultado:8                        ");
                             System.out.println("| -=| int a=5;a-=3 | resta el operando derecho del          ");
                             System.out.println("|     operando izquierdo y asigna el resultado al operando  ");
                             System.out.println("|     izquierdo.Resultado:2                                 ");
                             System.out.println("| *=| int a=5;a*=3 | multiplica el operando derecho por     ");
                             System.out.println("|     el operando izquierdo y asigna el resultado al        ");
                             System.out.println("|     operando izquierdo.Resultado:15                       ");
                             System.out.println("| /=| int a=6;a/=3 | divide el operando izquierdo por el    ");
                             System.out.println("|     operando derecho y asigna el resultado al             ");
                             System.out.println("|     operando izquierdo.Resultado:2                        ");
                             System.out.println("| %=| int a=5;a%=3 | cálcula el módulo del operando         ");
                             System.out.println("|     izquierdo por el operando derecho y asigna el         ");
                             System.out.println("|     resultado al operando izquierdo.Resultado:2           ");
                             System.out.println("------------------------------------------------------------");
                             break;
                         case 5:
                             System.out.println("-----------------------------------------------------------");
                             System.out.println("-                     INCREMENTO/DECREMENTO               -");
                             System.out.println("-----------------------------------------------------------");
                             System.out.println("| ++ | int a=5;a++; incrementa el valor del operando en 1  ");
                             System.out.println("|      Resultado:6                                         ");
                             System.out.println("| -- | int a=5;a--; decrementa el valor del operando en 1  ");
                             System.out.println("|      Resultado:4                                         ");
                             System.out.println("-----------------------------------------------------------");
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
                do{
                System.out.println("-------------------------------------------------");
                System.out.println("-                    SWITCH                     -");
                System.out.println("-------------------------------------------------");
                System.out.println("-          1. Qué es Switch                     -");
                System.out.println("-          2. Sintaxis                          -");
                System.out.println("-          3. Ejemplo                           -");
                System.out.println("-          4. Volver                            -");
                System.out.println("-------------------------------------------------");
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
                        System.out.println("-------------------------------------------------");
                        System.out.println("-                      Volver                    -");
                        System.out.println("-------------------------------------------------");
                        break;


                    default :
                        System.out.println("-               Opción No valida               -");

                }

                    scannerMenu.nextLine(); //Limpiamos buffer del System.in
                    System.out.println("\n\t\tPRESIONE ENTER PARA CONTINUAR..."); //Mensaje en pantalla
                    scannerMenu.nextLine(); //Ahora el programa se detiene hasta que se pulse ENTER*/
                        }while (opcion6!=4);


                break;
            case 7:
                do{
                System.out.println("-------------------------------------------------");
                System.out.println("-                    TERNARÍA                   -");
                System.out.println("-------------------------------------------------");
                System.out.println("-          1. Qué es Operador Ternario          -");
                System.out.println("-          2. Ejemplo                           -");
                System.out.println("-          3. Volver                            -");
                System.out.println("-------------------------------------------------");
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
                        System.out.println("-------------------------------------------------");
                        System.out.println("-                     Volver                    -");
                        System.out.println("-------------------------------------------------");
                        break;

                    default :
                        System.out.println("-               Opción No valida                -");

                                 }

                    scannerMenu.nextLine(); //Limpiamos buffer del System.in
                    System.out.println("\n\t\tPRESIONE ENTER PARA CONTINUAR..."); //Mensaje en pantalla
                    scannerMenu.nextLine(); //Ahora el programa se detiene hasta que se pulse ENTER*/

                }while (opcion7!=3);
                break;
            case 8 :
                do {
                    System.out.println("-------------------------------------------------");
                    System.out.println("-                   DO WHILE                    -");
                    System.out.println("-------------------------------------------------");
                    System.out.println("-               1. Bucle DO WHILE               -");
                    System.out.println("-               2. Ejemplo                      -");
                    System.out.println("-               3. Volver                       -");
                    System.out.println("-------------------------------------------------");
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
                            System.out.println("-------------------------------------------------");
                            System.out.println("-                     Volver                    -");
                            System.out.println("-------------------------------------------------");
                            break;
                        default :
                            System.out.println("-               Opción No valida                -");

                    }

                    scannerMenu.nextLine(); //Limpiamos buffer del System.in
                    System.out.println("\n\t\tPRESIONE ENTER PARA CONTINUAR..."); //Mensaje en pantalla
                    scannerMenu.nextLine(); //Ahora el programa se detiene hasta que se pulse ENTER*/

                }while (opcion8!=3);
                break;
            case 9:

                do {
                    System.out.println("-------------------------------------------------");
                    System.out.println("-                     WHILE                     -");
                    System.out.println("-------------------------------------------------");
                    System.out.println("-               1. Bucle WHILE               -");
                    System.out.println("-               2. Ejemplo                      -");
                    System.out.println("-               3. Volver                       -");
                    System.out.println("-------------------------------------------------");
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
                            System.out.println("-------------------------------------------------");
                            System.out.println("-                     Volver                    -");
                            System.out.println("-------------------------------------------------");
                            break;

                        default :
                            System.out.println("-               Opción No valida                -");

                    }

                    scannerMenu.nextLine(); //Limpiamos buffer del System.in
                    System.out.println("\n\t\tPRESIONE ENTER PARA CONTINUAR..."); //Mensaje en pantalla
                    scannerMenu.nextLine(); //Ahora el programa se detiene hasta que se pulse ENTER*/

                }while (opcion9!=3);
                break;
            case 10:
                do {
                    System.out.println("-------------------------------------------------");
                    System.out.println("-                      FOR                      -");
                    System.out.println("-------------------------------------------------");
                    System.out.println("-               1. FOR                          -");
                    System.out.println("-               2. Ejemplo                      -");
                    System.out.println("-               3. Volver                       -");
                    System.out.println("-------------------------------------------------");
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
                            System.out.println("-------------------------------------------------");
                            System.out.println("-                     Volver                    -");
                            System.out.println("-------------------------------------------------");
                            break;
                            default :
                            System.out.println("-               Opción No valida                -");

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
                System.out.println("-------------------------------------------------");
                System.out.println("-  OPCIÓN NO VALIDA/INGRESA UNA OPCIÓN DEL MENÚ -");
                System.out.println("-------------------------------------------------");
        }

      //Para pausar la ejecución del programa


     /* scannerMenu.nextLine(); //Limpiamos buffer del System.in
      System.out.println("\n\t\tPRESIONE ENTER PARA CONTINUAR..."); //Mensaje en pantalla
      scannerMenu.nextLine(); //Ahora el programa se detiene hasta que se pulse ENTER*/



  }while (opcion!=0);
        System.out.println("HASTA LUEGO");
    }

}