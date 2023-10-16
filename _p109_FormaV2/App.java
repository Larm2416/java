package _p109_FormaV2;

public class App {
    public static void main(String[] args) {
        Circulo c1 = new Circulo("Rojo",true, 10.23);
        System.out.println(c1);
        Circulo c2 = new Circulo("Verde",false, 99.12);
        System.out.println(c2);
        Rectangulo r1 = new Rectangulo("Amarillo", false, 10.0, 20.0);
        System.out.println(r1);
        Rectangulo r2 = new Rectangulo("Azul", true, 15.0, 44.0);
        System.out.println(r2);

        System.out.println("Calculando Areas y Perimetros...");
        System.out.println("La forma es un circulo: ");
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimetro: " + c1.getPerimetro());
        System.out.println("La forma es un circulo: ");
        System.out.println("Area: " + c2.getArea());
        System.out.println("Perimetro: " + c2.getPerimetro());
        System.out.println("La forma es un rectangulo: ");
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimetro: " + r1.getPerimetro());
        System.out.println("La forma es un rectangulo: ");
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimetro: " + r2.getPerimetro());
        
    }
}
