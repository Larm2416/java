package _p108_Vehiculo;

public class Compacto extends Vehiculo{
    private int Pasajeros;
    private int puertas;
     
    public Compacto (){}

    public Compacto(String serie, String marca, int año, double precio, int pasajeros, int puertas) {
        super(serie, marca, año, precio);
        Pasajeros = pasajeros;
        puertas = puertas;
    }

    public int getPasajeros() {
        return Pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        Pasajeros = pasajeros;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        puertas = puertas;
    }

    @Override
    public String toString() {
        return "Compacto ["+ super.toString() + "Pasajeros=" + Pasajeros + ", puertas=" + puertas + "]";
    }

    
}
