package Vehiculo;

public class Terrestre extends vehiculo implements Motor{
    private int numeroLlantas=0;
    enum uso{
        MILITAR, CIVIL
    }
    private uso uso;

    public Terrestre(int velocidadActual, int velocidadMaxima, int numeroLlantas, uso uso){
        super(velocidadActual, velocidadMaxima);
        this.numeroLlantas=numeroLlantas;
        this.uso=uso;
    }

    //getters y setters de los nuevos atributos
    public int getNumeroLlantas() {
        return numeroLlantas;
    }

    public void setNumeroLlantas(int numeroLlantas) {
        this.numeroLlantas = numeroLlantas;
    }

    public uso getUso() {
        return uso;
    }

    public void setUso(uso uso) {
        this.uso = uso;
    }

    //uso de metodos abstractos
    @Override
    public void acelerar(int velocidad){
        if (getVelocidadActual()+velocidad>getVelocidadMaxima()){
            this.velocidadActual=getVelocidadMaxima();
        }else {
            int nuevaVelocidad=getVelocidadActual()+velocidad;
            this.velocidadActual=nuevaVelocidad;
        }
    }

    @Override
    public void frenar(int velocidad){
        if (getVelocidadActual()==0){
            this.velocidadActual=0;
        } else if (getVelocidadActual()-velocidad<0) {
            this.velocidadActual=0;
        }else {
            int nuevaVelocidad= getVelocidadActual()-velocidad;
            this.velocidadActual=nuevaVelocidad;
        }
    }

    //Metodo de la interfaz
    @Override
    public void revolucionesMotor(int fuerza, int radio){
        int revoluciones= fuerza*radio;
        System.out.println("Las revoluciones de este motor son de: "+revoluciones);
    }

    @Override
    public String toString() {
        return "Terrestre{" +
                "numeroLlantas=" + numeroLlantas +
                ", uso=" + uso +
                ", velocidadMaxima=" + velocidadMaxima +
                ", velocidadActual=" + velocidadActual +
                '}';
    }
}
