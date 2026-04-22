package BIO;

public class Lobo extends Canido{

    public Lobo(String sonidos, String alimentos, String habitat, String nombreCientifico) {
        super(sonidos, alimentos, habitat, nombreCientifico);
    }

    public String getSonidos(){
        return "aullido";
    }

    public String getAlimentos(){
        return "carne";
    }

    public String getHabitat(){
        return "bosque";
    }

    public String getNombreCientifico(){
        return "Canis Lupus";
    }

    public String toString(){
        return "Esto es un lobo \n"+super.toString();
    }

}
