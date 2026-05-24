package gui3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrisma extends JFrame {
    private JTextField txtAreaBase;
    private JTextField txtAltura;
    private JTextField txtPerimetroBase;
    private JLabel lblSuperficie;
    private JLabel lblVolumen;
    private JButton btnCalcular;

    public VentanaPrisma() {
        // Configuración de la ventana
        setTitle("Cálculo de Prisma");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2, 10, 10));

        // Componentes de entrada
        add(new JLabel(" Área de la Base:"));
        txtAreaBase = new JTextField();
        add(txtAreaBase);

        add(new JLabel(" Altura:"));
        txtAltura = new JTextField();
        add(txtAltura);

        add(new JLabel(" Perímetro de la Base:"));
        txtPerimetroBase = new JTextField();
        add(txtPerimetroBase);

        // Botón de acción
        btnCalcular = new JButton("Calcular");
        add(new JLabel(""));
        add(btnCalcular);

        // Componentes de salida
        add(new JLabel(" Superficie:"));
        lblSuperficie = new JLabel("-");
        add(lblSuperficie);

        add(new JLabel(" Volumen:"));
        lblVolumen = new JLabel("-");
        add(lblVolumen);

        // Evento del botón
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double areaBase = Double.parseDouble(txtAreaBase.getText());
                    double altura = Double.parseDouble(txtAltura.getText());
                    double perimetroBase = Double.parseDouble(txtPerimetroBase.getText());

                    // Crear la instancia de tu clase prisma (ajusta a mayúscula si renombras la clase)
                    prisma p = new prisma(areaBase, altura, perimetroBase);

                    // Mostrar resultados
                    lblSuperficie.setText(String.format("%.2f", p.getSuperficie()));
                    lblVolumen.setText(String.format("%.2f", p.getVolumen()));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(VentanaPrisma.this,
                            "Por favor, asegúrate de rellenar todos los campos con números válidos.",
                            "Error de datos",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}