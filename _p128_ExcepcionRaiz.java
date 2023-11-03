//Crear un programa que pida al usuario un numero flotante y muestre su raíz cuadrada. Los errores se debe atrapar usando try .. catch como una excepción genérica.

import java.util.Scanner;

public class _p128_ExcepcionRaiz{
    public static void main(String[] args) {
        
        try {
            float n = 0.0f;
            Scanner obj = new Scanner(System.in);
            System.out.println("Dame un valor: ");
            n = obj.nextFloat();

            if (n<0){
                System.out.println("Dame un valor positivo...");
            }else{
            float resultado = (float) Math.sqrt(n);
            System.out.println("La raíz cuadrada de " + n + " es " + resultado);
            }
            
        } catch (Exception e) {
            System.out.println("debe ser un valor numerico  ");
        }
    }
}
