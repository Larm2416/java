package _p113_SegundoExamenParcial;

public class JugadorActivo extends Jugador{
    private int Partidos;
    private int Goles;

    public JugadorActivo(String nombre, char sexo, String descripcion, double salario, int partidos, int goles) {
        super(nombre, sexo, descripcion, salario);
        Partidos = partidos;
        Goles = goles;
    }

    @Override
    public double getBono(){
        double bono= (Salario*0.10)+(Partidos*50)+(Goles*5);
        return bono;
    }

    public double getTotal(){
        double Total = 0;
        Total = Salario + getBono();
        return Total;
    }
    @Override
    public String toString() {
        return "JugadorActivo ["+ super.toString() + "Partidos=" + Partidos + ", Goles=" + Goles + ", Bono= "+ getBono() + ", total=" + getTotal() +"]";
    }
    
    
}
