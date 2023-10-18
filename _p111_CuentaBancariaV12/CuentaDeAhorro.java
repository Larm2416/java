package _p111_CuentaBancariaV12;

public class CuentaDeAhorro extends CuentaBancaria {
    private double TasaIntereses;

    public CuentaDeAhorro(double saldo, double tasaIntereses) {
        super(saldo);
        TasaIntereses = tasaIntereses;
    }
    public void calcularInteres(){
        Saldo = Saldo + TasaIntereses;
    }

    @Override
    public boolean retira(double cantidad){
        if (Saldo >= cantidad){
            Saldo -= cantidad;
            return true;
        }else return false;
    }

    @Override
    public String toString() {
        return "CuentaDeAhorro [ " + super.toString()+ "TasaIntereses=" + TasaIntereses + "]";
    }
}
