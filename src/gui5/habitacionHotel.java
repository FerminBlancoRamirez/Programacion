package gui5;
import java.util.Date;

public class habitacionHotel {
    private boolean disponible=true;
    private int numeroHabitacion=0;
    private double precioHabitacion=0;
    private huesped huesped;

    public habitacionHotel(int numeroHabitacion, boolean disponible, double precioHabitacion){
        this.numeroHabitacion=numeroHabitacion;
        this.precioHabitacion=precioHabitacion;
        this.disponible=disponible;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    public huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(huesped huesped) {
        this.huesped = huesped;
    }
}
