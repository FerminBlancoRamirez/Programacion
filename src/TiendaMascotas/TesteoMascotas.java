package TiendaMascotas;

import java.util.ArrayList;

public class TesteoMascotas {
    public static void main(String[] args) {
        ArrayList<Mascotas> familia=new ArrayList<>();
        //cracion de mascotas

        familia.add(new PerroPequeño("Juanito", 2, "marron", 12.00, false,
                PerroPequeño.razaPequeño.caniche));
        familia.add(new PerroMediano("Thor", 10, "gris", 25.50, true,
                PerroMediano.razaMediano.bulldog));
        familia.add(new PerroGrande("Zeus", 7, "blanco", 50.00, false,
                PerroGrande.razaGrande.rotweiller));
        familia.add(new GatoSinPelo("Cleopatra", 2, "gris", 25.06, 30.00,
                GatoSinPelo.razaSinPelo.esfinge));
        familia.add(new GatoPeloCorto("Asia", 1, "multicolor", 30.67, 40.00,
                GatoPeloCorto.razaPeloCorto.devon_rex));
        familia.add(new GatoPeloLargo("Tora", 2, "naranja", 40.65, 50.23,
                GatoPeloLargo.razaPeloLargo.himalayo));

        //Miramos sus valores
        for (Mascotas f:familia){
            f.calcularPrecio();
            System.out.println(f);
            System.out.println("_________________________________________________");
        }
    }
}
