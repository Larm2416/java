//verificar una suma

import java.util.Scanner;

public class _P22_VerificaSuma {
    public static void main(String[] args) {
        int n1,n2,n3;

        System.out.print("verificar si la suma de dos numeros es igual al tercer numero: \n");
        System.out.print("Dame numero 1: \n");
        n1 = new Scanner(System.in).nextInt();

        System.out.print("Dame numero 2: \n");
        n2 = new Scanner(System.in).nextInt();

        System.out.print("Dame numero 3: \n");
        n3 = new Scanner(System.in).nextInt();

        if(n1+n2==n3)
                    System.out.print("Los numeros son positivos \n");
        else
            System.out.print("son diferentes \n");

        System.out.println("Gracias por usar este programa\n");
        
        
    }
}
