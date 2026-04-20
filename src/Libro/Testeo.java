package Libro;

import java.util.ArrayList;

public class Testeo {
    static void main(String[] args) {
        ArrayList<Libro> libros=new ArrayList<>();
        Novelas n1=new Novelas("Cien años de soledad", "Gabriel Garcia Marquez", 22.5, Novelas.genero.realista);
        LibroTexto l1= new LibroTexto("Lengua Castellana", "Juan Rodriguez", 50, 4);
        LibroUniversidad lu1=new LibroUniversidad("Fisica Basica", "Ricardo Rodriguez", 70, 1, "Fisica");
        //arraylist de libros
        libros.add(n1);
        libros.add(l1);
        libros.add(lu1);

        //recorremos
        for (Libro l:libros) {
            System.out.println(l);
            System.out.println("--------------------");
        }
        System.out.println();

        //metodos
        n1.prestar();
        System.out.println(n1);
        n1.devolver();
        System.out.println(n1);
        System.out.println("-------------------------------------------");
        l1.prestar();
        System.out.println(l1);
        l1.devolver();
        System.out.println(l1);
        System.out.println("-------------------------------------------");
        lu1.prestar();
        System.out.println(lu1);
        lu1.devolver();
        System.out.println(lu1);
        System.out.println("-------------------------------------------");

    }
}
