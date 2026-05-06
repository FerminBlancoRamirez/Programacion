package Vehiculo;

public class TesteoVehiculos {
    public static void main(String[] args) {
        Terrestre camioneta=new Terrestre(40, 120, 4, Terrestre.uso.CIVIL);
        Acuatico motoAcuatica=new Acuatico(30, 90, Acuatico.tipo.SUPERFICIE, 2);
        Aereo avion=new Aereo(200, 800, "boing-322");

        System.out.println("--Empezamos probando la camioneta--");
        System.out.println("Vemos sus datos antes de modificar");
        System.out.println(camioneta);
        System.out.println("----------------------------------------------------");
        camioneta.acelerar(70);
        System.out.println("Despues de acelerar");
        System.out.println(camioneta);
        System.out.println("----------------------------------------------------");
        camioneta.frenar(50);
        System.out.println("Despues de frenar");
        System.out.println(camioneta);
        System.out.println("----------------------------------------------------");
        System.out.println("Metodo de la interfaz");
        camioneta.revolucionesMotor(40, 60);
        System.out.println("");
        System.out.println("");
        System.out.println("--Seguimos con la moto de agua--");
        System.out.println("Vemos sus datos antes de modificar");
        System.out.println(motoAcuatica);
        System.out.println("----------------------------------------------------");
        motoAcuatica.acelerar(60);
        System.out.println("Despues de acelerar");
        System.out.println(motoAcuatica);
        System.out.println("----------------------------------------------------");
        motoAcuatica.frenar(100);
        System.out.println("Despues de frenar");
        System.out.println(motoAcuatica);
        System.out.println("----------------------------------------------------");
        System.out.println("Metodo de la interfaz");
        motoAcuatica.recomendarVelocidad(100);
        System.out.println("");
        System.out.println("");
        System.out.println("--Vamos con el avion--");
        System.out.println("Veamos sus datos antes de modificar nada");
        System.out.println(avion);
        System.out.println("----------------------------------------------------");
        if (avion.getVelocidadActual()>0){
            avion.volar();
            avion.soltarTren();
            avion.aterrizar();
            avion.frenar(avion.getVelocidadActual());
            avion.apagar();
        }else {
            avion.encender();
            avion.acelerar(200);
            avion.despegar();
            avion.subirTren();
            avion.volar();
        }


    }
}
