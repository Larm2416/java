package _p108_Vehiculo;

public class App {
    public static void main(String[] args) {
        Compacto v1 = new Compacto("CP0100010122", "Nissan", 2023, 125345.22, 4, 2);
        System.out.println(v1);
        Compacto v2 = new Compacto("CP1000145555", "Nissan", 2010, 54500.33, 6, 4);
        System.out.println(v2);
        Camioneta v3 = new Camioneta("CA104014544", "Dina", 2008, 234567.15, 450.0, 4);
        System.out.println(v3);
        Camioneta v4 = new Camioneta("CA774814599", "Honygan", 2023, 934577.98, 1200.0, 6);
        System.out.println(v4);

        System.out.println("Calculando total de todos los precios...");
        System.out.println(v1.getPrecio());
        System.out.println(v2.getPrecio());
        System.out.println(v3.getPrecio());
        System.out.println(v4.getPrecio());
        double suma;
        suma = v1.getPrecio() + v2.getPrecio() + v3.getPrecio() + v4.getPrecio();
        System.out.println("La suma de precios es: " + suma);
    }
    
}
