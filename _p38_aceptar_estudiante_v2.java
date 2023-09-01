//Acepta a un estudiante en base a su edad y sus calificaciones

import java.util.Scanner;

public class _p38_aceptar_estudiante_v2 {
    public static void main(String[] args) {
        String nombre, sexo;
        int edad;
        float c1, c2, c3, promedio;
        Scanner obj = new Scanner(System.in);

        System.out.println("Bienvenida a la universidad para mujeres Kitty Kat SA");

        System.out.println("Acepta a un estudiante en base a su edad, sexo,  y sus calificaciones\n");
        System.out.print("Dame tu nombre ? ");
        nombre = obj.nextLine();
        System.out.print("Dame tu sexo ? ");
        sexo = obj.nextLine();

        if (sexo.equals("hombre")) {
            System.out.println("\n Solo aceptamos estudiantes femeninas ");
        } else {
            System.out.print("Dame la edad ? ");
            edad = obj.nextInt();
            if (edad < 21){
                System.out.println("\n Solo aceptamos estudiantes mayores de edad ");
            }else{ 
                System.out.print("Dame tres calificaciones separadas por Enter:");
            c1 = obj.nextFloat();
            c2 = obj.nextFloat();
            c3 = obj.nextFloat();
            promedio = (c1 + c2 + c3) / 3;
            System.out.printf("Tu promedio es:%.2f ",promedio);
            if (promedio < 8){
                System.out.println("\n NO Cumples con el promedio ");
            }else
                System.out.printf("\n Bienvenida %s,tu sexo es %s tienes %d años de edad y tu promedio es de %.2f",
                        nombre, sexo, edad, promedio);
            }
              
        }

    }
}