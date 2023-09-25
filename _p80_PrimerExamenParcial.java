// Examen parcial

import java.util.Scanner;

public class _p80_PrimerExamenParcial {

    public static void main(String[] args) {
        int edad,totalE=0,participante=0,pa=0,pd=0,pt=0,a=0,d=0,t=0,totaldinero=0,hombres=0,mujer=0;
        float pedad;
        String nombre,sexo,tparticipante;
        char resp;
        Scanner obj = new Scanner(System.in);
        
        do{ 
            do{
        System.out.println("ingresa tu nombre: "); nombre = obj.nextLine();
        System.out.println("ingresa tu edad: ");
        edad = obj.nextInt();
        System.out.println("ingresa tu sexo: ");
        System.out.println("Tipo de sexo\n[H]\n[M] ");
        sexo = obj.nextLine();
        System.out.print("Qué tipo de participante\n[A]lumno\n[D]ocente\n[T]rabajador\n");
        tparticipante = obj.nextLine();

        if (edad >=18 && (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("H"))&&(tparticipante.equalsIgnoreCase("A") || tparticipante.equalsIgnoreCase("D")||tparticipante.equalsIgnoreCase("T"))){
            System.out.print("continuemos");
        }else   
            System.out.print("vuelve a revisar los datos");

     }while((edad < 18 || (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("H")) || (!tparticipante.equalsIgnoreCase("A") && !tparticipante.equalsIgnoreCase("D") && !tparticipante.equalsIgnoreCase("T"))));

     participante+=1;
     totalE+=1;
     pedad=totalE/participante;

     if(tparticipante.equalsIgnoreCase("a")){
        pa+=50;
        a+=1;
    }else if(tparticipante.equalsIgnoreCase("d")){ 
        pd+=80;
        d+=1;
    }else if(tparticipante.equalsIgnoreCase("t")){
        pt+=60;
        t+=1;
    }
    totaldinero=pa+pd;

    if(sexo.equalsIgnoreCase("H")){
        hombres+=1;
    }else if(sexo.equalsIgnoreCase("M")){
        mujer+=1;
    }

    System.out.println(" ");
    System.out.println(String.format("total de alumnos: %d, dinero total de los alumnos: %d", a, pa));
    System.out.println(String.format("total de docentes: %d, dinero total de los docentes: %d", d, pd));
    System.out.println(String.format("total de trabajadores: %d, dinero total de los trabajadores: %d", t,pt));
    System.out.println(String.format("total de hombres: %d, ", hombres ));
    System.out.println(String.format("total de mujeres: %d, ", mujer ));
    System.out.println(String.format("total de participantes: %d, ", participante ));
    System.out.println(String.format("total de dinero ganado: %d, ", totaldinero ));
    System.out.println(String.format("Promedio edad: %.2f", pedad));

    System.out.print("\nDeseas continuar (S/N) ?");
    resp = Character.toUpperCase(obj.next().charAt(0));
    }while(resp != 'N');
    System.out.println("\nProceso terminado ..");

    if(totaldinero<100){
        System.out.println("el evento concluye con ganancias bajas");
    }else if(totaldinero>=100 && totaldinero<200){
        System.out.println("el evento concluye con ganancias moderadas");
    }else if(totaldinero>=200){
        System.out.println("el evento concluye con ganancias altas");
    }
     
    }
    
}
