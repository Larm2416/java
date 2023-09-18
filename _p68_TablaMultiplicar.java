//imprime la tabla que el usuario pida hasta donde el pida

import java.util.Scanner;

public class _p68_TablaMultiplicar {

    public static void TablaMultiplicar(int t, int n){
        System.out.printf("tabla de %d \n",t);
        for(int i=1; i<=n; i++)
            System.out.printf("%d x %d = %d\n",t,i, t*i);
        

    }

    public static void main(String[] args) {
        int t,n;
        Scanner obj = new Scanner(System.in);

        System.out.print("Qué tabla quieres? ");
        t = obj.nextInt();
        System.out.print("Hata donde? ");
        n = obj.nextInt();

        TablaMultiplicar(t, n);

    }
    
}
