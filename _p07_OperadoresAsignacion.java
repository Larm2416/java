//Efectua operaciones sobre un numero entero utilizando los operadores de asignacion 

import java.util.Scanner;

public class _p07_OperadoresAsignacion {
    public static void main(String[] args) {
        
        System.out.print("Dame un numéro?");
        float num=new Scanner(System.in).nextInt();

        System.out.printf("El numero original es : %.2f \n", num);
        System.out.printf("Incrementar 1: %.2f\n", ++num);
        System.out.printf("Sumar 80 : %.2f\n", num+=80);
        System.out.printf("Restar 35 : %.2f\n", num-=35);
        System.out.printf("Multiplicar x 15 : %.2f\n", num*=15);
        System.out.printf("Dividir /4 : %.2f\n", num/=4);
        System.out.printf("Decrementar  1: %.2f\n", --num);
    }
    
}
