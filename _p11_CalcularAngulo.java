//calcular un angulo de un triangulo

import java.util.Scanner;

public class _p11_CalcularAngulo {
    public static void main(String[] args) {
        float angulo1, angulo2, angulo3;

        Scanner obj = new Scanner(System.in);

        System.out.print("dame la angulo 1?\n");
        angulo1 = obj.nextFloat();
        System.out.print("dame la angulo 2?\n");
        angulo2 = obj.nextFloat();

        angulo3 = 180-(angulo1 + angulo2) ;
        System.out.println(String.format("El primer angulo 1 es %.2f el segundo angulo es %.2f y su tercer angulo es de %.2f",angulo1, angulo2, angulo3));;
    }
    
}
