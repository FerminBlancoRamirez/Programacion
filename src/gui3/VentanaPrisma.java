package gui3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrisma extends JFrame{
    private JTextField txtLargo, txtAlto, txtAncho;
    private JLabel lblVolumen, lblSuperficie;
    private JButton btnCalcular;

    public VentanaPrisma(){
        setTitle("Calcular Prisma");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2, 10, 10));

        add(new JLabel("  Alto:"));
        txtAlto = new JTextField();
        add(txtAlto);

        add(new JLabel("  Ancho:"));
        txtAncho = new JTextField();
        add(txtAncho);

        add(new JLabel(" Largo:"));
        txtLargo=new JTextField();
        add(txtLargo);

        btnCalcular = new JButton("Calcular");
        add(btnCalcular);
        add(new JLabel(""));

        add(new JLabel("  Volumen:"));
        lblVolumen = new JLabel("0.0");
        add(lblVolumen);

        add(new JLabel("  Superficie:"));
        lblSuperficie = new JLabel("0.0");
        add(lblSuperficie);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });


    }
}
