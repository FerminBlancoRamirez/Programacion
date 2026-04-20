package Ejercicio1;

public class testeo {
    public static void main(String[] args) {
        Coche coche=new Coche("Porsche", "911 Turbo S", 330, 2);
        moto moto=new moto("Ural", "Gear Up Expedition", 115, true);

        coche.describe();
        moto.describe();
    }
}
