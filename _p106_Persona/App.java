package _p106_Persona;

public class App {
    public static void main(String[] args) {
        Persona p1 = new Persona("Carlos Castañeda", "Av.México 115");
        Persona p2 = new Persona("Alma Gonzales", "Primera de los Bolos 2341");

        Estudiante estudiante = new Estudiante(p1, "Ing.Software", 2023, 500);
        System.out.println(estudiante);
        System.out.println("\n");

        System.out.println(estudiante);
        estudiante.setNombre("Urbano");
        System.out.println("Nombre: : " + estudiante.getNombre());
        System.out.println("Direccion : " + estudiante.getDireccion());
        System.out.println("Carrera : " + estudiante.getCarrera());
        System.out.println("Año : " + estudiante.getAño());
        System.out.println("Colegiatura : " + estudiante.getColegiatura());
        System.out.println("\n");
        
        Apoyo apoyo = new Apoyo(p2, "Licenciatura", 1000);
        apoyo.setPaga(2500);
        System.out.println("Nombre: : " + apoyo.getNombre());
        System.out.println("Direccion : " + apoyo.getDireccion());
        System.out.println("Carrera : " + apoyo.getEscolaridad());
        System.out.println("Carrera : " + apoyo.getPaga());

        Apoyo apoyo2 = new Apoyo("Sra Tere ", "Sierra Madre", "Secundaria", 1000);
        Estudiante estudiante2 = new Estudiante("Edgar", "Calle de abajo 13","Ing.Civil", 2024, 2500);

        System.out.println(apoyo2);
        System.out.println(estudiante2);

    }
    
}
