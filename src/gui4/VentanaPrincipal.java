package gui4;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private Container contenedor; // Un contenedor de elementos gráficos
    ListaEmpleados empleados; // Un vector de empleados
    private JMenuBar barraMenu; // Una barra de menú principal
    private JMenu menuOpciones; /* Un menú de la barra de menú principal */
    private JMenuItem itemMenu1; // Un ítem de menú
    private JMenuItem itemMenu2; // Un ítem de menú
    private JMenuItem itemMenu3; // Un ítem de menú

    /**
     * Constructor de la clase VentanaPrincipal
     */
    public VentanaPrincipal() {
        empleados = new ListaEmpleados(); // Se crea la lista de empleados

        inicio();
        setTitle("Nómina"); // Establece el título de la ventana
        setSize(280, 380); // Establece el tamaño de la ventana
        setLocationRelativeTo(null); /* La ventana se posiciona en el centro de la pantalla */
        // Establece que el botón de cerrar permitirá salir de la aplicación
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); /* Establece que el tamaño de la ventana no puede cambiar */
    }

    public void inicio() {
        contenedor = getContentPane(); /* Obtiene el panel de contenidos de la ventana */
        contenedor.setLayout(null); /* 									 */

        // Se crea la barra de menús, un menú y tres ítems de menú

        barraMenu = new JMenuBar();
        menuOpciones = new JMenu("Menú");
        itemMenu1 = new JMenuItem("Agregar empleado");
        itemMenu2 = new JMenuItem("Calcular nómina");
        itemMenu3 = new JMenuItem("Guardar archivo");
        menuOpciones.add(itemMenu1); // Se agrega el ítem de menú 1 al menú

        menuOpciones.add(itemMenu2); // Se agrega el ítem de menú 2 al menú

        menuOpciones.add(new JSeparator()); // Se agrega una línea divisoria

        menuOpciones.add(itemMenu3); // Se agrega el ítem de menú 3 al menú

        barraMenu.add(menuOpciones); // Se agregan las opciones de menú al menú

        setJMenuBar(barraMenu); // Se agrega el menú a la ventana
        /*
         * grega al ítem de menú un ActionListener para que gestione eventos del ítem de
         * menú
         */
        itemMenu1.addActionListener(this);
        itemMenu2.addActionListener(this);
        itemMenu3.addActionListener(this);
    }

    /**
     * Método que gestiona los eventos generados en la ventana principal throws
     * Exception Excepción en la creación o escritura del archivo
     */
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == itemMenu1) { /* Se selecciona el ítem de menú 1 */
            // Se crea la ventana de agregar empleado
            VentanaAgregarEmpleado ventanaAgregar = new VentanaAgregarEmpleado(empleados);
            ventanaAgregar.setVisible(true); // Se hace visible la ventana
        }

        if (evento.getSource() == itemMenu2) { /* Se selecciona el ítem de menú 2 */
// Se crea la ventana de nómina
            VentanaNomina ventanaNomina = new VentanaNomina(empleados);
            ventanaNomina.setVisible(true); // Se hace visible la ventana
        }
        if (evento.getSource() == itemMenu3) { /* Se selecciona el ítem de menú 3 */
            try {
                // 1. Convertimos los datos de los empleados en texto usando el método optimizado
                String contenido = empleados.convertirTexto();

                // 2. Definimos el archivo directamente en la raíz del proyecto.
                // Al no poner ninguna ruta absoluta (como C:\...), Java toma por defecto la raíz del proyecto.
                File file = new File("Nomina.txt");

                // 3. Escribimos el contenido de forma moderna y eficiente
                // El bloque try-with-resources cierra automáticamente los flujos (FileWriter/BufferedWriter) al terminar.
                try (FileWriter fw = new FileWriter(file);
                     BufferedWriter bw = new BufferedWriter(fw)) {
                    bw.write(contenido);
                }

                // 4. Obtenemos la ruta absoluta real donde se guardó para mostrársela al usuario
                String rutaAbsoluta = file.getAbsolutePath();
                String texto = "El archivo de la nómina 'Nomina.txt' se ha creado con éxito.\n"
                        + "Ubicación: " + rutaAbsoluta;

                JOptionPane.showMessageDialog(this, texto, "Archivo Guardado", JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al guardar el archivo: " + e.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }
}
