package _p112_ControlVentas;

import java.util.ArrayList;

public class Tienda {
    private String Nombre ;
    private String Propietario;
    private String Domicilio ;
    private ArrayList<Cliente>Clientes;
    
    public Tienda() {
        Clientes = new ArrayList<>();
    }

    public Tienda(String nombre, String propietario, String domicilio) {
        this();
       this.Nombre = nombre;
       this.Propietario = propietario;
       this.Domicilio = domicilio;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getPropietario() {
        return Propietario;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }

    public void agregarCliente(Cliente cliente) {
        Clientes.add(cliente);
    }
    public double getTotal() {
        double total = 0.0;
        for (Cliente cliente : Clientes) {
            total += cliente.getTotal();
        }
        return total;
    }

    // Método para generar un reporte de ventas.
    public void reporte() {
        System.out.println("Reporte de clientes sin ventas : " + this);
        for (Cliente cliente : Clientes) {
            if (cliente.getTotal() == 0) {
                System.out.println(">> " + cliente);
            }
        }

        System.out.println("\nReporte de ventas de los clientes : " + this);
        for (Cliente cliente : Clientes) {
            if (cliente.getTotal() > 0) {
                System.out.println(">> " + cliente);
                for (Venta venta : cliente.getVentas()) {
                    System.out.println(venta);
                }
            }
        }
    }
    @Override
    public String toString() {
        return "Tienda [Nombre=" + Nombre + ", Propietario=" + Propietario + ", Domicilio=" + Domicilio + ", Clientes="+ Clientes.size() + ", Total= "+  getTotal()+"]";
    }


}
