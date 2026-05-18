package cursos;

import java.io.*;
import java.util.ArrayList;

public class ColeccionAsignaturas {
    public ArrayList<Asignatura> asignaturas;

    public ColeccionAsignaturas(ArrayList<Asignatura> asignaturas){
        this.asignaturas=new ArrayList<Asignatura>();
    }

    //guardar y leer
    public void guardarColeccion(){
        try{
            FileOutputStream archivo=new FileOutputStream("Coleccion.dat");
            ObjectOutputStream salida=new ObjectOutputStream(archivo);
            salida.writeObject(this.asignaturas);
            salida.close();
            System.out.println("Coleccion guardada con exito");
        }catch (IOException e){
            System.out.println("No se pudo escribir en el archivo"+ e.getMessage());
        }
    }

    public void cargarColeccion(){
        try {
            FileInputStream archivo=new FileInputStream("Coleccion.dat");
            ObjectInputStream entrada=new ObjectInputStream(archivo);
            this.asignaturas=(ArrayList<Asignatura>) entrada.readObject();
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
