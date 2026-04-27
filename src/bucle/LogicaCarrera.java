package bucle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class LogicaCarrera {

    // Ordenar por Tiempo Parcial (de menor a mayor)
    public void ordenarPorTiempo(List<Ciclista> lista) {
        lista.sort(Comparator.comparingInt(Ciclista::getTiempo));
    }

    // Ordenar por Tiempo Acumulado (de menor a mayor)
    public void ordenarPorTiempoAcumulado(List<Ciclista> lista) {
        lista.sort(Comparator.comparingInt(Ciclista::getTiempoAcumulado));
    }

    public void actualizarClasificacionGeneral(List<Ciclista> lista) {
        // Primero ordenamos por el acumulado
        lista.sort(Comparator.comparingInt(Ciclista::getTiempoAcumulado));

        // Luego asignamos la posición según el orden de la lista
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).setPosicionGen(i + 1);
        }
    }

    public void mostrarClasificacion(ArrayList<Ciclista> peloton){
        int pos=1;
        for (Ciclista c1:peloton){
            System.out.println("Posicion "+(pos++)+" "+c1);
        }
    }

    public void correrEtapas(ArrayList<Ciclista> peloton, int numeroEtapa){
        System.out.println("--Etapa numero "+numeroEtapa+"--");
        for (Ciclista corredor: peloton){
            //corres la etapa
            corredor.correrEtapa();//tu decides los valores en segundos
        }
        ordenarPorTiempo(peloton);
        mostrarClasificacion(peloton);
        System.out.println("-------------------------------------------------------------------");
        actualizarClasificacionGeneral(peloton);
        System.out.println("La clasificacion general queda asi:");
        mostrarClasificacion(peloton);
        System.out.println(" ");
        System.out.println(" ");
    }


}