package _p107_Forma;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        //Forma f1 = new Forma("Azul"); // no jala xd //System.out.println(f1);

        Circulo circulo = new Circulo("Rojo", 10.3);
        System.out.println(circulo);
        System.out.println("Area Circulo : " + circulo.getArea());
        System.out.println("");
        Triangulo triangulo = new Triangulo("Verde", 10, 20);
        System.out.println(triangulo);
        System.out.println("Area Triángulo : " + triangulo.getArea());

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(circulo);
        formas.add(triangulo);
        formas.add(new Circulo("Azul", 33.45));

        System.out.println("\nTodas las formas :\n");

        for (Forma forma : formas) {
             System.out.println(forma);
             System.out.print("El area del " + (forma instanceof Circulo?"Circulo":"Triangulo"));
        System.out.println(forma.getArea());
        }

    }
    
}
