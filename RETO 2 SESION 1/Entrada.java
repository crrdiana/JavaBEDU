
public class Entrada {
    private String nombreEvento;
    private double precio;


    public Entrada(String nombreEvento, double precio) {
        this.nombreEvento = nombreEvento;
        this.precio = precio;
    }


    public void mostrarInformacion() {
        System.out.println("Evento: " + nombreEvento + " | Precio: $" + precio);
    }
}
