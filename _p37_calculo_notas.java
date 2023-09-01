//Sacar promedio 

import java.util.Scanner;

public class _p37_calculo_notas {
    public static void main(String[] args) {
        double promedio,c1,c2,c3,c4,c5;
        Scanner obj = new Scanner(System.in);

        System.out.println("Dame la primer calificacion: ");
        c1 = obj.nextDouble();
        System.out.println("Dame la segunda calificacion: ");
        c2 = obj.nextDouble();
        System.out.println("Dame la tercera calificacion: ");
        c3 = obj.nextDouble();
        System.out.println("Dame la cuarta calificacion: ");
        c4 = obj.nextDouble();
        System.out.println("Dame la quinta calificacion: ");
        c5 = obj.nextDouble();

        promedio = (c1 + c2 + c3 + c4+ c5)/5;
        System.out.println("Tu promedio es: "+ promedio);

        if (promedio >0 && promedio<=6){
            System.out.println("Quedas reprobado");
        }else if (promedio > 6 && promedio <=7){
            System.out.println("Pasas de panzaso");
        }else if (promedio > 7 && promedio <=8){
            System.out.println("Muy bien, puedes mejorar");
        }else if (promedio > 8 && promedio <=9){
            System.out.println("Excelente sigue asi");
        }else if (promedio > 9 && promedio <=10){
            System.out.println("Perfecto tu esfuerzo vali\u00F3 la pena");
        }
        System.out.println("proceso finalizado...");
    }
}
