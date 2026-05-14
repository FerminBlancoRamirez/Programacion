package FormacionFutbol;

import java.util.ArrayList;

public class Testeo {
    static void main(String[] args) {

        Entrenador entrenador=new Entrenador("Carlos Queiroz", 66, 30, false);
        Portero portero=new Portero("David Ospina", 30, true, 10);

        ArrayList<Defensas> defensas=new ArrayList<>();
        defensas.add(new Defensas("Yerry Mina", 24,true));
        defensas.add(new Defensas("Davison Sanchez", 23,true));
        defensas.add(new Defensas("William Tesillo", 29,true));
        defensas.add(new Defensas("Stefan Medina",  29,true));

        ArrayList<Mediocentros> centrocampistas=new ArrayList<>();
        centrocampistas.add(new Mediocentros("Mateus Uribe", 28, true, 12));
        centrocampistas.add(new Mediocentros("William Barrios", 25, true, 12));
        centrocampistas.add(new Mediocentros("Juan Guillermo Cuadrado", 31, true, 10));
        centrocampistas.add(new Mediocentros("James Rodriguez", 28, true, 32));

        ArrayList<Delanteros> atacantes=new ArrayList<>();
        atacantes.add(new Delanteros("Radamel Falcao", 33, true, 15));
        atacantes.add(new Delanteros("Duvan Zapata", 28, true, 12));

        EquipoFutbol seleccion=new EquipoFutbol("Seleccion Colombiana", "Colombia", portero, defensas,
                centrocampistas, entrenador, atacantes);

        System.out.println(seleccion);
    }
}
