package gui3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCubo extends JFrame {
    private JTextField txtArista;
    private JLabel lblSuperficie;
    private JLabel lblVolumen;
    private JButton btnCalcular;

    public VentanaCubo() {
        // Configuración de la ventana
        setTitle("Cálculo de Cubo");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        // Componentes
        JLabel lblArista = new JLabel(" Longitud de Arista:");
        txtArista = new JTextField();

        btnCalcular = new JButton("Calcular");
        JLabel lblVacio = new JLabel(""); // Espacio en blanco para la cuadrícula

        JLabel lblResultSup = new JLabel(" Superficie:");
        lblSuperficie = new JLabel("-");

        JLabel lblResultVol = new JLabel(" Volumen:");
        lblVolumen = new JLabel("-");

        // Añadir componentes al layout
        add(lblArista);
        add(txtArista);
        add(lblVacio);
        add(btnCalcular);
        add(lblResultSup);
        add(lblSuperficie);
        add(lblResultVol);
        add(lblVolumen);

        // Evento del botón
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double arista = Double.parseDouble(txtArista.getText());

                    // Crear la instancia de tu clase Cubo
                    Cubo cubo = new Cubo(arista);

                    // Mostrar resultados usando los getters de FiguraGeometrica
                    lblSuperficie.setText(String.format("%.2f", cubo.getSuperficie()));
                    lblVolumen.setText(String.format("%.2f", cubo.getVolumen()));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(VentanaCubo.this,
                            "Por favor, introduce un número válido.",
                            "Error de datos",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}