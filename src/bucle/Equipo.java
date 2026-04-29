package bucle;


import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private int tiempoE=0;
    private int tiempoAcumuladoE=0;
    private String pais;
    ArrayList<Ciclista> listaCiclista;

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
}
