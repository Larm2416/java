import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class _p135_Archivos4 {

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
        ArrayList<String> nombres = leeDatos(), losnombres;
        try {
            System.out.println("Grabando los nombres o los datos que introduciste");
            grabarArchivo(nombres, "losnombres.txt");
            System.out.println("leyendo los datos del archivo...");
            losnombres = leerArchivo("losnombres.txt");
            losnombres.forEach(n->System.out.println(n));
        } catch (Exception e) {
            System.out.println("Error al procesar los archivos...");
        }
    }
}
