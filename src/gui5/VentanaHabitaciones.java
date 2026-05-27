package gui5;

import gui4.ListaEmpleados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaHabitaciones extends JFrame implements ActionListener {
    private JPanel panelHabitaciones;
    private JPanel panelControles;
    private Hotel miHotel;
    private JLabel[] nombre=new JLabel[10];
    private JLabel[] estados= new JLabel[10];
    private SpinnerNumberModel habitacionAReservar;//Configuracion del spinner
    private JSpinner spinner;
    private JButton btnAceptar;

    public VentanaHabitaciones(Hotel hotel){
        this.miHotel=hotel;
        setTitle("Registro de habitaciones");
        setSize(700,300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        //Dividimos el gui en dos paneles para ordenarlo
        //Panel de las habitaciones
        panelHabitaciones=new JPanel(new GridLayout(2, 5));
        //Añadimos los labels
        for (int i=0; i<miHotel.getHabitaciones().size(); i++){
            //Obtenemos cada habitacion de manera individual
            habitacionHotel habitacionHotel = miHotel.getHabitaciones().get(i);
            nombre[i]=new JLabel("Habitacion "+habitacionHotel.getNumeroHabitacion(), JLabel.CENTER);

            //Ahora comprobamos si la habitacion esta disponible para que aparezca como disponible o reservada
            if (habitacionHotel.isDisponible()) {
                estados[i] = new JLabel("Disponible", JLabel.CENTER);
            }else {
                estados[i]=new JLabel("Reservado", JLabel.CENTER);
            }
            //creamos un minipanel para distribuir las habitaciones
            JPanel panelPorHabitacion=new JPanel(new GridLayout(2, 1, 0, 0));
            panelPorHabitacion.add(nombre[i]);
            panelPorHabitacion.add(estados[i]);
            panelPorHabitacion.setBorder(BorderFactory.createLineBorder(java.awt.Color.LIGHT_GRAY));//codigo para ponerle un pequeño borde a cada minipanel
                                                                                                    //poder identificar mejor cada uno porque no soy capaz de ponerlo como en la imagen

            //añadimos cada uno al panel grande
            panelHabitaciones.add(panelPorHabitacion);
        }

        //Panel de los controles
        panelControles=new JPanel(new FlowLayout(FlowLayout.CENTER,20, 10));
        //Añado el spinner
        habitacionAReservar=new SpinnerNumberModel(1, 1,10, 1);
        spinner=new JSpinner(habitacionAReservar);
        panelControles.add(spinner);
        //añadimos el boton de aceptar
        btnAceptar=new JButton("Aceptar");
        panelControles.add(btnAceptar);
        //añadimos la orejita para que escuche si clico el boton aceptar
        btnAceptar.addActionListener(this);

        //Distribuimos los paneles y los añadimos
        this.setLayout(new BorderLayout());
        this.add(panelHabitaciones, BorderLayout.CENTER);
        this.add(panelControles, BorderLayout.SOUTH);
    }

    //ahora añadimos las acciones del boton
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==btnAceptar){
            int indice=((int) spinner.getValue())-1;
            //Vamos a modificar tanto en el gui como en la clase el estado de la habitacion
            habitacionHotel habitacion=miHotel.getHabitaciones().get(indice+1);
            habitacion.setDisponible(false);
            estados[indice].setText("Reservado");
            VentanaIngreso ventanaIngreso = new VentanaIngreso(indice+1);
            ventanaIngreso.setVisible(true);
        }
    }

    //Estos ejercicios me estan sacando el alma dios santo de mi vida, me niego a que la ia me de la clase entera quiero entenderla
    //Entregar un ejercicio en el cual la parte fundamental del ejercicio te lo hace la ia y no sabes ni que te pone no hace nada de sentido
}
