//Calcular el promedio de 3 numeros usando una funcion

import java.util.Scanner;


public class _p65_PromedioNumeros {

    public static float promedio(float num1,float num2,float num3){
        float suma,prom;
        suma = num1 + num2 + num3;
        prom=suma/3;
        return prom;

    }


    public static void main(String[] args) {
        float n1,n2,n3,prom;
        Scanner obj = new Scanner(System.in);

        System.out.print("dame numero 1\n");
        n1=obj.nextFloat();
        System.out.print("dame numero 2\n");
        n2=obj.nextFloat();
        System.out.print("dame numero 3\n");
        n3=obj.nextFloat();

        prom = promedio(n1,n2,n3);
        System.out.printf("\n El promedio es %.2f",prom);

    }
    
}
