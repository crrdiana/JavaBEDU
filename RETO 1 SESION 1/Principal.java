import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear objeto de la clase Paciente
        Paciente paciente = new Paciente();

        // Solicitar datos al usuario
        System.out.print("Ingresa el nombre del paciente: ");
        paciente.nombre = scanner.nextLine();

        System.out.print("Ingresa la edad del paciente: ");
        paciente.edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Ingresa el número de expediente: ");
        paciente.numeroExpediente = scanner.nextLine();

        // Mostrar los datos del paciente
        System.out.println("\n--- Información del Paciente ---");
        paciente.mostrarInformacion();
    }
}
