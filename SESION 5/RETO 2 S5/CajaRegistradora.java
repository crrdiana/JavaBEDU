public class CajaRegistradora {
    public static void main(String[] args) {
        MetodoPago[] pagos = new MetodoPago[]{
            new PagoEfectivo(100),
            new PagoTarjeta(50, 200),
            new PagoTransferencia(300)
        };

        for (MetodoPago pago : pagos) {
            if (pago instanceof Autenticable && ((Autenticable) pago).autenticar()) {
                pago.procesarPago();
                pago.mostrarResumen();
            } else {
                System.out.println("Autenticación fallida.");
            }
        }
    }
}
