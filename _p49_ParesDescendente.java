//imprimir los números pares desde 100 hasta el número que el usuario decida (n),

import java.util.Scanner;

public class _p49_ParesDescendente  {
    public static void main(String[] args) {
        int c,n,i,s;
        float promedio;
        char resp;
        Scanner obj = new Scanner(System.in);

        do{
            System.out.println("imprime numeros pares dese 100 hasta donde el usuario elija de forma decendente");
            System.out.print("hasta donde?");
            n= obj.nextInt();
            s=0;
            i=0;
            c = 100;
            while (c>=n) {
                System.out.printf("%d ", c);
                i++;
                s+=c;
                c-=2;
            }

            promedio=s/i;
            System.out.printf("\nLa suma es %d ", c);
            System.out.printf("\nel promedio  es %.2f ", promedio);
            System.out.print("\nDeseas continuar (S/N) ? "); 
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while( resp != 'N' );
        System.out.println("\nGracias por utilizar este programa !");
    }
}
