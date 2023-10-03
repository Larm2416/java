//Mostrar los elementos del arreglo junto con los elemenetos que son pares e impares y hacer su cuenta

import java.util.Random;

public class _p93_ParesImpares  {
    
    public static void  Mostrar(int[] a){
        for(int i=0; i<a.length; i++)
            System.out.print(a[i]+" ");
            System.out.println();
    }

    public static void GenerarAleatorios(int[] a){
        int rango = 20;
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(rango) + 1;
        }
    }

    public static void mostrarPares(int[] a) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }

    public static int contarPares(int[] a) {
        int pares = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                pares++;
            }
        }
        return pares;
    }

    public static void mostrarImpares(int[] a) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }

    public static int contarImpares(int[] a) {
        int impares = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                impares++;
            }
        }
        return impares;
    }
    
    public static void main(String[] args) {
        int MAX=100,pares,impares;
        int[]arrA = new int[MAX];

        System.out.println("\nElementos del arreglo: ");
        GenerarAleatorios(arrA); Mostrar(arrA);

        System.out.println("\nLa cantidad de elementos pares es: " + contarPares(arrA));
        System.out.println("\nLos elementos pares son:");
         mostrarPares(arrA);

        System.out.println("\nLa cantidad de elementos pares es: " + contarImpares(arrA));
        System.out.println("\nLos elementos impares son:");
        mostrarImpares(arrA);

    }
    
}
