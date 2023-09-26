// Leer el arreglo de n nombres y edades, calcula el promedio de edades

import java.util.Scanner;

public class _p85_NombresEdades {
    public static void main(String[] args) {
        int n=0,s=0,p=0;
        Scanner obj = new Scanner(System.in);

        System.out.println("\ncuantas personas deseas procesar?");
        n=obj.nextInt();
        String[] nombres = new String[n];
        int[] edades = new int[n];

        System.out.printf("\nIntroduce los nombres y las edades de las %d personas que dijiste ",n);
        for(int i=0; i<n; i++){
            obj.nextLine();
            System.out.printf("\nDame el nombre %s ",i+1); 
            nombres[i] = obj.nextLine();
            System.out.printf("Dame su edad ? ", i+1); 
            edades[i] = obj.nextInt();
        }       
        System.out.println("Los nombres capturados son:\n");
        System.out.printf("Nombre\tEdad\n");
        for(int i=0; i<nombres.length; i++) {
            System.out.printf("%s\t%d\n",nombres[i], edades[i]);
            s += edades[i];
        }
        p = s / edades.length;
        
        System.out.printf("\nEl promedio de edades es %d", p);
    }
    
}
