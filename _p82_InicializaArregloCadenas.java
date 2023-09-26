//Iniciaizar de forma manual un arreglo de cadenas e imprimirlo 

public class _p82_InicializaArregloCadenas {
    public static void main(String[] args) {
        String[] municipios = new String[10];
       
        municipios[0] = "Apozol";
        municipios[1] = "Apulco";
        municipios[2] = "Cañitas";
        municipios[3] = "Jerez";
        municipios[4] = "Fresnillo";
        municipios[5] = "Rio Grande";
        municipios[6] = "Sain Alto";
        municipios[7] = "Sombrerete";
        municipios[8] = "Teul de Gonzalez Ortega";
        municipios[9] = "Autollinga";

        System.out.println("El primer elemento del arreglo es: "+municipios[0]);
        System.out.println("El ultimo elemento del arreglo es: "+municipios[9]);

        System.out.println("Todos los elementos usando for con indice");
        for(int i=0; i<10; i++)
            System.out.println(municipios[i]);

        System.out.println("Todos los elementos usando for-each");
        for(String mun : municipios)
            System.out.println(mun);
    }
    
}
