//Leer un arreglo de n calificaciones flotante, calcula suma y promedio

import java.util.Scanner;

public class _p84_LeerArregloCalificaciones {
    public static void main(String[] args) {
        int n=0;
        float suma=0, promedio=0;
        Scanner obj = new Scanner(System.in);

        System.out.println("\ncuantas calificaciones desea procesar? ");
        n = obj.nextInt();

        float[] calif = new float[n];

        System.out.printf("introduce las %d calificaciones: \n",n);
        for(int i=0; i < calif.length; i++) {
            System.out.printf("Calificacion %d : ",i+1);
            calif[i] = obj.nextFloat();
        }
        System.out.println("\nEl arreglo de calificaciones capturadas es :");
        for(float cal : calif) {
            System.out.printf("%.2f ", cal);
            suma = suma + cal;
        }
        promedio = suma / calif.length;

        System.out.printf("\nLa suma de las calificaciones es %.2f", suma);
        System.out.printf("\nEl promedio de las calificaciones es %.2f", promedio);

    }
    
}
