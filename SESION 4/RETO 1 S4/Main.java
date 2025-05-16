public class Main {
    public static void main(String[] args) {
        Factura factura1 = new Factura("F123", "Juan Pérez", 1500.0);
        Factura factura2 = new Factura("F123", "Ana Martínez", 2000.0);

        System.out.println(factura1.toString());
        System.out.println(factura2.toString());

        if (factura1.equals(factura2)) {
            System.out.println("Las facturas son iguales.");
        } else {
            System.out.println("Las facturas no son iguales.");
        }
    }
}
