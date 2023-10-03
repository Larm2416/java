//Temperaturas con arreglos

public class _p90_Temperaturas {
    
    public static void  Mostrar(float[] temp){
        for(int i=0; i<temp.length; i++)
            System.out.printf(temp[i]+" ");
    }


    public static void Mayor10(float[]temp){
        for(int i=0;i<temp.length; i++){
            if (temp[i]>10){
                temp[i]=0;
            }
             System.out.printf(temp[i]+"\n ");
        }
    }
    public static void main(String[] args) {
        float[]temperatura = {2.34f, 44.56f, 7.89f, 0.5f, 2.5f, 4.67f, 40.3f, 22.35f, 56.22f};

        System.out.println("Elemetos del arreglo original ");
        System.out.println("El primer elemento es: "+ temperatura[0]);
        System.out.println("El tercer elemento es: "+ temperatura[2]);
        System.out.println("Los elementos del arreglo son: ");
        Mostrar(temperatura);

        System.out.println("\nElementos del arreglo:");
        Mostrar(temperatura); Mayor10(temperatura);        
    }
}