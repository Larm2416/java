//imprimir la secuencia de números mostrados el número de renglones que el usuario desee

import java.util.Scanner;

public class _p62_SecuenciaNumeros2 {
    public static void main(String[] args) {
        int i, j, n,car;
        char  resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("Cuantos renglones ? ");
            n = obj.nextInt();
            for (i = 1; i <= n; i++) {
                car=1;
                for (j = 1; j <= i; j++) {
                    System.out.print(car++);
                }
                System.out.println();
            }
            System.out.print("\nDeseas continuar (S/N) ?");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nProceso terminado ..");
        
    }
}
