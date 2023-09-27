//Genera arreglos aleatorios y sumalos 

import java.util.Random;

public class _p89_ArregloAleatorios {
    public static void  Mostrar(float[] a){
        for(int i=0; i<a.length; i++)
            System.out.printf("%.2f",a[i]);
        System.out.println();
    }

    public static void GenerarAleatorios(float[] a){
        float min=10.5f, max=41.5f;
        Random rnd = new Random();
        for(int i=0; i < a.length; i++)
            a[i] = Math.abs(rnd.nextFloat(max - min)) + min;
    }
    
    public static void SumaArreglos(float[]a,float[]b,float[]c){
        for(int i=0; i<a.length; i++)
            c[i]=a[i]+b[i];

    }
    public static void main(String[] args) {
        int MAX=15; 
        float[]num1 = new float[MAX];
        float[]num2 = new float[MAX];
        float[]num3 = new float[MAX];

        System.out.println("\nprimer arreglo con numeros aleatorios ");
        GenerarAleatorios(num1); Mostrar(num1);
        System.out.println("\nprimer arreglo con numeros aleatorios ");
        GenerarAleatorios(num2); Mostrar(num2);
        System.out.println("\nla suma de los arreglos es: ");
        SumaArreglos(num1, num2, num3); Mostrar(num3);

    }
    
}
