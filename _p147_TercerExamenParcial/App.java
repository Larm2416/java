package _p147_TercerExamenParcial;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;

public class App  extends JFrame implements ActionListener{

    ArrayList<Jugador> datos;
    JMenuBar mbrJugador;
    JMenu mnuArchivo, mnuAyuda;
    JMenuItem smnAbrir, smnSalir, smnAcercade, smnGuardar;
    JPanel pnlTabla;
    static JPanel pnlDatos,pnlTotales;
    JPanel pnlBotones;;
    JDialog jdlAcercaDe;
    JLabel lblDatos,lblNombre, lblEdad, lblSexo, lblEstadoCivil,lblDescripcion , lblSalario, lblTotalSal, lblTotalH, lblTotalM, lblTotalS, lblTotalC;
    JTextField txtNombre,txtEdad,txtSexo,txtEstadoCivil,txtDescripcion,txtSalario,txtTotalSal,txtTotalH,txtTotalM,txtTotalS,txtTotalC;
    JScrollPane spane;
    JTable tblDatos; 
    DefaultTableModel modelo;
    JFileChooser fchArchivo;
    JButton btnAgregar, btnGrabar, btnCalcularT;

    public App(){
        super("Actualizar y agregar datos de un jugador ");

        mbrJugador = new JMenuBar();
        setJMenuBar(mbrJugador);

        //Se crea el apartado archivo en el menu
        mnuArchivo = new JMenu("Archivo");
        mbrJugador.add(mnuArchivo);
        //Menu item abri
        smnAbrir = new JMenuItem("Abrir");
        mnuArchivo.add(smnAbrir);
        smnAbrir.addActionListener(this);
        //Memu item guardar
        smnGuardar = new JMenuItem("Guardar");
        mnuArchivo.add(smnGuardar);
        smnGuardar.addActionListener(this);
        //Menu item salir
        mnuArchivo.add(new JSeparator());
        smnSalir = new JMenuItem("Salir");
        mnuArchivo.add(smnSalir);
        smnSalir.addActionListener(this);

        //Se crea apartado Ayuda en el menu
        mnuAyuda = new JMenu("Ayuda");
        mbrJugador.add(mnuAyuda);
        //menu item Acerca de
        smnAcercade =new JMenuItem("Acerca de ..");
        mnuAyuda.add(smnAcercade);
        smnAcercade.addActionListener(this);
        //creamos lo que va a ir dentro de Acerca de
        jdlAcercaDe = new JDialog(this, "Acerca De");
        jdlAcercaDe.setSize(400,250);
        jdlAcercaDe.setLocationRelativeTo(null);
        lblDatos = new JLabel("<html>Programación Oriendada a Objetos I<br>Luis Adrian Rodriguez Martinez<br>Tercer examen parcial</html>",JLabel.CENTER);
        lblDatos.setFont(new Font("Times New Roman",Font.BOLD, 18));
        jdlAcercaDe.add(lblDatos);
        //Creamos la tabla
        setLayout(new GridLayout(5, 1, 0, 0));

        pnlTabla = new JPanel();
        pnlTabla.setLayout(new BoxLayout(pnlTabla,BoxLayout.X_AXIS));
        add(pnlTabla);
        spane = new JScrollPane();
        spane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        pnlTabla.add(spane);
        tblDatos = new JTable();
        tblDatos.getTableHeader().setBackground(Color.CYAN);
        tblDatos.getTableHeader().setForeground(Color.black);
        spane.setViewportView(tblDatos);

        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Nombre","Edad","Sexo","Estado civil","Descripcion","Salario"});
        tblDatos.setModel(modelo);
        tblDatos.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
            int ren = tblDatos.rowAtPoint(e.getPoint());
            mostrarDatos(ren);
            }
        });
        //Añadimos apartados para agregar datos
        pnlDatos = new JPanel();
        add(pnlDatos);
        pnlDatos.setLayout(new GridLayout(7,4,10,2));

        lblNombre = new JLabel("Nombre", SwingConstants.RIGHT);
        pnlDatos.add(lblNombre);
        txtNombre = new JTextField();     
        pnlDatos.add(txtNombre);

        lblEdad = new JLabel("Edad", SwingConstants.RIGHT);
        pnlDatos.add(lblEdad);
        txtEdad = new JTextField();
        pnlDatos.add(txtEdad);

        lblSexo =  new JLabel("Sexo", SwingConstants.RIGHT);
        pnlDatos.add(lblSexo);
        txtSexo = new JTextField();
        pnlDatos.add(txtSexo);

        lblEstadoCivil = new JLabel("Estado civil", SwingConstants.RIGHT);
        pnlDatos.add(lblEstadoCivil);
        txtEstadoCivil = new JTextField();
        pnlDatos.add(txtEstadoCivil);

        lblDescripcion = new JLabel("Descripcion ", SwingConstants.RIGHT);
        pnlDatos.add(lblDescripcion);
        txtDescripcion =new JTextField();
        pnlDatos.add(txtDescripcion);

        lblSalario = new JLabel("Salario", SwingConstants.RIGHT);
        pnlDatos.add(lblSalario);
        txtSalario = new JTextField();
        pnlDatos.add(txtSalario);

        //Apartado Totales
        pnlTotales =  new JPanel();
        add(pnlTotales);
        pnlTotales.setLayout(new GridLayout(6,1,0,0));
        lblTotalSal= new JLabel("Salario total", SwingConstants.RIGHT);
        pnlTotales.add(lblTotalSal);
        txtTotalSal = new JTextField();
        pnlTotales.add(txtTotalSal);
        
        lblTotalH = new JLabel("Total Hombres: ", SwingConstants.RIGHT);
        pnlTotales.add(lblTotalH);
        txtTotalH = new JTextField();
        pnlTotales.add(txtTotalH);

        lblTotalM = new JLabel("Total Mujeres: ", SwingConstants.RIGHT);
        pnlTotales.add(lblTotalM);
        txtTotalM = new JTextField();
        pnlTotales.add(txtTotalM);

        lblTotalS = new JLabel("Total Solteros: ", SwingConstants.RIGHT);
        pnlTotales.add(lblTotalS);
        txtTotalS = new JTextField();
        pnlTotales.add(txtTotalS);

        lblTotalC = new JLabel("Total Casados: ", SwingConstants.RIGHT);
        pnlTotales.add(lblTotalC);
        txtTotalC = new JTextField();
        pnlTotales.add(txtTotalC);

        //Agregamos los botones
        pnlBotones = new JPanel();
        btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(this);
        pnlBotones.add(btnAgregar);
        btnGrabar = new JButton("Grabar");
        btnGrabar.setEnabled(false);
        btnGrabar.addActionListener(this);
        pnlBotones.add(btnGrabar);      
        add(pnlBotones);
        btnCalcularT = new JButton("Calcular Totales");
        btnCalcularT.addActionListener(this);
        pnlBotones.add(btnCalcularT);
        
    }

    public void cargarDatos() {
        
        DefaultTableModel dm = (DefaultTableModel)tblDatos.getModel();
        while(dm.getRowCount()>0){ 
            dm.removeRow(0);
        }
        Object[] obj = new Object[6];
        
        for(int i=0; i<datos.size() ; i++) {
            obj[0] = datos.get(i).getNombre();
            obj[1] = datos.get(i).getEdad();
            obj[2] = datos.get(i).getSexo();
            obj[3] = datos.get(i).getEstadoCivil();
            obj[4] = datos.get(i).getDescripcion();
            obj[5] = datos.get(i).getSalario();
            modelo.addRow(obj);
        }
    }

    public void mostrarDatos(int ren) {

        txtNombre.setText(datos.get(ren).getNombre());
        txtEdad.setText(Integer.toString((datos.get(ren).getEdad())));
        txtSexo.setText(String.valueOf(datos.get(ren).getSexo()));
        txtEstadoCivil.setText((datos.get(ren).getEstadoCivil()));
        txtDescripcion.setText((datos.get(ren).getDescripcion()));
        txtSalario.setText(Double.toString((datos.get(ren).getSalario())));
    }

    public static void activarCampos(boolean actdes) {

        for (Component cp : pnlDatos.getComponents())
            if(cp instanceof JTextField)
                cp.setEnabled(actdes);
        for (Component cp : pnlTotales.getComponents())
            if(cp instanceof JTextField)
                cp.setEnabled(actdes);
        
    }

    public void limpiarCampos() {
        for (Component cp : pnlDatos.getComponents())
            if(cp instanceof JTextField)
                ((JTextField)cp).setText(""); 
        for (Component cp : pnlTotales.getComponents())
            if(cp instanceof JTextField)
                ((JTextField)cp).setText("");   

    }

    public void guardarCampos() {
        Jugador est = new Jugador();
        est.setNombre( txtNombre.getText() );
        est.setEdad( Integer.parseInt(txtEdad.getText() ));
        est.setSexo(txtSexo.getText().charAt(0));
        est.setEstadoCivil(txtEstadoCivil.getText());
        est.setDescripcion(txtDescripcion.getText());
        est.setSalario(Double.parseDouble(txtSalario.getText()));
        datos.add(est);
        cargarDatos();
    } 

   
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == smnSalir) {
            dispose();
        
        } else if(e.getSource()== smnAcercade) {
            jdlAcercaDe.setVisible(true);
        
        } else if (e.getSource() == smnAbrir) {
            fchArchivo = new JFileChooser();
            fchArchivo.setCurrentDirectory(new File("."));
            fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos(.dat)", new String[]{"dat"}));
            int res = fchArchivo.showOpenDialog(null);
            File archivo = fchArchivo.getSelectedFile();
            if (res == JFileChooser.APPROVE_OPTION) {
                File arch = fchArchivo.getSelectedFile();
                try {
                    datos = Util.desSerializarDatos(arch.getName());
                    this.cargarDatos();
                
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(this, "Error al procesar el archivo", "Error",JOptionPane.ERROR_MESSAGE);
                
                }
            }

        } else if(e.getSource()== smnGuardar) {
            fchArchivo = new JFileChooser();
            fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos(.dat)", new String[]{"dat"}));
            fchArchivo.setCurrentDirectory(new File("."));
            int res = fchArchivo.showSaveDialog(this);
            File archivo = fchArchivo.getSelectedFile();
            if (res == JFileChooser.APPROVE_OPTION) {
                File arch = fchArchivo.getSelectedFile();
                try {
                    Util.serializarDatos(arch.getName(),datos);
                    JOptionPane.showMessageDialog(this, "Datos Grabados en : " +
                    arch.getName(),"Correcto" ,JOptionPane.INFORMATION_MESSAGE);
                
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(this, "Error al procesar el archivo", "Error",JOptionPane.ERROR_MESSAGE);
                
                }
            }

        } else if(e.getSource()==btnAgregar) {
            activarCampos(true);
            limpiarCampos();
            txtNombre.requestFocus();
            btnAgregar.setEnabled(false);
            btnGrabar.setEnabled(true);
    
        } else if(e.getSource()==btnGrabar) {
            guardarCampos();
            limpiarCampos();
            activarCampos(false);
            btnGrabar.setEnabled(false);
            btnAgregar.setEnabled(true);
        }else if(e.getSource()==btnCalcularT){

        double totsalario = 0;
        int hombres= 0, mujeres =0, casados = 0, solteros = 0;

        for (Jugador jugador : datos) {
            totsalario = totsalario+ jugador.getSalario();
            txtTotalSal.setText(String.format("%.2f", totsalario));
            char genero = jugador.getSexo();
            if (genero == 'H') {
                hombres++;
                txtTotalH.setText(String.format("%d",hombres));
            } else if (genero == 'M') {
                mujeres++;
                txtTotalM.setText(String.format("%d",mujeres));
            }

            if(jugador.getEstadoCivil().equals("casado")){
                casados++;
                txtTotalC.setText(String.format("%d",casados));
            }else if(jugador.getEstadoCivil().equals("soltero")){
                solteros++;
                txtTotalS.setText(String.format("%d",solteros));
            }

        }

        }
    }
    public static void main(String[] args) {
        App app = new App();
        app.setBounds(10,10,700, 650);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.datos=Util.inicializarDatos();
        app.cargarDatos();
        app.activarCampos(false);
        }

}
