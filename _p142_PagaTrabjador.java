// calcular el pago de u  trabajador segun sus horas trabajadas y el pago por horas 

import javax.swing.*;
import java.awt.event.*;

public class _p142_PagaTrabjador extends JFrame implements ActionListener  {

    JLabel lblNombre ,lblPago, lblHoras, lblTasa, lblPagaBruta, lblImpuestos, lblPagaNeta;
    JTextField txtNombre, txtPago, txtHoras;
    JButton btnCalcular, btnSalir;

    public _p142_PagaTrabjador(){
       super("Calcular la paga de un trabajador");     

       setLayout(null);
       lblNombre = new JLabel("Nombre:");
       lblNombre.setBounds(10, 20, 200, 20);
       add(lblNombre);
       txtNombre = new JTextField();
       txtNombre.setBounds(110, 20, 200, 30);
       add(txtNombre);
       lblHoras = new JLabel("Horas trabajadas: ");
       lblHoras.setBounds(10, 50, 200, 30);
       add(lblHoras);
       txtHoras = new JTextField();
       txtHoras.setBounds(110, 50, 200, 30);
       add(txtHoras);
       lblPago = new JLabel("Paga por horas: ");
       lblPago.setBounds(10, 80, 200, 30);
       add(lblPago);
       txtPago = new JTextField();
       txtPago.setBounds(110, 80, 200, 30);
       add(txtPago);
       lblTasa = new JLabel("Tasa de impuestos del 0.3%");
       lblTasa.setBounds(90, 110, 200, 30);
       add(lblTasa);
       lblPagaBruta = new JLabel(" [Paga Bruta aqui]");
       lblPagaBruta.setBounds(110, 140, 200, 30);
       add(lblPagaBruta);
       lblImpuestos = new JLabel(" [Impuestos  aqui]");
       lblImpuestos.setBounds(110, 170, 200, 30);
       add(lblImpuestos);
       lblPagaNeta = new JLabel(" [Paga neta aqui]");
       lblPagaNeta.setBounds(110, 200, 200, 30);
       add(lblPagaNeta);
       btnCalcular = new JButton("Calcular");
       btnCalcular.setBounds(50, 230, 100, 40);
       add(btnCalcular);
       btnSalir = new JButton("Salir");
       btnSalir.setBounds(170, 230, 100, 40);
       add(btnSalir); 
       btnCalcular.addActionListener(this);
       btnSalir.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre, mensaje;
   
        if(e.getSource() == btnCalcular){
            float horas = Float.parseFloat(txtHoras.getText());
            float paga = Float.parseFloat(txtPago.getText());
            float  tasa = 0.3f;

           float getPagabruta = horas * paga;
           float  getImpuesto = getPagabruta * tasa;
           float getPaganeta = getPagabruta - getImpuesto;  

           float pagabruta = getPagabruta(horas, paga);
           lblPagaBruta.setText(String.format("%.2f", pagabruta));
           float impuesto = getImpuesto(getPagabruta,tasa);
           lblImpuestos.setText(String.format("%.2f", impuesto));
           float pagaNeta = getPaganeta(getPagabruta,getImpuesto);
           lblPagaNeta.setText(String.format("%.2f", pagaNeta ));
        }else if (e.getSource() == btnSalir) {
            JOptionPane.showMessageDialog(this, "Gracias por usar este programa", "Despedida", JOptionPane.INFORMATION_MESSAGE);
            dispose();
    
        }
        
    }
    private float getPagabruta(float horas, float paga) {
        return horas * paga;
    }
    private float getImpuesto(float getPagabruta, float tasa) {
        return getPagabruta * tasa;
    }   
    private float getPaganeta(float getPagabruta, float getImpuesto) {
        return getPagabruta - getImpuesto;
    }

    public static void main(String[] args) {
        _p142_PagaTrabjador app = new _p142_PagaTrabjador();
        app.setBounds(10, 10, 350, 350);
        app.setLocationRelativeTo(null);
        //app.setSize(500, 200);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
