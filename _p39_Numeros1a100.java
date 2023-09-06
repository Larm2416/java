//imprime los numeros del 1-n en incrementos de i 

import java.util.Scanner;

public class _p39_Numeros1a100 {
    public static void main(String[] args) {
        int c,n,i;

        c=1;

        System.out.print("Hasta donde quieres llegar?");
        n = new Scanner(System.in).nextInt();

        System.out.print("Cuanto incremento ?");
        i = new Scanner(System.in).nextInt();


        while( c <= n ) {
            System.out.print(c + " ");
            c = c + i;

        }
        System.out.println("\nProceso terminado ...");
        System.out.println(c);
    }
}
