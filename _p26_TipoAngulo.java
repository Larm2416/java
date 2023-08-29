//Muestra el  tipo de angulo segun los grados 

import java.util.Scanner;

public class _p26_TipoAngulo {
    public static void main(String[] args) {
        System.out.println("Muestra el tipo de ángulo \n");
        System.out.print("Dame un ángulo entre 0 y 360 grados? ");
        int angulo = new Scanner(System.in).nextInt();

        if (angulo >= 0 && angulo <= 360) {
            System.out.print("\n El angulo "+ angulo );
            if (angulo < 90)
                System.out.println(" es agudo");
            if (angulo == 90)
                System.out.println(" es recto");
            if (angulo > 90 && angulo < 180)
                System.out.println(" es obtuso");
            if (angulo == 180)
                System.out.println(" es obtuso");
            if (angulo > 180 && angulo < 360)
                System.out.println("  es concavo ");
            if (angulo == 360)
                System.out.println(" es completo");
        }
        
        else
            System.out.println("\nAngulo fuera de rango ....");

        System.out.println("\nProceso terminado ....");

    }

}
