//Conversion de longitudes 

import java.util.Scanner;

public class _p77_MedidasLongitud {

    public static float Centimetros(float p){
        float cm;
        cm = p * 2.54f;
        return cm;
    }
    public static float Pies(float m){
        float pies;
        pies  = m * 3.281f;
        return pies;
    }
    public static void main(String[] args) {
        int op;
        float medidas, res;
        Scanner obj = new Scanner(System.in);

        System.out.print("[1] centimetros\n[2] pies\nElige ? "); op = obj.nextInt();
        switch (op) {
            case 1:
                System.out.print("Convertir a centimetros\nDame las  pulgadas : ");
                medidas = obj.nextFloat();
                res = Centimetros(medidas);
                System.out.printf("%.2f pulgadas equivalen a %.2f centimetros ",medidas, res);
                break;
            case 2:
                System.out.print("Convertir a Pies\nDame los metros : ");
                medidas = obj.nextFloat();
                res = Pies(medidas);
                System.out.printf("%.2f metros equivalen a %.2f pies ",medidas, res);
            default : System.out.print("proceso invalido...");
            break;
        }
    }
}
