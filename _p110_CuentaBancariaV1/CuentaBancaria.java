package _p110_CuentaBancariaV1;

public class CuentaBancaria {
    private double Saldo;

    public CuentaBancaria(double saldo) {
        Saldo = saldo;
    }

    public void deposita(double Cantidad){
        Saldo = Saldo+ Cantidad;
    }
    
    public double getSaldo() {
        return Saldo;
    }

    public boolean retiro(double cantidad) {
        if( Saldo >= cantidad) {
            Saldo -= cantidad;
            return true;
        } else return false;
     }

}
