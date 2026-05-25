package gui3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPiramide extends JFrame {
    private JTextField txtBase, txtAltura;
    private JLabel lblVolumen, lblSuperficie, lblApotema;
    private JButton btnCalcular;

    public VentanaPiramide() {
        setTitle("Calcular Pirámide");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2, 10, 10));

        // Componentes
        add(new JLabel("  Base (Lado):"));
        txtBase = new JTextField();
        add(txtBase);

        add(new JLabel("  Altura:"));
        txtAltura = new JTextField();
        add(txtAltura);

        btnCalcular = new JButton("Calcular");
        add(btnCalcular);
        add(new JLabel(""));

        add(new JLabel("  Apotema:"));
        lblApotema = new JLabel("0.0");
        add(lblApotema);

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
                    double base = Double.parseDouble(txtBase.getText());
                    double altura = Double.parseDouble(txtAltura.getText());

                    Piramide piramide = new Piramide(base, altura);

                    lblApotema.setText(String.format("%.2f", piramide.calcularApotema()));
                    lblVolumen.setText(String.format("%.2f", piramide.calcularVolumen()));
                    lblSuperficie.setText(String.format("%.2f", piramide.calcularSuperficie()));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, introduce valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}