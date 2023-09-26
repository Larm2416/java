//Iniciaizar de forma manual un arreglo de numeros flotantes e imprimirlo 

public class _p81_InicializaArregloNumeros {
    public static void main(String[] args) {
        int MAX=7;
        double[] nums = new double[7];

        nums[0]=5.0;
        nums[1]=10.0;
        nums[2]=15.5;
        nums[3]=20.5;
        nums[4]=25.0;
        nums[5]=100.72;
        nums[6]=90.0;
        // nums[7]= 66; <- no se puede se sale del limite 

        System.out.println("El primer elemento del arreglo es:  "+ nums[0]);
        System.out.println("El primer elemento del arreglo es:  "+ nums[6]);

        System.out.println("Todos los valores del arreglo con un ciclo for tradicional");
        for(int i=0; i<MAX; i++)
            System.out.println(nums[i]);
        
        System.out.println("Todos los valores del arreglo con ciclo for-each :");
        for(double num : nums)
            System.out.println(num);
    }
    
}
