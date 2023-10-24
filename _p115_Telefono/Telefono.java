package _p115_Telefono;

public class Telefono implements Gps,Conecta, Radio{

    @Override
    public void obtenerCoordenadas() {
        System.out.println("Obteniendo coordenadas del satelite mas cercano...");
    }

    @Override
    public void bluethoot() {
        System.out.println("Conectando el Bluethoot v3...Cuidado con quien compartes...");
    }

    @Override
    public void wif() {
        System.out.println("Conectando al wifi al canal 5 ghz, si no me pasoo al 2.4 ghz");
    }

    @Override
    public void detenerRadio() {
        System.out.println("Deteniendo Radio...");
    }

    @Override
    public void iniciarRadio() {
        System.out.println("Iniciando Radio...");
    }
    
    
}
