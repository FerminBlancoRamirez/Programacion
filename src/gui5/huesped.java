package gui5;

import java.util.Date;

public class huesped {
    private String nombre;
    private String apellidos;
    private String DNI;
    private double precioFInal=0;
    private Date fechaIngreso;
    private Date fechaSalida;

    public huesped(String nombre, String apellidos, String dni){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.DNI=dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public double getPrecioFInal() {
        return precioFInal;
    }

    public void setPrecioFInal(double precioFInal) {
        this.precioFInal = precioFInal;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int obtenerDiasAlojamiento() {
        /*
         * Resta la fecha de ingreso de la fecha de salida utilizando el método getTime
         */
        int dias = (int) ((fechaSalida.getTime() - fechaIngreso.getTime()) / 86400000);
        return dias;
    }
    //Como le cobro al pavo??

    public double precioFinal(habitacionHotel habitacion){
        return this.precioFInal=obtenerDiasAlojamiento()*habitacion.getPrecioHabitacion();
    }



    @Override
    public String toString() {
        return "huesped{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", DNI='" + DNI + '\'' +
                ", precioFInal=" + precioFInal +
                ", fechaIngreso=" + fechaIngreso +
                ", fechaSalida=" + fechaSalida +
                '}';
    }
}
