/*La empresa cocacola solicita un sistema que determine los dias de vacaciones a los que tiene derecho un trabajador, tomando en cuenta las siguientes caracteristicas.

-3 departamentos.
Clave 1: Atencion a cliente
Clave 2: Departamento de Logistica
Clave 3: Gerencia

-Con Clave 1:
1 año: 6 dias de vacaciones
2 a 6 años: 14 dias de vacaciones.
mas de 7: 20 dias de vacaciones.

-Con Clave 2:
1 año: 7 dias de vacaciones
2 a 6 años: 15dias de vacaciones.
mas de 7: 22dias de vacaciones.

-Con Clave 3:
1 año: 10 dias de vacaciones
2 a 6 años: 20 dias de vacaciones.
mas de 7: 30 dias de vacaciones.

Solicitar nombre, clave de departamente y antiguedad
*/

import java.util.Scanner;

public class VacacionesCocaCola {

  public static void main(String args[]) {

Scanner scan = new Scanner(System.in);

        String nombre = "";
        int clave = 0;
        int years = 0;
        int vacaciones = 0;

        System.out.println("Como te llamas?");
        nombre = scan.nextLine();

        System.out.println("En que departamente trabajas?");
        System.out.println("1: Atencion a cliente.");
        System.out.println("2: Logistica");
        System.out.println("3: Gerencia");
        clave = scan.nextInt();


        System.out.println("Hace cuantos a;os que estas trabajas en la empresa?");
        years = scan.nextInt();

        if (clave == 1) {
            if (years <= 1) {
                System.out.println( nombre + " Te corresponden 6 dias de vacaciones.");

            } else if (years <= 6) {
                System.out.println (nombre + " Te corresponden 14 dias de vacaciones.");

            } else {
                System.out.println( nombre + " Te corresponden 20 dias de vacaciones.");
            }

        } else if (clave == 2) {
            if (years <= 1) {
                System.out.println (nombre + " Te corresponden 7 dias de vacaciones.");

            } else if (years <= 6){
                System.out.println (nombre + " Te corresponden 15 dias de vacaciones.");

            } else {
                System.out.println(nombre + " Te corresponden 22 dias de vacaciones.");
            }

        } else if (clave == 3) {
                if (years <= 1) {
                    System.out.println(nombre + " Te corresponden 10 dias de vacaciones.");

                } else if (years <= 6) {
                    System.out.println(nombre + " Te corresponden 20 dias de vacaciones.");

                } else {
                    System.out.println(nombre + " Te corresponden 30 dias de vacaciones.");

                }
        } else {
                System.out.println("No es una opcion valida");

            }

    
  

  }

}