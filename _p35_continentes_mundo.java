// Dado un número entero entre 1 y 6 que corresponde a un continente del mundo,

import java.util.Scanner;

public class _p35_continentes_mundo {
    public static void main(String[] args) {
        System.out.println("Dado un numero entre 1 y 7 imprime el dia de la semana\n");
        System.out.print("Dame el día con número? ");
        int continente = new Scanner(System.in).nextInt();

        switch (continente) {
            case 1 : System.out.println("Asia");break;
            case 2 : System.out.println("África");break;
            case 3 : System.out.println("America del norte");break;
            case 4 : System.out.println("America del sur");break;
            case 5 : System.out.println("antartida");break;
            case 6 : System.out.println("Europa");break;
            default : System.out.println("Numero invalido");break;
        }
        System.out.println("\n\nProceso terminado ...");
    }
}
