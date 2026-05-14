package peaje;

import java.util.ArrayList;
import java.util.Scanner;

public class Conductor {
    private String nombre;
    private int numeroIdentidad;
    private String fechaNacimiento;
    private ArrayList<Vehiculo> vehiculos;

    public Conductor(String nombre, int numeroIdentidad, String fechaNacimiento) {
        this.nombre = nombre;
        this.numeroIdentidad = numeroIdentidad;
        this.fechaNacimiento = fechaNacimiento;
        vehiculos=new ArrayList<>(); //inicializamos el array list propio del conductor al crearlo
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroIdentidad() {
        return numeroIdentidad;
    }

    public void setNumeroIdentidad(int numeroIdentidad) {
        this.numeroIdentidad = numeroIdentidad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    //metodo para añadir vehiculo
    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }

    //metodo quitar vehiculo
    public void eliminarVehiculo(){
        Scanner sc=new Scanner(System.in);
        if (vehiculos.isEmpty()){
            System.out.println("A esta persona no se le puede quitar ningun vehiculo ya que no dispone de ninguno");
        }else {
            System.out.println("Los vehiculos de "+getNombre()+" son:");
            for (int i=0; i<vehiculos.size(); i++){
                String nombreVehiculo=vehiculos.get(i).getClass().getSimpleName();
                System.out.println((i+1)+" "+nombreVehiculo);
            }
            System.out.println("----------------------------");
            System.out.println("Escribe el numero del vehiculo que deseas eliminar");
            int indice= Integer.parseInt(sc.nextLine());
            vehiculos.remove(indice);
            System.out.println("Vehiculo eliminado.");
        }
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "nombre='" + nombre + '\'' +
                ", numeroIdentidad=" + numeroIdentidad +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
}
