package cursos;

import java.util.ArrayList;

public class TestAsignatura {
    static void main(String[] args) {
        Asignatura asignatura=new Asignatura(232323, "Programacion", 4);
        asignatura.escribirAsignatura();
        asignatura.leerAsignatura();

        ArrayList<Asignatura> asignaturas=new ArrayList<>();
        asignaturas.add((new Asignatura(232323, "Bases de datos", 45)));
        asignaturas.add(new Asignatura(23232323, "Entornos", 12));
        asignaturas.add(new Asignatura(1231321312, "Ingles", 23));
        asignaturas.add(new Asignatura(1211224547, "Sistemas Informaticos", 145));
        asignaturas.add(new Asignatura(1212355677, "Marcas", 45));
        asignaturas.add(new Asignatura(1212112122, "Ipe", 23));
        ColeccionAsignaturas coleccion=new ColeccionAsignaturas(asignaturas);
        coleccion.guardarColeccion();
        coleccion.cargarColeccion();
    }
}
