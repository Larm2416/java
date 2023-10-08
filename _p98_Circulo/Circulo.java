package _p98_Circulo;

public class Circulo {
    private double Radio;
    private double Area;

    public Circulo() {
    }

    public Circulo(double radio, double area) {
        Radio = radio;
        Area = area;
    }

    public double getRadio(){
        return Radio;
    }
    public void setRadio(double radio) {
        Radio = radio;
    }

    public double getArea() {
        return Math.PI * Radio * Radio;
    }

    public double getCircunferencia() {
        return 2 * Math.PI * Radio;
    }

    @Override
    public String toString() {
        return "Circulo con radio: " + Radio;
    }
}
