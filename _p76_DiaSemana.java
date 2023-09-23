//Segun el número ingresado dar un dia de la semana 

import java.util.Scanner;

public class _p76_DiaSemana {
    public static int Dia(int dia){
        if(dia<=0 | dia>7)
            System.out.print("Numero invalido");
        else if (dia==1)
            System.out.print("Es Lunes");
        else if (dia==2)
            System.out.print("Es Martes");
        else if (dia==3)
            System.out.print("Es Miercoles");
        else if (dia==4)
            System.out.print("Es Jueves");
        else if (dia==5)
            System.out.print("Es viernes");
        else if (dia==6)
            System.out.print("Es Sabado");
        else if (dia==7)
            System.out.print("Es Domingo");
        return dia;
    }
    public static void main(String[] args) {
        int n;
        char resp;
        Scanner obj = new Scanner(System.in);
        do{
        
        System.out.println("Dame un numero: ");
        n = obj.nextInt();
        Dia(n);
        
        System.out.print("\nDeseas continuar (S/N) ?");
        resp = Character.toUpperCase(obj.next().charAt(0));

        }while(resp != 'N');
        System.out.println("\nProceso terminado ..");  
    }
}
