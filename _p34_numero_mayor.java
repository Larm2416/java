//De 3 numeros verificar cual es el mayor de los 3 

import java.util.Scanner;

public class _p34_numero_mayor {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner obj = new Scanner(System.in);

        System.out.println("Dame el primer número: ");
        n1 = obj.nextInt();
        System.out.println("Dame el segundo número: ");
        n2 = obj.nextInt();
        System.out.println("Dame el tercer número: ");
        n3 = obj.nextInt();
        
        if (n1 > n2 && n1 > n3) {
            System.out.print("El numero mayor es: "+n1);
        }else if (n2 > n1 && n2 > n3) {
            System.out.print("El numero mayor es: "+n2);
        }else{
            System.out.print("El numero mayor es: "+n3);
        }

    }
}
