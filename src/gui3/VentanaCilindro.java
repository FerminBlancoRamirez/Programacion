package gui3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCilindro extends JFrame {
    private JTextField txtRadio, txtAltura;
    private JLabel lblVolumen, lblSuperficie;
    private JButton btnCalcular;

    public VentanaCilindro() {
        setTitle("Calcular Cilindro");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Componentes
        add(new JLabel("  Radio:"));
        txtRadio = new JTextField();
        add(txtRadio);

        add(new JLabel("  Altura:"));
        txtAltura = new JTextField();
        add(txtAltura);

        btnCalcular = new JButton("Calcular");
        add(btnCalcular);
        add(new JLabel("")); // Espacio en blanco para la cuadrícula

        add(new JLabel("  Volumen:"));
        lblVolumen = new JLabel("0.0");
        add(lblVolumen);

        add(new JLabel("  Superficie:"));
        lblSuperficie = new JLabel("0.0");
        add(lblSuperficie);

        // Evento del botón
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double radio = Double.parseDouble(txtRadio.getText());
                    double altura = Double.parseDouble(txtAltura.getText());

                    Cilindro cilindro = new Cilindro(radio, altura);

                    lblVolumen.setText(String.format("%.2f", cilindro.calcularVolumen()));
                    lblSuperficie.setText(String.format("%.2f", cilindro.calcularSuperficie()));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, introduce valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}