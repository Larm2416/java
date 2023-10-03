//ingresar los numeros de un arreglo y decir cual es el menor y cual el mayor

import java.util.Scanner;

public class _p92_MayorMenor {
    
    public static int Mayor(int[]n){
        int m=n[0];
        for(int i=0; i<n.length; i++)
        if(n[i]>m)m=n[i];

        return m;
    }

     public static int Menor(int[]n){
        int m=n[0];
        for(int i=0; i<n.length; i++)
        if(n[i]<m)m=n[i];

        return m;
    }
    public static void main(String[] args) {
        int n;
        Scanner obj = new Scanner (System.in);

        System.out.println("\n¿Cuantos elementos desea agregar?");
        n = obj.nextInt();
        int[]numeros = new int[n];

        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("arreglo[" + i + "]: ");
            numeros[i] = obj.nextInt();
        }

        System.out.println("Los elementos del arreglo son:");
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nEl elemento mayor es: "+ Mayor(numeros));
        System.out.println("\nEl elemento menor es: "+ Menor(numeros));

    }
}
