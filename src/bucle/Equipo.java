package bucle;


import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Equipo implements Comparable<Equipo>{

    private String nombre;
    private int tiempoE=0;
    private int tiempoAcumuladoE=0;
    private String pais;
    public ArrayList<Ciclista> listaCiclista=new ArrayList<>();
    public int posicionGeneral;

    public Equipo(String pais, String nombre) {
        this.pais = pais;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTiempoE() {
        return tiempoE;
    }

    public void setTiempoE(int tiempoE) {
        this.tiempoE = tiempoE;
    }

    public int getTiempoAcumuladoE() {
        return tiempoAcumuladoE;
    }

    public void setTiempoAcumuladoE(int tiempoAcumuladoE) {
        this.tiempoAcumuladoE = tiempoAcumuladoE;
    }

    public int getPosicionGeneral() {
        return posicionGeneral;
    }

    public void setPosicionGeneral(int posicionGeneral) {
        this.posicionGeneral = posicionGeneral;
    }

    //Metodos propios de la clase
    public void añadirCiclistas(Ciclista ciclista){
        listaCiclista.add(ciclista); //Se agregan ciclistas al equipo
    }

    public void mostrarEquipo(){ //Muestra los ciclistas de cada equipo
        for (Ciclista ciclista:listaCiclista){
            System.out.println(ciclista.getNombre());
            System.out.println(ciclista.getDorsal());
        }
    }

    //Metodo para buscar al ciclista
    public void buscarCiclista(){
        Scanner sc=new Scanner(System.in);
        String nombreCiclista=sc.nextLine();
        boolean esta=false;
        for (int i=0; i<listaCiclista.size(); i++) {
            Ciclista ciclista = (Ciclista) listaCiclista.get(i);
            if (ciclista.getNombre().equals(nombreCiclista)) {
                System.out.println(ciclista.getNombre() + "-" + ciclista.getDorsal());
                esta=true;
            }
        }
            if (!esta)
                System.out.println("no esta en el equipo...");
    }

    //Metodo para calcular tiempo
    public void calcularTiempoTotalEquipo(){
        this.tiempoE=0;
        for (Ciclista ciclista:listaCiclista){
            this.tiempoE+=ciclista.getTiempo();
            this.tiempoAcumuladoE+=ciclista.getTiempo();
        }
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", tiempoE=" + tiempoE +
                ", tiempoAcumuladoE=" + tiempoAcumuladoE +
                ", pais='" + pais + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Equipo equipo = (Equipo) o;
        return tiempoE == equipo.tiempoE && tiempoAcumuladoE == equipo.tiempoAcumuladoE;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tiempoE, tiempoAcumuladoE);
    }

    @Override
    public int compareTo(Equipo otro) {
        return Integer.compare(this.tiempoE, otro.tiempoE);
    }
}
