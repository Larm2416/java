// Imprime tabla de conversión de peso a dolar

import java.util.Scanner;

public class _p46_TablaConversion {
    public static void main(String[] args) {
        float c,ini,fin, tc=17.53f, tcl=21.86f;
        Scanner obj = new Scanner(System.in);
        char resp;
        do{
            System.out.println("imprime una tabala de conversion de peso a dolar y libra en un cierto rango de valores");
            do{
                System.out.print("Inicio : ");
                ini = obj.nextFloat();
                System.out.print("Fin : ");
                fin = obj.nextFloat();
            } while(fin<ini);
            c = ini;
            System.out.println("Peso\tDolar\tLibra");
            while (c<=fin) {
                System.out.printf("%.2f\t%.2f\t%.2f\n",c, c/tc, c/tcl);
                c++;
            }
            System.out.print("\nDeseas continuar (S/N) ? ");resp = Character.toUpperCase(obj.next().charAt(0));
        }while( resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
    }
    
}
