//Convertir una temperatura de grados fahrenheit a grados celsius y viceversa 

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class _p143_Temperaturas extends JFrame implements ActionListener, ChangeListener{
    JPanel p1;
    JLabel lblFahrenheit, lblCelsius;
    JTextField txtFahrenheit, txtCelsius;
    ButtonGroup grpOpciones;
    JRadioButton rbtFahrenheit, rbtCelsius;
    JButton btnCalcular, btnSalir;

    public _p143_Temperaturas(){
        super("Convertir temperaturas");

        setLayout(new FlowLayout());
        p1 = new JPanel();
        p1.setLayout(new GridLayout(5, 2));
        lblFahrenheit = new JLabel("Fahrenheit: ", JLabel.RIGHT);
        p1.add(lblFahrenheit);
        txtFahrenheit = new JTextField();
        p1.add(txtFahrenheit);
        lblCelsius = new JLabel("Celsius", JLabel.RIGHT);
        p1.add(lblCelsius);
        txtCelsius = new JTextField();
        p1.add(txtCelsius);
        grpOpciones = new ButtonGroup();
        rbtFahrenheit = new JRadioButton("Fahrenheit");
        rbtCelsius = new JRadioButton("Celsius");
        grpOpciones.add(rbtCelsius);
        grpOpciones.add(rbtFahrenheit);
        p1.add(rbtFahrenheit);
        p1.add(rbtCelsius);
        add(p1);
        btnCalcular = new JButton("Aceptar");
        add(btnCalcular);
        btnSalir = new JButton("Salir");
        add(btnSalir);
        rbtFahrenheit.addChangeListener(this);
        rbtCelsius.addChangeListener(this);
        btnCalcular.addActionListener(this);
        btnSalir.addActionListener(this);
    }
    @Override
    public void stateChanged(ChangeEvent e) {
        txtFahrenheit.setEnabled(true);
        txtCelsius.setEnabled(true);
        if (rbtFahrenheit.isSelected())
            txtFahrenheit.setEnabled(false);
        else
        txtCelsius.setEnabled(false);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        float far,cel;
        if (e.getSource() == btnCalcular) {
            try {
                if(rbtFahrenheit.isSelected()){
                    cel = Float.parseFloat(txtCelsius.getText());
                    far=( cel * 9 / 5 ) + 32;
                    txtFahrenheit.setText(String.format("%.2f", far));
                }else if(rbtCelsius.isSelected()){
                    far= Float.parseFloat((txtFahrenheit.getText()));
                    cel=( far - 32 ) * 5 / 9;
                    txtCelsius.setText(String.format("%.2f", cel));
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Faltan valores",
                        "Error", JOptionPane.ERROR_MESSAGE);

            }
        } else if (e.getSource() == btnSalir) {
            dispose();
        }

    }

    public static void main(String[] args) {
        _p143_Temperaturas app = new _p143_Temperaturas();
        app.setBounds(10, 10, 300, 200);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }




}
