package _p120_Vehiculo;

public class Maquina {
    public String Nombre , Propietario;
    public int Pasajeros;

    public Maquina(String nombre, String propietario, int pasajeros) {
        Nombre = nombre;
        Propietario = propietario;
        Pasajeros = pasajeros;
    }
    
    @Override
    public String toString() {
        return "Maquina [Nombre=" + Nombre + ", Propietario=" + Propietario + ", Pasajeros=" + Pasajeros + "]";
    }

    public String getNombre() {
        return Nombre;
    }

    public String getPropietario() {
        return Propietario;
    }

    public int getPasajeros() {
        return Pasajeros;
    }    

    public void repostar(){
        System.out.println("repostando...");
    }
    public void arrancar(){
        System.out.println("arrancando...");
    }
    public void frenar(){
        System.out.println("Frenando...");
    }





}
