package bucle;

import java.util.ArrayList;

public class Testeo2 {
    static void main(String[] args) {
        Ciclista c1=new Velocista(1, "Juan Alberto", 22.5, 30.5);
        Ciclista c2= new ContraRelojista(2, "Carlos Rodriguez", 21.3);
        Ciclista c3= new Escalador(3, "Juan Abril", 12.5, 22.5);
        Ciclista c4=new Velocista(4 ,"David Alfaya", 9.5, 12.5);
        Ciclista c5=new ContraRelojista(5 ,"Antonio Alfaya", 25.5);
        Ciclista c6=new Escalador(6 ,"Pedro Perez", 23.5, 8.0);
        Ciclista c7=new Velocista(7 ,"Marcos Alonso", 9.5, 12.5);
        Ciclista c8=new ContraRelojista(8 ,"Berti Perez", 25.5);
        Ciclista c9=new Escalador(9 ,"Alvaro Villaverde", 23.5, 8.0);

        int numeroEtapa=0;
        ArrayList<Ciclista> peloton=new ArrayList<>();
        peloton.add(c1);
        peloton.add(c2);
        peloton.add(c3);
        peloton.add(c4);
        peloton.add(c5);
        peloton.add(c6);
        peloton.add(c7);
        peloton.add(c8);
        peloton.add(c9);

        Equipo roma=new Equipo("Italia", "Roma2");
        roma.añadirCiclistas(c1);
        roma.añadirCiclistas(c2);
        roma.añadirCiclistas(c3);
        Equipo berlin=new Equipo("Alemania", "Berlin");
        berlin.añadirCiclistas(c4);
        berlin.añadirCiclistas(c5);
        berlin.añadirCiclistas(c6);
        Equipo Paris=new Equipo("Francia", "Paris");
        Paris.añadirCiclistas(c7);
        Paris.añadirCiclistas(c8);
        Paris.añadirCiclistas(c9);

        ArrayList<Equipo> listaEquipos=new ArrayList<>();
        listaEquipos.add(roma);
        listaEquipos.add(berlin);
        listaEquipos.add(Paris);

        LogicaCarrera lC=new LogicaCarrera();
        //Se corre la primera etapa
        lC.correrEtapas(peloton, 1);

        roma.calcularTiempoTotalEquipo();
        System.out.println(roma);
        berlin.calcularTiempoTotalEquipo();
        System.out.println(berlin);
        Paris.calcularTiempoTotalEquipo();
        System.out.println(Paris);
        lC.actualizarClasificacionGeneralEquipos(listaEquipos);

        lC.correrEtapas(peloton, 2);

        roma.calcularTiempoTotalEquipo();
        System.out.println(roma);
        berlin.calcularTiempoTotalEquipo();
        System.out.println(berlin);
        Paris.calcularTiempoTotalEquipo();
        System.out.println(Paris);
        lC.actualizarClasificacionGeneralEquipos(listaEquipos);

        lC.mostrarClasificacionEquipos(listaEquipos);




    }
}
