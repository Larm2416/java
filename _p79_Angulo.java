//determinar el tipo de angulo segun su valor 

import java.util.Scanner;

public class _p79_Angulo {

    public static int Angulo(int ang){
        if(ang<=0 | ang >360)
            System.out.print("Proceso invalido...");
            if (ang>0 && ang < 90)
                System.out.println("El angulo es agudo");
            if (ang == 90)
                System.out.println("El angulo es recto");
            if (ang > 90 && ang < 180)
                System.out.println("El angulo es obtuso");
            if (ang == 180)
                System.out.println("El angulo es obtuso");
            if (ang > 180 && ang < 360)
                System.out.println("El angulo es concavo ");
            if (ang == 360)
                System.out.println("El angulo es completo");
            return ang;
    }

    public static void main(String[] args) {
        int n;
        char resp;
        Scanner obj = new Scanner(System.in);
        do{
        System.out.println("ingresa un numero:");
        n = obj.nextInt();
        
        Angulo(n);
        
        System.out.print("\nDeseas continuar (S/N) ?");
        resp = Character.toUpperCase(obj.next().charAt(0));

        }while(resp != 'N');
        System.out.println("\nProceso terminado .."); 
        
    }
    
}
