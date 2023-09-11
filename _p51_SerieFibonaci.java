//Imprimir los primeros n números de la será de fibbonaci.

import java.util.Scanner;

public class _p51_SerieFibonaci {
    public static void main(String[] args) {
        int n, a, b, c;
        Scanner obj = new Scanner(System.in);
        char respuesta;

        do{
            System.out.println("hasta donde quieres que termine la serie?");
            n = obj.nextInt();
            a=0; 
            b=1; 
            c=0;

            for(int i = 0; i < n; i++){
                System.out.print(a+" ");
                c= a+b;
                a = b;
                b = c;
            }

            System.out.print("\nDeseas continuar (S/N) ? ");
            respuesta = Character.toUpperCase(obj.next().charAt(0));
        }while(respuesta == 'S');

        System.out.println("proceso terminado...");  
    }
}
