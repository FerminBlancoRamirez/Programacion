package BIO;

public class Perro extends Canido{

    public Perro(String sonido, String alimento, String habitat, String nombreCientifico){
        super(sonido, alimento, habitat, nombreCientifico);
    }

    public String getSonidos(){
        return "Ladrido";
    }

    public String getAlimentos(){
        return "Carnivoro";
    }

    public String getHabitat(){
        return "Domestico";
    }

    public String getNombreCientifico(){
        return "Canis lupus familiaris";
    }

    @Override
    public String toString(){
        return "Esto es un perro\n"+super.toString();
    }
}
