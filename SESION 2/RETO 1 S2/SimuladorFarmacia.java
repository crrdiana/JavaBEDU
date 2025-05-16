import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre del medicamento: ");
        String medicamento = scanner.nextLine();

        System.out.print("Introduce el precio unitario del medicamento: ");
        double precioUnitario = scanner.nextDouble();

        System.out.print("Introduce la cantidad de piezas: ");
        int cantidad = scanner.nextInt();

        double totalSinDescuento = precioUnitario * cantidad;

        double descuento = (totalSinDescuento > 500.00) ? totalSinDescuento * 0.15 : 0.0;
        double totalPagar = totalSinDescuento - descuento;

        System.out.println("\nResumen de compra:");
        System.out.println("Medicamento: " + medicamento);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Total sin descuento: $" + totalSinDescuento);
        System.out.println("¿Aplica descuento?: " + (descuento > 0 ? "true" : "false"));
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalPagar);

        scanner.close();
    }
}
