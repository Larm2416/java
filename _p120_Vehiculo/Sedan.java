package _p120_Vehiculo;

public class Sedan extends Maquina implements Familiar {
    public Sedan (String nombre, String propietario, int pasajeros ){
        super(nombre, propietario, pasajeros);
    }
    @Override
    public void sistemaElecrtrico() {
        System.out.println("Es un automovil con sistema electrico es un Sedan"); 
    }
    @Override
    public void combustionInterna() {
        System.out.println("Es un automovil de combustion interna es un Sedan");
    }
    @Override
    public void carroceriaTres() {
        System.out.println("Es de tipo familiar con carroceria en tres partes es un Sedan");
    }

    @Override
    public void chasisMonoCasco() {
        System.out.println("Es de tipo familiar con chasis monocasco es un Sedan"); 
    }
    @Override
    public String toString() {
        return super.toString();
    }

    
}
