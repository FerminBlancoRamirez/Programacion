package FormacionFutbol;

import java.util.ArrayList;

public class Testeo {
    static void main(String[] args) {

        Entrenador entrenador=new Entrenador("Manuel Pellegrini", 59, 25, false);
        Portero portero=new Portero("Willy Caballero", 31, true, 3);

        ArrayList<Defensas> defensas=new ArrayList<>();
        defensas.add(new Defensas("Jesus Gamez", 28,true));
        defensas.add(new Defensas("Martin Demichelis", 32,true));
        defensas.add(new Defensas("Sergio Sanchez", 27,true));
        defensas.add(new Defensas("Vitorino Antunes",  26,true));

        ArrayList<Mediocentros> centrocampistas=new ArrayList<>();
        centrocampistas.add(new Mediocentros("Jeremy Toulalan", 29, true, 0));
        centrocampistas.add(new Mediocentros("Ignacio Camacho", 22, true, 0));
        centrocampistas.add(new Mediocentros("Isco Alarcon", 20, true, 1));
        centrocampistas.add(new Mediocentros("Duda", 32, true, 0));

        ArrayList<Delanteros> atacantes=new ArrayList<>();
        atacantes.add(new Delanteros("Joaquin Sanchez", 31, true, 1));
        atacantes.add(new Delanteros("Julio Baptista", 31, true, 0));

        EquipoFutbol seleccion=new EquipoFutbol("Malaga CF", "España", portero, defensas,
                centrocampistas, entrenador, atacantes);

        System.out.println(seleccion);
    }
}
