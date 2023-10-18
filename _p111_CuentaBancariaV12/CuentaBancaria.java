package _p111_CuentaBancariaV12;

public abstract class CuentaBancaria {
    protected double Saldo;

    public CuentaBancaria(double saldo) {
        Saldo = saldo;
    }

    public void deposita(double cantidad){
        Saldo = Saldo + cantidad;
    }

    public double getSaldo() {
        return Saldo;
    }
    
    public abstract boolean retira(double cantidad);

    @Override
    public String toString() {
        return "CuentaBancaria [Saldo=" + Saldo + "]";
    }
    
}
