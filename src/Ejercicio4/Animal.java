package Ejercicio4;
//Ejercicio 4: Animales
//Crea Animal con nombre y un método hacerSonido().
// Crea Perro, Gato y Pajaro que lo sobreescriban.
// Luego crea un array de tipo Animal[] con objetos de los tres tipos y recórrelo llamando a hacerSonido()
// — aquí verás el polimorfismo en acción.

public class Animal {
    protected String nombre;

    public Animal(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String hacerSonido(){
        return "";
    }
}
