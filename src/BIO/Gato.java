package BIO;

public class Gato extends Felino{
    public Gato(String sonidos, String alimentos, String habitat, String nombreCientifico) {
        super(sonidos, alimentos, habitat, nombreCientifico);
    }

    public String getSonidos(){
        return "Maullido";
    }

    public String getAlimentos(){
        return "carnivoro";
    }

    public String getHabitat(){
        return "Tu ropa";
    }

    public String getNombreCientifico(){
        return "Panthera catus";
    }

    @Override
    public String toString(){
        return "Gato gatete \n"+super.toString();
    }
}
