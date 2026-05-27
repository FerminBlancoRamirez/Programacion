package gui5;

public class Testeo {
    public static void main(String[] args) {
        Hotel hotelRiver=new Hotel();
        VentanaHabitaciones ventanaHabitaciones=new VentanaHabitaciones(hotelRiver);
        ventanaHabitaciones.setVisible(true);
    }
}
