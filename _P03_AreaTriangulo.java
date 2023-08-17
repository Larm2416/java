//calcular area de un triangulo 

import java.util.Scanner;

public class _P03_AreaTriangulo {
    public static void main(String[] args) {
        int base, altura;
        double area;
        Scanner obj = new Scanner(System.in);

        System.out.print("dame la base?\n");
        base = obj.nextInt();
        System.out.print("dame la altura?\n");
        altura = obj.nextInt();

        area = base * altura / 2;

        System.out.println(String.format("El triangulo de base %d y altura %d tiene un area de %.2f",base, altura, area));
        

    }
}
