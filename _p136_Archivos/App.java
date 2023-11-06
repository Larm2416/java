package _p136_Archivos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class App {

    public static void serializarDatos(String archivo, ArrayList<Persona> datos) throws IOException {
        FileOutputStream arch = new FileOutputStream(archivo);
        ObjectOutputStream fpersonas = new ObjectOutputStream(arch);
        fpersonas.writeObject(datos);
        fpersonas.close();
    }

    public static ArrayList<Persona> desSerializarDatos(String archivo) throws IOException, ClassNotFoundException {
        ArrayList<Persona> datos;
        FileInputStream arch = new FileInputStream(archivo);
        ObjectInputStream fpersonas = new ObjectInputStream(arch);
        datos = (ArrayList<Persona>) fpersonas.readObject();
        fpersonas.close();
        return datos;
    }

    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>(), lasPersonas;
        personas.add(new Persona("Carlos Perez", 22, 85.5, "cperez@gmail.com"));
        personas.add(new Persona("Maria Lopez", 15, 34.56, "mlopez@msn.com"));
        personas.add(new Persona("Juan Perez", 40, 95, "jperez@msn.com"));

        try {
            System.out.println("Escribiendo datos de personas en el archivo...");
            serializarDatos("datos.dat", personas);
            System.out.println("Leyendo datos del disco");
            lasPersonas = desSerializarDatos("datos.txt");
            lasPersonas.forEach(p->System.out.println(p));


        } catch (Exception e) {
            System.out.println("Problemas al procesar el archivo: " + e);
        }

    }

}
