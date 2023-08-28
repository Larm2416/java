//Verificar numero

import java.util.Scanner;


public class _P21_VerificaNumero  {
    public static void main(String[] args) {
        int n;

        System.out.print("Verifica si un numero es negativo, positivo o cero: \n");
        System.out.print("Dame un numero: \n");
        n = new Scanner(System.in).nextInt();

        if(n>0)
                System.out.println("El numero es POSITIVO");
        
        if(n<0)
                System.out.println("El numero es NEGATIVO");
        
        if(n==0)
                System.out.println("El numero es CERO");

        System.out.println("Gracias por usar este programa\n");
    }
}
