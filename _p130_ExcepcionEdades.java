//Pedir la edad de 5 personas y luego mostralas en un arreglo

import java.util.InputMismatchException;
import java.util.Scanner;

public class _p130_ExcepcionEdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] edades = new int[5];
        
        System.out.println("Captura las edades de 5 personas:");
        
        for (int i = 0; i < 5; i++) {
            try {
                System.out.print("Edad persona " + (i + 1) + ": ");
                edades[i] = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número entero");
                scanner.nextLine(); // Limpiar el búfer de entrada
                i--; // Para que el usuario vuelva a ingresar la edad
            }
        }
        
        System.out.println("Captura terminada. Las edades son:");
        for (int edad : edades) {
            System.out.print(edad + " ");
        }  
    }   
}
