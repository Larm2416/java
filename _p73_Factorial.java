// Calcula e imrime el factorial de un número

import java.util.Scanner;

public class _p73_Factorial {   
    
    public static double Factorial(int n) {
            double f=1;
            for(int i=1; i <= n; i++)
            
            f=f*i;
            return f;
            }
    public static void main(String[] args) {
        int n;
        Scanner obj = new Scanner(System.in);

        System.out.print("Dame un numero ? ");
        n = obj.nextInt();
        System.out.printf("\nEl factorial de %d es %.0f", n, Factorial(n));
    }
}
