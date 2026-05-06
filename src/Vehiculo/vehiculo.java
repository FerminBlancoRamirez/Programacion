package Vehiculo;

public abstract class vehiculo {
    protected int velocidadActual=0;
    protected int velocidadMaxima=0;

    public vehiculo(int velocidadActual, int velocidadMaxima) {
        if (velocidadActual>velocidadMaxima){
            this.velocidadActual = velocidadMaxima;
        }else {
            this.velocidadActual=velocidadActual;
        }
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    //Metodos abstractos de la clase
    public abstract void acelerar(int velocidad);//cascaron que hara que nuestros vehiculos aceleren
    public abstract void frenar(int velocidad);//cascaron que hara frenar nuestros futurso vehiculos

    @Override
    public String toString() {
        return "vehiculo{" +
                "velocidadActual=" + velocidadActual +
                ", velocidadMaxima=" + velocidadMaxima +
                '}';
    }
}
