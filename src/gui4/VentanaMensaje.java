package gui4;

import gui5.VentanaIngreso;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMensaje extends JFrame implements ActionListener {
    private JLabel respuestas;
    private JButton ok;
    private VentanaIngreso ventanaIngreso;

    public VentanaMensaje(boolean respuesta){
        setTitle("Ingreso de Huesped");
        setSize(400,100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        //Declaramos el panel del texto
        JPanel texto=new JPanel(new GridLayout(1, 1));
        if (respuesta==true){
            respuestas=new JLabel("El huesped a sido registrado", JLabel.CENTER);
            texto.add(respuestas);
        }else {
            respuestas=new JLabel("La introduccion del huesped a sido cancelada correctamente", JLabel.CENTER);
            texto.add(respuestas);
        }

        //Declaramos el panel del boton
        JPanel boton=new JPanel(new GridLayout(1,1 ));
        ok=new JButton("OK");
        boton.add(ok);

        //Añadimos acciones al boton
        ok.addActionListener(this);

        //Ajustamos los paneles
        this.setLayout(new BorderLayout());
        this.add(texto, BorderLayout.CENTER);
        this.add(boton, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==ok){
            //Con esta linea cerramos las dos ventanas
            this.dispose();
            ventanaIngreso.dispose();
        }
    }
}
