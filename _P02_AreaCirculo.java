//calcular el area de un circulo 

import java.util.Scanner;

public class _P02_AreaCirculo{
    public static void main(String[] args) {
        double radio, area;
        Scanner lradio = new Scanner(System.in);

        System.out.println("\nCalculando el area de un circulo\n");
        System.out.print("\nDame el radio?\n");
        radio = lradio.nextFloat();

        area = Math.PI * Math.pow(radio,2);

        System.out.println("El circulo de radio "+ radio + " tiene un arae de "+ area);
        
    }
}
