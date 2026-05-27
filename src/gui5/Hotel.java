package gui5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Hotel {
    public ArrayList<habitacionHotel> habitaciones=new ArrayList<>();

    public Hotel(){
        habitaciones.add(new habitacionHotel(1, true, 120));
        habitaciones.add(new habitacionHotel(2, true, 120));
        habitaciones.add(new habitacionHotel(3, true, 120));
        habitaciones.add(new habitacionHotel(4, true, 120));
        habitaciones.add(new habitacionHotel(5, true, 120));
        habitaciones.add(new habitacionHotel(6, true, 160));
        habitaciones.add(new habitacionHotel(7, true, 160));
        habitaciones.add(new habitacionHotel(8, true, 160));
        habitaciones.add(new habitacionHotel(9, true, 160));
        habitaciones.add(new habitacionHotel(10, true, 160));
    }

    public String buscarFechaIngresoHabitacion(int numero) {
        for (int i = 0; i < habitaciones.size(); i++) { /* Recorre el vector de habitaciones */
            // Obtiene un elemento del vector
            habitacionHotel Habitacion = (habitacionHotel) habitaciones.get(i);
            if (Habitacion.getNumeroHabitacion() == numero) { /* Si el número buscado es encontrado */
                // Se obtiene la fecha de ingreso
                Date fecha = Habitacion.getHuesped().getFechaIngreso();
                // Se le da formato a la fecha de ingreso
                DateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
                return formatoFecha.format(fecha); /* Devuelve la fecha de ingreso */
            }
        }
        return ""; // En caso de no encontrar la Habitacion
    }

    public boolean buscarHabitacionOcupada(int numero) {
        for (int i = 0; i < habitaciones.size(); i++) {
            /* Recorre el vector de habitaciones */
            // Obtiene un elemento del vector
            habitacionHotel Habitacion = (habitacionHotel) habitaciones.get(i);
            if (Habitacion.getNumeroHabitacion() == numero && !Habitacion.isDisponible()) {
                // Si la Habitacion está disponible
                return true;
            }
        }
        return false; // Si la Habitacion no está disponible
    }

}
