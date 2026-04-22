package BIO;

public class Testeo {
    static void main(String[] args) {
        //Animal sobera=new Animal("ewrg!", "kiwis", "navideño", "Cejus hispanicus");

        //Canido toralla= new Canido("brup", "bichotas", "marino", "Carolus Maritimus");

        //No puedes crearlos ya que son clases abstractas

        Canido mafalda = new Perro("guf guf", "salchichas", "pisero",
                "Mafaldus Galaicus");

        Animal feroz=new Lobo("argh!", "abuelas", "altas esferas",
                "hambrunos tipex");

        Felino Scar=new Leon("roaw!", "Antilope", "Sabana",
                "LEon leon");

        Animal asia=new Gato("miau", "pienso", "mi cama y mi mesa y mi armario y mi ropa",
                "Catus TocaHuevis");

        System.out.println(mafalda);
        System.out.println(feroz);
        System.out.println(mafalda instanceof Perro); //true
        System.out.println(feroz instanceof Animal); //True porque si es un animal
        //System.out.println(Scar instanceof Perro); //No te deja porque no esta en el ramal de Perro
        System.out.println(Scar instanceof Felino);//true
        System.out.println(feroz instanceof Lobo);// util es un loboç
        System.out.println(asia instanceof Gato);

        //Downcasting

        Perro p=(Perro) mafalda;

        Canido ca=(Canido) feroz;

        Lobo lob=(Lobo) feroz;

        Leon le= (Leon) Scar;

        //Gato ga= (Perro) asia;

        //Gato ga= (Leon) asia;

        Felino fe= (Felino) asia;
    }
}
