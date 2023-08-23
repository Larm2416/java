//Dada una cantidad en horas, calcular su equivalente en días, minutos y segundos

import  java.util.Scanner;

public class _p14_CalculoTiempo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double dia, horas , minutos, segundos;
        
        System.out.print("dame la cantidad de horas?\n");
        horas = obj.nextDouble();
       
        dia = horas/24;
        minutos= horas*60;
        segundos = horas*3600;

        System.out.printf(String.format("Las horas son:  %.2f horas , en dias son: %.2f dias, en minutos son: %.2f minutos, en segundos son %.2f segundos",horas, dia, minutos, segundos));;
    }
    
}
