package gui5;

import gui4.VentanaMensaje;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class VentanaIngreso extends JFrame implements ActionListener{
    private JLabel lblHabitacion, lblFecha, lblHuesped, lblNombre, lblApellidos, lblDNI;
    private JTextField txtNombre, txtApellidos, txtDNI, txtFecha;
    private JButton btnAceptar, btnCancelar;
    private JPanel ingresoDatos;
    private JPanel accion;
    private huesped huesped;

    public VentanaIngreso(int numeroHabitacion){
        setTitle("Ingreso de Huesped");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        //Rellenamos el primer panel
        ingresoDatos=new JPanel(new GridLayout(7, 2,10,10));
        //Añadimos las etiquetas y sus respectivos texFields
        lblHabitacion=new JLabel("Habitacion numero: "+numeroHabitacion, JLabel.LEFT);
        JLabel lblVacio=new JLabel("",JLabel.CENTER);
        ingresoDatos.add(lblHabitacion);
        ingresoDatos.add(lblVacio);

        lblFecha=new JLabel("Fecha (aaaa-mm-dd): ", JLabel.LEFT);
        txtFecha=new JTextField();
        ingresoDatos.add(lblFecha);
        ingresoDatos.add(txtFecha);

        lblHuesped=new JLabel("Huesped: ", JLabel.LEFT);
        JLabel lblVacio2=new JLabel("", JLabel.CENTER);
        ingresoDatos.add(lblHuesped);
        ingresoDatos.add(lblVacio2);

        lblNombre=new JLabel("Nombre: ", JLabel.LEFT);
        txtNombre=new JTextField();
        ingresoDatos.add(lblNombre);
        ingresoDatos.add(txtNombre);

        lblApellidos=new JLabel("Apellidos: ", JLabel.LEFT);
        txtApellidos=new JTextField();
        ingresoDatos.add(lblApellidos);
        ingresoDatos.add(txtApellidos);

        lblDNI=new JLabel("Documento de identidad: ", JLabel.LEFT);
        txtDNI=new JTextField();
        ingresoDatos.add(lblDNI);
        ingresoDatos.add(txtDNI);

        //Ahora rellenamos el segundo panel
        accion=new JPanel(new FlowLayout(FlowLayout.CENTER,20, 10));
        btnAceptar=new JButton("Aceptar");
        btnCancelar=new JButton("Cancelar");
        accion.add(btnAceptar);
        accion.add(btnCancelar);

        //Ponemos los botones a escuchar
        btnAceptar.addActionListener(this);
        btnCancelar.addActionListener(this);

        //Distribuimos los paneles y los añadimos
        this.setLayout(new BorderLayout());
        this.add(ingresoDatos, BorderLayout.NORTH);
        this.add(accion, BorderLayout.SOUTH);

    }

    //Ahora añadimos las acciones de los botones
    @Override
    public void actionPerformed(ActionEvent e){
        boolean accionMensaje;
        if (e.getSource()==btnAceptar){
            accionMensaje=true;
            VentanaMensaje ventanica=new VentanaMensaje(accionMensaje);
            ventanica.setVisible(true);
            //Registramos al huesped
            //para ello necesitamos crear instancias con lo que nos devuelve el JTextField
            String nombre=txtNombre.getText();
            String apellidos=txtApellidos.getText();
            String DNI=txtDNI.getText();
            huesped=new huesped(nombre, apellidos, DNI);
        } else if (e.getSource()==btnCancelar) {
            accionMensaje=false;
            VentanaMensaje ventanica=new VentanaMensaje(accionMensaje);
            ventanica.setVisible(true);
        }
    }

    
}
