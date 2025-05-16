public class Vuelo {
    private final String codigoVuelo;
    private String destino;
    private String horaSalida;
    private Pasajero asientoReservado;

    public Vuelo(String codigo, String destino, String horaSalida) {
        this.codigoVuelo = codigo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            System.out.println("Reserva realizada con éxito.");
            return true;
        }
        return false;
    }

    public boolean reservarAsiento(String nombre, String pasaporte) {
        return reservarAsiento(new Pasajero(nombre, pasaporte));
    }

    public void cancelarReserva() {
        System.out.println("Cancelando reserva...");
        asientoReservado = null;
    }

    public String obtenerItinerario() {
        String info = "\nItinerario del vuelo:\n";
        info += "Código: " + codigoVuelo + "\n";
        info += "Destino: " + destino + "\n";
        info += "Salida: " + horaSalida + "\n";
        info += "Pasajero: " + (asientoReservado != null ? asientoReservado.getNombre() : "[Sin reserva]");
        return info;
    }
}
