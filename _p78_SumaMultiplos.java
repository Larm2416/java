//imprimir y sumar  los multiplos de 3 o de 4 desde el numero inicio hasta el numero final 

import java.util.Scanner;

public class _p78_SumaMultiplos {

    public static int Suma(int ini, int fin, int constante){
        int suma=0;
        for (int i = ini; i <= fin; i++) {
            if (constante == 3 && i % 3 == 0) {
                System.out.printf("%d ", i);
                suma += i;
            } else if (constante == 4 && i % 4 != 0) {
                System.out.printf("%d ", i);
                suma += i;
            }
        }
        return suma;
    }
    public static void main(String[] args) {
        int ini,fin,constante;
        Scanner obj = new Scanner(System.in);

        do{
        System.out.print("Valor incial ? ");
        ini = obj.nextInt();
        System.out.print("Valor final ? ");
        fin = obj.nextInt();
        }while (ini>= fin);

        do {
            System.out.print("¿Qué variable deseas usar?\n[3]\n[4]\n");
            constante = obj.nextInt();
        } while (constante !=3 && constante != 4);

        System.out.printf("\nla suma del rango es: "+Suma(ini, fin, constante));
        
    }
    
}
