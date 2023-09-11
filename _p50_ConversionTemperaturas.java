//Calcular la temperatura convertida de grados centígrados a grados farenheit de un rango de valores introducidos por el usuario.

import java.util.Scanner;

public class _p50_ConversionTemperaturas {
    public static void main(String[] args) {
        float ini, fin, Far = 0, Cen = 0;
        Scanner obj = new Scanner(System.in);
        char resp;

        do {
            ini = 0;
            fin = 0;
            System.out.println("\ndame una temperatura en celcius");

            do {
                System.out.println("inicio");
                ini = obj.nextFloat();
                System.out.println("final");
                fin = obj.nextFloat();
            } while (ini > fin);

            Cen = ini;
            System.out.println("Celcius\tFarenheit");

            while (Cen <= fin) {
                Far = (Cen * 9 / 5) + 32;
                System.out.println(String.format("%.2f\t%.2f", Cen, Far));
                Cen++;
            }
            System.out.print("\nDeseas continuar (S/N) ? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp == 'S');

        System.out.println("proceso terminado...");
    }
}