package gui5;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.KeyStore;

public class VentanaSalida extends JFrame implements ActionListener {
    private JLabel lblHabitacion, lblfechaIngreso, lblfechaSalida, lblCantidadDias, lblTotal;
    private JTextField txtFechaSalida;
    private JButton calcular, RegistrarSalida;
    private JPanel panel;
    private int dias=0;
    private double dinero=0;

    public VentanaSalida(Hotel hotel, int habitacion){
        setTitle("Salida Huesped");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        //Introducimos informacion en el panel
        panel=new JPanel(new GridLayout(8, 1));
        lblHabitacion=new JLabel("Habitacion: "+habitacion, JLabel.CENTER);
        panel.add(lblHabitacion);
        lblfechaIngreso=new JLabel("Fecha de ingreso: "+hotel.buscarFechaIngresoHabitacion(habitacion), JLabel.LEFT);
        panel.add(lblfechaIngreso);
        lblfechaSalida=new JLabel("Fecha de salida(xxxx-MM-dd):", JLabel.LEFT);
        panel.add(lblfechaSalida);
        txtFechaSalida=new JTextField();
        panel.add(txtFechaSalida);
        calcular=new JButton("Calcular");
        panel.add(calcular);
        //pones a escuchar este boton
        calcular.addActionListener(this);
        lblCantidadDias=new JLabel("Cantidad de dias: "+dias,JLabel.LEFT);
        panel.add(lblCantidadDias);
        lblTotal=new JLabel("Total en $: "+dinero, JLabel.LEFT);
        panel.add(lblTotal);
        RegistrarSalida=new JButton("Registrar Salida");
        panel.add(RegistrarSalida);
        //ponemos a escuchar este boton
        RegistrarSalida.addActionListener(this);

        //Ordenamos el panel
        this.setLayout(new BorderLayout());
        this.add(panel, BorderLayout.CENTER);
    }


    //Ponemos las acciones
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==calcular){
            int fechaIngreso=hotel.buscarFechaIngresoHabitacion(habitacion);
            this.dias= (int) ((fechaSalida.getTime() - fechaIngreso.getTime()) / 86400000);
        }
    }
}
