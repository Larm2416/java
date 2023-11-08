import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class _p137_ArchivoMunicipios {

    public static ArrayList<String> leeDatos() {
        String dato = "";
        ArrayList<String> datos = new ArrayList<>();
        System.out.println("Introduce un dato, dato vacio para terminar");
        while (true) {
            dato = new Scanner(System.in).nextLine();
            if (!dato.isEmpty())
                datos.add(dato);
            else
                break;
        }
        return datos;
    }

    public static void grabarArchivo(ArrayList<String> datos, String archivo) throws IOException {
        BufferedWriter fdatos = new BufferedWriter(new FileWriter(new File(archivo)));
        for (String dato : datos)
            fdatos.write(dato + "\n");
        fdatos.close();
    }

    public static ArrayList<String> leerArchivo(String archivo) throws IOException {
        ArrayList<String> datos = new ArrayList<>();
        BufferedReader fdatos = new BufferedReader(new FileReader(new File(archivo)));
        String dato;
        while ((dato = fdatos.readLine()) != null)
            datos.add(dato);
        return datos;
    }

    public static void main(String[] args) {
        ArrayList<String> deportes = leeDatos(), losdeportes;
        try {
            System.out.println("Grabando los datos que introduciste");
            grabarArchivo(deportes, "losdeportes.txt");
            System.out.println("leyendo los datos del archivo...");
            losdeportes = leerArchivo("losdeportes.txt");
            losdeportes.forEach(n -> System.out.println(n));
            System.out.println("los datos han sido escritos ");
        } catch (Exception e) {
            System.out.println("Error al procesar los archivos...");
        }
    }
}
