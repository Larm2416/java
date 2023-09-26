//Inicializa al declarar dos arreglos, uno de nombres y otro de edades

public class _p83_InicializaNombresEdades {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Pedro", "Luis", "Jose", "Mateo","Maria"};
        int[] edades = {22, 25, 44, 38, 50, 16};

        System.out.println("\nTodos los nombres:");
        for(String nombre : nombres)
            System.out.printf("%s ",nombre);

        System.out.println("\nTodas las edades:");
        for(int edad : edades)
            System.out.printf("%d ",edad);
        
        System.out.println("\nImprime nombres con su respectiva edad");
        for (int i=0; i<nombres.length; i++)
            System.out.printf("Nombres %s, edad %d, nombres %s ",nombres[i],edades[i],nombres[i].toUpperCase());
    }
    
}
