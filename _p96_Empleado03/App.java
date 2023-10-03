package _p96_Empleado03;

public class App {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();

        empleado.setNombre("Juan Perez");
        empleado.setEdad(35);

        Empleado empleado2;
        empleado2 = new Empleado();
        empleado2.setNombre("Maria de Jesús");
        empleado2.setEdad(21);;

        Empleado empleado3;
        empleado3 = new Empleado("Peje", 75);
        empleado3.setNombre("Amlo");
        System.out.println(empleado.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());

        System.out.println(empleado.getNombre());
        System.out.println(empleado2.getNombre());
        System.out.println(empleado3.getNombre());
    }
    
}
