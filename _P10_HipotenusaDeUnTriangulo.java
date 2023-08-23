// Calcular la hipotenusa de un triangulo 

import java.util.Scanner;

public class _P10_HipotenusaDeUnTriangulo {
    public static void main(String[] args) {
        double hipotenusa, long1, long2;

        Scanner obj = new Scanner(System.in);

        System.out.print("dame la longitud 1?\n");
        long1 = obj.nextDouble();
        System.out.print("dame la longitud 2?\n");
        long2 = obj.nextDouble();

        hipotenusa =  Math.sqrt(long1 * long1 + long2 * long2);
        System.out.printf("%.2f",hipotenusa);



    }
    
}
