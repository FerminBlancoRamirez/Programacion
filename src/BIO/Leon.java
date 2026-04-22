package BIO;

public class Leon extends Felino{

    public Leon(String sonidos, String alimentos, String habitat, String nombreCientifico) {
        super(sonidos, alimentos, habitat, nombreCientifico);
    }

    public String getSonidos(){
        return "Rugir";
    }

    public String getAlimentos(){
        return "carnivoro";
    }

    public String getHabitat(){
        return "Sabana";
    }

    public String getNombreCientifico(){
        return "Panthera Leo";
    }

    @Override
    public String toString(){
        return "RUGE EL LEON EN LA SABANA \n"+super.toString();
    }
}
