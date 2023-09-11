//imprimir los números impares de forma ascendente desde 1 hasta el número que el usuario decida (n),

import java.util.Scanner;

public class _p48_ImparesAscendente  {
    public static void main(String[] args) {
        int c=1,n,s=0,i=0;
        float promedio;
        char resp;
        Scanner obj = new Scanner(System.in);

        do{
            System.out.println("imprime numeros impares hasta donde el usuario elija de forma decendente");
            System.out.print("hasta donde?");
            n= obj.nextInt();
            s=0;
            i=0;
            c = 1;
            while (c<=n) {
                System.out.printf("%d ", c);
                i++;
                s+=c;
                c+=2;
            }

            promedio= s/i;
            System.out.printf("\nLa suma es %d ", c);
            System.out.printf("\n el promedio es: %.2f ", promedio);
            System.out.print("\nDeseas continuar (S/N) ? "); 
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while( resp != 'N' );
        System.out.println("\nGracias por utilizar este programa !");
        
    }
}
