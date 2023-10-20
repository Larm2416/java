package _p112_ControlVentas;

public class VentaCredito extends Venta{
    private int Meses;
    private double Interes;

    public VentaCredito(String articulo, double cantidad, double precio, int meses, double interes) {
        super(articulo, cantidad, precio);
        Meses = meses;
        Interes = interes;
    }

    public int getMeses() {
        return Meses;
    }

    public void setMeses(int meses) {
        Meses = meses;
    }

    public double getInteres() {
        return Interes;
    }

    public void setInteres(double interes) {
        Interes = interes;
    }

    @Override
    public double getTotalVenta(){
        double total = Total + (Total *(Meses * Interes/100)) ;
        return total;
    }
    @Override
    public String toString() {
        return "VentaCredito [" +super.toString()+ "Meses=" + Meses + ", Interes=" + Interes + ", total= "+ getTotalVenta()+"]";
    }

    
}
