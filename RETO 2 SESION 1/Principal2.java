
public class Principal {
    public static void main(String[] args) {
        // Crear dos objetos de tipo Entrada
        Entrada entrada1 = new Entrada("Obra de Teatro", 450.0);
        Entrada entrada2 = new Entrada("Concierto de Rock", 350.0);

        // Llamar al método mostrarInformacion() para mostrar los datos
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();
    }
}
