//Administra el pago por estacionamiento de acuerdo a la Zona

import java.util.Scanner;

public class _p32_PagoEstacionamiento {
    public static void main(String[] args) {
        int op;
        Scanner obj = new Scanner(System.in);
        float tasa=0, pago=0, impuesto=0, total=0;

        System.out.println("Administra el pago por estacionamiento de acuerdo a la Zona\n");
        System.out.println("1 - Estacionamiento Tacuba 3%");
        System.out.println("2 - Estacionamiento Portales 5%");
        System.out.println("3 - Estacionamiento Conquistadores 10%");
        System.out.println("4 - Estacionamiento Pajaros Caidos 15%");
        System.out.print("Elige opción ? "); op = obj.nextInt();
        System.out.print("Pago efectuado ? "); pago = obj.nextFloat();

        switch (op) {
            case 1 : tasa = 0.03f;break;
            case 2 : tasa = 0.05f;break;
            case 3 : tasa = 0.10f;break;
            case 4 : tasa = 0.15f;break;
         }
         impuesto = pago * tasa;
         total = pago + impuesto;

         System.out.printf("El pago total con impuesto añadido del estacionamiento es de; %.2f",total);
    }
}
