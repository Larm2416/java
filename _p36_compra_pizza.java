//Comprar una pizza

import java.util.Scanner;

public class _p36_compra_pizza {
    public static void main(String[] args) {
        int cantidad;
        double precio,descuento,total;
        String tamaño;
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de la pizza: ");
        tamaño = obj.nextLine();

        System.out.println("Ingrese la cantidad de pizzas: ");
        cantidad = obj.nextInt();

        precio = 0;
        switch (tamaño) {
            case "chica": precio = 5 * cantidad; break;
            case "mediana":precio = 10 * cantidad; break;
            case "grande": precio = 20 * cantidad;break;
        }
        descuento = 0;
        if (precio >= 2000) {
            descuento = precio * 0.15;
        }

        total = precio - descuento;
        
        System.out.println("Tamaño de la compra: " + tamaño);
        System.out.println("Cantidad comprada: " + cantidad);
        System.out.println("Total compra: " + precio);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total de compra con descuento: " + total);
    }
}
