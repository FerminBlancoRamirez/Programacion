package gui3;

import javax.swing.*;
import java.awt.*;

public class VentanaFiguras extends JFrame {
    // Componentes que compartirán todas las ventanas de figuras
    protected JButton btnCilindro, btnPiramide, btnEsfera, btnCerrar;
    protected JPanel panelAtributos;


    public VentanaFiguras(String titulo) {
        setTitle(titulo);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));

        // 1. Panel Superior / Central para Atributos Propios
        panelAtributos = new JPanel();
        add(panelAtributos, BorderLayout.CENTER);

        // 2. Panel Inferior para Resultados y Botón

        btnCilindro = new JButton("Cilindro");
        add(btnCilindro);
        btnEsfera = new JButton("Esfera");
        add(btnEsfera);
        btnPiramide= new JButton("Piramide");
        add(btnPiramide);
        btnCerrar=new JButton("Cerrar");
        add(btnCerrar);

        btnEsfera.addActionListener(e->{
            new VentanaEsfera().setVisible(true);
        });

        btnPiramide.addActionListener(e->{
            new VentanaPiramide().setVisible(true);
        });

        btnCilindro.addActionListener(e->{
            new VentanaCilindro().setVisible(true);
        });

        btnCerrar.addActionListener(e->System.exit(0));



    }


}