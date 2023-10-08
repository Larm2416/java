package _p100_Articulo;

public class Articulo {
    private String Id;
    private String Desc;
    private int Cant;
    private double PrecioUnit;

    public Articulo(){
    }

    public Articulo(String id, String desc, int cant, double preciounit){
        Id = id;
        Desc = desc;
        Cant = cant;
        PrecioUnit = preciounit;
    }
    
    public String getId(){
        return Id;
    }

    public String getDesc(){
        return Desc;
    }

    public int getCant(){
        return Cant;
    }

    public void setCant(int cant){
        Cant = cant;
    }    

    public double getPrecioUnit(){
        return PrecioUnit;
    }

    public void setPrecioUnit(double preciounit){
        PrecioUnit = preciounit;
    }

    public double getTotal(){
        return (PrecioUnit * Cant);
    }

    @Override
    public String toString() {
    return "Articulo{" + "Id='" + Id + '\'' + ", Desc='" + Desc + '\'' + ", Cant=" + Cant + ", PrecioUnit=" + PrecioUnit + '}';
    }
}
