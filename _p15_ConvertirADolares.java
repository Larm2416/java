//Obtener el equivalente de pesos a dolares

import java.util.Scanner;

public class _p15_ConvertirADolares {
    public static void main(String[] args) {
        
         double pesos, dolares ;
        Scanner obj = new Scanner(System.in);

        System.out.print("dame la cantidad de pesos?\n");
        pesos = obj.nextDouble();

        dolares = pesos/16.86;
        System.out.printf("el equicalente de %.2f pesos a dolares es de %.2f dolares",pesos,dolares);
     }
}
