package programas;

import java.util.Scanner;

public class Ejemplos {

    public static void proString(){
        System.out.println("---------------------------------------------------");
        System.out.println("-                  EJEMPLO String                 -");
        System.out.println("---------------------------------------------------");
        System.out.println("String MENSAJE = ''Hola mundo''                    ");
        System.out.println("---------------------------------------------------");
    }

    public static  void proConstantes(){
        System.out.println("---------------------------------------------------");
        System.out.println("-                  EJEMPLO Constante              -");
        System.out.println("---------------------------------------------------");
        System.out.println("public static final int TIEMPO_ESPERA_CONEXION=30; ");
        System.out.println("public static final boolean MODO_DEPURACION=true;  ");
        System.out.println("---------------------------------------------------");
    }

    public static void programaIf(Scanner scannerIf){
        System.out.println("--------------------------------------------------------------");
        System.out.println("-                        EJEMPLO IF                          -");
        System.out.println("--------------------------------------------------------------");
        System.out.println("-Programa que calcula el número mayor y menor de tres valores-");

        int A;
        int B;
        int C;
        System.out.println("ingrese valor para A: ");
        //Scanner scannerIf = new Scanner(System.in);
        A = scannerIf.nextInt();
        System.out.println("ingrese valor para B: ");
        B = scannerIf.nextInt();
        System.out.println("ingrese valor para C: ");
        C = scannerIf.nextInt();

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
    }

    public static void programaSwitch(Scanner scannerSwitch){
        System.out.println("-------------------------------------------------");
        System.out.println("-              EJEMPLO SWITCH                     -");
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

        nota = scannerSwitch.nextInt();

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
    }

    public static void programaTernaria(Scanner scannerTernaria){
        System.out.println("-------------------------------------------------");
        System.out.println("-                   Ejemplo                     -");
        System.out.println("El operador ternario se suele utilizar para decidir \nque valor asignar. Un ejemplo de código del \noperador ternario sería:");
        System.out.println("ingrese el valor: ");
        int vble1;
        int vble2;
        int mayor;

        vble1 = scannerTernaria.nextInt();
        vble2 = scannerTernaria.nextInt();

        mayor = (vble1 > vble2)?vble1:vble2;

        System.out.println("El mayor de los dos números es " + mayor);
        System.out.println("NOTA:En el caso de que la expresión tenga \nun valor de true se retorna el valor \nindicado después del cierre de interrogación (?) \nY si la expresión tiene un valor de false se retorna \nel valor que esté después de los dos puntos (:). ");
        System.out.println("-------------------------------------------------");
    }

    public static void programaDoWhile(){
        System.out.println("-------------------------------------------------");
        System.out.println("-            Ejemplo DO WHILE                   -");
        System.out.println("-------------------------------------------------");

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
        System.out.println("- Este Ejemplo imprime los números menores e iguales a 5.");
    }

    public static void programaWhile(){
        System.out.println("-------------------------------------------------");
        System.out.println("-                Ejemplo WHILE                  -");
        System.out.println("-------------------------------------------------");

        int j = 0;
        while (j < 10) {
            System.out.println(j);
            j++;
        }
        System.out.println("- Este Ejemplo imprime los números del 0 al 9. La \nvariable j se inicializa con 0 antes del ciclo \ny se incrementa en 1 dentro del ciclo, por lo \nque después de 10 iteraciones la condición j < 10 \nserá falsa y el ciclo se detendrá.\n" );

    }

    public static void programaFor(){
        System.out.println("-------------------------------------------------");
        System.out.println("-               Ejemplo FOR                     -");
        System.out.println("-------------------------------------------------");

        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
        System.out.println("- Imprimir solo los números pares del 2 al 20   ");
    }

}
