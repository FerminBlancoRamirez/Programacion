package BIO;

public abstract class Animal {

    protected String sonidos;
    protected String alimentos;
    protected String habitat;
    protected String nombreCientifico;

    public Animal(String sonidos, String alimentos, String habitat, String nombreCientifico) {
        this.sonidos = sonidos;
        this.alimentos = alimentos;
        this.habitat = habitat;
        this.nombreCientifico = nombreCientifico;
    }

    //Cuatro metodos abstractos
    public abstract String getAlimentos();
    public abstract String getSonidos();
    public abstract String getNombreCientifico();
    public abstract String getHabitat();

    @Override
    public String toString() {
        return "Animal{" +
                "sonidos='" + sonidos + '\'' +
                ", alimentos='" + alimentos + '\'' +
                ", habitat='" + habitat + '\'' +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }
}
