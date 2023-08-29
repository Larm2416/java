//Acepta a un estudiante en base a su edad y sus calificaciones

import java.util.Scanner;

public class _p27_AceptarEstudiante {
    public static void main(String[] args) {
        String nombre;
        int edad;
        float c1,c2;
        Scanner obj = new Scanner(System.in);

        System.out.println("Acepta a un estudiante en base a su edad y sus calificaciones\n");
        System.out.print("Dame tu nombre ? "); 
        nombre = obj.nextLine();
        System.out.print("Dame la edad ? "); 
        edad = obj.nextInt();

        if (edad<18){
                System.out.println("\n Solo aceptamos estudiantes mayores de edad ");
        } else{
            System.out.println("Dame dos calificaciones separadas por Enter:");
            c1 = obj.nextFloat(); c2 = obj.nextFloat();
            if (c1<8 && c2<8)
                 System.out.println("\n Solo aceptamos estudiantes con calificaciones mayores a 8 ");
            else 
                 System.out.printf("\n Bienvenido %s, tienes %d años de edad y tus calificaciones son %.2f y %.2f", nombre,edad,c1,c2);

        }
        System.out.println("\n Proceso terminado... ");
        
    }
}
