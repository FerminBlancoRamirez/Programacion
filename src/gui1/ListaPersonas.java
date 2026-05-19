package gui1;

import cursos.Asignatura;

import java.io.*;
import java.util.ArrayList;

public class ListaPersonas {
    private ArrayList<Persona> listaPersonas; // Atributo que identifica un vector de personas
    /**
     * Constructor de la clase ListaPersonas
     */
    public ListaPersonas() {
        listaPersonas = new ArrayList<>(); // Crea el vector de personas
    }
    /**
     * Método que permite agregar una persona al vector de personas
     * @param p Parámetro que define la persona a agregar al vector de
     * personas
     */
    public void añadirPersona(Persona p) {
        listaPersonas.add(p);
    }
    /**
     * Método que permite eliminar una persona del vector de personas
     * @param i Parámetro que define la posición a eliminar en el vector
     * de personas
     */
    public void eliminarPersona(int i) {
        listaPersonas.remove(i);
    }
    /**
     * Método que permite eliminar todos los elementos del vector de
     * personas
     */
    public void borrarLista() {
        listaPersonas.clear();
    }

    public void guardarLista(){
        try{
            FileOutputStream archivo=new FileOutputStream("lista.dat");
            ObjectOutputStream salida=new ObjectOutputStream(archivo);
            salida.writeObject(this.listaPersonas);
            salida.close();
            System.out.println("Coleccion guardada con exito");
        }catch (IOException e){
            System.out.println("No se pudo escribir en el archivo"+ e.getMessage());
        }
    }

    public void cargarColeccion(){
        try {
            FileInputStream archivo=new FileInputStream("lista.dat");
            ObjectInputStream entrada=new ObjectInputStream(archivo);
            this.listaPersonas=(ArrayList<Persona>) entrada.readObject();
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
}
