package _p110_CuentaBancariaV1;

public class App {
    public static void main(String[] args) {
        System.out.println("\nprobando clase  CuentaBancaria ");
        CuentaBancaria cuenta1 = new CuentaBancaria(5000);
        System.out.println("Saldo inicial: " + cuenta1.getSaldo());
        cuenta1.deposita(10000);
        System.out.println("Saldo deposito: " + cuenta1.getSaldo());
        double cretira = 1500;
        boolean retiro = cuenta1.retiro(cretira);
        if(retiro)
        System.out.println("Retiro de: " + cretira + " Exitoso, ya puedes ir a pistear");
        else 
        System.out.println("Lastima Margarito, que otro te invite ");

        System.out.println("\nProbando clase Clinte");
        Cliente cliente1 = new Cliente("Juan Margarito Perez ", cuenta1);
        System.out.println(cliente1);
        Cliente cliente2 = new Cliente("Carlos Catañeda ", new CuentaBancaria(1000));
        System.out.println("Cliente 2 " + cliente2);
        cliente2.getCuenta().deposita(8500);
        System.out.println("Cliente 2 : despues del deposito de 8500: " + cliente2);
        if(cliente2.getCuenta().retiro(1500))
            System.out.println("El retiro de 1500 fue exitoso, te quedo: " + cliente2.getCuenta().getSaldo());
        else
         System.out.println("No more money: ");

         System.out.println("\nProbando clase Banco");
         Banco banco = new Banco("Banco patito", "Calle la escondida S/N");
         banco.agregarCliente(cliente1);
         banco.agregarCliente(cliente2);
         banco.agregarCliente(new Cliente("Felipe Correa", new CuentaBancaria(2000)));
         banco.getClientes().get(0).getCuenta().deposita(1500);
         banco.getClientes().get(1).getCuenta().retiro(1000);
         banco.getClientes().get(2).getCuenta().deposita(12000);
         double totalbanco = 0.0;
         for(Cliente cliente : banco.getClientes()) {
            System.out.println(cliente);
            totalbanco += cliente.getCuenta().getSaldo();
            }
            System.out.println("\nTotal de dinero en el Banco : " + totalbanco);
    }
}