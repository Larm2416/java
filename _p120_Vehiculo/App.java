package _p120_Vehiculo;

public class App {
    public static void main(String[] args) {
        Sedan miSedan = new Sedan("vochito", "Maria Diaz", 4);
        System.out.println(miSedan);
        miSedan.sistemaElecrtrico();
        miSedan.combustionInterna();
        miSedan.carroceriaTres();
        miSedan.chasisMonoCasco();
        miSedan.repostar();
        miSedan.arrancar();
        miSedan.frenar();
        System.out.println("\n");
    Suv miSuv = new Suv("La Mamalona", "Carlos Castañeda", 6);
    System.out.println(miSuv);
    miSuv.sistemaElecrtrico();
    miSuv.combustionInterna();
    miSuv.traccion4x4();
    miSuv.chasisIndependiente();
    miSuv.repostar();
    miSuv.arrancar();
    miSuv.frenar();
    }
    

    
}
