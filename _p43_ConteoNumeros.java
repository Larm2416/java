// Cuenta números: postivos, negativos, ceros, hasta introducir 999

import java.util.Scanner;

public class _p43_ConteoNumeros {
    public static void main(String[] args) {
        int n,c=0,s=0, cp=0, cn=0, cc=0;

        do{
            System.out.print("Numero? "); n =   new Scanner(System.in).nextInt();
            if(n!=999){
                c++;
                s+=n;
                if(n==0) cc++;
                else if(n<0) cn++;
                else cp++;


            }
        }while(n != 999);
        System.out.printf("\n introdujiste %d numeros ", c );
        System.out.printf("\n la suma es %d ", s);
        System.out.printf("\n positivos %d", cp );
        System.out.printf("\n negativos %d", cn );
        System.out.printf("\n cero %d", cc );
        System.out.println("\nProceso terminado ...");
    }
}
