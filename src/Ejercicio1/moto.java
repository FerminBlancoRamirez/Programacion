package Ejercicio1;

public class moto extends Vehiculo{
    private static boolean llevaSidecar;

    //constructor usando herencia
    public moto(String marca, String modelo, int velocidadMaxima, boolean llevaSidecar){
        super(marca, modelo, velocidadMaxima);
        this.llevaSidecar=llevaSidecar;
    }

    //getters y setters
    public static boolean isLlevaSidecar() {
        return llevaSidecar;
    }

    public static void setLlevaSidecar(boolean llevaSidecar) {
        moto.llevaSidecar = llevaSidecar;
    }

    //metodo sobreescribido
    @Override
    public void describe(){
        if (llevaSidecar==true){
            super.describe();
            System.out.println("La moto lleva sidecar incluido");
        }else{
            super.describe();
        }
    }
}
