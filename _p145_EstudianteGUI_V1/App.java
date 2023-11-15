package _p145_EstudianteGUI_V1;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.util.ArrayList;

public class App extends JFrame  implements ActionListener{
    ArrayList<Estudiante> datos;

    JMenuBar menuEstudiante;
    JMenu mnuArchivo, mnuAyuda;
    JMenuItem smnAbrir,smnGuardar,smnSalir,smnAcercaDe;
    JDialog jdlAcercaDe;
    JLabel lblDatos,lblNombre,lblEdad,lblPeso,lblCorreo;
    JTextField txtNombre,txtEdad,txtPeso,txtCorreo;
    JPanel pnlTabla,pnlDatos;

    DefaultTableModel modelo;
    JTable tblDatos;    
    JScrollPane spane;


    public App(){
        super("Actualizacion de datos de estudiantes");
        menuEstudiante = new JMenuBar();
        setJMenuBar(menuEstudiante);
        mnuArchivo = new JMenu("Archivo");
        menuEstudiante.add(mnuArchivo);
        mnuAyuda = new JMenu("Ayuda");
        menuEstudiante.add(mnuAyuda);
        smnAbrir = new JMenuItem("Abrir");
        smnGuardar = new JMenuItem("Guardar");
        smnSalir =new JMenuItem("Salir");
        mnuArchivo.add(smnAbrir);
        mnuArchivo.add(smnGuardar);
        mnuArchivo.add(new JSeparator());
        mnuArchivo.add(smnSalir);
        smnAcercaDe = new JMenuItem("Acerca de..");
        mnuAyuda.add(smnAcercaDe); 
        smnSalir.addActionListener(this);
        smnAcercaDe.addActionListener(this);

        jdlAcercaDe = new JDialog(this,"Acerca de ..");
        jdlAcercaDe.setSize(300,250);
        jdlAcercaDe.setLocationRelativeTo(null);
        lblDatos = new JLabel("<html>Programación Oriendada a Objetos I<br>Luis Adrian Rodriguez Martinez </html>",JLabel.CENTER);
        lblDatos.setFont(new Font("Times New Roman",Font.BOLD, 18));
        jdlAcercaDe.add(lblDatos);

        setLayout(new GridLayout(2, 1, 0, 0));

        pnlTabla = new JPanel();
        getContentPane().add(pnlTabla);
        spane = new JScrollPane();
        pnlTabla.add(spane);
        tblDatos = new JTable();
        tblDatos.getTableHeader().setBackground(Color.yellow);
        tblDatos.getTableHeader().setForeground(Color.black);
        spane.setViewportView(tblDatos);

        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Nombre","Edad","Peso","Correo"});
        tblDatos.setModel(modelo);   
        
        pnlDatos = new JPanel();
        getContentPane().add(pnlDatos);
        pnlDatos.setLayout(new GridLayout(4, 2, 0, 0));
        lblNombre = new JLabel("Nombre");
        lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNombre = new JTextField();
        pnlDatos.add(lblNombre);
        pnlDatos.add(txtNombre);
        lblEdad = new JLabel("Edad");
        lblEdad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdad = new JTextField();
        pnlDatos.add(lblEdad);
        pnlDatos.add(txtEdad);
        lblPeso = new JLabel("Peso");
        lblPeso.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPeso = new JTextField();
        pnlDatos.add(lblPeso);
        pnlDatos.add(txtPeso);
        lblCorreo = new JLabel("Correo:");
        lblCorreo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCorreo = new JTextField();
        pnlDatos.add(lblCorreo);
        pnlDatos.add(txtCorreo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == smnSalir) {
            dispose();
            
            } else if(e.getSource()== smnAcercaDe) {
            jdlAcercaDe.setVisible(true); 
            }
    }  
    
    public void cargarDatos() {
        Object[] obj = new Object[4];
        for(int i=0; i<datos.size() ; i++) {
        obj[0] = datos.get(i).getNombre();
        obj[1] = datos.get(i).getEdad();
        obj[2] = datos.get(i).getPeso();
        obj[3] = datos.get(i).getCorreo();
        modelo.addRow(obj);
        }
    }    
    public static void main(String[] args) {
        App app = new App();
        app.setBounds(10,10,550, 400);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.datos=util.inicializarDatos();
        app.cargarDatos();
        }

    
}
