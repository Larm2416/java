//ingresa 4 numeros y te dire cual es el menor 

import java.util.Scanner;

public class _p75_NumeroMenor {

    public static float Menor(float n1, float n2, float n3, float n4 ) {
        float menor=0;
        if (n1 < n2 && n1 < n3 && n1 < n4)
            menor = n1;
        else if (n2 < n1 && n2 < n3 && n2 < n4)
            menor = n2;
        else if (n3 < n1 && n3 < n2 && n3 < n4)
            menor = n3;
        else if (n4 < n1 && n4 < n2 && n4 < n3)
            menor =n4;
            return menor;
    }
    public static void main(String[] args) {
        float n1,n2,n3,n4;
        char resp;
        Scanner obj = new Scanner(System.in);
        do{ 
        
        System.out.println("ingresa 4 numeros separados por un espacio:");
        n1= obj.nextFloat();
        n2= obj.nextFloat();
        n3= obj.nextFloat();
        n4= obj.nextFloat();
        System.out.printf("\nEl menor de los tres números es : %.2f", Menor(n1, n2, n3,n4));
        
        System.out.print("\nDeseas continuar (S/N) ?");
            resp = Character.toUpperCase(obj.next().charAt(0));

        }while (resp != 'N');
        System.out.println("\nProceso terminado ..");
    }
    
}
