// Imprmir los numeros del n al 1 en incrementos de i 

import java.util.Scanner;

public class _p40_Numeros100a1 {
    public static void main(String[] args) {
        int c,n,i;

        System.out.print("desde  donde quieres llegar?");
        n = new Scanner(System.in).nextInt();

        System.out.print("Cuanto decremento ?");
        i = new Scanner(System.in).nextInt();

        c=n;


        while( c >= 1 ) {
            System.out.print(c + " ");
            c = c - i;

        }
        System.out.println("\nProceso terminado ...");
        System.out.println(c);
    }
}
