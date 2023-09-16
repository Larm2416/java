//imprimir la secuencia de términos armónicos el número de renglones que el usuario desee y su suma

import java.util.Scanner;

public class _p63_SumaTerminos1 {
    public static void main(String[] args) {
        int n,i;
        double suma=0.0;
        char resp;
        Scanner obj = new Scanner(System.in);

        do{
            System.out.print("¿Cuántos términos? ");
            n = obj.nextInt();

            for(i=1; i<=n; i++){
                if (i != 1) {
                    System.out.print(" + ");
                }
                System.out.print("1/" + i);
                suma += 1.0/ i;
            }
            System.out.println("\nSuma: " + suma);

            System.out.print("\n¿Deseas continuar (S/N)? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        }while (resp != 'N');
        System.out.println("\nProceso terminado ...");

        
    }
}
