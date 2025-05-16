public class Principal3 {
    public static void main(String[] args) {
        Pasajero pasajero1 = new Pasajero("Ana Martínez", "A123456");
        Vuelo vuelo = new Vuelo("UX123", "París", "14:30");

        vuelo.reservarAsiento(pasajero1);
        System.out.println(vuelo.obtenerItinerario());

        vuelo.cancelarReserva();
        System.out.println(vuelo.obtenerItinerario());

        vuelo.reservarAsiento("Mario Gonzalez", "B654321");
        System.out.println(vuelo.obtenerItinerario());
    }
}
