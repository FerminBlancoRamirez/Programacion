package bucle;

public class ContraRelojista extends Ciclista{
    protected double velocidadMaxima;

    public ContraRelojista(int dorsal, String nombre, double velocidadMaxima){
        super(dorsal, nombre);
        this.velocidadMaxima=velocidadMaxima;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String toString() {
        return "ContraRelojista{" +
                "velocidadMaxima=" + velocidadMaxima +
                ", dorsal=" + dorsal +
                ", tiempo=" + tiempo +
                ", nombre='" + nombre + '\'' +
                ", tiempoAcumulado=" + tiempoAcumulado +
                '}';
    }

    /* Podriamos cambiar la forma en que corre la etapa y calcula los tiempos
    * @Override
    * public void correrEtapa(){
    * Random random =new Random();
    *
    * // Random rd = new Random();
        int tiempoEtapa= rd.nextInt(21600-7200)+1+7200;
        this.tiempo=tiempoEtapa;
        this.tiempoAcumulado+=tiempoEtapa;*/
}
