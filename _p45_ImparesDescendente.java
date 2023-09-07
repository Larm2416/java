// Imprime numeros impares descendente

import java.util.Scanner;

public class _p45_ImparesDescendente {
    public static void main(String[] args) {
        int c,n,s;
        char resp;
        Scanner obj = new Scanner(System.in);

        do{
            System.out.println("imprime numeros impares hasta donde el usuario elija de forma decendente");
            System.out.print("Desde donde?");
            n= obj.nextInt();
            s=0;
            c = n%2==0 ? --n : n;
            while (c>=1) {
                System.out.printf("%d ", c);
                s+=c;
                c-=2;
            }
            System.out.printf("\nLa suma es %d ", c);
            System.out.print("\nDeseas continuar (S/N) ? "); 
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while( resp != 'N' );
        System.out.println("\nGracias por utilizar este programa !");
    }
}
