// Procesa n calificaciones, calcula la suma y el promedio

import java.util.Scanner;

public class _p41_ProcesaCalificaciones {
    public static void main(String[] args) {
        int n,c;
        float calif=0,suma=0, prom=0;
        Scanner obj = new Scanner(System.in);

        System.out.print("Cuantas calificaciones ? ");
        n = obj.nextInt();
        c = 1;
        while( c <= n ) {
             System.out.printf("Calificacion %d? ",c);
             calif= obj.nextFloat();
             suma = suma + calif;
             c++;
        }
        prom = suma / n;
        System.out.printf("La suma es : %.2f\n", suma);
        System.out.printf("El promedio es : %.2f\n", prom);
    }
}
