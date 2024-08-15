import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        int opcion;

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
                System.out.println("-------------------------------------------------");
                System.out.println("-               DATOS PRIMITIVOS                -");
                System.out.println("-------------------------------------------------");
                break;
            case 2:
                System.out.println("-------------------------------------------------");
                System.out.println("-                    STRING                     -");
                System.out.println("-------------------------------------------------");
                break;
            case 3:
                System.out.println("-------------------------------------------------");
                System.out.println("-                  CONSTANTES                   -");
                System.out.println("-------------------------------------------------");
                break;
             case 4:
                System.out.println("-------------------------------------------------");
                System.out.println("-              TIPOS DE OPERADORES              -");
                System.out.println("-------------------------------------------------");
                 break;
            case 5:
                System.out.println("-------------------------------------------------");
                System.out.println("-             IF - ELSE -  IF ELSE              -");
                System.out.println("-------------------------------------------------");
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


  }while (opcion!=0);
        System.out.println("HASTA LUEGO");
    }

}