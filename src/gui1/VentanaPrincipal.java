package gui1;

import javax.swing.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class VentanaPrincipal extends JFrame implements ActionListener {

    //Este es nuestro modelo de datos
    private ListaPersonas lista; // El objeto ListaPersonas de la aplicación

    //Este es nuestra vista
    private Container contenedor; // Un contenedor de elementos gráficos

    // Etiquetas estáticas para los nombres de los atributos
    private JLabel nombre, apellidos, telefono, direccion;

    // Campos de ingreso de texto
    private JTextField campoNombre, campoApellidos, campoTelefono, campoDireccion;

    private JButton añadir, eliminar, borrarLista, cargar, guardar; // Botones
    private JList<String> listaNombres; // Lista de personas (añadido tipo genérico)
    private DefaultListModel<String> modelo; // Objeto que modela la lista
    private JScrollPane scrollLista; // Barra de desplazamiento vertical

    /**
     * Constructor de la clase VentanaPrincipal
     */
    public VentanaPrincipal() {
        lista = new ListaPersonas(); // Crea la lista de personas

        //LLamada a la preparacion de la ventana
        inicio();

        setTitle("Personas"); // Establece el título de la ventana
        setSize(270, 400); // Establece el tamaño de la ventana
        setLocationRelativeTo(null); /* La ventana se posiciona en el centro de la pantalla */
        // Establece que el botón de cerrar permitirá salir de la aplicación
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); /* Establece que el tamaño de la ventana no se puede cambiar */
    }

    /**
     * Método que crea la ventana con sus diferentes componentes gráficos
     */
    private void inicio() {
        contenedor = getContentPane(); /* Obtiene el panel de contenidos de la ventana */
        contenedor.setLayout(null); /* Establece que el panel no tiene asociado ningún layout */

        // Establece la etiqueta y el campo nombre
        nombre = new JLabel();
        nombre.setText("Nombre:");
        nombre.setBounds(20, 20, 135, 23);
        campoNombre = new JTextField();
        campoNombre.setBounds(105, 20, 135, 23);

        // Establece la etiqueta y el campo apellidos
        apellidos = new JLabel();
        apellidos.setText("Apellidos:");
        apellidos.setBounds(20, 50, 135, 23);
        campoApellidos = new JTextField();
        campoApellidos.setBounds(105, 50, 135, 23);

        // Establece la etiqueta y el campo teléfono
        telefono = new JLabel();
        telefono.setText("Teléfono:");
        telefono.setBounds(20, 80, 135, 23);
        campoTelefono = new JTextField();
        campoTelefono.setBounds(105, 80, 135, 23);

        // Establece la etiqueta y el campo dirección
        direccion = new JLabel();
        direccion.setText("Dirección:");
        direccion.setBounds(20, 110, 135, 23);
        campoDireccion = new JTextField();
        campoDireccion.setBounds(105, 110, 135, 23);

        // Establece el botón Añadir persona
        añadir = new JButton();
        añadir.setText("Añadir");
        añadir.setBounds(105, 150, 80, 23);
        añadir.addActionListener(this);

        // Establece el botón Eliminar persona
        eliminar = new JButton();
        eliminar.setText("Eliminar");
        eliminar.setBounds(20, 280, 80, 23);//Establece la posicion del boton para eliminar
        //Agrega el boton de actionListener para que gestione el evento
        eliminar.addActionListener(this);

        //Establece boton de cargar lista
        cargar=new JButton();
        cargar.setText("Cargando lista");
        cargar.setBounds(20,320,100,23);
        cargar.addActionListener(this);

        //Establece boton de guardar lista
        guardar=new JButton();
        guardar.setText("Guardar lista");
        guardar.setBounds(140, 320, 100, 23);
        guardar.addActionListener(this);

        // Establece el botón Borrar lista
        borrarLista = new JButton();
        borrarLista.setText("Borrar Lista");
        borrarLista.setBounds(140, 280, 120, 23);
        borrarLista.addActionListener(this);

        // Establece la lista gráfica de personas
        listaNombres = new JList<>();
        listaNombres.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        modelo = new DefaultListModel<>();

        // Establece una barra de desplazamiento vertical
        scrollLista = new JScrollPane();
        scrollLista.setBounds(20, 190, 220, 80);
        scrollLista.setViewportView(listaNombres);

        // Se añade cada componente gráfico al contenedor de la ventana
        contenedor.add(nombre);
        contenedor.add(campoNombre);
        contenedor.add(apellidos);
        contenedor.add(campoApellidos);
        contenedor.add(telefono);
        contenedor.add(campoTelefono);
        contenedor.add(direccion);
        contenedor.add(campoDireccion);
        contenedor.add(añadir);
        contenedor.add(eliminar);
        contenedor.add(borrarLista);
        contenedor.add(scrollLista);
        contenedor.add(cargar);
        contenedor.add(guardar);
    }

    /**
     * Método que gestiona los eventos generados en la ventana principal
     */
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == añadir) {//Si se pulsa el boton añadir
            añadirPersona();//Se invoca añadir persona
        }
        if (evento.getSource() == eliminar) {//Si se pulsa el boton eliminar
            //Se invoca el metodo eliminarNombre que elimina el elemento seleccionado
            eliminarNombre(listaNombres.getSelectedIndex());
        }
        if (evento.getSource() == borrarLista) {//Si se pulsa el boton borrar lista
            //Se invoca borrar lista
            borrarLista();
        }

        //Añadir eventos de cargar y guardar coleccion
    }

    //declarar metodos de cargar y guardar
    public void guardarLista(){
        try{
            FileOutputStream archivo=new FileOutputStream("lista.dat");
            ObjectOutputStream salida=new ObjectOutputStream(archivo);
            salida.writeObject(this.lista);
            salida.close();
            System.out.println("Coleccion guardada con exito");
        }catch (IOException e){
            System.out.println("No se pudo escribir en el archivo"+ e.getMessage());
        }
    }

    public void cargarLista(){
        try {
            FileInputStream archivo=new FileInputStream("lista.dat");
            ObjectInputStream entrada=new ObjectInputStream(archivo);
            this.lista=(ArrayList<Persona>) entrada.readObject();
            entrada.close();
            System.out.println("Coleccion cargada con exito");
        }catch (FileNotFoundException e){
            System.out.println("No se pudo leer el archivo");
        }catch (IOException e){
            System.out.println("Errr de entrada/salida");
        }catch (Exception e){
            System.out.println("Error al leer el archivo");
        }
    }

    /**
     * Método que agrega una persona al vector de personas y a la lista gráfica
     */
    private void añadirPersona() {
        Persona p = new Persona(campoNombre.getText(),
                campoApellidos.getText(),
                campoTelefono.getText(), campoDireccion.getText());
        lista.añadirPersona(p);

        String elemento = campoNombre.getText() + " - " +
                campoApellidos.getText() + " - " +
                campoTelefono.getText() + " - " +
                campoDireccion.getText();

        modelo.addElement(elemento); //Se agrega el texto con los datos de la persona al Jlist
        listaNombres.setModel(modelo);

        // Se limpian los campos de texto
        campoNombre.setText("");
        campoApellidos.setText("");
        campoTelefono.setText("");
        campoDireccion.setText("");
    }

    /**
     * Método que elimina una persona del vector y de la lista gráfica
     */
    public void eliminarNombre(int indice) {
        if (indice >= 0) {
            modelo.removeElementAt(indice);
            lista.eliminarPersona(indice);
        } else {
            // CORREGIDO: Tenías comas y operadores '+' mezclados de forma ilegal aquí
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Método que elimina todas las personas de la lista
     */
    public void borrarLista() {
        lista.borrarLista();
        modelo.clear();
    }
}