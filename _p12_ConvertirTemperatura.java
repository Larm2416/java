//Convertir una temperatura de grados fahrenheit a grados celsius

import java.util.Scanner;

public class _p12_ConvertirTemperatura {
    public static void main(String[] args) {
        double celsius, fahrenheit;
        Scanner obj = new Scanner(System.in);

        System.out.print("dame los grados fahrenheit?\n");
        fahrenheit = obj.nextDouble();

        celsius = (fahrenheit - 32.0) * (5.0/9.0);
        System.out.printf("%.2f", celsius);
     }
}
