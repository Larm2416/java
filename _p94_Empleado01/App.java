//Manejar objeto

package _p94_Empleado01;

public class App {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();

        empleado.Nombre = "Juan Perez";
        empleado.Edad = 35;

        Empleado empleado2;
        empleado2 = new Empleado();
        empleado2.Nombre = "Maria de jesus";
        empleado2.Edad = 21;
        System.out.println(empleado.toString());
        System.out.println(empleado2.toString());


   

        
    }
    
}
