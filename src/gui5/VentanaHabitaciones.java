package gui5;

import gui4.ListaEmpleados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VentanaHabitaciones extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel habitacion1, habitacion2, habitacion3, habitacion4, habitacion5, habitacion6, habitacion7, habitacion8,
            habitacion9, habitacion10;
    private JScrollPane scrollTabla;
    private JButton btnAceptar, btnCancelar;

    public VentanaHabitaciones() {
        inicio();
        setTitle("Agregar Empleado");
        setSize(320, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
    }


}
