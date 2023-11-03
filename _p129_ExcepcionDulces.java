//hacer un programa que repoarta n cantidad de dulces entre n cantidad de niños 

import java.util.Scanner;

public class _p129_ExcepcionDulces {
    public static void main(String[] args) {
        try {
            double niños=0.0, dulces=0.0, repartir=0.0;
            Scanner obj = new Scanner(System.in);
            System.out.println("Numero de niños en el barrio: ");
            niños = obj.nextDouble();
            System.out.println("Cantidad de dulces existente ");
            dulces = obj.nextDouble();
            if (dulces == 0){
            System.out.println("no hay dulces para repartir");  
            }else{
            repartir = dulces/niños;
            System.out.println("a cada niño le tocan "+ repartir);
            }

        } catch (Exception e) {
            System.out.println("Los niños y los dulces, deben ser cantidades numéricas");
        }
    }
}
