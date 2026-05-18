package cursos;

import java.io.*;

public class Asignatura implements Serializable {
    private int codigo = 0;
    private String nombre;
    private int creditos = 0;

    public Asignatura(int codigo, String nombre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public void imprimir() {
        System.out.println("El codigo de la asignatura es: "+codigo);
        System.out.println("El nombre de la asignatura es: "+nombre);
        System.out.println("La cantidad de creditos es: "+creditos);
    }

    public void escribirAsignatura(){
        try{
            FileOutputStream archivo=new FileOutputStream("Coleccion.dat");
            ObjectOutputStream salida=new ObjectOutputStream(archivo);
            salida.writeObject(this);
            salida.close();
        }catch (IOException e){
            System.out.println("No se pudo escribir en el archivo");
        }
    }

    public void leerAsignatura(){
        try {
            FileInputStream archivo=new FileInputStream("Coleccion.dat");
            ObjectInputStream entrada=new ObjectInputStream(archivo);
            Asignatura asignatura=(Asignatura) entrada.readObject();
            entrada.close();
        }catch (FileNotFoundException e){
            System.out.println("No se pudo leer el archivo");
        }catch (IOException e){
            System.out.println("Errr de entrada/salida");
        }catch (Exception e){
            System.out.println("Error al leer el archivo");
        }
    }


}