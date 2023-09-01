//Dados 3 números verificar si son consecutivos 

import java.util.Scanner;

public class _p33_numeros_consecutivos {
    public static void main(String[] args) {
        int  n1, n2, n3;
        Scanner obj = new Scanner(System.in);

        System.out.println("Dame el primer número: \n");
        n1 = obj.nextInt();
        System.out.println("Dame el segundo número: \n");
        n2 = obj.nextInt();
        System.out.println("Dame el tercer número: \n");
        n3 = obj.nextInt();

        
        if (n2 - n1 == 1 && n3 - n2 == 1) {
            System.out.println("Los números son consecutivos.");
        } else {
            System.out.println("Los números no son consecutivos.");
        }
    }


}
