package Ejercicio4;

public class Testeo {
    public static void main(String[] args) {
        Animal[] animals={new Perro("Juan"), new Gato("Chichi"), new Pajaro("pollo")};
        for (int i=0; i< animals.length; i++){
            System.out.println("El animal "+animals[i].getNombre()+" hace "+animals[i].hacerSonido());
        }
    }
}
