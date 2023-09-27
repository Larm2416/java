//Mostrar un arreglo usando una funcion, lo eleva al cuadrado usando una funcion 

import java.util.Scanner;

public class _p86_ArregloMostrar {

    public static void  Mostrar(int[] a){
        for(int i=0; i<a.length; i++)
            System.out.printf(a[i]+" ");
    }

    public static void Cuadrado(int[]a){
        for(int i=0; i<a.length;i++)
        a[i]=a[i]*a[i];
    }
    public static void main(String[] args) {
        int[]arr1= {2,4,6,8,3,5,7};
        int[]arr2= {1,3,5,7,9,11,12,13};

        System.out.println("Elemetos del arreglo original ");
        System.out.println("Elementos de Arr1");
        Mostrar(arr1);
        System.out.println("Elementos de Arr2");
        Mostrar(arr2);
        System.out.println("\nElementos de Arr1 al Cuadrado");
        Cuadrado(arr1); Mostrar(arr1);
        System.out.println("\nElementos de Arr1 al Cuadrado");
        Cuadrado(arr2); Mostrar(arr2);
    }
    
}
