//calcular el volumen de un cilindro dado su radio y altura,

import java.util.Scanner;

public class _p13_VolumenCilindro {
    public static void main(String[] args) {
        double volumen,radio,altura;

        Scanner obj = new Scanner(System.in);

        System.out.print("dame el radio?\n");
        radio = obj.nextDouble();
        System.out.print("dame la altura?\n");
        altura = obj.nextDouble();

        volumen = Math.PI*( (radio * radio) * altura);
        System.out.printf("%.2f", volumen);
        
    }
    
}
