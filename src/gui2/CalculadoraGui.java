package gui2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalculadoraGui extends JFrame {

    // Componentes de la interfaz
    private JTextField[] camposNotas;
    private JLabel lblPromedio, lblDesviacion, lblMayor, lblMenor;
    private JButton btnCalcular, btnLimpiar;

    // Instancia de la clase lógica que proporcionaste
    private Notas notasLocales;

    public CalculadoraGui() {
        // Configuración de la ventana principal
        setTitle("Calculadora de Notas");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setLayout(new BorderLayout(10, 10));

        notasLocales = new Notas();
        camposNotas = new JTextField[5];

        // --- Panel Superior: Título ---
        JLabel lblTitulo = new JLabel("Gestión y Cálculo de Notas", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 16));
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(lblTitulo, BorderLayout.NORTH);

        // --- Panel Central: Entrada de datos ---
        JPanel panelCentral = new JPanel();
        panelCentral.setLayout(new GridLayout(6, 2, 5, 10));
        panelCentral.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        for (int i = 0; i < 5; i++) {
            panelCentral.add(new JLabel("Nota " + (i + 1) + ":"));
            camposNotas[i] = new JTextField();
            panelCentral.add(camposNotas[i]);
        }

        // Botones de acción
        btnCalcular = new JButton("Calcular");
        btnLimpiar = new JButton("Limpiar");
        panelCentral.add(btnCalcular);
        panelCentral.add(btnLimpiar);

        add(panelCentral, BorderLayout.CENTER);

        // --- Panel Inferior: Resultados ---
        JPanel panelResultados = new JPanel();
        panelResultados.setLayout(new GridLayout(4, 1, 5, 5));
        panelResultados.setBorder(BorderFactory.createTitledBorder("Resultados Estadísticos"));

        lblPromedio = new JLabel("Promedio: -");
        lblDesviacion = new JLabel("Desviación Estándar: -");
        lblMayor = new JLabel("Nota Mayor: -");
        lblMenor = new JLabel("Nota Menor: -");

        panelResultados.add(lblPromedio);
        panelResultados.add(lblDesviacion);
        panelResultados.add(lblMayor);
        panelResultados.add(lblMenor);

        add(panelResultados, BorderLayout.SOUTH);

        // --- Gestión de Eventos (Acciones de los botones) ---
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // 1. Pasar las notas de los JTextField al array de la lógica
                    for (int i = 0; i < camposNotas.length; i++) {
                        String texto = camposNotas[i].getText().trim();
                        if (texto.isEmpty()) {
                            throw new IllegalArgumentException("Por favor, rellena todas las notas.");
                        }
                        double valor = Double.parseDouble(texto);
                        if (valor < 0 || valor > 10) { // O el rango máximo de tu país (ej. 5.0 o 100)
                            throw new IllegalArgumentException("Las notas deben estar entre 0 y 10.");
                        }
                        notasLocales.listaNotas[i] = valor;
                    }

                    // 2. Calcular y mostrar resultados formateados a 2 decimales
                    lblPromedio.setText(String.format("Promedio: %.2f", notasLocales.calcularPromedio()));
                    lblDesviacion.setText(String.format("Desviación Estándar: %.2f", notasLocales.calcularDesviacion()));
                    lblMayor.setText(String.format("Nota Mayor: %.2f", notasLocales.calcularMayor()));
                    lblMenor.setText(String.format("Nota Menor: %.2f", notasLocales.calcularMenor()));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(CalculadoraGui.this,
                            "Por favor, introduce solo números válidos (usa el punto para los decimales).",
                            "Error de formato", JOptionPane.ERROR_MESSAGE);
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(CalculadoraGui.this,
                            ex.getMessage(),
                            "Dato inválido", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Limpiar campos de texto
                for (JTextField campo : camposNotas) {
                    campo.setText("");
                }
                // Reiniciar etiquetas
                lblPromedio.setText("Promedio: -");
                lblDesviacion.setText("Desviación Estándar: -");
                lblMayor.setText("Nota Mayor: -");
                lblMenor.setText("Nota Menor: -");
            }
        });
    }

}