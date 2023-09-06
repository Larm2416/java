// Imprime la tabla de multiplicar que el usuario pida, desde 1 hasta n

import java.util.Scanner;

public class _p42_TablaMultiplicar {
    public static void main(String[] args) {
        int c,t,n;
        Scanner obj = new Scanner(System.in);


        System.out.print("Que tabla quieres ? ");
        t = obj.nextInt();
        System.out.print("Hasta donde ? ");
        n = obj.nextInt();
        c = 1;
        while( c <= n ) {
            System.out.printf("%d x %d = %d\n", c, t, c*t);
             c++;
        }
        System.out.println("\nProceso terminado ...");
    }
}
