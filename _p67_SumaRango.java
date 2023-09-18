//suma de un rango de números 

import java.util.Scanner;

public class _p67_SumaRango {

    public static int SumaRango(int ini, int fin){
        int sum=0;
        for(int  i=ini; i<=fin; i++)
            sum +=1;
        return sum;
    }

    public static void main(String[] args) {
        int ini,fin;
        Scanner obj = new Scanner(System.in);

        do{
            System.out.print("Dame el inicio : "); 
            ini = obj.nextInt();
            System.out.print("Dame el final : "); 
            fin = obj.nextInt();
        }while (ini > fin);

        System.out.printf("La suma de %d a %d es %d",ini,fin, SumaRango(ini, fin) );
        
    }
}