package bucle;

import java.util.ArrayList;

public class Testeo2 {
    static void main(String[] args) {
        Ciclista c1=new Velocista(1, "Juan Alberto", 22.5, 30.5);
        Ciclista c2= new Velocista(2, "Carlos Rodriguez", 21.3, 29.5);
        Ciclista c3= new Escalador(3, "Juan Abril", 12.5, 22.5);
        Ciclista c4=new Escalador(4 ,"David Alfaya", 9.5, 12.5);
        Ciclista c5=new ContraRelojista(5 ,"Antonio Alfaya", 25.5);
        Ciclista c6=new ContraRelojista(5 ,"Antonio Alfaya", 23.5);

        int numeroEtapa=0;
        ArrayList<Ciclista> peloton=new ArrayList<>();
        peloton.add(c1);
        peloton.add(c2);
        peloton.add(c3);
        peloton.add(c4);
        peloton.add(c5);
        peloton.add(c6);

        LogicaCarrera lC=new LogicaCarrera();
        //Se corre la primera etapa
        lC.correrEtapas(peloton, 1);

    }
}
