package gui3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaEsfera extends JFrame {
    private JTextField txtRadio;
    private JLabel lblVolumen, lblSuperficie;
    private JButton btnCalcular;

    public VentanaEsfera() {
        setTitle("Calcular Esfera");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        // Componentes
        add(new JLabel("  Radio:"));
        txtRadio = new JTextField();
        add(txtRadio);

        btnCalcular = new JButton("Calcular");
        add(btnCalcular);
        add(new JLabel(""));

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

                    Esfera esfera = new Esfera(radio);

                    lblVolumen.setText(String.format("%.2f", esfera.calcularVolumen()));
                    lblSuperficie.setText(String.format("%.2f", esfera.calcularSuperficie()));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, introduce un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}