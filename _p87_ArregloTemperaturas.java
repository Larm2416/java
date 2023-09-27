//Calcula el mayor el menor y busca un arreglo de numeros flotantes usando funciones 

import java.util.Scanner;

public class _p87_ArregloTemperaturas {
    public static void  Mostrar(double[] a){
        for(int i=0; i<a.length; i++)
            System.out.printf(a[i]+" ");
    }

    public static double Mayor(double[]a){
        double m=a[0];
        for(int i=0; i<a.length; i++)
        if(a[i]>m)m=a[i];

        return m;
    }

        public static double Menor(double[]a){
        double m=a[0];
        for(int i=0; i<a.length; i++)
        if(a[i]<m)m=a[i];

        return m;
    }

    public static int Buscar(double[]a, double bus){
        int pos=-1;
        for(int i=0; i<a.length; i++)
            if(a[i]==bus){pos=i;
            break;}
        return pos;
    }
    public static void main(String[] args) {  
        double[] temp = {12.34,56.22,56.78,0.0,10.25,60.22}; 
        System.out.println("\nTemperaturas");
        Mostrar(temp);
        System.out.println("\nEl elemento mayor es: "+ Mayor(temp));
        System.out.println("\nEl elemento menor es: "+ Menor(temp));
        int pos=Buscar(temp,10.00);
        if(pos!=-1)
            System.out.println("\nEl elemento fue encontrado en la pocision: "+pos);
        else
            System.out.println("\nEl elemento a buscar no existe en la temperatura");
    }
}
