package _p112_ControlVentas;

public class App{
    public static void main(String[] args) {
        Tienda mTienda = new Tienda("Saims","Carlos Castaneda", "Av. Luis Moya 345");
        // Crea clientes y agrega ventas
        mTienda.agregarCliente(new Cliente("Felipe Calderon", "Av. lomas 123", "calde@msn.com"));
        mTienda.agregarCliente(new Cliente("Enrique Peña ", "5 de Mayo 321 ", "quique@gmail.com"));
        mTienda.agregarCliente(new Cliente("Andres Lopez ", "Palacio Nacional 321 ", "peje@yahoo.com,"));
        mTienda.agregarCliente(new Cliente("Xochitl Gelatina ", "Danone 123", "xochitl@precidencia.gob.mx,"));
        mTienda.reporte();
        // Cliente 1
        mTienda.getClientes().get(0).agregarVenta(new VentaContado("Martillo", 10, 60.50, 10.00, "Sacabrocados"));
        mTienda.getClientes().get(0).agregarVenta(new VentaCredito("Pala", 2, 1170.55, 3, 10));
        //Cliente 2
        mTienda.getClientes().get(1).agregarVenta(new VentaCredito("Clavo", 2.5, 160.34, 2, 20.00));
        mTienda.getClientes().get(1).agregarVenta(new VentaCredito("Cinta de Aislar", 5.0, 71.34, 6, 20.00));
        mTienda.getClientes().get(1).agregarVenta(new VentaContado("Pinzas", 10.00, 650.33, 20.00, "Taladro"));
        //Cliente 3 
        mTienda.getClientes().get(2).agregarVenta(new VentaContado("Thiner", 50.0, 65.00, 10.00, "Aerosol"));
        mTienda.reporte();
        
    }
}