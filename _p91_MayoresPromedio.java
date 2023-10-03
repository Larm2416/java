//Ingresar elementos al arreglo, sacar promedio y los mayores a promedio 

import java.util.Scanner;
public class _p91_MayoresPromedio {
    public static void main(String[] args) {
        int n=0;
        float suma=0f, promedio=0f;
        Scanner obj = new Scanner(System.in);

        System.out.println("\ncuantas calificaciones desea procesar? ");
        n = obj.nextInt();

        float[]calif = new float[n];

        System.out.printf("introduce las %d calificaciones: \n",n);
        for(int i=0; i < calif.length; i++) {
            System.out.printf("Calificacion %d : ",i+1);
            calif[i] = obj.nextFloat();
            suma = suma + calif[i];
            promedio = suma / calif.length;
        }
        System.out.println("\nEl arreglo de calificaciones capturadas es :");
        for ( float cal : calif) {
            System.out.printf("%.2f ", cal);

        }
            System.out.println("\nLa suma es: "+suma);
            System.out.printf("\nEl promedio es: %.2f ",promedio);  
           
            for (int i = 0; i < calif.length; i++) {
                if (calif[i] >= promedio) {
                    System.out.println("\nLas calificaciones mayores al promedio son: " + calif[i]);
                }
        }
    }
}
