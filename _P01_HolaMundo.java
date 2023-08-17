//Manda un saludo a la pantalla 

public class _P01_HolaMundo{
    public static void main(String[] args) {
        String amigo = "Gonzalo";
        String hermano = "Xavier";
        String mensaje = String.format("Tanto %s como %s desean aprender java",amigo, hermano);

        System.out.println("Hola Mundo desde el lenguaje java");
        System.out.println("\nHola amigo "+amigo+" biemvenido a java");
        System.out.println("\nMi amigo es "+amigo+" mi hermano es "+ hermano +""  );
        System.out.println("\n" + mensaje);
    }
}