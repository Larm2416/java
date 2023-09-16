//imprimir la secuencia de términos, el número de renglones que el usuario desee y su suma

import java.util.Scanner;

public class _p64_SumaTerminos2 {
    public static void main(String[] args) {
        int n,i,n2=0,suma=0;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("Cuantos renglones ? ");
            n = obj.nextInt();

            
            for (i = 1; i <= n; i++) {
                if (i != 1) {
                    System.out.print("+");
                }
                n2=n2*10+1;
                System.out.print(n2);
                suma += n2;

            }
            System.out.println("\nSuma: " + suma);

            System.out.print("\nDeseas continuar (S/N) ?");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nProceso terminado ...");
        
    }
    
}
