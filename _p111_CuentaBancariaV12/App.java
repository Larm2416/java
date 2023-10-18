package _p111_CuentaBancariaV12;

public class App{
    public static void main(String[] args) {
        Banco miBanco = new Banco("Banco del Norte SA de CV", "Priavada las Cumbres 122");
        miBanco.reporte();
        // Agregamos clientes al banco
        miBanco.agregarCliente(new Cliente("Carlos Fuentes"));
        miBanco.agregarCliente(new Cliente("Juan de la Fuente"));
        miBanco.agregarCliente(new Cliente("Rene Mayorga"));
        miBanco.agregarCliente(new Cliente("Maria Vazques"));
        miBanco.reporte();
        // Agregamos cuentas de diferentes tipos a los clientes del Banco
        miBanco.getClientes().get(0).agregarCuenta(new CuentaDeAhorro(1000,0.10));
        miBanco.getClientes().get(0).agregarCuenta(new CuentaDeAhorro(1000,0.20));
        miBanco.getClientes().get(0).agregarCuenta(new CuentaDeCheques(1000, 500));
        miBanco.getClientes().get(1).agregarCuenta(new CuentaDeCheques(2500, 500));
        miBanco.getClientes().get(2).agregarCuenta(new CuentaDeCheques(2000, 600));
        miBanco.getClientes().get(2).agregarCuenta(new CuentaDeAhorro(2000,0.40));
        miBanco.reporte();
        // Retiramos y depositamos a las diferentes cuentas de algunos clientes
        miBanco.getClientes().get(0).getCuenta().get(0).retira(500);
        miBanco.getClientes().get(0).getCuenta().get(1).retira(100);
        miBanco.getClientes().get(1).getCuenta().get(0).deposita(100);
        miBanco.getClientes().get(2).getCuenta().get(0).deposita(300);
        miBanco.getClientes().get(2).getCuenta().get(1).retira(1000);
        miBanco.reporte();
        miBanco.calcularInteres();
        miBanco.reporte();

    }
}