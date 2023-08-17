//calcular la paga de un trabajador

import java.util.Scanner;

public class _P04_PagaTrabajador {
    public static void main(String[] args) {
        String nombre;
        int horas;
        double pago, tasa, impuesto, pagabruta, paganeta;
        Scanner obj = new Scanner(System.in);

        System.out.print("Nombre del trabajador :"); nombre = obj.nextLine();
        System.out.print("Horas trabajadas    :"); horas = obj.nextInt();
        System.out.print("Paga por hora    :"); pago = obj.nextFloat();
        tasa = 0.3f;  

        pagabruta = horas * pago;
        impuesto = pagabruta * tasa;
        paganeta = pagabruta - impuesto;

        System.out.println("resumen de pagos \n");
        System.out.println(String.format("El trabajador %s, trabajo %d horas, con una paga de %.2f pesos la hora, se asume una tasa de impuestos de %.2f",nombre, horas,pago,tasa));
        System.out.println(String.format("Paga bruta: %.2f",pagabruta));
        System.out.println(String.format("Impuesto: %.2f",impuesto));
        System.out.println(String.format("Paga neta: %.2f",paganeta));
    }
    
}
