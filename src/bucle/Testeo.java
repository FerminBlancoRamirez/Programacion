package bucle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Testeo {
    static void main(String[] args) {
        Ciclista c1=new Ciclista(1, "Juan Alberto");
        Ciclista c2= new Ciclista(2, "Carlos Rodriguez");
        Ciclista c3= new Ciclista(3, "Juan Abril");
        Ciclista c4=new Ciclista(4 ,"David Alfaya");
        Ciclista c5=new Ciclista(5 ,"Antonio Alfaya");

        ArrayList<Ciclista> peloton=new ArrayList<>();
        peloton.add(c1);
        peloton.add(c2);
        peloton.add(c3);
        peloton.add(c4);
        peloton.add(c5);

        for (Ciclista corredor: peloton){
            corredor.correrEtapa();
        }

        LogicaCarrera lC=new LogicaCarrera();

        lC.ordenarPorTiempoAcumulado(peloton);
        lC.actualizarClasificacionGeneral(peloton);


        lC.mostrarClasificacion(peloton);
        System.out.println("-------------------------------------------------------------------");

        for (Ciclista corredor: peloton){
            corredor.correrEtapa();
        }
        lC.actualizarClasificacionGeneral(peloton);

        lC.mostrarClasificacion(peloton);

    }
}
